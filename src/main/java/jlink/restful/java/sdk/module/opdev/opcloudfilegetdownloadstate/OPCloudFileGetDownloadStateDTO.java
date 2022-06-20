package jlink.restful.java.sdk.module.opdev.opcloudfilegetdownloadstate;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * Get download progress dto
 * @author luojx
 * @date 2022/6/16 16:32
 */
public class OPCloudFileGetDownloadStateDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPCloudFileGetDownloadState;
    }
    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();
}
