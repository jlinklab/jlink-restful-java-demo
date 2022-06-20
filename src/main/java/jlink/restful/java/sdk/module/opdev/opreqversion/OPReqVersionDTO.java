package jlink.restful.java.sdk.module.opdev.opreqversion;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;


/**
 * versionUpdate
 *
 * @author hjm
 * @date 2022/06/09
 */
public class OPReqVersionDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPReqVersion;
    }

    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();
    /**
     * versionUpdateParameters
     */
    @SerializedName("OPReqVersion")
    private OPReqVersion opReqVersion = new OPReqVersion();

    public static class OPReqVersion {
        @SerializedName("Length")
        private Integer length;
        @SerializedName("VersionDate")
        private String versionDate;
        @SerializedName("VersionName")
        private String versionName;

        public Integer getLength() {
            return length;
        }

        public void setLength(Integer length) {
            this.length = length;
        }

        public String getVersionDate() {
            return versionDate;
        }

        public void setVersionDate(String versionDate) {
            this.versionDate = versionDate;
        }

        public String getVersionName() {
            return versionName;
        }

        public void setVersionName(String versionName) {
            this.versionName = versionName;
        }
    }

    public DeviceOperateEnum getName() {
        return name;
    }

    public OPReqVersion getOpReqVersion() {
        return opReqVersion;
    }

    public void setOpReqVersion(OPReqVersion opReqVersion) {
        this.opReqVersion = opReqVersion;
    }
}