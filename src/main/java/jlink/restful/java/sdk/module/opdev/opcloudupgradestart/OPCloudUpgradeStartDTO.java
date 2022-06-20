package jlink.restful.java.sdk.module.opdev.opcloudupgradestart;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * Start to upgrade dto online
 * @author luojx
 * @date 2022/6/16 16:23
 */
public class OPCloudUpgradeStartDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPCloudUpgradeStart;
    }
    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();

    public DeviceOperateEnum getName() {
        return name;
    }
}
