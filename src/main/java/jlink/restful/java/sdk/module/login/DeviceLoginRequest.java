package jlink.restful.java.sdk.module.login;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.competent.*;
import jlink.restful.java.sdk.exception.JLinkDeviceLoginException;
import jlink.restful.java.sdk.exception.JLinkJsonException;
import jlink.restful.java.sdk.util.JLinkHttpUtil;
import jlink.restful.java.sdk.util.JLinkLog;
import org.apache.commons.lang3.StringUtils;

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
    public DeviceLoginData deviceLoginByUser(String devUsername, String devPassword, String devToken) {
        DeviceLoginDto dto = new DeviceLoginDto();
        dto.setDevUsername(devUsername);
        dto.setDevPassword(devPassword);
        return deviceLogin(dto, devToken);
    }

    /**
     * Login By Token
     *
     * @param loginToken
     * @param devToken
     * @return {@link DeviceLoginData}
     */
    public DeviceLoginData deviceLoginByToken(String loginToken, String devToken) {
        DeviceLoginDto dto = new DeviceLoginDto();
        dto.setLoginToken(loginToken);
        return deviceLogin(dto, devToken);
    }


    /**
     * device Login
     *
     * @param dto      dto
     * @param devToken dev
     * @return {@link DeviceLoginData}
     */
    private DeviceLoginData deviceLogin(DeviceLoginDto dto, String devToken) {
        //Define the return bean for obtaining the device login, and verify the login parameters
        int verifyCode = verifyJLinkDeviceLoginDto(dto);
        if (verifyCode == JLinkResponseCode.SUCCESS.getCode()) {
            //Parameter verification passed, login by username and password
            //Assemble the request address for logging in to the device requestDeviceLoginUrl
            String requestDeviceLoginUrl = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.DEVICE_LOGIN.get(), devToken);
            JLinkLog.d("requestDeviceLoginUrl:\r\n" + requestDeviceLoginUrl);
            //Assign attributes to encapsulate the complete parameters of the request restfulAPI
            LoginBo bo = new LoginBo();
            bo.setDevUsername(dto.getDevUsername());
            bo.setDevPassword(dto.getDevPassword());
            bo.setLoginToken(dto.getLoginToken());
            //send https request
            String res = JLinkHttpUtil.httpsRequest(requestDeviceLoginUrl, JLinkMethodType.POST.get(), null, new Gson().toJson(bo));
            //debug??????????????????
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
            //If the parameter verification is passed, press the login Token to log in
            //temporaryDoesNotSupport
            throw new JLinkDeviceLoginException(JLinkDeviceResponseCode.VERSION_NOT_SUPPORTED.getCode(), "Not Support LoginToken");
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
        /**
         * loginToken
         *
         * @return
         */
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
    }
}
