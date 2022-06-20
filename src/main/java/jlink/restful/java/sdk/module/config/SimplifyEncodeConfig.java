package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Coding parameter configuration
 *
 * @author luojx
 * @date 2022/6/13 19:22
 */
public class SimplifyEncodeConfig extends DeviceConfig {
    @SerializedName("Simplify.Encode")
    protected List<SimplifyEncodeDTO> simplifyEncodeDTOS;
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

    public List<SimplifyEncodeDTO> getSimplifyEncodeDTOS() {
        return simplifyEncodeDTOS;
    }

    public void setSimplifyEncodeDTOS(List<SimplifyEncodeDTO> simplifyEncodeDTOS) {
        this.simplifyEncodeDTOS = simplifyEncodeDTOS;
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

    public static class SimplifyEncodeDTO {
        /**
         * ExtraFormat
         */
        @SerializedName("ExtraFormat")
        private AvEncEncodeConfig.AvEncEncodeDTO.ExtraFormatDTO extraFormatDTO;
        /**
         * MainFormat
         */
        @SerializedName("MainFormat")
        private AvEncEncodeConfig.AvEncEncodeDTO.MainFormatDTO mainFormatDTO;

        public AvEncEncodeConfig.AvEncEncodeDTO.ExtraFormatDTO getExtraFormatDTO() {
            return extraFormatDTO;
        }

        public void setExtraFormatDTO(AvEncEncodeConfig.AvEncEncodeDTO.ExtraFormatDTO extraFormatDTO) {
            this.extraFormatDTO = extraFormatDTO;
        }

        public AvEncEncodeConfig.AvEncEncodeDTO.MainFormatDTO getMainFormatDTO() {
            return mainFormatDTO;
        }

        public void setMainFormatDTO(AvEncEncodeConfig.AvEncEncodeDTO.MainFormatDTO mainFormatDTO) {
            this.mainFormatDTO = mainFormatDTO;
        }
    }
}
