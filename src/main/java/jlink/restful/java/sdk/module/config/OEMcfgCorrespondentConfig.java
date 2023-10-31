package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author luojx
 * @date 2023/7/1 17:19
 */
public class OEMcfgCorrespondentConfig extends DeviceConfig{
    @SerializedName("OEMcfg.Correspondent")
    protected OEMcfgCorrespondentConfigDTO oeMcfgCorrespondentConfigDTO;
    /**
     * name
     */
    @SerializedName("Name")
    protected String name;
    /**
     * ret
     */
    @SerializedName("Ret")
    protected Integer ret;
    /**
     * ret
     */
    @SerializedName("RetMsg")
    protected String retMsg;

    /**
     * sessionId
     */
    @SerializedName("SessionID")
    protected String sessionId;

    public OEMcfgCorrespondentConfigDTO getOeMcfgCorrespondentConfigDTO() {
        return oeMcfgCorrespondentConfigDTO;
    }

    public void setOeMcfgCorrespondentConfigDTO(OEMcfgCorrespondentConfigDTO oeMcfgCorrespondentConfigDTO) {
        this.oeMcfgCorrespondentConfigDTO = oeMcfgCorrespondentConfigDTO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRet() {
        return ret;
    }

    public void setRet(Integer ret) {
        this.ret = ret;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public static class OEMcfgCorrespondentConfigDTO {
        @SerializedName("BrandInfo")
        public String brandInfo;
        @SerializedName("FirmwareVersion")
        public String firmwareVersion;
        @SerializedName("HardwareId")
        public String hardwareId;
        @SerializedName("Port")
        public int port;
        @SerializedName("RevSpace")
        public String revSpace;
        @SerializedName("Scope")
        public List<String> scope;

        public String getBrandInfo() {
            return brandInfo;
        }

        public void setBrandInfo(String brandInfo) {
            this.brandInfo = brandInfo;
        }

        public String getFirmwareVersion() {
            return firmwareVersion;
        }

        public void setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
        }

        public String getHardwareId() {
            return hardwareId;
        }

        public void setHardwareId(String hardwareId) {
            this.hardwareId = hardwareId;
        }

        public int getPort() {
            return port;
        }

        public void setPort(int port) {
            this.port = port;
        }

        public String getRevSpace() {
            return revSpace;
        }

        public void setRevSpace(String revSpace) {
            this.revSpace = revSpace;
        }

        public List<String> getScope() {
            return scope;
        }

        public void setScope(List<String> scope) {
            this.scope = scope;
        }
    }
}
