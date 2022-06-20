package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Video Input Color Configuration
 *
 * @author luojx
 * @date 2022/6/13 9:50
 */
public class AvEncVideoColorConfig extends DeviceConfig {

    @SerializedName("AVEnc.VideoColor")
    protected List<AvEncVideoColorDTO> avEncVideoColorDTOs;
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

    public List<AvEncVideoColorDTO> getAvEncVideoColorDTOs() {
        return avEncVideoColorDTOs;
    }

    public void setAvEncVideoColorDTOs(List<AvEncVideoColorDTO> avEncVideoColorDTOs) {
        this.avEncVideoColorDTOs = avEncVideoColorDTOs;
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

    public static class AvEncVideoColorDTO {
        /**
         * enable
         */
        @SerializedName("Enable")
        private Boolean enable;
        /**
         * corresponding time period
         */
        @SerializedName("TimeSection")
        private String timeSection;
        @SerializedName("VideoColorParam")
        private VideoColorParamDTO videoColorParamDto;

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }

        public String getTimeSection() {
            return timeSection;
        }

        public void setTimeSection(String timeSection) {
            this.timeSection = timeSection;
        }

        public VideoColorParamDTO getVideoColorParamDto() {
            return videoColorParamDto;
        }

        public void setVideoColorParamDto(VideoColorParamDTO videoColorParamDto) {
            this.videoColorParamDto = videoColorParamDto;
        }

        public static class VideoColorParamDTO {
            /**
             * sharpness
             */
            @SerializedName("Acutance")
            private Integer acutance;
            /**
             * brightness[0, 100]
             */
            @SerializedName("Brightness")
            private Integer brightness;
            /**
             * contrast[0, 100]
             */
            @SerializedName("Contrast")
            private Integer contrast;
            /**
             * gain
             */
            @SerializedName("Gain")
            private Integer gain;
            /**
             * chroma[0, 100]
             */
            @SerializedName("Hue")
            private Integer hue;
            /**
             * saturation[0, 100]
             */
            @SerializedName("Saturation")
            private Integer saturation;
            /**
             * whiteBalance
             */
            @SerializedName("Whitebalance")
            private Integer whiteBalance;

            public Integer getAcutance() {
                return acutance;
            }

            public void setAcutance(Integer acutance) {
                this.acutance = acutance;
            }

            public Integer getBrightness() {
                return brightness;
            }

            public void setBrightness(Integer brightness) {
                this.brightness = brightness;
            }

            public Integer getContrast() {
                return contrast;
            }

            public void setContrast(Integer contrast) {
                this.contrast = contrast;
            }

            public Integer getGain() {
                return gain;
            }

            public void setGain(Integer gain) {
                this.gain = gain;
            }

            public Integer getHue() {
                return hue;
            }

            public void setHue(Integer hue) {
                this.hue = hue;
            }

            public Integer getSaturation() {
                return saturation;
            }

            public void setSaturation(Integer saturation) {
                this.saturation = saturation;
            }

            public Integer getWhiteBalance() {
                return whiteBalance;
            }

            public void setWhiteBalance(Integer whiteBalance) {
                this.whiteBalance = whiteBalance;
            }
        }
    }
}
