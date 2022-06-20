package jlink.restful.java.sdk.module.usermanage.group;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManage;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManageEnum;

/**
 * modifyGroup
 *
 * @author hjm
 * @date 2022/04/28
 */
public class ModifyGroupDTO implements DeviceUserManage {
    @SerializedName("Group")
    private GroupDTO group = new GroupDTO();
    @SerializedName("ModifyName")
    private final DeviceUserManageEnum modifyName = getUserManageEnum();
    @SerializedName("GroupName")
    private String groupName;
    @SerializedName("Name")
    private final String name = "GroupName";

    @Override
    public DeviceUserManageEnum getUserManageEnum() {
        return DeviceUserManageEnum.MODIFYGROUP;
    }

    public GroupDTO getGroup() {
        return group;
    }

    public void setGroup(GroupDTO group) {
        this.group = group;
    }

    public DeviceUserManageEnum getModifyName() {
        return modifyName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getName() {
        return name;
    }

    public static class GroupDTO {
        /**
         * permissionsList
         */
        @SerializedName("AuthorityList")
        private String[] authorityList = {"ShutDown", "ChannelTitle", "DefaultConfig", "Talk_01", "IPCCamera", "ImExport",
                "Monitor_01", "EncodeConfig", "Account", "SysInfo", "QueryLog", "DelLog", "SysUpgrade", "AutoMaintain",
                "GeneralConfig", "NetConfig", "AlarmConfig", "VideoConfig", "RecordConfig", "StorageManager",
                "Replay_01", "CommConfig", "PtzConfig", "PTZControl", "ElecPTZControl"};
        /**
         * userGroupsName
         */
        @SerializedName("Name")
        private String name;
        /**
         * note
         */
        @SerializedName("Memo")
        private String memo;

        public String[] getAuthorityList() {
            return authorityList;
        }

        public void setAuthorityList(String[] authorityList) {
            this.authorityList = authorityList;
        }

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
    }
}
