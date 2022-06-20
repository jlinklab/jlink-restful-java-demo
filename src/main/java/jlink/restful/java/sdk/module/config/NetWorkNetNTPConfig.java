package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

/**
 * NetNTP
 *
 * @author luojx
 * @date 2022/6/13 17:16
 */
public class NetWorkNetNTPConfig extends DeviceConfig {
    @SerializedName("NetWork.NetNTP")
    protected NetWorkNetNTPDTO netWorkNetNTPDTO;
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

    public NetWorkNetNTPDTO getNetWorkNetNTPDTO() {
        return netWorkNetNTPDTO;
    }

    public void setNetWorkNetNTPDTO(NetWorkNetNTPDTO netWorkNetNTPDTO) {
        this.netWorkNetNTPDTO = netWorkNetNTPDTO;
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

    public static class NetWorkNetNTPDTO {
        /**
         * enable
         */
        @SerializedName("Enable")
        private Boolean enable;
        /**
         * NTP server Configuration
         */
        @SerializedName("Server")
        private ServerDTO serverDTO;
        /**
         * timeZone[0, 33]
         */
        @SerializedName("TimeZone")
        private Integer timeZone;
        /**
         * updateCycle
         */
        @SerializedName("UpdatePeriod")
        private Integer updatePeriod;

        public static class ServerDTO {
            /**
             * address
             */
            @SerializedName("Address")
            private String address;
            /**
             * anonymous
             */
            @SerializedName("Anonymity")
            private Boolean anonymity;
            /**
             * nameOf
             */
            @SerializedName("Name")
            private String name;
            /**
             * password
             */
            @SerializedName("Password")
            private String password;
            /**
             * port
             */
            @SerializedName("Port")
            private Integer port;
            /**
             * userName
             */
            @SerializedName("UserName")
            private String userName;

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public Boolean getAnonymity() {
                return anonymity;
            }

            public void setAnonymity(Boolean anonymity) {
                this.anonymity = anonymity;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public Integer getPort() {
                return port;
            }

            public void setPort(Integer port) {
                this.port = port;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }
        }

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }

        public ServerDTO getServerDTO() {
            return serverDTO;
        }

        public void setServerDTO(ServerDTO serverDTO) {
            this.serverDTO = serverDTO;
        }

        public Integer getTimeZone() {
            return timeZone;
        }

        public void setTimeZone(Integer timeZone) {
            this.timeZone = timeZone;
        }

        public Integer getUpdatePeriod() {
            return updatePeriod;
        }

        public void setUpdatePeriod(Integer updatePeriod) {
            this.updatePeriod = updatePeriod;
        }
    }
}
