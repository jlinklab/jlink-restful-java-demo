package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * NetEmail
 *
 * @author luojx
 * @date 2022/6/13 17:08
 */
public class NetWorkNetEmailConfig extends DeviceConfig {
    @SerializedName("NetWork.NetEmail")
    protected NetWorkNetEmailDTO netWorkNetEmailDTO;
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

    public NetWorkNetEmailDTO getNetWorkNetEmailDTO() {
        return netWorkNetEmailDTO;
    }

    public void setNetWorkNetEmailDTO(NetWorkNetEmailDTO netWorkNetEmailDTO) {
        this.netWorkNetEmailDTO = netWorkNetEmailDTO;
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

    public static class NetWorkNetEmailDTO {
        /**
         * mail enable
         */
        @SerializedName("Enable")
        private Boolean enable;
        /**
         *
         */
        @SerializedName("MailServer")
        private MailServerDTO mailServerDTO;
        /**
         * recipient address, there are multiple
         */
        @SerializedName("Recievers")
        private List<String> recievers;
        /**
         * send time period
         */
        @SerializedName("Schedule")
        private List<String> schedule;
        /**
         * sendAddress
         */
        @SerializedName("SendAddr")
        private String sendAddr;
        /**
         * emailTitle
         */
        @SerializedName("Title")
        private String title;
        /**
         * Enable using SSL
         */
        @SerializedName("UseSSL")
        private Boolean useSSL;

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }

        public MailServerDTO getMailServerDTO() {
            return mailServerDTO;
        }

        public void setMailServerDTO(MailServerDTO mailServerDTO) {
            this.mailServerDTO = mailServerDTO;
        }

        public List<String> getRecievers() {
            return recievers;
        }

        public void setRecievers(List<String> recievers) {
            this.recievers = recievers;
        }

        public List<String> getSchedule() {
            return schedule;
        }

        public void setSchedule(List<String> schedule) {
            this.schedule = schedule;
        }

        public String getSendAddr() {
            return sendAddr;
        }

        public void setSendAddr(String sendAddr) {
            this.sendAddr = sendAddr;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Boolean getUseSSL() {
            return useSSL;
        }

        public void setUseSSL(Boolean useSSL) {
            this.useSSL = useSSL;
        }

        public static class MailServerDTO {
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
             * name
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
    }
}
