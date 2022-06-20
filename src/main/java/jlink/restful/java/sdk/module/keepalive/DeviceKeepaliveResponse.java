package jlink.restful.java.sdk.module.keepalive;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.competent.JLinkResponseCode;

public class DeviceKeepaliveResponse {
    private Integer code;
    private String msg;
    private DevOperate data;

    public DeviceKeepaliveResponse(Integer code, String msg, DevOperate data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static class DevOperate {
        @SerializedName("Name")
        private String name;
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
    }


    public static DeviceKeepaliveResponse newInstance() {
        return new DeviceKeepaliveResponse(JLinkResponseCode.SUCCESS.getCode(), JLinkResponseCode.SUCCESS.getMsg(), null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DevOperate getData() {
        return data;
    }

    public void setData(DevOperate data) {
        this.data = data;
    }
}
