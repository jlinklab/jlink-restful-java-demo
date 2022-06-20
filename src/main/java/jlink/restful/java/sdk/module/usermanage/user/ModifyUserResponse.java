package jlink.restful.java.sdk.module.usermanage.user;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManageResponse;

/**
 * @author luojx
 * @date 2022/6/15 14:03
 */
public class ModifyUserResponse extends DeviceUserManageResponse {
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
}
