package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Camera parameters
 *
 * @author luojx
 * @date 2022/6/13 15:28
 */
public class CameraConfig extends DeviceConfig {
    @SerializedName("Camera")
    protected CameraDTO cameraDTO;
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

    public CameraDTO getCameraDTO() {
        return cameraDTO;
    }

    public void setCameraDTO(CameraDTO cameraDTO) {
        this.cameraDTO = cameraDTO;
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

    public static class CameraDTO {
        @SerializedName("ClearFog")
        private List<ClearFogDTO> clearFogDTOS;
        @SerializedName("DistortionCorrect")
        private DistortionCorrectDTO distortionCorrectDTO;
        @SerializedName("FishLensParam")
        private List<FishLensParamDTO> fishLensParamDTOS;
        @SerializedName("Param")
        private List<ParamDTO> paramDTOS;
        @SerializedName("ParamEx")
        private List<ParamExDTO> paramExDTOS;
        @SerializedName("WhiteLight")
        private WhiteLightDTO whiteLightDTO;

        public List<ClearFogDTO> getClearFogDTOS() {
            return clearFogDTOS;
        }

        public void setClearFogDTOS(List<ClearFogDTO> clearFogDTOS) {
            this.clearFogDTOS = clearFogDTOS;
        }

        public DistortionCorrectDTO getDistortionCorrectDTO() {
            return distortionCorrectDTO;
        }

        public void setDistortionCorrectDTO(DistortionCorrectDTO distortionCorrectDTO) {
            this.distortionCorrectDTO = distortionCorrectDTO;
        }

        public List<FishLensParamDTO> getFishLensParamDTOS() {
            return fishLensParamDTOS;
        }

        public void setFishLensParamDTOS(List<FishLensParamDTO> fishLensParamDTOS) {
            this.fishLensParamDTOS = fishLensParamDTOS;
        }

        public List<ParamDTO> getParamDTOS() {
            return paramDTOS;
        }

        public void setParamDTOS(List<ParamDTO> paramDTOS) {
            this.paramDTOS = paramDTOS;
        }

        public List<ParamExDTO> getParamExDTOS() {
            return paramExDTOS;
        }

        public void setParamExDTOS(List<ParamExDTO> paramExDTOS) {
            this.paramExDTOS = paramExDTOS;
        }

        public WhiteLightDTO getWhiteLightDTO() {
            return whiteLightDTO;
        }

        public void setWhiteLightDTO(WhiteLightDTO whiteLightDTO) {
            this.whiteLightDTO = whiteLightDTO;
        }

        public static class ClearFogDTO {
            @SerializedName("enable")
            private Boolean enable;
            @SerializedName("level")
            private Integer level;

            public Boolean getEnable() {
                return enable;
            }

            public void setEnable(Boolean enable) {
                this.enable = enable;
            }

            public Integer getLevel() {
                return level;
            }

            public void setLevel(Integer level) {
                this.level = level;
            }
        }

        public static class DistortionCorrectDTO {
            @SerializedName("Lenstype")
            private Integer lensType;
            @SerializedName("Version")
            private Integer version;

            public Integer getLensType() {
                return lensType;
            }

            public void setLensType(Integer lensType) {
                this.lensType = lensType;
            }

            public Integer getVersion() {
                return version;
            }

            public void setVersion(Integer version) {
                this.version = version;
            }
        }

        public static class FishLensParamDTO {
            @SerializedName("CenterOffsetX")
            private Integer centerOffsetX;
            @SerializedName("CenterOffsetY")
            private Integer centerOffsetY;
            @SerializedName("ImageHeight")
            private Integer imageHeight;
            @SerializedName("ImageWidth")
            private Integer imageWidth;
            @SerializedName("LensType")
            private Integer lensType;
            @SerializedName("PCMac")
            private String pcMac;
            @SerializedName("Radius")
            private Integer radius;
            @SerializedName("Version")
            private Integer version;
            @SerializedName("ViewAngle")
            private Integer viewAngle;
            @SerializedName("ViewMode")
            private Integer viewMode;
            @SerializedName("Zoom")
            private Integer zoom;

            public Integer getCenterOffsetX() {
                return centerOffsetX;
            }

            public void setCenterOffsetX(Integer centerOffsetX) {
                this.centerOffsetX = centerOffsetX;
            }

            public Integer getCenterOffsetY() {
                return centerOffsetY;
            }

            public void setCenterOffsetY(Integer centerOffsetY) {
                this.centerOffsetY = centerOffsetY;
            }

            public Integer getImageHeight() {
                return imageHeight;
            }

            public void setImageHeight(Integer imageHeight) {
                this.imageHeight = imageHeight;
            }

            public Integer getImageWidth() {
                return imageWidth;
            }

            public void setImageWidth(Integer imageWidth) {
                this.imageWidth = imageWidth;
            }

            public Integer getLensType() {
                return lensType;
            }

            public void setLensType(Integer lensType) {
                this.lensType = lensType;
            }

            public String getPcMac() {
                return pcMac;
            }

            public void setPcMac(String pcMac) {
                this.pcMac = pcMac;
            }

            public Integer getRadius() {
                return radius;
            }

            public void setRadius(Integer radius) {
                this.radius = radius;
            }

            public Integer getVersion() {
                return version;
            }

            public void setVersion(Integer version) {
                this.version = version;
            }

            public Integer getViewAngle() {
                return viewAngle;
            }

            public void setViewAngle(Integer viewAngle) {
                this.viewAngle = viewAngle;
            }

            public Integer getViewMode() {
                return viewMode;
            }

            public void setViewMode(Integer viewMode) {
                this.viewMode = viewMode;
            }

            public Integer getZoom() {
                return zoom;
            }

            public void setZoom(Integer zoom) {
                this.zoom = zoom;
            }
        }

        public static class ParamDTO {
            /**
             * sensitivity Configuration
             */
            @SerializedName("AeSensitivity")
            private Integer aeSensitivity;
            /**
             * configure AutomaticAperture
             */
            @SerializedName("ApertureMode")
            private String apertureMode;
            /**
             * backlight Compensation
             */
            @SerializedName("BLCMode")
            private String bLCMode;
            /**
             * dayAndNightMode
             */
            @SerializedName("DayNightColor")
            private String dayNightColor;
            /**
             * noiseLevelDuringDay
             */
            @SerializedName("Day_nfLevel")
            private Integer day_nfLevel;
            /**
             * dayAndNight SwitchThreshold
             */
            @SerializedName("DncThr")
            private Integer dncThr;
            /**
             * set ReferenceLevelValue
             */
            @SerializedName("ElecLevel")
            private Integer elecLevel;
            /**
             * electronic SlowShutter
             */
            @SerializedName("EsShutter")
            private String esShutter;
            @SerializedName("ExposureParam")
            private ExposureParamDTO exposureParamDTO;
            @SerializedName("GainParam")
            private GainParamDTO gainParamDTO;
            /**
             * IR-CUT switchMode
             */
            @SerializedName("IRCUTMode")
            private Integer ircutMode;
            @SerializedName("InfraredSwap")
            private Integer infraredSwap;
            /**
             * IRcut sequence Transformation
             */
            @SerializedName("IrcutSwap")
            private Integer ircutSwap;
            /**
             * nightNoiseLevel
             */
            @SerializedName("Night_nfLevel")
            private Integer night_nfLevel;
            /**
             * picture UpsideDown
             */
            @SerializedName("PictureFlip")
            private String pictureFlip;
            /**
             * pictures AboutFlip
             */
            @SerializedName("PictureMirror")
            private String pictureMirror;
            /**
             * fluorescentLamp flashFunction
             */
            @SerializedName("RejectFlicker")
            private String rejectFlicker;
            /**
             * whiteBalance
             */
            @SerializedName("WhiteBalance")
            private String whiteBalance;

            public Integer getAeSensitivity() {
                return aeSensitivity;
            }

            public void setAeSensitivity(Integer aeSensitivity) {
                this.aeSensitivity = aeSensitivity;
            }

            public String getApertureMode() {
                return apertureMode;
            }

            public void setApertureMode(String apertureMode) {
                this.apertureMode = apertureMode;
            }

            public String getbLCMode() {
                return bLCMode;
            }

            public void setbLCMode(String bLCMode) {
                this.bLCMode = bLCMode;
            }

            public String getDayNightColor() {
                return dayNightColor;
            }

            public void setDayNightColor(String dayNightColor) {
                this.dayNightColor = dayNightColor;
            }

            public Integer getDay_nfLevel() {
                return day_nfLevel;
            }

            public void setDay_nfLevel(Integer day_nfLevel) {
                this.day_nfLevel = day_nfLevel;
            }

            public Integer getDncThr() {
                return dncThr;
            }

            public void setDncThr(Integer dncThr) {
                this.dncThr = dncThr;
            }

            public Integer getElecLevel() {
                return elecLevel;
            }

            public void setElecLevel(Integer elecLevel) {
                this.elecLevel = elecLevel;
            }

            public String getEsShutter() {
                return esShutter;
            }

            public void setEsShutter(String esShutter) {
                this.esShutter = esShutter;
            }

            public ExposureParamDTO getExposureParamDTO() {
                return exposureParamDTO;
            }

            public void setExposureParamDTO(ExposureParamDTO exposureParamDTO) {
                this.exposureParamDTO = exposureParamDTO;
            }

            public GainParamDTO getGainParamDTO() {
                return gainParamDTO;
            }

            public void setGainParamDTO(GainParamDTO gainParamDTO) {
                this.gainParamDTO = gainParamDTO;
            }

            public Integer getIrcutMode() {
                return ircutMode;
            }

            public void setIrcutMode(Integer ircutMode) {
                this.ircutMode = ircutMode;
            }

            public Integer getInfraredSwap() {
                return infraredSwap;
            }

            public void setInfraredSwap(Integer infraredSwap) {
                this.infraredSwap = infraredSwap;
            }

            public Integer getIrcutSwap() {
                return ircutSwap;
            }

            public void setIrcutSwap(Integer ircutSwap) {
                this.ircutSwap = ircutSwap;
            }

            public Integer getNight_nfLevel() {
                return night_nfLevel;
            }

            public void setNight_nfLevel(Integer night_nfLevel) {
                this.night_nfLevel = night_nfLevel;
            }

            public String getPictureFlip() {
                return pictureFlip;
            }

            public void setPictureFlip(String pictureFlip) {
                this.pictureFlip = pictureFlip;
            }

            public String getPictureMirror() {
                return pictureMirror;
            }

            public void setPictureMirror(String pictureMirror) {
                this.pictureMirror = pictureMirror;
            }

            public String getRejectFlicker() {
                return rejectFlicker;
            }

            public void setRejectFlicker(String rejectFlicker) {
                this.rejectFlicker = rejectFlicker;
            }

            public String getWhiteBalance() {
                return whiteBalance;
            }

            public void setWhiteBalance(String whiteBalance) {
                this.whiteBalance = whiteBalance;
            }

            public static class ExposureParamDTO {
                /**
                 * automatic exposure minimumTime
                 */
                @SerializedName("LeastTime")
                private String leastTime;
                /**
                 * aeModel manualExposureLevel
                 */
                @SerializedName("Level")
                private Integer level;
                /**
                 * automaticExposureMaximumTime
                 */
                @SerializedName("MostTime")
                private String mostTime;

                public String getLeastTime() {
                    return leastTime;
                }

                public void setLeastTime(String leastTime) {
                    this.leastTime = leastTime;
                }

                public Integer getLevel() {
                    return level;
                }

                public void setLevel(Integer level) {
                    this.level = level;
                }

                public String getMostTime() {
                    return mostTime;
                }

                public void setMostTime(String mostTime) {
                    this.mostTime = mostTime;
                }
            }

            public static class GainParamDTO {
                /**
                 * automaticGainOpen
                 */
                @SerializedName("AutoGain")
                private Integer autoGain;
                /**
                 * automaticGainLimit
                 */
                @SerializedName("Gain")
                private Integer gain;

                public Integer getAutoGain() {
                    return autoGain;
                }

                public void setAutoGain(Integer autoGain) {
                    this.autoGain = autoGain;
                }

                public Integer getGain() {
                    return gain;
                }

                public void setGain(Integer gain) {
                    this.gain = gain;
                }
            }
        }

        public static class ParamExDTO {
            /**
             * sensitivityConfiguration
             */
            @SerializedName("AeMeansure")
            private Integer aeMeansure;
            @SerializedName("AutomaticAdjustment")
            private Integer automaticAdjustment;
            @SerializedName("BroadTrends")
            private BroadTrendsDTO broadTrendsDTO;
            /**
             * corridorPattern
             */
            @SerializedName("CorridorMode")
            private Integer corridorMode;
            /**
             * electronicImageStabilizationIsSet
             */
            @SerializedName("Dis")
            private Integer dis;
            /**
             * actualEffectOfExposureTime
             */
            @SerializedName("ExposureTime")
            private String exposureTime;
            /**
             * lensDistortionCorrection
             */
            @SerializedName("Ldc")
            private Integer ldc;
            @SerializedName("LightRestrainLevel")
            private Integer lightRestrainLevel;
            /**
             * lightPattern
             */
            @SerializedName("LowLuxMode")
            private Integer lowLuxMode;
            /**
             * image
             */
            @SerializedName("PreventOverExpo")
            private Integer preventOverExpo;
            /**
             * softLightControl
             */
            @SerializedName("SoftPhotosensitivecontrol")
            private Integer softPhotoSensitiveControl;
            @SerializedName("Style")
            private String style;

            public Integer getAeMeansure() {
                return aeMeansure;
            }

            public void setAeMeansure(Integer aeMeansure) {
                this.aeMeansure = aeMeansure;
            }

            public Integer getAutomaticAdjustment() {
                return automaticAdjustment;
            }

            public void setAutomaticAdjustment(Integer automaticAdjustment) {
                this.automaticAdjustment = automaticAdjustment;
            }

            public BroadTrendsDTO getBroadTrendsDTO() {
                return broadTrendsDTO;
            }

            public void setBroadTrendsDTO(BroadTrendsDTO broadTrendsDTO) {
                this.broadTrendsDTO = broadTrendsDTO;
            }

            public Integer getCorridorMode() {
                return corridorMode;
            }

            public void setCorridorMode(Integer corridorMode) {
                this.corridorMode = corridorMode;
            }

            public Integer getDis() {
                return dis;
            }

            public void setDis(Integer dis) {
                this.dis = dis;
            }

            public String getExposureTime() {
                return exposureTime;
            }

            public void setExposureTime(String exposureTime) {
                this.exposureTime = exposureTime;
            }

            public Integer getLdc() {
                return ldc;
            }

            public void setLdc(Integer ldc) {
                this.ldc = ldc;
            }

            public Integer getLightRestrainLevel() {
                return lightRestrainLevel;
            }

            public void setLightRestrainLevel(Integer lightRestrainLevel) {
                this.lightRestrainLevel = lightRestrainLevel;
            }

            public Integer getLowLuxMode() {
                return lowLuxMode;
            }

            public void setLowLuxMode(Integer lowLuxMode) {
                this.lowLuxMode = lowLuxMode;
            }

            public Integer getPreventOverExpo() {
                return preventOverExpo;
            }

            public void setPreventOverExpo(Integer preventOverExpo) {
                this.preventOverExpo = preventOverExpo;
            }

            public Integer getSoftPhotoSensitiveControl() {
                return softPhotoSensitiveControl;
            }

            public void setSoftPhotoSensitiveControl(Integer softPhotoSensitiveControl) {
                this.softPhotoSensitiveControl = softPhotoSensitiveControl;
            }

            public String getStyle() {
                return style;
            }

            public void setStyle(String style) {
                this.style = style;
            }

            public static class BroadTrendsDTO {
                /**
                 * automaticGainOpen
                 */
                @SerializedName("AutoGain")
                private Integer autoGain;
                /**
                 * automaticGainLimit
                 */
                @SerializedName("Gain")
                private Integer gain;

                public Integer getAutoGain() {
                    return autoGain;
                }

                public void setAutoGain(Integer autoGain) {
                    this.autoGain = autoGain;
                }

                public Integer getGain() {
                    return gain;
                }

                public void setGain(Integer gain) {
                    this.gain = gain;
                }
            }
        }

        public static class WhiteLightDTO {
            /**
             * brightness
             */
            @SerializedName("Brightness")
            private Integer brightness;
            @SerializedName("MoveTrigLight")
            private MoveTrigLightDTO moveTrigLightDTO;
            @SerializedName("WorkMode")
            private String workMode;
            @SerializedName("WorkPeriod")
            private WorkPeriodDTO workPeriodDTO;

            public Integer getBrightness() {
                return brightness;
            }

            public void setBrightness(Integer brightness) {
                this.brightness = brightness;
            }

            public MoveTrigLightDTO getMoveTrigLightDTO() {
                return moveTrigLightDTO;
            }

            public void setMoveTrigLightDTO(MoveTrigLightDTO moveTrigLightDTO) {
                this.moveTrigLightDTO = moveTrigLightDTO;
            }

            public String getWorkMode() {
                return workMode;
            }

            public void setWorkMode(String workMode) {
                this.workMode = workMode;
            }

            public WorkPeriodDTO getWorkPeriodDTO() {
                return workPeriodDTO;
            }

            public void setWorkPeriodDTO(WorkPeriodDTO workPeriodDTO) {
                this.workPeriodDTO = workPeriodDTO;
            }

            public static class MoveTrigLightDTO {
                @SerializedName("Duration")
                private Integer duration;
                @SerializedName("Level")
                private Integer level;

                public Integer getDuration() {
                    return duration;
                }

                public void setDuration(Integer duration) {
                    this.duration = duration;
                }

                public Integer getLevel() {
                    return level;
                }

                public void setLevel(Integer level) {
                    this.level = level;
                }
            }

            public static class WorkPeriodDTO {
                @SerializedName("EHour")
                private Integer eHour;
                @SerializedName("EMinute")
                private Integer eMinute;
                @SerializedName("Enable")
                private Integer enable;
                @SerializedName("SHour")
                private Integer sHour;
                @SerializedName("SMinute")
                private Integer sMinute;

                public Integer geteHour() {
                    return eHour;
                }

                public void seteHour(Integer eHour) {
                    this.eHour = eHour;
                }

                public Integer geteMinute() {
                    return eMinute;
                }

                public void seteMinute(Integer eMinute) {
                    this.eMinute = eMinute;
                }

                public Integer getEnable() {
                    return enable;
                }

                public void setEnable(Integer enable) {
                    this.enable = enable;
                }

                public Integer getsHour() {
                    return sHour;
                }

                public void setsHour(Integer sHour) {
                    this.sHour = sHour;
                }

                public Integer getsMinute() {
                    return sMinute;
                }

                public void setsMinute(Integer sMinute) {
                    this.sMinute = sMinute;
                }
            }
        }
    }
}
