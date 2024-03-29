package jlink.restful.java.sdk.module.opdev.opsystemtimezone;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperateResponse;

/**
 * @author luojx
 * @date 2022/6/16 10:16
 */
public class OPSystemTimeZoneResponse extends DeviceOperateResponse {
    @SerializedName("Name")
    private String name;
    @SerializedName("Ret")
    private Integer ret;
    @SerializedName("SessionID")
    private String sessionID;
    @SerializedName("SystemTimeZoneDTO")
    private OPSystemTimeZoneDTO.SystemTimeZoneDTO systemTimeZoneDTO;

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
