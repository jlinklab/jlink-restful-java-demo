package jlink.restful.java.sdk.module.usermanage.user;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManage;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManageEnum;

/**
 * @author luojx
 * @date 2022/6/15 13:37
 */
public class UsersDTO implements DeviceUserManage {
    @Override
    public DeviceUserManageEnum getUserManageEnum() {
        return DeviceUserManageEnum.USERS;
    }
    @SerializedName("Name")
    private final DeviceUserManageEnum name = getUserManageEnum();

    public DeviceUserManageEnum getName() {
        return name;
    }
}
