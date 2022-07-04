package jlink.restful.java.sdk.module.alarm;

import com.google.gson.Gson;
import jlink.restful.java.sdk.competent.JLinkDeviceRequestUrl;
import jlink.restful.java.sdk.competent.JLinkDomain;
import jlink.restful.java.sdk.competent.JLinkMethodType;
import jlink.restful.java.sdk.competent.JLinkResponseCode;
import jlink.restful.java.sdk.exception.JLinkCloudStorageException;
import jlink.restful.java.sdk.exception.JLinkJsonException;
import jlink.restful.java.sdk.util.JLinkHttpUtil;

import java.util.HashMap;
import java.util.Map;


/**
 * Device cloud storage request
 *
 * @author hjm
 * @date 2022/07/01
 */
public class DeviceAlarmListRequest {
    /**
     * get alarmList
     *
     * @param sn
     * @param startTime
     * @param endTime
     * @param devToken
     * @return boolean
     */
    public DeviceAlarmListResponse getDeviceAlarmList(String sn, String startTime, String endTime, String devToken) {
        DeviceAlarmListResponse response;
        String requestUrl = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.CLOUD_ALARM_LIST.get(), devToken);
        Map<String, String> map = new HashMap<>();
        map.put("sn", sn);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        //send https request
        String res = JLinkHttpUtil.httpsRequest(requestUrl, JLinkMethodType.POST.get(), null, new Gson().toJson(map));
        try {
            response = new Gson().fromJson(res, DeviceAlarmListResponse.class);
            if (response.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
                return response;
            } else {
                //RESTFul API request status code judgment
                throw new JLinkCloudStorageException(response.getCode(), JLinkResponseCode.get(response.getCode()).getMsg());
            }
        } catch (Exception e) {
            throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
        }
    }
}
