package jlink.restful.java.sdk.module.usermanage.permission;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManageResponse;

/**
 * @author luojx
 * @date 2022/6/15 17:03
 */
public class FullAuthorityListResponse extends DeviceUserManageResponse {
    @SerializedName("AuthorityList")
    private String[] authorityList;
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
