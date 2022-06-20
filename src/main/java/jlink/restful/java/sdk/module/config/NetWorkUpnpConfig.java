package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;


/**
 * UpnpConfig
 *
 * @author hjm
 * @date 2022/04/24
 */
public class NetWorkUpnpConfig extends DeviceConfig {
    @SerializedName("NetWork.Upnp")
    protected NetWorkUpnpDTO netWorkUpnpDTO;
    /**
     * name
     */
    @SerializedName("Name")
    protected String name;
    /**
     * ret
     */
    @SerializedName("Ret")
    protected Integer ret;
    /**
     * ret
     */
    @SerializedName("RetMsg")
    protected String retMsg;

    /**
     * sessionId
     */
    @SerializedName("SessionID")
    protected String sessionId;

    public static class NetWorkUpnpDTO {
        /**
         * enable
         */
        @SerializedName("Enable")
        private Boolean enable;
        /**
         * http port
         */
        @SerializedName("HTTPPort")
        private Integer hTTPPort;
        /**
         * mediaPort
         */
        @SerializedName("MediaPort")
        private Integer mediaPort;
        /**
         * mobilePort
         */
        @SerializedName("MobilePort")
        private Integer mobilePort;
        /**
         * ret
         */
        @SerializedName("State")
        private Boolean state;

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }

        public Integer getHTTPPort() {
            return hTTPPort;
        }

        public void setHTTPPort(Integer hTTPPort) {
            this.hTTPPort = hTTPPort;
        }

        public Integer getMediaPort() {
            return mediaPort;
        }

        public void setMediaPort(Integer mediaPort) {
            this.mediaPort = mediaPort;
        }

        public Integer getMobilePort() {
            return mobilePort;
        }

        public void setMobilePort(Integer mobilePort) {
            this.mobilePort = mobilePort;
        }

        public Boolean getState() {
            return state;
        }

        public void setState(Boolean state) {
            this.state = state;
        }
    }

    public NetWorkUpnpDTO getNetWorkUpnpDTO() {
        return netWorkUpnpDTO;
    }

    public void setNetWorkUpnpDTO(NetWorkUpnpDTO netWorkUpnpDTO) {
        this.netWorkUpnpDTO = netWorkUpnpDTO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRet() {
        return ret;
    }

    public void setRet(Integer ret) {
        this.ret = ret;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
