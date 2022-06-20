package jlink.restful.java.sdk.module.usermanage.permission;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManage;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManageEnum;

/**
 * @author luojx
 * @date 2022/6/15 17:03
 */
public class FullAuthorityListDTO implements DeviceUserManage {
    @Override
    public DeviceUserManageEnum getUserManageEnum() {
        return DeviceUserManageEnum.FULLAUTHORITYLIST;
    }
    @SerializedName("Name")
    private final DeviceUserManageEnum name = getUserManageEnum();
}
