package jlink.restful.java.sdk.module.usermanage.group;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManageResponse;

import java.util.List;

/**
 * Device User Management Group Configuration
 *
 * @author hjm
 * @date 2022/04/21
 */
public class GroupsResponse extends DeviceUserManageResponse {

    /**
     * group
     */
    @SerializedName("Groups")
    private List<GroupsDTO> groups;
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

    public List<GroupsDTO> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupsDTO> groups) {
        this.groups = groups;
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

    public static class GroupsDTO {
        @SerializedName("AuthorityList")
        private List<String> authorityList;
        @SerializedName("Memo")
        private String memo;
        @SerializedName("Name")
        private String name;

        public List<String> getAuthorityList() {
            return authorityList;
        }

        public void setAuthorityList(List<String> authorityList) {
            this.authorityList = authorityList;
        }

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
