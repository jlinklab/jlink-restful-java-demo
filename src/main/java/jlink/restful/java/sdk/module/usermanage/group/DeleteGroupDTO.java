package jlink.restful.java.sdk.module.usermanage.group;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManage;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManageEnum;

/**
 * deleteGroup
 *
 * @author hjm
 * @date 2022/04/28
 */
public class DeleteGroupDTO implements DeviceUserManage {
    @SerializedName("NameDel")
    private final DeviceUserManageEnum modifyName = getUserManageEnum();
    @SerializedName("Name")
    private String name;

    @Override
    public DeviceUserManageEnum getUserManageEnum() {
        return DeviceUserManageEnum.DELETEGROUP;
    }

    public DeviceUserManageEnum getModifyName() {
        return modifyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
