package jlink.restful.java.sdk.module.usermanage.user;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManageResponse;

import java.util.List;

/**
 * @author luojx
 * @date 2022/6/15 13:35
 */
public class UsersResponse extends DeviceUserManageResponse {
    @SerializedName("Users")
    private List<UsersDTO> users;
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

    public List<UsersDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UsersDTO> users) {
        this.users = users;
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

    public static class UsersDTO {
        /**
         * userName
         */
        @SerializedName("Name")
        private String name;
        /**
         * password
         */
        @SerializedName("Password")
        private String password;
        /**
         * instructions
         */
        @SerializedName("Memo")
        private String memo;
        /**
         * User's group name
         */
        @SerializedName("Group")
        private String group;
        /**
         * User's permission list
         */
        @SerializedName("AuthorityList")
        private String[] authorityList;
        /**
         * Whether it is a reserved user, reserved users cannot be deleted
         */
        @SerializedName("Reserved")
        private Boolean reserved;
        /**
         * Whether the user can be reused
         */
        @SerializedName("Sharable")
        private Boolean sharable;

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

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public String[] getAuthorityList() {
            return authorityList;
        }

        public void setAuthorityList(String[] authorityList) {
            this.authorityList = authorityList;
        }

        public Boolean getReserved() {
            return reserved;
        }

        public void setReserved(Boolean reserved) {
            this.reserved = reserved;
        }

        public Boolean getSharable() {
            return sharable;
        }

        public void setSharable(Boolean sharable) {
            this.sharable = sharable;
        }
    }
}
