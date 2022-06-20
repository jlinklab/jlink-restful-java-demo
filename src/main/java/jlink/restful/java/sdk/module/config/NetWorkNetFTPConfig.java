package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;


/**
 * NetFTPConfig
 *
 * @author hjm
 * @date 2022/04/24
 */
public class NetWorkNetFTPConfig extends DeviceConfig {

    @SerializedName("NetWork.NetFTP")
    protected NetWorkNetFTPDTO netWorkNetFTPDTO;
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

    public static class NetWorkNetFTPDTO {
        /**
         * directory
         */
        @SerializedName("Directory")
        private String directory;
        /**
         * toEnable
         */
        @SerializedName("Enable")
        private Boolean enable;
        /**
         * max File Len
         */
        @SerializedName("MaxFileLen")
        private Integer maxFileLen;
        /**
         * server
         */
        @SerializedName("Server")
        private ServerDTO server = new ServerDTO();

        public String getDirectory() {
            return directory;
        }

        public void setDirectory(String directory) {
            this.directory = directory;
        }

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }

        public Integer getMaxFileLen() {
            return maxFileLen;
        }

        public void setMaxFileLen(Integer maxFileLen) {
            this.maxFileLen = maxFileLen;
        }

        public ServerDTO getServer() {
            return server;
        }

        public void setServer(ServerDTO server) {
            this.server = server;
        }

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

    public NetWorkNetFTPDTO getNetWorkNetFTPDTO() {
        return netWorkNetFTPDTO;
    }

    public void setNetWorkNetFTPDTO(NetWorkNetFTPDTO netWorkNetFTPDTO) {
        this.netWorkNetFTPDTO = netWorkNetFTPDTO;
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
