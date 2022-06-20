package jlink.restful.java.sdk.module.devicetoken;

import com.google.gson.Gson;
import jlink.restful.java.sdk.JLinkClient;
import jlink.restful.java.sdk.competent.JLinkDeviceRequestUrl;
import jlink.restful.java.sdk.competent.JLinkDomain;
import jlink.restful.java.sdk.competent.JLinkMethodType;
import jlink.restful.java.sdk.competent.JLinkResponseCode;
import jlink.restful.java.sdk.exception.JLinkJsonException;
import jlink.restful.java.sdk.exception.JLinkSignatureException;
import jlink.restful.java.sdk.util.JLinkHttpUtil;
import jlink.restful.java.sdk.util.JLinkLog;
import jlink.restful.java.sdk.util.JLinkSignatureUtil;
import jlink.restful.java.sdk.util.JLinkTimeMillisUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DeviceToken Request
 */
public class DeviceTokenRequest {
    /**
     * @param sn devise serial number
     * @return
     * @throws Exception
     */
    public String getDeviceToken(JLinkClient jClient, String sn) {
        DeviceTokenDto dto = new DeviceTokenDto();
        List<String> strSn = new ArrayList<>();
        strSn.add(sn);
        dto.setSns(strSn);
        //getTimestamp
        String timeMillis = JLinkTimeMillisUtil.getTimMillis();
        //Defining Open Platform Authentication Variables sign
        String sign = "";
        try {
            //Request for Open Platform Signature Certification
            sign = JLinkSignatureUtil.getEncryptStr(jClient.getUuid(), jClient.getAppKey(), jClient.getAppSecret(), timeMillis, jClient.getMoveCard());
        } catch (Exception e) {
            //Failed to get signature
            throw new JLinkSignatureException(JLinkResponseCode.SIGN_ERROR.getCode(), JLinkResponseCode.SIGN_ERROR.getMsg());
        }
        //Assemble the request address for obtaining the device Token requestDeviceTokenUrl
        String requestDeviceTokenUrl = String.format("%s/%s/%s/%s.rs", JLinkDomain.TKS_DOMAIN.get(), JLinkDeviceRequestUrl.DEVICE_TOKEN.get(), timeMillis, sign);
        //  Token requests need to assemble HTTP request Header parameters
        Map<String, String> requestHeader = new HashMap<>();
        //Set the request header uuid parameter
        requestHeader.put("uuid", jClient.getUuid());
        //Set the request header appKey parameter
        requestHeader.put("appKey", jClient.getAppKey());
        //send https request
        String res = JLinkHttpUtil.httpsRequest(requestDeviceTokenUrl, JLinkMethodType.POST.get(), requestHeader, new Gson().toJson(dto));
        //debug print return result
        JLinkLog.d("GetToken res:\r\n" + res);
        try {
            DeviceTokenResponse response = new Gson().fromJson(res, DeviceTokenResponse.class);
            return response.getData().get(0).getToken();
        } catch (Exception e) {
            throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
        }
    }

    private static class DeviceTokenDto {
        /**
         * devise serial number set
         */
        private List<String> sns;
        /**
         * Additional parameter userId; the current version can pass an empty string
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
