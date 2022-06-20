package jlink.restful.java.sdk.user;

import com.google.gson.Gson;
import jlink.restful.java.sdk.JLinkClient;
import jlink.restful.java.sdk.JLinkUser;
import jlink.restful.java.sdk.competent.JLinkDomain;
import jlink.restful.java.sdk.competent.JLinkMethodType;
import jlink.restful.java.sdk.competent.JLinkResponseCode;
import jlink.restful.java.sdk.exception.JLinkException;
import jlink.restful.java.sdk.exception.JLinkJsonException;
import jlink.restful.java.sdk.exception.JLinkSignatureException;
import jlink.restful.java.sdk.util.JLinkAesUtil;
import jlink.restful.java.sdk.util.JLinkHttpUtil;
import jlink.restful.java.sdk.util.JLinkSignatureUtil;
import jlink.restful.java.sdk.util.JLinkTimeMillisUtil;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * jlink UserToken Request
 *
 * @author hjm
 * @date 2022/04/22
 */
public class JLinkUserTokenRequest {
    /**
     * request user token
     *
     * @param jClient JLinkClient
     * @param jUser   jLinkUser
     * @return {@link String}
     */
    public String requestUserToken(JLinkClient jClient, JLinkUser jUser) {
        String timeMillis = JLinkTimeMillisUtil.getTimMillis();
        JLinkAesUtil aesUtils = new JLinkAesUtil();
        String data = "";
        try {
            String key = aesUtils.keyFilter(timeMillis, jClient.getAppSecret());
            String account = aesUtils.encryptToHexString(jUser.getAccount(), key);
            String pass = aesUtils.encryptToHexString(jUser.getPass(), key);
            data = "account=" + account + "&pass=" + pass;
        } catch (Exception e) {
            throw new JLinkException(JLinkResponseCode.AES_ERROR.getCode(), JLinkResponseCode.AES_ERROR.getMsg());
        }

        String sign = "";
        try {
            //Request for Open Platform Signature Certification
            sign = JLinkSignatureUtil.getEncryptStr(jClient.getUuid(), jClient.getAppKey(), jClient.getAppSecret(), timeMillis, jClient.getMoveCard());
        } catch (Exception e) {
            //Failed to get signature
            throw new JLinkSignatureException(JLinkResponseCode.SIGN_ERROR.getCode(), JLinkResponseCode.SIGN_ERROR.getMsg());
        }

        String requestDeviceTokenUrl = String.format("%s/%s/%s.rs", JLinkDomain.RS_DOMAIN.get(), timeMillis, sign);
        //Token requests need to assemble HTTP request Header parameters
        Map<String, String> requestHeader = new HashMap<>();
        //Set request header parameters
        requestHeader.put("uuid", jClient.getUuid());
        requestHeader.put("appKey", jClient.getAppKey());
        requestHeader.put("Content-Type", "application/x-www-form-urlencoded");
        //send https request
        String res = JLinkHttpUtil.httpsRequest(requestDeviceTokenUrl, JLinkMethodType.POST.get(), requestHeader, data);
        try {
            res = URLDecoder.decode(res, "utf-8");
//            System.out.println(res);
            JLinkUserTokenResponse response = new Gson().fromJson(res, JLinkUserTokenResponse.class);
            if (response.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
                return response.getData().getAccessToken();
            } else throw new JLinkUserException(response.getCode(), response.getMsg());
        } catch (Exception e) {
            throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
        }
    }

    private static class DeviceTokenDto {
        /**
         * devise serial number
         */
        private List<String> sns;
        /**
         * Additional parameter user Id; the current version can pass an empty
         */
        private String userId;

        public List<String> getSns() {
            return sns;
        }

        public void setSns(List<String> sns) {
            this.sns = sns;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }
    }
}
