package jlink.restful.java.sdk.module.usermanage.group;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManageResponse;

/**
 * deleteGroup
 *
 * @author hjm
 * @date 2022/04/21
 */
public class DeleteGroupResponse extends DeviceUserManageResponse {

    /**
     * name
     */
    @SerializedName("Name")
    private String name;
    /**
     * Ret
     */
    @SerializedName("Ret")
    private Integer ret;
    @SerializedName("SessionID")
    private String sessionID;
    /**
     * ret message
     */
    @SerializedName("RetMsg")
    protected String retMsg;

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

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }
}
