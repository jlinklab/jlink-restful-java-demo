package jlink.restful.java.sdk.module.livestream;

import com.google.gson.Gson;
import jlink.restful.java.sdk.competent.*;
import jlink.restful.java.sdk.exception.JLinkDeviceLiveStreamException;
import jlink.restful.java.sdk.exception.JLinkJsonException;
import jlink.restful.java.sdk.util.JLinkHttpUtil;

/**
 * Device LiveStream Request
 *
 * @author hjm
 * @date 2022/04/21
 */
public class DeviceLiveStreamRequest {

    public String deviceLivestream(String user, String pass, String channel, String stream, String mediaType, String protocol, String userToken, String devToken) {
        return deviceLivestream(user, pass, channel, stream, mediaType, protocol, null, userToken, devToken);
    }


    /**
     * @param devToken
     * @param user
     * @param pass
     * @param channel
     * @param stream
     * @param mediaType
     * @param protocol
     * @param userToken
     * @return {@link DeviceLiveStreamResponse.DataDTO}
     */
    public String deviceLivestream(String user, String pass, String channel, String stream, String mediaType, String protocol, String expireTime, String userToken, String devToken) {
        DeviceLiveStreamResponse response;
        String requestUrl = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.DEVICE_LIVESTREAM.get(), devToken);
        LiveStreamParam param = new LiveStreamParam();
        param.setMediaType(mediaType);
        param.setChannel(channel);
        param.setStream(stream);
        param.setProtocol(protocol);
        param.setUserToken(userToken);
        param.setUsername(user);
        param.setDevPwd(pass);
        if (null != expireTime) param.setExpireTime(expireTime);
        //send https request
        String res = JLinkHttpUtil.httpsRequest(requestUrl, JLinkMethodType.POST.get(), null, new Gson().toJson(param));
        try {
            response = new Gson().fromJson(res, DeviceLiveStreamResponse.class);
            if (response.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
                if (response.getData().getRet() == JLinkDeviceResponseCode.SUCCESS.getCode()) {
                    return response.getData().getUrl();
                } else {
                    //If the RESTFul API request is successful, the device returns the login failure, and the returned information is judged uniformly according to the ret value.
                    throw new JLinkDeviceLiveStreamException(response.getData().getRet(), JLinkDeviceResponseCode.get(response.getData().getRet()).getMsg());
                }
            } else {
                //RESTFul API request status code judgment
                throw new JLinkDeviceLiveStreamException(response.getCode(), JLinkResponseCode.get(response.getCode()).getMsg());
            }
        } catch (Exception e) {
            throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
        }
    }

    /**
     * videoStreamParameters
     *
     * @author hjm
     * @date 2022/04/22
     */
    private static class LiveStreamParam {
        /**
         * mediaType
         */
        private String mediaType;
        /**
         * channel
         */
        private String channel;
        /**
         * flow
         */
        private String stream;
        /**
         * userName
         */
        private String username;
        /**
         * dev pwd
         */
        private String devPwd;
        /**
         * agreement
         */
        private String protocol;
        /**
         * userToken
         */
        private String userToken;

        /**
         * dueToTime
         */
        public String expireTime;

        public String getMediaType() {
            return mediaType;
        }

        public void setMediaType(String mediaType) {
            this.mediaType = mediaType;
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getStream() {
            return stream;
        }

        public void setStream(String stream) {
            this.stream = stream;
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

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public String getUserToken() {
            return userToken;
        }

        public void setUserToken(String userToken) {
            this.userToken = userToken;
        }

        public String getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(String expireTime) {
            this.expireTime = expireTime;
        }
    }
}
