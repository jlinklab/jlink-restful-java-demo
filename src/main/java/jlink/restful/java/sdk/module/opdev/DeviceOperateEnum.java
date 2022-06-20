package jlink.restful.java.sdk.module.opdev;

import com.google.gson.reflect.TypeToken;
import jlink.restful.java.sdk.module.opdev.PtzControl.PtzControlResponse;
import jlink.restful.java.sdk.module.opdev.opcloudfilegetdownloadstate.OPCloudFileGetDownloadStateResponse;
import jlink.restful.java.sdk.module.opdev.opcloudupgradegetburnprogress.OPCloudUpgradeGetBurnProgressResponse;
import jlink.restful.java.sdk.module.opdev.opcloudupgradestart.OPCloudUpgradeStartResponse;
import jlink.restful.java.sdk.module.opdev.opcloudupgradestop.OPCloudUpgradeStopResponse;
import jlink.restful.java.sdk.module.opdev.opfilequery.OPFileQueryResponse;
import jlink.restful.java.sdk.module.opdev.oplogquery.OPLogQueryResponse;
import jlink.restful.java.sdk.module.opdev.opmachine.OPMachineResponse;
import jlink.restful.java.sdk.module.opdev.opreqversion.OPReqVersionResponse;
import jlink.restful.java.sdk.module.opdev.optimequery.OPTimeQueryResponse;
import jlink.restful.java.sdk.module.opdev.opversionlist.OPVersionListResponse;

import java.lang.reflect.Type;

/**
 * jlink
 *
 * @author hjm
 * @date 2022/04/21
 */
public enum DeviceOperateEnum {
    OPMACHINE("OPMACHINE", new TypeToken<DeviceOperateResponse<OPMachineResponse>>() {
    }.getType()),
    OPDEFAULTCONFIG("OPDEFAULTCONFIG", new TypeToken<DeviceOperateResponse<OPMachineResponse>>() {
    }.getType()),
    OPLOGQUERY("OPLOGQUERY", new TypeToken<DeviceOperateResponse<OPLogQueryResponse>>() {
    }.getType()),
    OPTimeQuery("OPTimeQuery", new TypeToken<DeviceOperateResponse<OPTimeQueryResponse>>() {
    }.getType()),
    OPPTZControl("OPPTZControl", new TypeToken<DeviceOperateResponse<PtzControlResponse>>() {
    }.getType()),
    OPFileQuery("OPFileQuery", new TypeToken<DeviceOperateResponse<OPFileQueryResponse>>() {
    }.getType()),
    OPTIMESETTING("OPFileQuery", new TypeToken<DeviceOperateResponse<OPTimeQueryResponse>>() {
    }.getType()),
    OPRecordTimeQuery("OPFileQuery", new TypeToken<DeviceOperateResponse<OPTimeQueryResponse>>() {
    }.getType()),
    OPVersionList("OPVersionList", new TypeToken<DeviceOperateResponse<OPVersionListResponse>>() {
    }.getType()),
    OPReqVersion("OPReqVersion", new TypeToken<DeviceOperateResponse<OPReqVersionResponse>>() {
    }.getType()),
    OPCloudUpgradeStart("OPCloudUpgradeStart", new TypeToken<DeviceOperateResponse<OPCloudUpgradeStartResponse>>() {
    }.getType()),
    OPCloudUpgradeStop("OPCloudUpgradeStop", new TypeToken<DeviceOperateResponse<OPCloudUpgradeStopResponse>>() {
    }.getType()),
    OPCloudFileGetDownloadState("OPCloudFileGetDownloadState", new TypeToken<DeviceOperateResponse<OPCloudFileGetDownloadStateResponse>>() {
    }.getType()),
    OPCloudUpgradeGetBurnProgress("OPCloudUpgradeGetBurnProgress", new TypeToken<DeviceOperateResponse<OPCloudUpgradeGetBurnProgressResponse>>() {
    }.getType());


    /**
     * nameOfConfiguration
     */
    private final String opdev;
    private final java.lang.reflect.Type type;

    DeviceOperateEnum(String opdev, Type type) {
        this.opdev = opdev;
        this.type = type;
    }

    public static DeviceOperateEnum get(String opdev) {
        for (DeviceOperateEnum value : values()) {
            if (opdev.equals(value.name())) {
                return value;
            }
        }
        return OPPTZControl;
    }

    public String getOpdev() {
        return opdev;
    }

    public Type getType() {
        return type;
    }

}
