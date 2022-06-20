package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * screenPromptInformation
 *
 * @author luojx
 * @date 2022/6/13 14:11
 */
public class FVideoOSDInfoConfig extends DeviceConfig{

    @SerializedName("fVideo.OSDInfo")
    protected FVideoOSDInfoDTO fVideoOSDInfoDTO;

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

    public FVideoOSDInfoDTO getfVideoOSDInfoDTO() {
        return fVideoOSDInfoDTO;
    }

    public void setfVideoOSDInfoDTO(FVideoOSDInfoDTO fVideoOSDInfoDTO) {
        this.fVideoOSDInfoDTO = fVideoOSDInfoDTO;
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

    public static class FVideoOSDInfoDTO{
        @SerializedName("Align")
        private Integer align;
        @SerializedName("OSDInfo")
        List<OSDInfoDTO> osdInfoDTOS;
        @SerializedName("strEnc")
        private String strEnc;

        public Integer getAlign() {
            return align;
        }

        public void setAlign(Integer align) {
            this.align = align;
        }

        public List<OSDInfoDTO> getOsdInfoDTOS() {
            return osdInfoDTOS;
        }

        public void setOsdInfoDTOS(List<OSDInfoDTO> osdInfoDTOS) {
            this.osdInfoDTOS = osdInfoDTOS;
        }

        public String getStrEnc() {
            return strEnc;
        }

        public void setStrEnc(String strEnc) {
            this.strEnc = strEnc;
        }

        public static class OSDInfoDTO{
            @SerializedName("Info")
            private List<String> info;
            @SerializedName("OSDInfoWidget")
            private OSDInfoWidgetDTO osdInfoWidgetDTO;

            public List<String> getInfo() {
                return info;
            }

            public void setInfo(List<String> info) {
                this.info = info;
            }

            public OSDInfoWidgetDTO getOsdInfoWidgetDTO() {
                return osdInfoWidgetDTO;
            }

            public void setOsdInfoWidgetDTO(OSDInfoWidgetDTO osdInfoWidgetDTO) {
                this.osdInfoWidgetDTO = osdInfoWidgetDTO;
            }

            public static class OSDInfoWidgetDTO{
                /**
                 * backgroundColor
                 */
                @SerializedName("BackColor")
                private String backColor;
                /**
                 * superpositionOfCoding
                 */
                @SerializedName("EncodeBlend")
                private Boolean encodeBlend;
                /**
                 * foreground
                 */
                @SerializedName("FrontColor")
                private String frontColor;
                /**
                 * previewSuperposition
                 */
                @SerializedName("PreviewBlend")
                private Boolean previewBlend;
                /**
                 * The ratio of object margin to full length
                 */
                @SerializedName("RelativePos")
                private List<Integer> relativePos;

                public String getBackColor() {
                    return backColor;
                }

                public void setBackColor(String backColor) {
                    this.backColor = backColor;
                }

                public Boolean getEncodeBlend() {
                    return encodeBlend;
                }

                public void setEncodeBlend(Boolean encodeBlend) {
                    this.encodeBlend = encodeBlend;
                }

                public String getFrontColor() {
                    return frontColor;
                }

                public void setFrontColor(String frontColor) {
                    this.frontColor = frontColor;
                }

                public Boolean getPreviewBlend() {
                    return previewBlend;
                }

                public void setPreviewBlend(Boolean previewBlend) {
                    this.previewBlend = previewBlend;
                }

                public List<Integer> getRelativePos() {
                    return relativePos;
                }

                public void setRelativePos(List<Integer> relativePos) {
                    this.relativePos = relativePos;
                }
            }
        }
    }
}
