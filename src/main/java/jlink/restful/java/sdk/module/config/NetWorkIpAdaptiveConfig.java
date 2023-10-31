package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

/**
 * @author luojx
 * @date 2023/7/3 11:15
 */
public class NetWorkIpAdaptiveConfig extends DeviceConfig{

    @SerializedName("NetWork.IPAdaptive")
    protected NetWorkIpAdaptiveConfigDTO netWorkIpAdaptiveConfigDTO;
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

    public NetWorkIpAdaptiveConfigDTO getNetWorkIpAdaptiveConfigDTO() {
        return netWorkIpAdaptiveConfigDTO;
    }

    public void setNetWorkIpAdaptiveConfigDTO(NetWorkIpAdaptiveConfigDTO netWorkIpAdaptiveConfigDTO) {
        this.netWorkIpAdaptiveConfigDTO = netWorkIpAdaptiveConfigDTO;
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

    public static class NetWorkIpAdaptiveConfigDTO {
        @SerializedName("IPAdaptive")
        protected Boolean ipAdaptive;

        public Boolean getIpAdaptive() {
            return ipAdaptive;
        }

        public void setIpAdaptive(Boolean ipAdaptive) {
            this.ipAdaptive = ipAdaptive;
        }
    }
}
