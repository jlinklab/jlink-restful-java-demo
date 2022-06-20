package jlink.restful.java.sdk.module.usermanage.group;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManage;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManageEnum;

/**
 * userGroups
 *
 * @author hjm
 * @date 2022/04/26
 */
public class GroupsDTO implements DeviceUserManage {
    @Override
    public DeviceUserManageEnum getUserManageEnum() {
        return DeviceUserManageEnum.GROUPS;
    }

    @SerializedName("Name")
    private final DeviceUserManageEnum name = getUserManageEnum();

    public DeviceUserManageEnum getName() {
        return name;
    }
}