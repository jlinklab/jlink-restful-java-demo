package jlink.restful.java.sdk.module.opdev.opdiskmanager;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.competent.JLinkDeviceInfoEnum;

/**
 * @author luojx
 * @date 2022/6/21 15:16
 */
public class OPStorageInfoDTO{
    public JLinkDeviceInfoEnum getOperateEnum() {
        return JLinkDeviceInfoEnum.StorageInfo;
    }

    @SerializedName("Name")
    private final JLinkDeviceInfoEnum name = getOperateEnum();

    public JLinkDeviceInfoEnum getName() {
        return name;
    }
}
