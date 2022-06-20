package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * User configuration
 *
 * @author luojx
 * @date 2022/6/13 19:30
 */
public class SystemExUserMapConfig extends DeviceConfig {
    @SerializedName("System.ExUserMap")
    protected SystemExUserMapDTO systemExUserMapDTO;
    /**
     * name
     */
    @SerializedName("Name")
    protected String name;
    /**
     * ret
     */
    @SerializedName("Ret")
    protected Integer ret;
    /**
     * ret
     */
    @SerializedName("RetMsg")
    protected String retMsg;

    /**
     * sessionId
     */
    @SerializedName("SessionID")
    protected String sessionId;

    public SystemExUserMapDTO getSystemExUserMapDTO() {
        return systemExUserMapDTO;
    }

    public void setSystemExUserMapDTO(SystemExUserMapDTO systemExUserMapDTO) {
        this.systemExUserMapDTO = systemExUserMapDTO;
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

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public static class SystemExUserMapDTO {
        @SerializedName("User")
        private List<UserDTO> userDTOS;
        @SerializedName("UserNum")
        private Integer userNum;

        public List<UserDTO> getUserDTOS() {
            return userDTOS;
        }

        public void setUserDTOS(List<UserDTO> userDTOS) {
            this.userDTOS = userDTOS;
        }

        public Integer getUserNum() {
            return userNum;
        }

        public void setUserNum(Integer userNum) {
            this.userNum = userNum;
        }

        public static class UserDTO {
            /**
             * User's permission list
             */
            @SerializedName("AuthorityList")
            private List<String> authorityList;
            /**
             * User's group name
             */
            @SerializedName("Group")
            private String group;
            /**
             * instructions
             */
            @SerializedName("Memo")
            private String memo;
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
             * 是否为保留用户，保留用户不能删除
             */
            @SerializedName("Reserved")
            private Boolean reserved;
            /**
             * Whether the user can be reused
             */
            @SerializedName("Sharable")
            private Boolean sharable;

            public List<String> getAuthorityList() {
                return authorityList;
            }

            public void setAuthorityList(List<String> authorityList) {
                this.authorityList = authorityList;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
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

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
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
}
