package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * AVEnc.Encode
 *
 * @author hjm
 * @date 2022/04/24
 */
public class AvEncEncodeConfig extends DeviceConfig {

    @SerializedName("AVEnc.Encode")
    protected List<AvEncEncodeDTO> avEncEncodeDTOS;
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

    public static class AvEncEncodeDTO {

        @SerializedName("EncodeStaticParam")
        private List<EncodeStaticParamDTO> encodeStaticParam = new ArrayList<>(2);
        /**
         * ExtraFormat
         */
        @SerializedName("ExtraFormat")
        private List<ExtraFormatDTO> extraFormat = new ArrayList<>(2);
        /**
         * MainFormat
         */
        @SerializedName("MainFormat")
        private List<MainFormatDTO> mainFormat = new ArrayList<>(2);
        /**
         * SnapFormat
         */
        @SerializedName("SnapFormat")
        private List<SnapFormatDTO> snapFormat = new ArrayList<>(2);

        public List<EncodeStaticParamDTO> getEncodeStaticParam() {
            return encodeStaticParam;
        }

        public void setEncodeStaticParam(List<EncodeStaticParamDTO> encodeStaticParam) {
            this.encodeStaticParam = encodeStaticParam;
        }

        public List<ExtraFormatDTO> getExtraFormat() {
            return extraFormat;
        }

        public void setExtraFormat(List<ExtraFormatDTO> extraFormat) {
            this.extraFormat = extraFormat;
        }

        public List<MainFormatDTO> getMainFormat() {
            return mainFormat;
        }

        public void setMainFormat(List<MainFormatDTO> mainFormat) {
            this.mainFormat = mainFormat;
        }

        public List<SnapFormatDTO> getSnapFormat() {
            return snapFormat;
        }

        public void setSnapFormat(List<SnapFormatDTO> snapFormat) {
            this.snapFormat = snapFormat;
        }

        public static class EncodeStaticParamDTO {
            @SerializedName("Level")
            private Integer level;
            @SerializedName("Profile")
            private Integer profile;

            public Integer getLevel() {
                return level;
            }

            public void setLevel(Integer level) {
                this.level = level;
            }

            public Integer getProfile() {
                return profile;
            }

            public void setProfile(Integer profile) {
                this.profile = profile;
            }
        }

        public static class ExtraFormatDTO {
            /**
             * audioFormats
             */
            @SerializedName("Audio")
            private AudioDTO audio = new AudioDTO();
            /**
             * audioEnabled
             */
            @SerializedName("AudioEnable")
            private Boolean audioEnable;
            /**
             * videoFormat
             */
            @SerializedName("Video")
            private VideoDTO video = new VideoDTO();
            /**
             * videoSupport
             */
            @SerializedName("VideoEnable")
            private Boolean videoEnable;

            public AudioDTO getAudio() {
                return audio;
            }

            public void setAudio(AudioDTO audio) {
                this.audio = audio;
            }

            public Boolean getAudioEnable() {
                return audioEnable;
            }

            public void setAudioEnable(Boolean audioEnable) {
                this.audioEnable = audioEnable;
            }

            public VideoDTO getVideo() {
                return video;
            }

            public void setVideo(VideoDTO video) {
                this.video = video;
            }

            public Boolean getVideoEnable() {
                return videoEnable;
            }

            public void setVideoEnable(Boolean videoEnable) {
                this.videoEnable = videoEnable;
            }

            public static class AudioDTO {
                /**
                 * bitRate
                 */
                @SerializedName("BitRate")
                private Integer bitRate;
                /**
                 * largestVolume
                 */
                @SerializedName("MaxVolume")
                private Integer maxVolume;
                /**
                 * samplingRate
                 */
                @SerializedName("SampleRate")
                private Integer sampleRate;

                public Integer getBitRate() {
                    return bitRate;
                }

                public void setBitRate(Integer bitRate) {
                    this.bitRate = bitRate;
                }

                public Integer getMaxVolume() {
                    return maxVolume;
                }

                public void setMaxVolume(Integer maxVolume) {
                    this.maxVolume = maxVolume;
                }

                public Integer getSampleRate() {
                    return sampleRate;
                }

                public void setSampleRate(Integer sampleRate) {
                    this.sampleRate = sampleRate;
                }
            }

            public static class VideoDTO {
                /**
                 * videoStreaming(kbps)
                 */
                @SerializedName("BitRate")
                private Integer bitRate;
                /**
                 * codeFlowControlMode
                 * "CBR"---fixedStream
                 * "VBR"---variableStream
                 * “MBR“---mixedStream
                 */
                @SerializedName("BitRateControl")
                private String bitRateControl;
                /**
                 * video Compression Format:
                 * MPEG4", “MPEG2”,
                 * “MPEG1”,“MJPG”, “H.263”,
                 * “H.264”, “AVS”, “H.264MF”,
                 * “H.264HF”, “JPEG”
                 */
                @SerializedName("Compression")
                private String compression;
                /**
                 * videoFrameRate
                 * Negative number means one frame per second
                 * -3 means one frame for 3 seconds
                 * Ranges -5~30
                 */
                @SerializedName("FPS")
                private Integer fps;
                /**
                 * I frame interval [2-12], 2S to 12S an I frame
                 */
                @SerializedName("GOP")
                private Integer gop;
                /**
                 * Image Quality
                 * Only works under variable code stream.
                 * The value is 1-6, the larger the value, the better the image quality.
                 */
                @SerializedName("Quality")
                private Integer quality;
                /**
                 * Resolution:“D1”, “HD1”,
                 * “BCIF”, “CIF”, “QCIF”,
                 * “VGA”, “QVGA”, “SVCD”,
                 * “QQVGA”, “SXVGA”, “UXGA”
                 */
                @SerializedName("Resolution")
                private String resolution;
                @SerializedName("VirtualGOP")
                private Integer virtualGOP;

                public Integer getBitRate() {
                    return bitRate;
                }

                public void setBitRate(Integer bitRate) {
                    this.bitRate = bitRate;
                }

                public String getBitRateControl() {
                    return bitRateControl;
                }

                public void setBitRateControl(String bitRateControl) {
                    this.bitRateControl = bitRateControl;
                }

                public String getCompression() {
                    return compression;
                }

                public void setCompression(String compression) {
                    this.compression = compression;
                }

                public Integer getFps() {
                    return fps;
                }

                public void setFps(Integer fps) {
                    this.fps = fps;
                }

                public Integer getGop() {
                    return gop;
                }

                public void setGop(Integer gop) {
                    this.gop = gop;
                }

                public Integer getQuality() {
                    return quality;
                }

                public void setQuality(Integer quality) {
                    this.quality = quality;
                }

                public String getResolution() {
                    return resolution;
                }

                public void setResolution(String resolution) {
                    this.resolution = resolution;
                }

                public Integer getVirtualGOP() {
                    return virtualGOP;
                }

                public void setVirtualGOP(Integer virtualGOP) {
                    this.virtualGOP = virtualGOP;
                }
            }
        }

        public static class MainFormatDTO {
            @SerializedName("Audio")
            private AudioDTO audio = new AudioDTO();
            @SerializedName("AudioEnable")
            private Boolean audioEnable;
            @SerializedName("Video")
            private VideoDTO video = new VideoDTO();
            @SerializedName("VideoEnable")
            private Boolean videoEnable;

            public AudioDTO getAudio() {
                return audio;
            }

            public void setAudio(AudioDTO audio) {
                this.audio = audio;
            }

            public Boolean getAudioEnable() {
                return audioEnable;
            }

            public void setAudioEnable(Boolean audioEnable) {
                this.audioEnable = audioEnable;
            }

            public VideoDTO getVideo() {
                return video;
            }

            public void setVideo(VideoDTO video) {
                this.video = video;
            }

            public Boolean getVideoEnable() {
                return videoEnable;
            }

            public void setVideoEnable(Boolean videoEnable) {
                this.videoEnable = videoEnable;
            }

            public static class AudioDTO {
                @SerializedName("BitRate")
                private Integer bitRate;
                @SerializedName("MaxVolume")
                private Integer maxVolume;
                @SerializedName("SampleRate")
                private Integer sampleRate;

                public Integer getBitRate() {
                    return bitRate;
                }

                public void setBitRate(Integer bitRate) {
                    this.bitRate = bitRate;
                }

                public Integer getMaxVolume() {
                    return maxVolume;
                }

                public void setMaxVolume(Integer maxVolume) {
                    this.maxVolume = maxVolume;
                }

                public Integer getSampleRate() {
                    return sampleRate;
                }

                public void setSampleRate(Integer sampleRate) {
                    this.sampleRate = sampleRate;
                }
            }

            public static class VideoDTO {
                @SerializedName("BitRate")
                private Integer bitRate;
                @SerializedName("BitRateControl")
                private String bitRateControl;
                @SerializedName("Compression")
                private String compression;
                @SerializedName("FPS")
                private Integer fps;
                @SerializedName("GOP")
                private Integer gop;
                @SerializedName("Quality")
                private Integer quality;
                @SerializedName("Resolution")
                private String resolution;
                @SerializedName("VirtualGOP")
                private Integer virtualGOP;

                public Integer getBitRate() {
                    return bitRate;
                }

                public void setBitRate(Integer bitRate) {
                    this.bitRate = bitRate;
                }

                public String getBitRateControl() {
                    return bitRateControl;
                }

                public void setBitRateControl(String bitRateControl) {
                    this.bitRateControl = bitRateControl;
                }

                public String getCompression() {
                    return compression;
                }

                public void setCompression(String compression) {
                    this.compression = compression;
                }

                public Integer getFps() {
                    return fps;
                }

                public void setFps(Integer fps) {
                    this.fps = fps;
                }

                public Integer getGop() {
                    return gop;
                }

                public void setGop(Integer gop) {
                    this.gop = gop;
                }

                public Integer getQuality() {
                    return quality;
                }

                public void setQuality(Integer quality) {
                    this.quality = quality;
                }

                public String getResolution() {
                    return resolution;
                }

                public void setResolution(String resolution) {
                    this.resolution = resolution;
                }

                public Integer getVirtualGOP() {
                    return virtualGOP;
                }

                public void setVirtualGOP(Integer virtualGOP) {
                    this.virtualGOP = virtualGOP;
                }
            }
        }

        public static class SnapFormatDTO {
            @SerializedName("Audio")
            private AudioDTO audio = new AudioDTO();
            @SerializedName("AudioEnable")
            private Boolean audioEnable;
            @SerializedName("Video")
            private VideoDTO video = new VideoDTO();
            @SerializedName("VideoEnable")
            private Boolean videoEnable;

            public AudioDTO getAudio() {
                return audio;
            }

            public void setAudio(AudioDTO audio) {
                this.audio = audio;
            }

            public Boolean getAudioEnable() {
                return audioEnable;
            }

            public void setAudioEnable(Boolean audioEnable) {
                this.audioEnable = audioEnable;
            }

            public VideoDTO getVideo() {
                return video;
            }

            public void setVideo(VideoDTO video) {
                this.video = video;
            }

            public Boolean getVideoEnable() {
                return videoEnable;
            }

            public void setVideoEnable(Boolean videoEnable) {
                this.videoEnable = videoEnable;
            }

            public static class AudioDTO {
                @SerializedName("BitRate")
                private Integer bitRate;
                @SerializedName("MaxVolume")
                private Integer maxVolume;
                @SerializedName("SampleRate")
                private Integer sampleRate;

                public Integer getBitRate() {
                    return bitRate;
                }

                public void setBitRate(Integer bitRate) {
                    this.bitRate = bitRate;
                }

                public Integer getMaxVolume() {
                    return maxVolume;
                }

                public void setMaxVolume(Integer maxVolume) {
                    this.maxVolume = maxVolume;
                }

                public Integer getSampleRate() {
                    return sampleRate;
                }

                public void setSampleRate(Integer sampleRate) {
                    this.sampleRate = sampleRate;
                }
            }

            public static class VideoDTO {
                @SerializedName("BitRate")
                private Integer bitRate;
                @SerializedName("BitRateControl")
                private String bitRateControl;
                @SerializedName("Compression")
                private String compression;
                @SerializedName("FPS")
                private Integer fps;
                @SerializedName("GOP")
                private Integer gop;
                @SerializedName("Quality")
                private Integer quality;
                @SerializedName("Resolution")
                private String resolution;
                @SerializedName("VirtualGOP")
                private Integer virtualGOP;

                public Integer getBitRate() {
                    return bitRate;
                }

                public void setBitRate(Integer bitRate) {
                    this.bitRate = bitRate;
                }

                public String getBitRateControl() {
                    return bitRateControl;
                }

                public void setBitRateControl(String bitRateControl) {
                    this.bitRateControl = bitRateControl;
                }

                public String getCompression() {
                    return compression;
                }

                public void setCompression(String compression) {
                    this.compression = compression;
                }

                public Integer getFps() {
                    return fps;
                }

                public void setFps(Integer fps) {
                    this.fps = fps;
                }

                public Integer getGop() {
                    return gop;
                }

                public void setGop(Integer gop) {
                    this.gop = gop;
                }

                public Integer getQuality() {
                    return quality;
                }

                public void setQuality(Integer quality) {
                    this.quality = quality;
                }

                public String getResolution() {
                    return resolution;
                }

                public void setResolution(String resolution) {
                    this.resolution = resolution;
                }

                public Integer getVirtualGOP() {
                    return virtualGOP;
                }

                public void setVirtualGOP(Integer virtualGOP) {
                    this.virtualGOP = virtualGOP;
                }
            }
        }
    }

    public List<AvEncEncodeDTO> getAvEncEncodeDTOS() {
        return avEncEncodeDTOS;
    }

    public void setAvEncEncodeDTOS(List<AvEncEncodeDTO> avEncEncodeDTOS) {
        this.avEncEncodeDTOS = avEncEncodeDTOS;
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
}
