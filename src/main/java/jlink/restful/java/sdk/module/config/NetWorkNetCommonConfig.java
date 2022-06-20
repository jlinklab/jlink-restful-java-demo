package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

/**
 * NetCommon
 *
 * @author hjm
 * @date 2022/04/21
 */
public class NetWorkNetCommonConfig extends DeviceConfig {
    @SerializedName("NetWork.NetCommon")
    protected NetWorkNetCommonDTO netWorkNetCommonDto;
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

    public static class NetWorkNetCommonDTO {
        /**
         * gateway
         */
        @SerializedName("GateWay")
        private String gateWay;
        /**
         * host ip
         */
        @SerializedName("HostIP")
        private String hostIP;
        /**
         * hostName
         */
        @SerializedName("HostName")
        private String hostName;
        /**
         * http port
         */
        @SerializedName("HttpPort")
        private Integer httpPort;
        /**
         * mac
         */
        @SerializedName("MAC")
        private String mac;
        /**
         * limitCodeFlowValue
         */
        @SerializedName("MaxBps")
        private Integer maxBps;
        /**
         * monitoringAgreement
         */
        @SerializedName("MonMode")
        private String monMode;
        /**
         * SSL listenToPort
         */
        @SerializedName("SSLPort")
        private Integer sSLPort;
        /**
         * subnetMask
         */
        @SerializedName("Submask")
        private String submask;
        /**
         * maximumNumberOfConnections
         */
        @SerializedName("TCPMaxConn")
        private Integer tCPMaxConn;
        /**
         * TCP listenToPort
         */
        @SerializedName("TCPPort")
        private Integer tCPPort;
        /**
         * transmissionStrategy
         */
        @SerializedName("TransferPlan")
        private String transferPlan;
        /**
         * UDP listenToPort
         */
        @SerializedName("UDPPort")
        private Integer uDPPort;
        /**
         * Enable high-speed video download
         */
        @SerializedName("UseHSDownLoad")
        private Boolean useHSDownLoad;
        /**
         * deviceId
         */
        @SerializedName("DeviceID")
        private String deviceId;

        public String getGateWay() {
            return gateWay;
        }

        public void setGateWay(String gateWay) {
            this.gateWay = gateWay;
        }

        public String getHostIP() {
            return hostIP;
        }

        public void setHostIP(String hostIP) {
            this.hostIP = hostIP;
        }

        public String getHostName() {
            return hostName;
        }

        public void setHostName(String hostName) {
            this.hostName = hostName;
        }

        public Integer getHttpPort() {
            return httpPort;
        }

        public void setHttpPort(Integer httpPort) {
            this.httpPort = httpPort;
        }

        public String getMac() {
            return mac;
        }

        public void setMac(String mac) {
            this.mac = mac;
        }

        public Integer getMaxBps() {
            return maxBps;
        }

        public void setMaxBps(Integer maxBps) {
            this.maxBps = maxBps;
        }

        public String getMonMode() {
            return monMode;
        }

        public void setMonMode(String monMode) {
            this.monMode = monMode;
        }

        public Integer getSSLPort() {
            return sSLPort;
        }

        public void setSSLPort(Integer sSLPort) {
            this.sSLPort = sSLPort;
        }

        public String getSubmask() {
            return submask;
        }

        public void setSubmask(String submask) {
            this.submask = submask;
        }

        public Integer getTCPMaxConn() {
            return tCPMaxConn;
        }

        public void setTCPMaxConn(Integer tCPMaxConn) {
            this.tCPMaxConn = tCPMaxConn;
        }

        public Integer getTCPPort() {
            return tCPPort;
        }

        public void setTCPPort(Integer tCPPort) {
            this.tCPPort = tCPPort;
        }

        public String getTransferPlan() {
            return transferPlan;
        }

        public void setTransferPlan(String transferPlan) {
            this.transferPlan = transferPlan;
        }

        public Integer getUDPPort() {
            return uDPPort;
        }

        public void setUDPPort(Integer uDPPort) {
            this.uDPPort = uDPPort;
        }

        public Boolean getUseHSDownLoad() {
            return useHSDownLoad;
        }

        public void setUseHSDownLoad(Boolean useHSDownLoad) {
            this.useHSDownLoad = useHSDownLoad;
        }

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }
    }

    public NetWorkNetCommonDTO getNetWorkNetCommonDto() {
        return netWorkNetCommonDto;
    }

    public void setNetWorkNetCommonDto(NetWorkNetCommonDTO netWorkNetCommonDto) {
        this.netWorkNetCommonDto = netWorkNetCommonDto;
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
