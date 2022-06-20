package jlink.restful.java.sdk.module.ability;

import com.google.gson.Gson;
import jlink.restful.java.sdk.competent.*;
import jlink.restful.java.sdk.exception.JLinkDeviceAbilityException;
import jlink.restful.java.sdk.exception.JLinkJsonException;
import jlink.restful.java.sdk.util.JLinkHttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Device Ability
 */
public class DeviceAbilityRequest {

    /**
     * Get Device Ability
     */
    public DeviceAbilityResponse.DevAbility deviceAbility(JLinkDeviceAbilityEnum abilityEnum, String devToken) {
        DeviceAbilityResponse response;
        //Assemble the request address for obtaining the device capability set requestDeviceAbilityUrl
        String requestDeviceAbilityUrl = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.DEVICE_GETABILITY.get(), devToken);
        Map<String, String> param = new HashMap<>(1);
        param.put("Name", abilityEnum.getAbility());
        //send https request
        String res = JLinkHttpUtil.httpsRequest(requestDeviceAbilityUrl, JLinkMethodType.POST.get(), null, new Gson().toJson(param));
        try {
            response = new Gson().fromJson(res, DeviceAbilityResponse.class);
            if (response.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
                if (response.getData().getRet() == JLinkDeviceResponseCode.SUCCESS.getCode()) {
                    return response.getData();
                } else {
                    //If the RESTFul API request is successful, the device returns the login failure, and the returned information is judged uniformly according to the ret value.
                    throw new JLinkDeviceAbilityException(response.getData().getRet(), JLinkDeviceResponseCode.get(response.getData().getRet()).getMsg());
                }
            } else {
                //RESTFul API request status code judgment
                throw new JLinkDeviceAbilityException(response.getCode(), JLinkResponseCode.get(response.getCode()).getMsg());
            }
        } catch (Exception e) {
            throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
        }
    }
}
