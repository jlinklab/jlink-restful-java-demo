package jlink.restful.java.sdk.module.opdev.opcloudupgradegetburnprogress;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * Get upgrade progress dto
 * @author luojx
 * @date 2022/6/16 16:31
 */
public class OPCloudUpgradeGetBurnProgressDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPCloudUpgradeGetBurnProgress;
    }
    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();
}
