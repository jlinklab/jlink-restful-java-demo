package jlink.restful.java.sdk.module.usermanage.group;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManage;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManageEnum;

/**
 * addGroup
 *
 * @author hjm
 * @date 2022/04/28
 */
public class AddGroupDTO implements DeviceUserManage {
    @SerializedName("Group")
    private GroupDTO group = new GroupDTO();
    @SerializedName("ADDName")
    private DeviceUserManageEnum aDDName = getUserManageEnum();
    @SerializedName("Name")
    private String name = "Group";

    @Override
    public DeviceUserManageEnum getUserManageEnum() {
        return DeviceUserManageEnum.ADDGROUP;
    }

    public GroupDTO getGroup() {
        return group;
    }

    public void setGroup(GroupDTO group) {
        this.group = group;
    }

    public DeviceUserManageEnum getaDDName() {
        return aDDName;
    }

    public void setaDDName(DeviceUserManageEnum aDDName) {
        this.aDDName = aDDName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static class GroupDTO {
        /**
         * permissions List
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
