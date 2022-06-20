package jlink.restful.java.sdk.module.opdev.opcloudupgradestop;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * stop online upgrade dto
 * @author luojx
 * @date 2022/6/16 16:22
 */
public class OPCloudUpgradeStopDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPCloudUpgradeStop;
    }
    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();

    public DeviceOperateEnum getName() {
        return name;
    }
}
