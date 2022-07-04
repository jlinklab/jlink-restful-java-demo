package jlink.restful.java.sdk.module.opdev.opsystemconfig;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * configureImport dto
 *
  @author luojx
  @date 2022/6/15 10:23
*/
public class OPSystemConfigImportDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return null;
    }
    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();
    @SerializedName("OPSystemConfig")
    private String opSystemConfig;
}
