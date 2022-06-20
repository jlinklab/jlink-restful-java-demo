package jlink.restful.java.sdk.module.opdev.opversionlist;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;


/**
 * Version upgrade detection list query
 *
 * @author hjm
 * @date 2022/06/09
 */
public class OPVersionListQueryDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPVersionList;
    }

    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();

    public DeviceOperateEnum getName() {
        return name;
    }
}