package jlink.restful.java.sdk.module.usermanage.user;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManage;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManageEnum;

/**
 * @author luojx
 * @date 2022/6/15 16:48
 */
public class DeleteUserDTO implements DeviceUserManage {
    @Override
    public DeviceUserManageEnum getUserManageEnum() {
        return DeviceUserManageEnum.DELETEUSER;
    }
    @SerializedName("Name")
    private String name;
    @SerializedName("NameDel")
    private final String nameDel = getUserManageEnum().getManageName();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameDel() {
        return nameDel;
    }

}
