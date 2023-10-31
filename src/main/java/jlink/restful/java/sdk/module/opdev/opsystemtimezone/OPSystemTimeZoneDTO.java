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

    public SystemTimeZoneDTO getOpTimeSetting() {
        return opTimeSetting;
    }

    public void setOpTimeSetting(SystemTimeZoneDTO opTimeSetting) {
        this.opTimeSetting = opTimeSetting;
    }


    public class SystemTimeZoneDTO {
        @SerializedName("FirstUserTimeZone")
        private Integer FirstUserTimeZone;
        @SerializedName("timeMin")
        private Integer timeMin;

        public Integer getFirstUserTimeZone() {
            return FirstUserTimeZone;
        }

        public void setFirstUserTimeZone(Integer firstUserTimeZone) {
            FirstUserTimeZone = firstUserTimeZone;
        }

        public Integer getTimeMin() {
            return timeMin;
        }

        public void setTimeMin(Integer timeMin) {
            this.timeMin = timeMin;
        }
    }
}
