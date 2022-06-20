package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Get the humanoid configuration for NVR single channel and IPC
 *
 * @author luojx
 * @date 2022/6/13 16:08
 */
public class DetectHumanDetectionConfig extends DeviceConfig{
    @SerializedName("Detect.HumanDetection")
    protected List<DetectHumanDetectionDTO> detectHumanDetectionDTOS;
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

    public List<DetectHumanDetectionDTO> getDetectHumanDetectionDTOS() {
        return detectHumanDetectionDTOS;
    }

    public void setDetectHumanDetectionDTOS(List<DetectHumanDetectionDTO> detectHumanDetectionDTOS) {
        this.detectHumanDetectionDTOS = detectHumanDetectionDTOS;
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

    public static class DetectHumanDetectionDTO{
        @SerializedName("Enable")
        private Boolean enable;
        @SerializedName("ObjectType")
        private Integer objectType;
        @SerializedName("PedFdrAlg")
        private Integer pedFdrAlg;
        @SerializedName("PedRule")
        private List<PedRuleDTO> pedRuleDTOS;
        @SerializedName("PushInterval")
        private Integer pushInterval;
        @SerializedName("Sensitivity")
        private Integer sensitivity;
        @SerializedName("ShowRule")
        private Integer showRule;
        @SerializedName("ShowTrack")
        private Integer showTrack;

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }

        public Integer getObjectType() {
            return objectType;
        }

        public void setObjectType(Integer objectType) {
            this.objectType = objectType;
        }

        public Integer getPedFdrAlg() {
            return pedFdrAlg;
        }

        public void setPedFdrAlg(Integer pedFdrAlg) {
            this.pedFdrAlg = pedFdrAlg;
        }

        public List<PedRuleDTO> getPedRuleDTOS() {
            return pedRuleDTOS;
        }

        public void setPedRuleDTOS(List<PedRuleDTO> pedRuleDTOS) {
            this.pedRuleDTOS = pedRuleDTOS;
        }

        public Integer getPushInterval() {
            return pushInterval;
        }

        public void setPushInterval(Integer pushInterval) {
            this.pushInterval = pushInterval;
        }

        public Integer getSensitivity() {
            return sensitivity;
        }

        public void setSensitivity(Integer sensitivity) {
            this.sensitivity = sensitivity;
        }

        public Integer getShowRule() {
            return showRule;
        }

        public void setShowRule(Integer showRule) {
            this.showRule = showRule;
        }

        public Integer getShowTrack() {
            return showTrack;
        }

        public void setShowTrack(Integer showTrack) {
            this.showTrack = showTrack;
        }

        public static class PedRuleDTO{
            @SerializedName("Enable")
            private Boolean enable;
            @SerializedName("RuleLine")
            private RuleLineDTO ruleLineDTO;
            @SerializedName("RuleRegion")
            private RuleRegionDTO ruleRegionDTO;
            @SerializedName("RuleType")
            private Integer ruleType;

            public Boolean getEnable() {
                return enable;
            }

            public void setEnable(Boolean enable) {
                this.enable = enable;
            }

            public RuleLineDTO getRuleLineDTO() {
                return ruleLineDTO;
            }

            public void setRuleLineDTO(RuleLineDTO ruleLineDTO) {
                this.ruleLineDTO = ruleLineDTO;
            }

            public RuleRegionDTO getRuleRegionDTO() {
                return ruleRegionDTO;
            }

            public void setRuleRegionDTO(RuleRegionDTO ruleRegionDTO) {
                this.ruleRegionDTO = ruleRegionDTO;
            }

            public Integer getRuleType() {
                return ruleType;
            }

            public void setRuleType(Integer ruleType) {
                this.ruleType = ruleType;
            }

            public static class RuleLineDTO{
                @SerializedName("AlarmDirect")
                private Integer alarmDirect;
                @SerializedName("Pts")
                private PtsDTO ptsDTO;

                public Integer getAlarmDirect() {
                    return alarmDirect;
                }

                public void setAlarmDirect(Integer alarmDirect) {
                    this.alarmDirect = alarmDirect;
                }

                public PtsDTO getPtsDTO() {
                    return ptsDTO;
                }

                public void setPtsDTO(PtsDTO ptsDTO) {
                    this.ptsDTO = ptsDTO;
                }

                public static class PtsDTO{
                    @SerializedName("StartX")
                    private Integer startX;
                    @SerializedName("StartY")
                    private Integer startY;
                    @SerializedName("StopX")
                    private Integer stopX;
                    @SerializedName("StopY")
                    private Integer stopY;

                    public Integer getStartX() {
                        return startX;
                    }

                    public void setStartX(Integer startX) {
                        this.startX = startX;
                    }

                    public Integer getStartY() {
                        return startY;
                    }

                    public void setStartY(Integer startY) {
                        this.startY = startY;
                    }

                    public Integer getStopX() {
                        return stopX;
                    }

                    public void setStopX(Integer stopX) {
                        this.stopX = stopX;
                    }

                    public Integer getStopY() {
                        return stopY;
                    }

                    public void setStopY(Integer stopY) {
                        this.stopY = stopY;
                    }
                }
            }

            public static class RuleRegionDTO{
                @SerializedName("AlarmDirect")
                private Integer alarmDirect;
                @SerializedName("Pts")
                private List<RegionPtsDTO> regionPtsDTOS;
                @SerializedName("PtsNum")
                private Integer ptsNum;

                public Integer getAlarmDirect() {
                    return alarmDirect;
                }

                public void setAlarmDirect(Integer alarmDirect) {
                    this.alarmDirect = alarmDirect;
                }

                public List<RegionPtsDTO> getRegionPtsDTOS() {
                    return regionPtsDTOS;
                }

                public void setRegionPtsDTOS(List<RegionPtsDTO> regionPtsDTOS) {
                    this.regionPtsDTOS = regionPtsDTOS;
                }

                public Integer getPtsNum() {
                    return ptsNum;
                }

                public void setPtsNum(Integer ptsNum) {
                    this.ptsNum = ptsNum;
                }

                public static class RegionPtsDTO{
                    @SerializedName("X")
                    private Integer x;
                    @SerializedName("Y")
                    private Integer y;

                    public Integer getX() {
                        return x;
                    }

                    public void setX(Integer x) {
                        this.x = x;
                    }

                    public Integer getY() {
                        return y;
                    }

                    public void setY(Integer y) {
                        this.y = y;
                    }
                }
            }
        }
    }
}
