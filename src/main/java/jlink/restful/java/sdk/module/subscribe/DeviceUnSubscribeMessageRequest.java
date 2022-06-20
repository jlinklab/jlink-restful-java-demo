package jlink.restful.java.sdk.module.subscribe;

import com.google.gson.Gson;
import jlink.restful.java.sdk.competent.JLinkDeviceRequestUrl;
import jlink.restful.java.sdk.competent.JLinkDomain;
import jlink.restful.java.sdk.competent.JLinkMethodType;
import jlink.restful.java.sdk.competent.JLinkResponseCode;
import jlink.restful.java.sdk.exception.JLinkJsonException;
import jlink.restful.java.sdk.exception.JLinkSubscribeException;
import jlink.restful.java.sdk.util.JLinkHttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Device unsubscribe message request
 *
 * @author hjm
 * @date 2022/04/21
 */
public class DeviceUnSubscribeMessageRequest {

    /**
     * Unsubscribe from messages
     *
     * @param devToken
     * @param userToken
     * @return boolean
     */
    public boolean unSubscribeMessage(String userToken, String devToken) {
        DeviceMessageResponse response;
        String requestUrl = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.UNSUBSCRIBE_MESSAGE.get(), devToken);
        Map<String, String> map = new HashMap<>();
        map.put("userToken", userToken);
        //send https request
        String res = JLinkHttpUtil.httpsRequest(requestUrl, JLinkMethodType.POST.get(), null, new Gson().toJson(map));
        try {
            response = new Gson().fromJson(res, DeviceMessageResponse.class);
            if (response.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
                return true;
            } else {
                //RESTFul API request status code judgment
                throw new JLinkSubscribeException(response.getCode(), JLinkResponseCode.get(response.getCode()).getMsg());
            }
        } catch (Exception e) {
            throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
        }
    }
}
