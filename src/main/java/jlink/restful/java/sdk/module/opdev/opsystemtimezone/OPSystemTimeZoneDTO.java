package jlink.restful.java.sdk.module.opdev.opsystemtimezone;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;


/**
 * opsystem时区dto
 *
 * @author hjm
 * @date 2023/05/24
 */
public class OPSystemTimeZoneDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPSystemZONE;
    }

    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();
    @SerializedName("System.TimeZone")
    private SystemTimeZoneDTO opTimeSetting;

    public DeviceOperateEnum getName() {
        return name;
    }


    private class SystemTimeZoneDTO {
        @SerializedName("FirstUserTimeZone")
        private Integer FirstUserTimeZone;
        @SerializedName("timeMin")
        private Integer timeMin;
    }
}
