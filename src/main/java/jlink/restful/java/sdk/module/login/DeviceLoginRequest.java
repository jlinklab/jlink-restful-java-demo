package jlink.restful.java.sdk.module.login;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.JLinkClient;
import jlink.restful.java.sdk.competent.*;
import jlink.restful.java.sdk.exception.JLinkDeviceLoginException;
import jlink.restful.java.sdk.exception.JLinkJsonException;
import jlink.restful.java.sdk.util.JLinkHttpUtil;
import jlink.restful.java.sdk.util.JLinkLog;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Device Login Request
 */
public class DeviceLoginRequest {
    /**
     * Login By User
     *
     * @param devUsername
     * @param devPassword
     * @param devToken
     * @return {@link DeviceLoginData}
     */
    public DeviceLoginData deviceLoginByUser(String devUsername, String devPassword, String devToken, JLinkClient jLinkClient) {
        DeviceLoginDto dto = new DeviceLoginDto();
        dto.setDevUsername(devUsername);
        dto.setDevPassword(devPassword);
        return deviceLogin(dto, devToken, jLinkClient);
    }

    public DeviceLoginData deviceLoginByUser(String devUsername, String devPassword, String devToken, Boolean share, JLinkClient jLinkClient) {
        DeviceLoginDto dto = new DeviceLoginDto();
        dto.setDevUsername(devUsername);
        dto.setDevPassword(devPassword);
        dto.setShare(share);
        return deviceLogin(dto, devToken, jLinkClient);
    }

    /**
     * Login By Token
     *
     * @param loginToken
     * @param devToken
     * @return {@link DeviceLoginData}
     */
    public DeviceLoginData deviceLoginByToken(String loginToken, String devToken, JLinkClient jLinkClient) {
        DeviceLoginDto dto = new DeviceLoginDto();
        dto.setLoginToken(loginToken);
        return deviceLogin(dto, devToken, jLinkClient);
    }


    /**
     * device Login
     *
     * @param dto      dto
     * @param devToken dev
     * @return {@link DeviceLoginData}
     */
    private DeviceLoginData deviceLogin(DeviceLoginDto dto, String devToken, JLinkClient jClient) {
        Map<String, String> header = new HashMap<>();
        header.put("appKey", jClient.getAppKey());
        header.put("uuid", jClient.getUuid());
        //Define the return bean for obtaining the device login, and verify the login parameters
        int verifyCode = verifyJLinkDeviceLoginDto(dto);
        String requestDeviceLoginUrl = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.DEVICE_LOGIN.get(), devToken);
        if (verifyCode == JLinkResponseCode.SUCCESS.getCode()) {
            //Parameter verification passed, login by username and password
            //Assemble the request address for logging in to the device requestDeviceLoginUrl
            JLinkLog.d("requestDeviceLoginUrl:\r\n" + requestDeviceLoginUrl);
            //Assign attributes to encapsulate the complete parameters of the request restfulAPI
            LoginBo bo = new LoginBo();
            bo.setDevUsername(dto.getDevUsername());
            bo.setDevPassword(dto.getDevPassword());
            bo.setLoginToken(dto.getLoginToken());
            bo.setShare(dto.getShare());
            //send https request
            String res = JLinkHttpUtil.httpsRequest(requestDeviceLoginUrl, JLinkMethodType.POST.get(), header, new Gson().toJson(bo));
            //debug打印返回结果
            JLinkLog.d("Login res:\r\n" + res);
            try {
                DeviceLoginResponse response = new Gson().fromJson(res, DeviceLoginResponse.class);
                if (response.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
                    if (response.getData().getRet() == JLinkDeviceResponseCode.SUCCESS.getCode()) {
                        //Device login successfully
                        return response.getData();
                    } else {
                        //If the RESTFul API request is successful, the device returns the login failure, and the returned information is judged uniformly according to the ret value.
                        throw new JLinkDeviceLoginException(response.getData().getRet(), response.getData().getRetMsg());
                    }
                } else {
                    //RESTFul API request status code judgment
                    throw new JLinkDeviceLoginException(response.getCode(), JLinkResponseCode.get(response.getCode()).getMsg());
                }
            } catch (Exception e) {
                throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
            }
        } else {
            JsonObject param = new JsonObject();
            try {
                String loginToken = URLEncoder.encode(dto.getLoginToken(), "utf-8");
                param.addProperty("LoginToken", loginToken);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            String res = JLinkHttpUtil.httpsRequest(requestDeviceLoginUrl, JLinkMethodType.POST.get(), null, new Gson().toJson(param));
            JLinkLog.d("Login res:\r\n" + res);
            try {
                DeviceLoginResponse response = new Gson().fromJson(res, DeviceLoginResponse.class);
                if (response.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
                    if (response.getData().getRet() == JLinkDeviceResponseCode.SUCCESS.getCode()) {
                        //Device login successfully
                        return response.getData();
                    } else {
                        //If the RESTFul API request is successful, the device returns the login failure, and the returned information is judged uniformly according to the ret value.
                        throw new JLinkDeviceLoginException(response.getData().getRet(), response.getData().getRetMsg());
                    }
                } else {
                    //RESTFul API request status code judgment
                    throw new JLinkDeviceLoginException(response.getCode(), JLinkResponseCode.get(response.getCode()).getMsg());
                }
            } catch (Exception e) {
                throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
            }
        }
    }

    /**
     * Verify jlink device login dto
     *
     * @param dto dto
     * @return int
     */
    private int verifyJLinkDeviceLoginDto(DeviceLoginDto dto) {
        if (StringUtils.isBlank(dto.getLoginToken())) {
            //If the device login LoginToken is empty, the user name and password cannot be empty
            if (StringUtils.isBlank(dto.getDevUsername())) {
                throw new JLinkDeviceLoginException(JLinkResponseCode.PARAM_ERROR.getCode(), "DevUsername Not Null");
            } else {
                //The verification is successful, log in with the username and password
                return JLinkResponseCode.SUCCESS.getCode();
            }
        } else {
            return JLinkResponseCode.SUCCESS_LOGIN_TOKEN.getCode();
        }
    }

    private static class DeviceLoginDto {
        /**
         * Device login user name
         */
        private String devUsername;
        /**
         * Device login password
         */
        private String devPassword;

        /**
         * loginToken
         *
         * @return
         */
        private String loginToken;

        private Boolean share;

        public String getDevUsername() {
            return devUsername;
        }

        public void setDevUsername(String devUsername) {
            this.devUsername = devUsername;
        }

        public String getDevPassword() {
            return devPassword;
        }

        public void setDevPassword(String devPassword) {
            this.devPassword = devPassword;
        }

        public String getLoginToken() {
            return loginToken;
        }

        public void setLoginToken(String loginToken) {
            this.loginToken = loginToken;
        }

        public Boolean getShare() {
            return share;
        }

        public void setShare(Boolean share) {
            this.share = share;
        }
    }

    private static class LoginBo {
        /**
         * Device login user name
         */
        @SerializedName("UserName")
        private String devUsername;
        /**
         * Device login password
         */
        @SerializedName("PassWord")
        private String devPassword;

        @SerializedName("Name")
        private String name = "generalinfo";

        @SerializedName("EncryptType")
        private String EncryptType = "MD5";

        @SerializedName("LoginType")
        private String loginType = "DVRIP-Web";

        @SerializedName("share")
        private Boolean share = false;
        /**
         * loginToken
         *
         * @return
         */
        @SerializedName("LoginToken")
        private String loginToken;

        public String getDevUsername() {
            return devUsername;
        }

        public void setDevUsername(String devUsername) {
            this.devUsername = devUsername;
        }

        public String getDevPassword() {
            return devPassword;
        }

        public void setDevPassword(String devPassword) {
            this.devPassword = devPassword;
        }

        public String getLoginToken() {
            return loginToken;
        }

        public void setLoginToken(String loginToken) {
            this.loginToken = loginToken;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEncryptType() {
            return EncryptType;
        }

        public void setEncryptType(String encryptType) {
            EncryptType = encryptType;
        }

        public String getLoginType() {
            return loginType;
        }

        public void setLoginType(String loginType) {
            this.loginType = loginType;
        }

        public Boolean getShare() {
            return share;
        }

        public void setShare(Boolean share) {
            this.share = share;
        }
    }
}
