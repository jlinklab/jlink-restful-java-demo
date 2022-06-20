package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

/**
 * Das Config
 *
 * @author hjm
 * @date 2022/04/21
 */
public class NetWorkDasConfig extends DeviceConfig {
    @SerializedName("Name")
    private String name;
    @SerializedName("NetWork.DAS")
    private NetWorkDASDTO netWorkDAS = new NetWorkDASDTO();
    @SerializedName("retMsg")
    private String retMsg;
    @SerializedName("Ret")
    private Integer ret;
    @SerializedName("SessionID")
    private String sessionID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NetWorkDASDTO getNetWorkDAS() {
        return netWorkDAS;
    }

    public void setNetWorkDAS(NetWorkDASDTO netWorkDAS) {
        this.netWorkDAS = netWorkDAS;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public Integer getRet() {
        return ret;
    }

    public void setRet(Integer ret) {
        this.ret = ret;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public static class NetWorkDASDTO {
        @SerializedName("DeviceID")
        private String deviceID;
        @SerializedName("Enable")
        private Boolean enable;
        @SerializedName("Password")
        private String password;
        @SerializedName("Port")
        private Integer port;
        @SerializedName("ServerAddr")
        private String serverAddr;
        @SerializedName("UserName")
        private String userName;

        public String getDeviceID() {
            return deviceID;
        }

        public void setDeviceID(String deviceID) {
            this.deviceID = deviceID;
        }

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
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

        public String getServerAddr() {
            return serverAddr;
        }

        public void setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }
}
