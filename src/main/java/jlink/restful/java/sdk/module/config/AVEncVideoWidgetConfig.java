package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Video Object Configuration
 *
 * @author hjm
 * @date 2022/06/10
 */
public class AVEncVideoWidgetConfig extends DeviceConfig {

    @SerializedName("AVEnc.VideoWidget")
    protected List<AVEncVideoWidgetConfig.VideoWidgetDTO> videoWidgetDTOS;
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

    public static class VideoWidgetDTO {
        /**
         * nameOfChannel
         */
        @SerializedName("ChannelTitle")
        private ChannelTitleDTO channelTitle;
        /**
         * channelTitle Object Properties
         */
        @SerializedName("ChannelTitleAttribute")
        private ChannelTitleAttributeDTO channelTitleAttribute;
        /**
         * regionalCoverage
         */
        @SerializedName("Covers")
        private List<CoversDTO> covers;
        @SerializedName("CoversNum")
        private Integer coversNum;
        @SerializedName("TimeTitleAttribute")
        private TimeTitleAttributeDTO timeTitleAttribute;

        public ChannelTitleDTO getChannelTitle() {
            return channelTitle;
        }

        public void setChannelTitle(ChannelTitleDTO channelTitle) {
            this.channelTitle = channelTitle;
        }

        public ChannelTitleAttributeDTO getChannelTitleAttribute() {
            return channelTitleAttribute;
        }

        public void setChannelTitleAttribute(ChannelTitleAttributeDTO channelTitleAttribute) {
            this.channelTitleAttribute = channelTitleAttribute;
        }

        public List<CoversDTO> getCovers() {
            return covers;
        }

        public void setCovers(List<CoversDTO> covers) {
            this.covers = covers;
        }

        public TimeTitleAttributeDTO getTimeTitleAttribute() {
            return timeTitleAttribute;
        }

        public void setTimeTitleAttribute(TimeTitleAttributeDTO timeTitleAttribute) {
            this.timeTitleAttribute = timeTitleAttribute;
        }

        public Integer getCoversNum() {
            return coversNum;
        }

        public void setCoversNum(Integer coversNum) {
            this.coversNum = coversNum;
        }

        public static class ChannelTitleDTO {
            @SerializedName("Name")
            private String name;
            @SerializedName("SerialNo")
            private String serialNo;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getSerialNo() {
                return serialNo;
            }

            public void setSerialNo(String serialNo) {
                this.serialNo = serialNo;
            }
        }

        public static class ChannelTitleAttributeDTO {
            /**
             * backgroundColor
             */
            @SerializedName("BackColor")
            private String backColor;
            /**
             * Encode superposition
             */
            @SerializedName("EncodeBlend")
            private Boolean encodeBlend;
            /**
             * foreground
             */
            @SerializedName("FrontColor")
            private String frontColor;
            /**
             * preview Superposition
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

        public static class TimeTitleAttributeDTO {
            @SerializedName("BackColor")
            private String backColor;
            @SerializedName("EncodeBlend")
            private Boolean encodeBlend;
            @SerializedName("FrontColor")
            private String frontColor;
            @SerializedName("PreviewBlend")
            private Boolean previewBlend;
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

        public static class CoversDTO {
            @SerializedName("BackColor")
            private String backColor;
            @SerializedName("EncodeBlend")
            private Boolean encodeBlend;
            @SerializedName("FrontColor")
            private String frontColor;
            @SerializedName("PreviewBlend")
            private Boolean previewBlend;
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

    public List<VideoWidgetDTO> getVideoWidgetDTOS() {
        return videoWidgetDTOS;
    }

    public void setVideoWidgetDTOS(List<VideoWidgetDTO> videoWidgetDTOS) {
        this.videoWidgetDTOS = videoWidgetDTOS;
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

    public String getRetMsg() {
        return retMsg;
    }

    public String getSessionId() {
        return sessionId;
    }
}
