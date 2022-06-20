package jlink.restful.java.sdk.module.playback;

import com.google.gson.Gson;
import jlink.restful.java.sdk.competent.JLinkDeviceRequestUrl;
import jlink.restful.java.sdk.competent.JLinkDomain;
import jlink.restful.java.sdk.competent.JLinkMethodType;
import jlink.restful.java.sdk.competent.JLinkResponseCode;
import jlink.restful.java.sdk.exception.JLinkException;
import jlink.restful.java.sdk.exception.JLinkJsonException;
import jlink.restful.java.sdk.util.JLinkHttpUtil;


/**
 * 设备回放请求
 *
 * @author hjm
 * @date 2022/04/28
 */
public class DevicePlaybackRequest {

    /**
     * playback Request
     *
     * @param devToken
     * @param user
     * @param pass
     * @param channel
     * @param stream
     * @param userToken
     * @param fileName
     * @param startTime
     * @param endTime
     * @return {@link String}
     */
    public String devicePlayback(String user, String pass, int channel, int stream, String startTime, String endTime, String fileName, String userToken, String devToken) {
        DevicePlaybackResponse response;
        String requestUrl = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.DEVICE_PLAYBACKSTREAM.get(), devToken);
        PlayBackParam param = new PlayBackParam();
        param.setChannel(channel);
        param.setStreamType(stream);
        param.setStartTime(startTime);
        param.setEndTime(endTime);
        param.setFileName(fileName);
        param.setUserToken(userToken);
        param.setUsername(user);
        param.setDevPwd(pass);
        //send https request
        String res = JLinkHttpUtil.httpsRequest(requestUrl, JLinkMethodType.POST.get(), null, new Gson().toJson(param));
        try {
            response = new Gson().fromJson(res, DevicePlaybackResponse.class);
            if (response.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
                return response.getData().getUrl();
            } else {
                //RESTFul API request status code judgment
                throw new JLinkException(response.getCode(), JLinkResponseCode.get(response.getCode()).getMsg());
            }
        } catch (Exception e) {
            throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
        }
    }

    /**
     * playbackParameters
     *
     * @author hjm
     * @date 2022/04/22
     */
    private static class PlayBackParam {
        /**
         * fileName
         */
        private String fileName;
        /**
         * channel
         */
        private int channel;
        /**
         * advocateComplementaryCodeFlow
         */
        private int streamType;
        /**
         * userName
         */
        private String username;
        /**
         * dev pwd
         */
        private String devPwd;
        /**
         * userToken
         */
        private String userToken;

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

        public int getChannel() {
            return channel;
        }

        public void setChannel(int channel) {
            this.channel = channel;
        }

        public int getStreamType() {
            return streamType;
        }

        public void setStreamType(int streamType) {
            this.streamType = streamType;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getDevPwd() {
            return devPwd;
        }

        public void setDevPwd(String devPwd) {
            this.devPwd = devPwd;
        }

        public String getUserToken() {
            return userToken;
        }

        public void setUserToken(String userToken) {
            this.userToken = userToken;
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
