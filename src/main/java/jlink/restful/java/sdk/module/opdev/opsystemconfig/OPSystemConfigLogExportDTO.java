package jlink.restful.java.sdk.module.opdev.opsystemconfig;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * logExport dto
 *
 * @author luojx
 * @date 2022/6/15 10:33
 */
public class OPSystemConfigLogExportDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPSystemConfig;
    }
    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();
    @SerializedName("OPSystemConfig")
    private OPSystemConfigExportDTO.OPSystemConfig opSystemConfig;

    public DeviceOperateEnum getName() {
        return name;
    }

    public OPSystemConfigExportDTO.OPSystemConfig getOpSystemConfig() {
        return opSystemConfig;
    }

    public void setOpSystemConfig(OPSystemConfigExportDTO.OPSystemConfig opSystemConfig) {
        this.opSystemConfig = opSystemConfig;
    }
}
