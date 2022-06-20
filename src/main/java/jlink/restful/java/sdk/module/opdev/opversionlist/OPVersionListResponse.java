package jlink.restful.java.sdk.module.opdev.opversionlist;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperateResponse;

import java.util.List;

/**
 * Upgrade Detection List Response
 *
 * @author hjm
 * @date 2022/06/09
 */
public class OPVersionListResponse extends DeviceOperateResponse {
    @SerializedName("Name")
    private String name;
    @SerializedName("OPVersionList")
    private List<OPVersionListDTO> oPVersionList;
    @SerializedName("Ret")
    private Integer ret;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OPVersionListDTO> getOPVersionList() {
        return oPVersionList;
    }

    public void setOPVersionList(List<OPVersionListDTO> oPVersionList) {
        this.oPVersionList = oPVersionList;
    }

    public Integer getRet() {
        return ret;
    }

    public void setRet(Integer ret) {
        this.ret = ret;
    }

    public static class OPVersionListDTO {
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
}