package jlink.restful.java.sdk.module.tailored;

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
 * customConfigurationRequirements
 *
 * @author hjm
 * @date 2022/04/21
 */
public class TailoredConfigRequest {

    /**
     * Subscribe to news
     *
     * @param devToken devToken
     * @param sn       sn
     * @return boolean
     */
    public static TailoredConfigResponse tailoredConfig(String sn, String devToken) {
        TailoredConfigResponse response;
        String requestUrl = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.TAILORED_CONFIG.get(), devToken);
        Map<String, Object> map = new HashMap<>();
        map.put("sn", sn);
        String[] conf = {"bs", "bl"};
        map.put("configs", conf);
        //send https request
        String res = JLinkHttpUtil.httpsRequest(requestUrl, JLinkMethodType.POST.get(), null, new Gson().toJson(map));
        try {
            response = new Gson().fromJson(res, TailoredConfigResponse.class);
            if (response.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
                return response;
            } else {
                //RESTFul API request status code judgment
                throw new JLinkSubscribeException(response.getCode(), JLinkResponseCode.get(response.getCode()).getMsg());
            }
        } catch (Exception e) {
            throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
        }
    }
}

