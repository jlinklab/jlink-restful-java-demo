package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;


/**
 * video switch (Low-Power Device)
 *
 * @author hjm
 * @date 2023/09/13
 */
public class NetWorkSetEnableVideoConfig extends DeviceConfig {
    @SerializedName("NetWork.SetEnableVideo")
    protected NetWorkSetEnableVideoDTO netWorkSetEnableVideoDTO;
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

    public NetWorkSetEnableVideoDTO getNetWorkSetEnableVideoDTO() {
        return netWorkSetEnableVideoDTO;
    }

    public void setNetWorkSetEnableVideoDTO(NetWorkSetEnableVideoDTO netWorkSetEnableVideoDTO) {
        this.netWorkSetEnableVideoDTO = netWorkSetEnableVideoDTO;
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

    public static class NetWorkSetEnableVideoDTO {

        /**
         * enable
         */
        @SerializedName("Enable")
        private Boolean enable;
        @SerializedName("StrmMsk")
        private String strmMsk;
        @SerializedName("StrmType")
        private Integer strmType;

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }

        public String getStrmMsk() {
            return strmMsk;
        }

        public void setStrmMsk(String strmMsk) {
            this.strmMsk = strmMsk;
        }

        public Integer getStrmType() {
            return strmType;
        }

        public void setStrmType(Integer strmType) {
            this.strmType = strmType;
        }
    }
}
