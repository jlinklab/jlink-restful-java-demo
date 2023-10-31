package jlink.restful.java.sdk.module.opdev.optimequery;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperateResponse;

/**
 * System time query response
 *
 * @author luojx
 * @date 2022/6/16 17:22
 */
public class OPTimeQueryResponse extends DeviceOperateResponse {
    @SerializedName("Name")
    private String name;
    @SerializedName("Ret")
    private Integer ret;
    @SerializedName("SessionID")
    private String sessionID;
    @SerializedName("OPTimeQuery")
    private String opTimeQuery;

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

    public String getOpTimeQuery() {
        return opTimeQuery;
    }

    public void setOpTimeQuery(String opTimeQuery) {
        this.opTimeQuery = opTimeQuery;
    }
}
