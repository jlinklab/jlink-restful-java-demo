package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

/**
 * PMS Configuration
 *
 * @author luojx
 * @date 2022/6/13 18:35
 */
public class NetWorkPMSConfig extends DeviceConfig {
    @SerializedName("NetWork.PMS")
    protected NetWorkPMSDTO netWorkPMSDTO;
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

    public NetWorkPMSDTO getNetWorkPMSDTO() {
        return netWorkPMSDTO;
    }

    public void setNetWorkPMSDTO(NetWorkPMSDTO netWorkPMSDTO) {
        this.netWorkPMSDTO = netWorkPMSDTO;
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

    public static class NetWorkPMSDTO {
        @SerializedName("BoxID")
        private String boxId;
        @SerializedName("Enable")
        private Boolean enable;
        /**
         * port
         */
        @SerializedName("Port")
        private Integer port;
        /**
         * pushInterval
         */
        @SerializedName("PushInterval")
        private Integer pushInterval;
        /**
         * addressOfServer
         */
        @SerializedName("ServName")
        private String servName;

        public String getBoxId() {
            return boxId;
        }

        public void setBoxId(String boxId) {
            this.boxId = boxId;
        }

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Integer getPushInterval() {
            return pushInterval;
        }

        public void setPushInterval(Integer pushInterval) {
            this.pushInterval = pushInterval;
        }

        public String getServName() {
            return servName;
        }

        public void setServName(String servName) {
            this.servName = servName;
        }
    }
}
