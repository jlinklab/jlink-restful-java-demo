package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

/**
 * Wifi Configuration
 *
 * @author luojx
 * @date 2022/6/13 18:43
 */
public class NetWorkWifiConfig extends DeviceConfig {
    @SerializedName("NetWork.Wifi")
    protected NetWorkWifiDTO netWorkWifiDTO;
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

    public NetWorkWifiDTO getNetWorkWifiDTO() {
        return netWorkWifiDTO;
    }

    public void setNetWorkWifiDTO(NetWorkWifiDTO netWorkWifiDTO) {
        this.netWorkWifiDTO = netWorkWifiDTO;
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

    public static class NetWorkWifiDTO {
        /**
         * encryption
         */
        @SerializedName("Auth")
        private String auth;
        /**
         * channelNumber
         */
        @SerializedName("Channel")
        private Integer channel;
        /**
         * canMakeSwitch
         */
        @SerializedName("Enable")
        private String enable;
        /**
         * encryptionAlgorithm
         */
        @SerializedName("EncrypType")
        private String encrypType;
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
         * secretKeyToSave
         */
        @SerializedName("KeyType")
        private Integer keyType;
        /**
         * password
         */
        @SerializedName("Keys")
        private String keys;
        /**
         * networkType
         */
        @SerializedName("NetType")
        private String netType;
        /**
         * Wifi hotName
         */
        @SerializedName("SSID")
        private String ssid;
        /**
         * subnetMask
         */
        @SerializedName("Submask")
        private String submask;

        public String getAuth() {
            return auth;
        }

        public void setAuth(String auth) {
            this.auth = auth;
        }

        public Integer getChannel() {
            return channel;
        }

        public void setChannel(Integer channel) {
            this.channel = channel;
        }

        public String getEnable() {
            return enable;
        }

        public void setEnable(String enable) {
            this.enable = enable;
        }

        public String getEncrypType() {
            return encrypType;
        }

        public void setEncrypType(String encrypType) {
            this.encrypType = encrypType;
        }

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

        public Integer getKeyType() {
            return keyType;
        }

        public void setKeyType(Integer keyType) {
            this.keyType = keyType;
        }

        public String getKeys() {
            return keys;
        }

        public void setKeys(String keys) {
            this.keys = keys;
        }

        public String getNetType() {
            return netType;
        }

        public void setNetType(String netType) {
            this.netType = netType;
        }

        public String getSsid() {
            return ssid;
        }

        public void setSsid(String ssid) {
            this.ssid = ssid;
        }

        public String getSubmask() {
            return submask;
        }

        public void setSubmask(String submask) {
            this.submask = submask;
        }
    }
}
