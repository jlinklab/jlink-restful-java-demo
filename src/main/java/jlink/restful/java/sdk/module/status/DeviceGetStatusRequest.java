package jlink.restful.java.sdk.module.status;

import com.google.gson.Gson;
import jlink.restful.java.sdk.competent.JLinkDeviceRequestUrl;
import jlink.restful.java.sdk.competent.JLinkDomain;
import jlink.restful.java.sdk.competent.JLinkMethodType;
import jlink.restful.java.sdk.competent.JLinkResponseCode;
import jlink.restful.java.sdk.exception.JLinkJsonException;
import jlink.restful.java.sdk.util.JLinkHttpUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * DeviceGetStatusRequest
 */
public class DeviceGetStatusRequest {
    /**
     * getDeviceStatus
     *
     * @param token
     * @return {@link DeviceStatusData}
     */
    public DeviceStatusData getDeviceStatus(String token) {
        List<String> str = new ArrayList<>();
        str.add(token);
        StatusDto dto = new StatusDto();
        dto.setToken(str);
        dto.setOtherStatus(true);
        //Assemble the request address for obtaining the device ret requestDeviceStatusUrl
        String requestDeviceStatusUrl = String.format("%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.DEVICE_STATUS.get());
        //send https request
        String res = JLinkHttpUtil.httpsRequest(requestDeviceStatusUrl, JLinkMethodType.POST.get(), null, new Gson().toJson(dto));
        //Convert the return string to a bean object
        try {
            DeviceStatusResponse response = new Gson().fromJson(res, DeviceStatusResponse.class);
            return response.getData().get(0);
        } catch (Exception e) {
            throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
        }

    }

    private static class StatusDto {
        /**
         * Device Token Collection
         */
        private List<String> token;

        /**
         * The value is true to return rps, dss, p2p detailed ret; the default is false
         */
        private boolean otherStatus;

        public List<String> getToken() {
            return token;
        }

        public void setToken(List<String> token) {
            this.token = token;
        }

        public boolean isOtherStatus() {
            return otherStatus;
        }

        public void setOtherStatus(boolean otherStatus) {
            this.otherStatus = otherStatus;
        }
    }
}
