package jlink.restful.java.sdk.module.opdev;

import com.google.gson.Gson;
import jlink.restful.java.sdk.competent.JLinkDeviceRequestUrl;
import jlink.restful.java.sdk.competent.JLinkDomain;
import jlink.restful.java.sdk.competent.JLinkMethodType;
import jlink.restful.java.sdk.competent.JLinkResponseCode;
import jlink.restful.java.sdk.exception.JLinkDeviceOperateException;
import jlink.restful.java.sdk.exception.JLinkJsonException;
import jlink.restful.java.sdk.util.JLinkHttpUtil;

/**
 * DeviceOperate Request
 *
 * @author hjm
 * @date 2022/04/21
 */
public class DeviceOperateRequest {

    /**
     * operate
     *
     * @param operate
     * @param devToken
     * @return boolean
     */
    public static DeviceOperateResponse operate(DeviceOperate operate, String devToken) {
        //Define the return bean to get the device capability set
        DeviceOperateResponse response;
        //Assemble the request address for obtaining the device capability set
        String requestDeviceOperateUrl = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.DEVICE_OPDEV.get(), devToken);
        //send https request
        String res = JLinkHttpUtil.httpsRequest(requestDeviceOperateUrl, JLinkMethodType.POST.get(), null, new Gson().toJson(operate));
        try {
            res = formatRes(res);
            response = new Gson().fromJson(res, operate.getOperateEnum().getType());
            if (response.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
                return response;
            } else {
                //RESTFul API request status code judgment
                throw new JLinkDeviceOperateException(response.getCode(), JLinkResponseCode.get(response.getCode()).getMsg());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
        }
    }

    /**
     * Handle the problem that the format of the returned fields on the device side is not uniform
     *
     * @param res
     * @return
     */
    private static String formatRes(String res) {
        res = res.replaceAll("\"Length\":\"\"", "\"Length\":0");
        return res;
    }
}
