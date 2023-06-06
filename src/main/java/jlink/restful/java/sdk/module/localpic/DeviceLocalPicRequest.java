package jlink.restful.java.sdk.module.localpic;

import com.google.gson.Gson;
import jlink.restful.java.sdk.competent.JLinkDeviceRequestUrl;
import jlink.restful.java.sdk.competent.JLinkDomain;
import jlink.restful.java.sdk.competent.JLinkMethodType;
import jlink.restful.java.sdk.competent.JLinkResponseCode;
import jlink.restful.java.sdk.exception.JLinkException;
import jlink.restful.java.sdk.exception.JLinkJsonException;
import jlink.restful.java.sdk.util.JLinkHttpUtil;


/**
 * request Local Pictures
 *
 * @author hjm
 * @date 2023/04/01
 */
public class DeviceLocalPicRequest {


    /**
     * Device Local Image
     *
     * @param sn        sn
     * @param startTime startTime
     * @param endTime   endTime
     * @param fileName  fileName
     * @param devToken  device token
     * @return {@link String}
     */
    public String deviceLocalPic(String sn, String startTime, String endTime, String fileName, String devToken) {
        DeviceLocalPicResponse response;
        String requestUrl = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.DEVICE_LOCAL_PIC.get(), devToken);
        DeviceLocalPicParam param = new DeviceLocalPicParam();
        param.setStartTime(startTime);
        param.setEndTime(endTime);
        param.setFileName(fileName);
        param.setSn(sn);
        //send https request
        String res = JLinkHttpUtil.httpsRequest(requestUrl, JLinkMethodType.POST.get(), null, new Gson().toJson(param));
        try {
            response = new Gson().fromJson(res, DeviceLocalPicResponse.class);
            if (response.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
                return response.getData().getImage();
            } else {
                //RESTFul API request status code judgment
                throw new JLinkException(response.getCode(), JLinkResponseCode.get(response.getCode()).getMsg());
            }
        } catch (Exception e) {
            throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
        }
    }


    /**
     * Device Local Image Parameters
     *
     * @author hjm
     * @date 2023/04/01
     */
    private static class DeviceLocalPicParam {
        /**
         * fileName
         */
        private String fileName;

        /**
         * sn
         */
        private String sn;

        /**
         * startTime
         */
        private String startTime;

        /**
         * endOfTime
         */
        private String endTime;

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getSn() {
            return sn;
        }

        public void setSn(String sn) {
            this.sn = sn;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }
    }
}
