package jlink.restful.java.sdk.module.usermanage;

import com.google.gson.Gson;
import jlink.restful.java.sdk.competent.JLinkDeviceRequestUrl;
import jlink.restful.java.sdk.competent.JLinkDomain;
import jlink.restful.java.sdk.competent.JLinkMethodType;
import jlink.restful.java.sdk.competent.JLinkResponseCode;
import jlink.restful.java.sdk.exception.JLinkDeviceUserManageException;
import jlink.restful.java.sdk.exception.JLinkJsonException;
import jlink.restful.java.sdk.util.JLinkHttpUtil;

/**
 * Device User Management Request
 *
 * @author hjm
 * @date 2022/04/21
 */
public class DeviceUserManageRequest {

    /**
     * User Management
     *
     * @param devToken
     * @param userManage
     * @return boolean
     */
    public static DeviceUserManageResponse userManage(DeviceUserManage userManage, String devToken) {
        DeviceUserManageResponse response;
        String requestUrl = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.DEVICE_USERMANAGE.get(), devToken);
        //send https request
        String res = JLinkHttpUtil.httpsRequest(requestUrl, JLinkMethodType.POST.get(), null, new Gson().toJson(userManage));
        try {
            response = new Gson().fromJson(res, userManage.getUserManageEnum().getType());
            if (response.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
                return response;
            } else {
                //RESTFul API request status code judgment
                throw new JLinkDeviceUserManageException(response.getCode(), JLinkResponseCode.get(response.getCode()).getMsg());
            }
        } catch (Exception e) {
            throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
        }
    }
}
