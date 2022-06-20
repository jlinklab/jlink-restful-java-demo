package jlink.restful.java.sdk.module.info;

import com.google.gson.Gson;
import jlink.restful.java.sdk.competent.*;
import jlink.restful.java.sdk.exception.JLinkDeviceInfoException;
import jlink.restful.java.sdk.exception.JLinkJsonException;
import jlink.restful.java.sdk.util.JLinkHttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * DeviceInfo Request
 *
 * @author hjm
 * @date 2022/04/21
 */
public class DeviceInfoRequest {

    /**
     * Get Device Info
     */
    public DeviceInfoResponse.DevInfo deviceInfo(JLinkDeviceInfoEnum infoEnum, String devToken) {
        DeviceInfoResponse response;
        String requestDeviceInfoUrl = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.DEVICE_INFO.get(), devToken);
        Map<String, String> param = new HashMap<>(1);
        param.put("Name", infoEnum.name());
        //send https request
        String res = JLinkHttpUtil.httpsRequest(requestDeviceInfoUrl, JLinkMethodType.POST.get(), null, new Gson().toJson(param));
        try {
            response = new Gson().fromJson(res, DeviceInfoResponse.class);
            if (response.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
                if (response.getData().getRet() == JLinkDeviceResponseCode.SUCCESS.getCode()) {
                    return response.getData();
                } else {
                    //If the RESTFul API request is successful, the device returns the login failure, and the returned information is judged uniformly according to the ret value.
                    throw new JLinkDeviceInfoException(response.getData().getRet(), JLinkDeviceResponseCode.get(response.getData().getRet()).getMsg());
                }
            } else {
                //RESTFul API request status code judgment
                throw new JLinkDeviceInfoException(response.getCode(), JLinkResponseCode.get(response.getCode()).getMsg());
            }
        } catch (Exception e) {
            throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
        }
    }
}
