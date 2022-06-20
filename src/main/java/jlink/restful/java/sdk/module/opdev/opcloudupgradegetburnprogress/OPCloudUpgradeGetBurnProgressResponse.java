package jlink.restful.java.sdk.module.opdev.opcloudupgradegetburnprogress;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperateResponse;

/**
 * Get upgrade progress response
 *
 * @author luojx
 * @date 2022/6/16 16:31
 */
public class OPCloudUpgradeGetBurnProgressResponse extends DeviceOperateResponse {
    /**
     * downloadProgress 0~100
     */
    @SerializedName("Ret")
    private Integer ret;

    public Integer getRet() {
        return ret;
    }

    public void setRet(Integer ret) {
        this.ret = ret;
    }
}
