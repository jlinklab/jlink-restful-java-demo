package jlink.restful.java.sdk.module.usermanage.user;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManage;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManageEnum;

/**
 * @author luojx
 * @date 2022/6/15 13:59
 */
public class ModifyUserDTO implements DeviceUserManage {
    @Override
    public DeviceUserManageEnum getUserManageEnum() {
        return DeviceUserManageEnum.MODIFYUSER;
    }

    @SerializedName("Name")
    private final DeviceUserManageEnum name = getUserManageEnum();
    /**
     * existing username
     */
    @SerializedName("UserName")
    private String username;
    @SerializedName("User")
    private UserDTO userDTO;

    public DeviceUserManageEnum getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public static class UserDTO {
        /**
         * userName
         */
        @SerializedName("Name")
        private String name;
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

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
