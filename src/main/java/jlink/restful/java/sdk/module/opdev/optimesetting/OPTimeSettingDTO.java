package jlink.restful.java.sdk.module.opdev.optimesetting;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * @author luojx
 * @date 2022/6/16 10:13
 */
public class OPTimeSettingDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPTimeSetting;
    }

    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();
    @SerializedName("OPTimeSetting")
    private String opTimeSetting;

    public DeviceOperateEnum getName() {
        return name;
    }

    public String getOpTimeSetting() {
        return opTimeSetting;
    }

    public void setOpTimeSetting(String opTimeSetting) {
        this.opTimeSetting = opTimeSetting;
    }
}
