package jlink.restful.java.sdk;

import com.google.gson.Gson;
import jlink.restful.java.sdk.competent.*;
import jlink.restful.java.sdk.databind.JLinkServerResponse;
import jlink.restful.java.sdk.exception.*;
import jlink.restful.java.sdk.module.ability.DeviceAbilityRequest;
import jlink.restful.java.sdk.module.ability.DeviceAbilityResponse;
import jlink.restful.java.sdk.module.alarm.DeviceAlarmListRequest;
import jlink.restful.java.sdk.module.alarm.DeviceAlarmListResponse;
import jlink.restful.java.sdk.module.capture.DeviceCaptureRequest;
import jlink.restful.java.sdk.module.cloudstorage.DeviceCloudStorageAlarmRequest;
import jlink.restful.java.sdk.module.cloudstorage.DeviceCloudStoragePicResponse;
import jlink.restful.java.sdk.module.cloudstorage.DeviceCloudStorageVideoListResponse;
import jlink.restful.java.sdk.module.config.DeviceConfig;
import jlink.restful.java.sdk.module.devicetoken.DeviceTokenRequest;
import jlink.restful.java.sdk.module.info.DeviceInfoRequest;
import jlink.restful.java.sdk.module.info.DeviceInfoResponse;
import jlink.restful.java.sdk.module.keepalive.DeviceKeepAliveEnum;
import jlink.restful.java.sdk.module.keepalive.DeviceKeepaliveResponse;
import jlink.restful.java.sdk.module.livestream.DeviceLiveStreamRequest;
import jlink.restful.java.sdk.module.localpic.DeviceLocalPicRequest;
import jlink.restful.java.sdk.module.login.DeviceLoginData;
import jlink.restful.java.sdk.module.login.DeviceLoginRequest;
import jlink.restful.java.sdk.module.login.DeviceSession;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateRequest;
import jlink.restful.java.sdk.module.opdev.DeviceOperateResponse;
import jlink.restful.java.sdk.module.playback.DevicePlaybackRequest;
import jlink.restful.java.sdk.module.status.DeviceGetStatusRequest;
import jlink.restful.java.sdk.module.status.DeviceStatusData;
import jlink.restful.java.sdk.module.subscribe.DeviceSubscribeMessageRequest;
import jlink.restful.java.sdk.module.subscribe.DeviceUnSubscribeMessageRequest;
import jlink.restful.java.sdk.module.tailored.TailoredConfigRequest;
import jlink.restful.java.sdk.module.tailored.TailoredConfigResponse;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManage;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManageRequest;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManageResponse;
import jlink.restful.java.sdk.util.JLinkHttpUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * device Object
 */
public class JLinkDevice {
    /**
     * devise serial number
     */
    private String mDeviceSn;

    private JLinkClient mJLinkClient = null;

    /**
     * device UserName
     */
    private String mDeviceUser;

    /**
     * device Password
     */
    private String mDevicePass;

    /**
     * session
     */
    private final DeviceSession session = new DeviceSession();

    /**
     * @param sn      devise serial number
     * @param jClient
     */
    public JLinkDevice(JLinkClient jClient, String sn) {
        this.mJLinkClient = jClient;
        this.mDeviceSn = sn;
    }

    public JLinkDevice(JLinkClient jClient, String sn, String devUsername, String devPassword) {
        this.mJLinkClient = jClient;
        this.mDeviceSn = sn;
        this.mDeviceUser = devUsername;
        this.mDevicePass = devPassword;
    }

    /******************************basic Method*********************************/
    /**
     * getDeviceToken
     *
     * @return {@link String}
     */
    public String getDeviceToken() {
        String deviceToken = session.getDeviceToken();
        if (deviceToken == null) {
            deviceToken = new DeviceTokenRequest().getDeviceToken(mJLinkClient, mDeviceSn);
            session.setDeviceToken(deviceToken);
        }
        if (deviceToken == null || "".equals(deviceToken)) {
            throw new JLinkDeviceTokenException(JLinkResponseCode.DEVICE_TOKEN_ERROR.getCode(), JLinkResponseCode.DEVICE_TOKEN_ERROR.getMsg());
        }
        return deviceToken;
    }

    /**
     * access to device State
     */
    public DeviceStatusData deviceStatus() {
        return new DeviceGetStatusRequest().getDeviceStatus(getDeviceToken(), this.mJLinkClient);
    }

    public DeviceStatusData deviceStatus(JLinkClient jClient) {
        return new DeviceGetStatusRequest().getDeviceStatus(getDeviceToken(), jClient);
    }

    /**
     * Low-power device wakeup
     */
    public boolean wakeUp() {
        String url = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.DEVICE_WAKEUP.get(), getDeviceToken());
        String res = JLinkHttpUtil.post(url, null, "{}");
        try {
            JLinkServerResponse<String> response = new Gson().fromJson(res, JLinkServerResponse.class);
            return response.getCode() == 2000;
        } catch (Exception e) {
            throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
        }
    }

    /**
     * Get device information
     *
     * @param infoEnum informationEnumeration
     * @return {@link DeviceInfoResponse.DevInfo}
     */
    public DeviceInfoResponse.DevInfo deviceInfo(JLinkDeviceInfoEnum infoEnum) {
        //todo 1、determineLogin
        if (!session.isLogin()) {
            login();
        }
        //todo 2、getting information
        return new DeviceInfoRequest().deviceInfo(infoEnum, getDeviceToken());
    }

    /**
     * automatic Login device
     *
     * @return {@link DeviceLoginData}
     */
    public DeviceLoginData login() {
        DeviceLoginData loginData = deviceLoginByUser(mDeviceUser, mDevicePass, false);
        if (loginData.getRet() == 100) {
            session.setLogin(true);
            //todo Login successful keep heartbeat
        }
        return loginData;
    }

    /**
     * @param share share's device
     * @return {@link DeviceLoginData}
     */
    public DeviceLoginData login(Boolean share) {
        DeviceLoginData loginData = deviceLoginByUser(mDeviceUser, mDevicePass, share);
        if (loginData.getRet() == 100) {
            session.setLogin(true);
            //todo Login successful keep heartbeat
        }
        return loginData;
    }

    /**
     * device Capability
     *
     * @param abilityEnum abilityToEnumerate
     * @return {@link DeviceAbilityResponse.DevAbility}
     */
    public DeviceAbilityResponse.DevAbility deviceAbility(JLinkDeviceAbilityEnum abilityEnum) {
        //todo 1、determineLogin
        if (!session.isLogin()) {
            login();
        }
        //todo 2、accessToSet
        return new DeviceAbilityRequest().deviceAbility(abilityEnum, getDeviceToken());
    }

    /**
     * device ToKeepAlive
     */
    public boolean keepalive() {
        //todo 1、determineLogin
        if (!session.isLogin()) {
            login();
        }
        String url = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.DEVICE_KEEPALIVE.get(), getDeviceToken());
        Map<String, String> param = new HashMap<>(1);
        param.put("Name", DeviceKeepAliveEnum.KEEPALIVE.get());
        String res = JLinkHttpUtil.post(url, null, new Gson().toJson(param));
        try {
            DeviceKeepaliveResponse response = new Gson().fromJson(res, DeviceKeepaliveResponse.class);
            return response.getCode() == 2000 && response.getData().getRet() == 100;
        } catch (Exception e) {
            throw new JLinkJsonException(JLinkResponseCode.JSON_ERROR.getCode(), res);
        }
    }

    /**
     * accessToConfiguration
     */
    public Object getConfig(JLinkDeviceConfigTypeEnum configTypeEnum) {
        DeviceConfig wrapper = getConfigWrapper(configTypeEnum);
        return wrapper;
    }

    /**
     * setDeviceConfiguration with return info
     */
    public DeviceConfig settingConfig(DeviceConfig setConfig) {
        if (!session.isLogin()) {
            login();
        }
        String url = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.DEVICE_SETCONFIG.get(), getDeviceToken());
        return posting(setConfig, url);
    }


    /**
     * setDeviceConfiguration
     */
    public Boolean setConfig(DeviceConfig setConfig) {
        //todo 1、determineLogin
        if (!session.isLogin()) {
            login();
        }
        String url = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.DEVICE_SETCONFIG.get(), getDeviceToken());
        return post(setConfig, url);
    }


    /**
     * setDeviceConfiguration with return info
     */
    private DeviceConfig posting(DeviceConfig setConfig, String url) {
        String body = JLinkHttpUtil.post(url, null, new Gson().toJson(setConfig));
        DeviceConfig res = new Gson().fromJson(body, DeviceConfig.class);
        if (res.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
            return res;
        } else {
            throw new JLinkDeviceGetConfigException(res.getCode(), res.getMsg());
        }
    }

    private Boolean post(DeviceConfig setConfig, String url) {
        String body = JLinkHttpUtil.post(url, null, new Gson().toJson(setConfig));
        DeviceConfig res = new Gson().fromJson(body, DeviceConfig.class);
        if (res.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
            return true;
        } else {
            throw new JLinkDeviceGetConfigException(res.getCode(), res.getMsg());
        }
    }

    public Object tailoredConfig() {
        TailoredConfigResponse response = TailoredConfigRequest.tailoredConfig(getSn(), getDeviceToken());
        if (response.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
            return response.getData();
        } else {
            throw new JLinkException(response.getCode(), response.getMsg());
        }
    }

    /**
     * device Operation
     *
     * @return boolean
     */
    public Object deviceOperate(DeviceOperate operate) {
        //todo 1、determineLogin
        if (!session.isLogin()) {
            login();
        }
        //todo 2.device Operation
        DeviceOperateResponse response = DeviceOperateRequest.operate(operate, getDeviceToken(), this.mJLinkClient);
        if (response.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
            return response.getData();
        } else {
            throw new JLinkDeviceOperateException(response.getCode(), response.getMsg());
        }
    }

    /**
     * device liveStream
     *
     * @return boolean
     */
    public String deviceLivestream(String stream, String mediaType, String protocol, JLinkUser jUser) {
        return deviceLivestream(0, stream, mediaType, protocol, jUser);
    }

    /**
     * deviceLivestream
     *
     * @param channel   channel
     * @param stream    stream
     * @param mediaType mediaType
     * @param protocol  protocol
     * @param jUser     user
     * @return {@link String}
     */
    public String deviceLivestream(int channel, String stream, String mediaType, String protocol, JLinkUser jUser) {
        return new DeviceLiveStreamRequest().deviceLivestream(mDeviceUser, mDevicePass, String.valueOf(channel), stream, mediaType, protocol, jUser.getUserToken(), getDeviceToken(), this.mJLinkClient);
    }

    public String deviceLivestream(int channel, String stream, String mediaType, String protocol, String expireTime, JLinkUser jUser) {
        return new DeviceLiveStreamRequest().deviceLivestream(mDeviceUser, mDevicePass, String.valueOf(channel), stream, mediaType, protocol, expireTime, null, null, jUser.getUserToken(), getDeviceToken(), this.mJLinkClient);
    }

    public String deviceLivestream(String channel, String stream, String mediaType, String protocol, String expireTime, String videoCode, String audioCode, JLinkUser jUser) {
        return new DeviceLiveStreamRequest().deviceLivestream(mDeviceUser, mDevicePass, channel, stream, mediaType, protocol, expireTime, videoCode, audioCode, jUser.getUserToken(), getDeviceToken(), this.mJLinkClient);
    }

    /**
     * device Capture
     */
    public String capture(int channel, JLinkUser jUser) {
        //todo 1、determineLogin
        if (!session.isLogin()) {
            login();
        }
        //todo 2、设备抓图
        return new DeviceCaptureRequest().deviceCapture(channel, jUser.getUserToken(), getDeviceToken());

    }

    public String capture(JLinkUser jUser) {
        return capture(0, jUser);
    }

    /**
     * cloud storage alarm pic
     */
    public List<DeviceCloudStoragePicResponse.UrlDto> getPicUrl(List<String> alarmIds) {
        /*if (!session.isLogin()) {
            login();
        }*/
        return new DeviceCloudStorageAlarmRequest().getPicUrl(alarmIds, getDeviceToken());
    }

    /**
     * cloud storage alarm video
     */
    public String getVideoUrl(String startTime, String stopTime) {
        if (!session.isLogin()) {
            login();
        }
        return new DeviceCloudStorageAlarmRequest().getVideoUrl(startTime, stopTime, getDeviceToken());
    }

    /**
     * cloud storage alarm video
     */
    public List<DeviceCloudStorageVideoListResponse.DataDTO.VideoDTO> getVideoList(String startTime, String stopTime) {
        if (!session.isLogin()) {
            login();
        }
        return new DeviceCloudStorageAlarmRequest().getVideoList(startTime, stopTime, getDeviceToken());
    }

    /**
     * get playback video thumbnail
     */
    public List<DeviceCloudStoragePicResponse.UrlDto> getVideoPicUrl(List<DeviceCloudStorageAlarmRequest.GetVideoPicUrlParam> param) {
        if (!session.isLogin()) {
            login();
        }
        return new DeviceCloudStorageAlarmRequest().getVideoPicUrl(param, getDeviceToken());
    }

    /**
     * Device subscribes to alarm messages
     */
    public boolean subscribe(String callbackUrl, JLinkUser jUser) {
        return new DeviceSubscribeMessageRequest().subscribeMessage(callbackUrl, jUser.getUserToken(), getDeviceToken());
    }

    /**
     * Device unsubscribes from alarm messages
     */
    public boolean unSubscribe(JLinkUser jUser) {
        return new DeviceUnSubscribeMessageRequest().unSubscribeMessage(jUser.getUserToken(), getDeviceToken());
    }

    public Object userManage(DeviceUserManage userManage) {
        //todo 1、determineLogin
        if (!session.isLogin()) {
            login();
        }
        //todo 2、User action
        DeviceUserManageResponse response = DeviceUserManageRequest.userManage(userManage, getDeviceToken());
        if (response.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
            return response.getData();
        } else {
            throw new JLinkDeviceUserManageException(response.getCode(), response.getMsg());
        }
    }

    /**
     * Device playback address
     *
     * @return boolean
     */
    public String devicePlayback(int stream, String startTime, String endTime, String fileName, JLinkUser jUser) {
        return devicePlayback(0, stream, startTime, endTime, fileName, jUser);
    }

    public String devicePlayback(int channel, int stream, String startTime, String endTime, String fileName, JLinkUser jUser) {
        return new DevicePlaybackRequest().devicePlayback(mDeviceUser, mDevicePass, channel, stream, startTime, endTime, fileName, jUser.getUserToken(), getDeviceToken());
    }

    /**
     * Device playback timeline (SD Card)
     *
     * @param sn
     * @param beginTime
     * @param endTime
     * @return {@link String}
     */
    /**
     * Device playback timeline (SD Card)
     *
     * @param sn
     * @param beginTime
     * @param endTime
     * @return {@link String}
     */
    public String playbackTimelineList(String sn, String beginTime, String endTime) {
        return new DevicePlaybackRequest().playbackTimelineListImpl(sn, beginTime, endTime, null, 1, null, 0, null, null, getDeviceToken());
    }

    public String playbackTimelineList(String sn, String beginTime, String endTime, String event) {
        return new DevicePlaybackRequest().playbackTimelineListImpl(sn, beginTime, endTime, event, 1, null, 0, null, null, getDeviceToken());
    }

    public String playbackTimelineList(String sn, String beginTime, String endTime, String event, int lowChannel, String lowStreamType) {
        return new DevicePlaybackRequest().playbackTimelineListImpl(sn, beginTime, endTime, event, lowChannel, lowStreamType, 0, null, null, getDeviceToken());
    }

    public String playbackTimelineList(String sn, String beginTime, String endTime, String event, int lowChannel, String lowStreamType, int highChannel, String highStreamType) {
        return new DevicePlaybackRequest().playbackTimelineListImpl(sn, beginTime, endTime, event, lowChannel, lowStreamType, highChannel, highStreamType, null, getDeviceToken());
    }

    public String playbackTimelineList(String sn, String beginTime, String endTime, String event, int lowChannel, String lowStreamType, int highChannel, String highStreamType, String type) {
        return new DevicePlaybackRequest().playbackTimelineListImpl(sn, beginTime, endTime, event, lowChannel, lowStreamType, highChannel, highStreamType, type, getDeviceToken());
    }

    /**
     * Alarm List
     *
     * @param sn
     * @param startTime
     * @param endTime
     * @return {@link DeviceAlarmListResponse}
     */
    public DeviceAlarmListResponse getAlarmList(String sn, String startTime, String endTime) {
        return new DeviceAlarmListRequest().getDeviceAlarmList(sn, startTime, endTime, getDeviceToken());
    }

    public String deviceLocalPic(String startTime, String endTime, String fileName, JLinkUser jUser) {
        return new DeviceLocalPicRequest().deviceLocalPic(mDeviceSn, startTime, endTime, fileName, getDeviceToken());
    }

    /******************************basic Method*********************************/

    /******************************getter and setter*********************************/
    public String getSn() {
        return mDeviceSn;
    }

    public String getDeviceUser() {
        return mDeviceUser;
    }

    public void setDeviceUser(String mDeviceUser) {
        this.mDeviceUser = mDeviceUser;
    }

    public String getDevicePass() {
        return mDevicePass;
    }

    public void setDevicePass(String mDevicePass) {
        this.mDevicePass = mDevicePass;
    }

    /******************************method*********************************/


    /**
     * Log in to the device by username and password
     *
     * @param userName
     * @param passWord
     * @return
     */
    public DeviceLoginData deviceLoginByUser(String userName, String passWord) {
        return new DeviceLoginRequest().deviceLoginByUser(userName, passWord, getDeviceToken(), this.mJLinkClient);
    }

    public DeviceLoginData deviceLoginByUser(String userName, String passWord, Boolean share) {
        return new DeviceLoginRequest().deviceLoginByUser(userName, passWord, getDeviceToken(), share, this.mJLinkClient);
    }

    /**
     * Log in to the device with the Token obtained from device sharing（Token：xxxx）
     *
     * @param devLoginToken
     * @return
     */
    public DeviceLoginData deviceLoginByToken(String devLoginToken) {
        DeviceLoginData loginData = new DeviceLoginRequest().deviceLoginByToken(devLoginToken, getDeviceToken(), this.mJLinkClient);
        if (loginData.getRet() == 100) {
            session.setLogin(true);
            //todo Login successful keep heartbeat
        }
        return loginData;
    }

    public <T> T getConfigWrapper(JLinkDeviceConfigTypeEnum configTypeEnum) {
        //todo 1、determineLogin
        if (!session.isLogin()) {
            login();
        }
        //todo 2、accessToConfiguration
        String url = String.format("%s/%s/%s", JLinkDomain.RESTFUL_DOMAIN.get(), JLinkDeviceRequestUrl.DEVICE_GETCONFIG.get(), getDeviceToken());
        Map<String, String> param = new HashMap<>(1);
        param.put("Name", configTypeEnum.getConfigName());

        Map<String, String> header = new HashMap<>();
        header.put("appKey", this.mJLinkClient.getAppKey());
        header.put("uuid", this.mJLinkClient.getUuid());

        String body = JLinkHttpUtil.post(url, header, new Gson().toJson(param));
        DeviceConfig setConfigCommon = new Gson().fromJson(body, configTypeEnum.getType());
        if (setConfigCommon.getCode() == JLinkResponseCode.SUCCESS.getCode()) {
            return (T) setConfigCommon.getData();
        } else {
            throw new JLinkDeviceGetConfigException(setConfigCommon.getCode(), setConfigCommon.getMsg());
        }
    }

}
