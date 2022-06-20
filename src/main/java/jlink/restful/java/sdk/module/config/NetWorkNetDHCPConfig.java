package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * NetDHCP
 *
 * @author hjm
 * @date 2022/04/24
 */
public class NetWorkNetDHCPConfig extends DeviceConfig {
    @SerializedName("NetWork.NetDHCP")
    protected List<NetWorkNetDHCPDTO> netWorkNetDHCPDTOS;
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

    public static class NetWorkNetDHCPDTO {
        /**
         * DHCP
         */
        @SerializedName("Enable")
        private Boolean enable;
        /**
         * soName
         */
        @SerializedName("Interface")
        private String interfaceX;

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }

        public String getInterfaceX() {
            return interfaceX;
        }

        public void setInterfaceX(String interfaceX) {
            this.interfaceX = interfaceX;
        }
    }

    public List<NetWorkNetDHCPDTO> getNetWorkNetDHCPDTOS() {
        return netWorkNetDHCPDTOS;
    }

    public void setNetWorkNetDHCPDTOS(List<NetWorkNetDHCPDTO> netWorkNetDHCPDTOS) {
        this.netWorkNetDHCPDTOS = netWorkNetDHCPDTOS;
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
