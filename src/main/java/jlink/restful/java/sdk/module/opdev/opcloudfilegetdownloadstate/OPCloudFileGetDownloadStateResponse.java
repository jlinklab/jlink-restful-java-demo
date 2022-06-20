package jlink.restful.java.sdk.module.opdev.opcloudfilegetdownloadstate;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperateResponse;

/**
 * Get download progress response
 * @author luojx
 * @date 2022/6/16 16:32
 */
public class OPCloudFileGetDownloadStateResponse extends DeviceOperateResponse {
    @SerializedName("Ret")
    private Integer ret;

    public Integer getRet() {
        return ret;
    }

    public void setRet(Integer ret) {
        this.ret = ret;
    }
}
