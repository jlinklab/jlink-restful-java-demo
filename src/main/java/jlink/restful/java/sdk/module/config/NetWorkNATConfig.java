package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

/**
 * Nat Configuration
 *
 * @author luojx
 * @date 2022/6/13 18:39
 */
public class NetWorkNATConfig extends DeviceConfig {
    @SerializedName("NetWork.Nat")
    protected NetWorkNatDTO netWorkNatDTO;
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

    public NetWorkNatDTO getNetWorkNatDTO() {
        return netWorkNatDTO;
    }

    public void setNetWorkNatDTO(NetWorkNatDTO netWorkNatDTO) {
        this.netWorkNatDTO = netWorkNatDTO;
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

    public static class NetWorkNatDTO {
        /**
         * address
         */
        @SerializedName("Addr")
        private String addr;
        @SerializedName("DnsServer1")
        private String dnsServer1;
        @SerializedName("DnsServer2")
        private String dnsServer2;
        /**
         * enable
         */
        @SerializedName("NatEnable")
        private Boolean natEnable;
        /**
         * port
         */
        @SerializedName("Port")
        private Integer port;
        /**
         * MTU
         */
        @SerializedName("XMeyeMTU")
        private Integer xMeyeMTU;

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }

        public String getDnsServer1() {
            return dnsServer1;
        }

        public void setDnsServer1(String dnsServer1) {
            this.dnsServer1 = dnsServer1;
        }

        public String getDnsServer2() {
            return dnsServer2;
        }

        public void setDnsServer2(String dnsServer2) {
            this.dnsServer2 = dnsServer2;
        }

        public Boolean getNatEnable() {
            return natEnable;
        }

        public void setNatEnable(Boolean natEnable) {
            this.natEnable = natEnable;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Integer getxMeyeMTU() {
            return xMeyeMTU;
        }

        public void setxMeyeMTU(Integer xMeyeMTU) {
            this.xMeyeMTU = xMeyeMTU;
        }
    }
}
