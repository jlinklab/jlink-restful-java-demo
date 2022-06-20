package jlink.restful.java.sdk.module.login;

import com.google.gson.annotations.SerializedName;

/**
 * DeviceLoginData
 *
 * @author hjm
 * @date 2022/04/21
 */
public class DeviceLoginData {
    /**
     * survivalInterval
     */
    @SerializedName("AliveInterval")
    private int aliveInterval;
    /**
     * channelNo
     */
    @SerializedName("ChannelNum")
    private int channelNum;
    /**
     * deviceType
     */
    @SerializedName("DeviceType ")
    private String deviceType;
    /**
     * complementaryCodeFlow
     */
    @SerializedName("ExtraChannel")
    private int extraChannel;

    @SerializedName("Ret")
    private int ret;
    /**
     * sessionID
     */
    @SerializedName("SessionID")
    private String sessionID;

    /**
     * AdminToken  Parameters returned by Token login
     *
     * @return
     */
    @SerializedName("AdminToken")
    private String adminToken;

    /**
     * GuestToken Parameters returned by Token login
     *
     * @return
     */
    @SerializedName("GuestToken")
    private String guestToken;

    /**
     * ret on error
     */
    @SerializedName("RetMsg")
    public String retMsg;

    public int getAliveInterval() {
        return aliveInterval;
    }

    public void setAliveInterval(int aliveInterval) {
        this.aliveInterval = aliveInterval;
    }

    public int getChannelNum() {
        return channelNum;
    }

    public void setChannelNum(int channelNum) {
        this.channelNum = channelNum;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public int getExtraChannel() {
        return extraChannel;
    }

    public void setExtraChannel(int extraChannel) {
        this.extraChannel = extraChannel;
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getAdminToken() {
        return adminToken;
    }

    public void setAdminToken(String adminToken) {
        this.adminToken = adminToken;
    }

    public String getGuestToken() {
        return guestToken;
    }

    public void setGuestToken(String guestToken) {
        this.guestToken = guestToken;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }
}
