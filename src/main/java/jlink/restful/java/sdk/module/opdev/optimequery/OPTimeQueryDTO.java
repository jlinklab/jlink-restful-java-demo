package jlink.restful.java.sdk.module.opdev.optimequery;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * System time query dto
 *
 * @author luojx
 * @date 2022/6/16 17:22
 */
public class OPTimeQueryDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPTimeQuery;
    }
    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();
}
