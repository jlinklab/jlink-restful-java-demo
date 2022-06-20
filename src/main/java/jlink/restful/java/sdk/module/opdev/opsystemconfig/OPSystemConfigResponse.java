package jlink.restful.java.sdk.module.opdev.opsystemconfig;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperateResponse;

/**
 * System Information Import Export Response
 * 
 * @author luojx
 * @date 2022/6/15 10:26
 */
public class OPSystemConfigResponse extends DeviceOperateResponse {
    /** Configuration information base64 encryption */
    @SerializedName("Body")
    private String body;
    @SerializedName("Ret")
    private Integer ret;
    @SerializedName("SessionID")
    private String sessionID;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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
