package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author hjm
 * @date 2023/09/13
 */
public class AlarmPIRConfig extends DeviceConfig {

    @SerializedName("Alarm.PIR")
    protected List<AlarmPIRDTO> alarmPIRDTOs;
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

    public List<AlarmPIRDTO> getAlarmPIRDTOs() {
        return alarmPIRDTOs;
    }

    public void setAlarmPIRDTOs(List<AlarmPIRDTO> alarmPIRDTOs) {
        this.alarmPIRDTOs = alarmPIRDTOs;
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


    public static class AlarmPIRDTO {

        public static class EventHandlerDTO {
            @SerializedName("AlarmOutEnable")
            private Boolean alarmOutEnable;
            @SerializedName("AlarmOutLatch")
            private Integer alarmOutLatch;
            @SerializedName("AlarmOutMask")
            private String alarmOutMask;
            @SerializedName("BeepEnable")
            private Boolean beepEnable;
            @SerializedName("Dejitter")
            private Integer dejitter;
            @SerializedName("EventLatch")
            private Integer eventLatch;
            @SerializedName("FTPEnable")
            private Boolean fTPEnable;
            @SerializedName("LogEnable")
            private Boolean logEnable;
            @SerializedName("MailEnable")
            private Boolean mailEnable;
            @SerializedName("MatrixEnable")
            private Boolean matrixEnable;
            @SerializedName("MatrixMask")
            private String matrixMask;
            @SerializedName("MessageEnable")
            private Boolean messageEnable;
            @SerializedName("MsgtoNetEnable")
            private Boolean msgtoNetEnable;
            @SerializedName("MultimediaMsgEnable")
            private Boolean multimediaMsgEnable;
            @SerializedName("PtzEnable")
            private Boolean ptzEnable;
            @SerializedName("PtzLink")
            private List<List<String>> ptzLink;
            @SerializedName("RecordEnable")
            private Boolean recordEnable;
            @SerializedName("RecordLatch")
            private Integer recordLatch;
            @SerializedName("RecordMask")
            private String recordMask;
            @SerializedName("ShortMsgEnable")
            private Boolean shortMsgEnable;
            @SerializedName("ShowInfo")
            private Boolean showInfo;
            @SerializedName("SnapEnable")
            private Boolean snapEnable;
            @SerializedName("SnapShotMask")
            private String snapShotMask;
            @SerializedName("TimeSection")
            private List<List<String>> timeSection;
            @SerializedName("TipEnable")
            private Boolean tipEnable;
            @SerializedName("TourEnable")
            private Boolean tourEnable;
            @SerializedName("VoiceEnable")
            private Boolean voiceEnable;
            @SerializedName("VoiceTipInterval")
            private Integer voiceTipInterval;
            @SerializedName("VoiceType")
            private Integer voiceType;

            public Boolean getAlarmOutEnable() {
                return alarmOutEnable;
            }

            public void setAlarmOutEnable(Boolean alarmOutEnable) {
                this.alarmOutEnable = alarmOutEnable;
            }

            public Integer getAlarmOutLatch() {
                return alarmOutLatch;
            }

            public void setAlarmOutLatch(Integer alarmOutLatch) {
                this.alarmOutLatch = alarmOutLatch;
            }

            public String getAlarmOutMask() {
                return alarmOutMask;
            }

            public void setAlarmOutMask(String alarmOutMask) {
                this.alarmOutMask = alarmOutMask;
            }

            public Boolean getBeepEnable() {
                return beepEnable;
            }

            public void setBeepEnable(Boolean beepEnable) {
                this.beepEnable = beepEnable;
            }

            public Integer getDejitter() {
                return dejitter;
            }

            public void setDejitter(Integer dejitter) {
                this.dejitter = dejitter;
            }

            public Integer getEventLatch() {
                return eventLatch;
            }

            public void setEventLatch(Integer eventLatch) {
                this.eventLatch = eventLatch;
            }

            public Boolean getfTPEnable() {
                return fTPEnable;
            }

            public void setfTPEnable(Boolean fTPEnable) {
                this.fTPEnable = fTPEnable;
            }

            public Boolean getLogEnable() {
                return logEnable;
            }

            public void setLogEnable(Boolean logEnable) {
                this.logEnable = logEnable;
            }

            public Boolean getMailEnable() {
                return mailEnable;
            }

            public void setMailEnable(Boolean mailEnable) {
                this.mailEnable = mailEnable;
            }

            public Boolean getMatrixEnable() {
                return matrixEnable;
            }

            public void setMatrixEnable(Boolean matrixEnable) {
                this.matrixEnable = matrixEnable;
            }

            public String getMatrixMask() {
                return matrixMask;
            }

            public void setMatrixMask(String matrixMask) {
                this.matrixMask = matrixMask;
            }

            public Boolean getMessageEnable() {
                return messageEnable;
            }

            public void setMessageEnable(Boolean messageEnable) {
                this.messageEnable = messageEnable;
            }

            public Boolean getMsgtoNetEnable() {
                return msgtoNetEnable;
            }

            public void setMsgtoNetEnable(Boolean msgtoNetEnable) {
                this.msgtoNetEnable = msgtoNetEnable;
            }

            public Boolean getMultimediaMsgEnable() {
                return multimediaMsgEnable;
            }

            public void setMultimediaMsgEnable(Boolean multimediaMsgEnable) {
                this.multimediaMsgEnable = multimediaMsgEnable;
            }

            public Boolean getPtzEnable() {
                return ptzEnable;
            }

            public void setPtzEnable(Boolean ptzEnable) {
                this.ptzEnable = ptzEnable;
            }

            public List<List<String>> getPtzLink() {
                return ptzLink;
            }

            public void setPtzLink(List<List<String>> ptzLink) {
                this.ptzLink = ptzLink;
            }

            public Boolean getRecordEnable() {
                return recordEnable;
            }

            public void setRecordEnable(Boolean recordEnable) {
                this.recordEnable = recordEnable;
            }

            public Integer getRecordLatch() {
                return recordLatch;
            }

            public void setRecordLatch(Integer recordLatch) {
                this.recordLatch = recordLatch;
            }

            public String getRecordMask() {
                return recordMask;
            }

            public void setRecordMask(String recordMask) {
                this.recordMask = recordMask;
            }

            public Boolean getShortMsgEnable() {
                return shortMsgEnable;
            }

            public void setShortMsgEnable(Boolean shortMsgEnable) {
                this.shortMsgEnable = shortMsgEnable;
            }

            public Boolean getShowInfo() {
                return showInfo;
            }

            public void setShowInfo(Boolean showInfo) {
                this.showInfo = showInfo;
            }

            public Boolean getSnapEnable() {
                return snapEnable;
            }

            public void setSnapEnable(Boolean snapEnable) {
                this.snapEnable = snapEnable;
            }

            public String getSnapShotMask() {
                return snapShotMask;
            }

            public void setSnapShotMask(String snapShotMask) {
                this.snapShotMask = snapShotMask;
            }

            public List<List<String>> getTimeSection() {
                return timeSection;
            }

            public void setTimeSection(List<List<String>> timeSection) {
                this.timeSection = timeSection;
            }

            public Boolean getTipEnable() {
                return tipEnable;
            }

            public void setTipEnable(Boolean tipEnable) {
                this.tipEnable = tipEnable;
            }

            public Boolean getTourEnable() {
                return tourEnable;
            }

            public void setTourEnable(Boolean tourEnable) {
                this.tourEnable = tourEnable;
            }

            public Boolean getVoiceEnable() {
                return voiceEnable;
            }

            public void setVoiceEnable(Boolean voiceEnable) {
                this.voiceEnable = voiceEnable;
            }

            public Integer getVoiceTipInterval() {
                return voiceTipInterval;
            }

            public void setVoiceTipInterval(Integer voiceTipInterval) {
                this.voiceTipInterval = voiceTipInterval;
            }

            public Integer getVoiceType() {
                return voiceType;
            }

            public void setVoiceType(Integer voiceType) {
                this.voiceType = voiceType;
            }
        }

        public static class PirTimeSectionDTO {
            @SerializedName("PirTimeSectionOne")
            private PirTimeSectionOneDTO pirTimeSectionOne;
            @SerializedName("PirTimeSectionTwo")
            private PirTimeSectionTwoDTO pirTimeSectionTwo;

            public static class PirTimeSectionOneDTO {
                @SerializedName("Enable")
                private Boolean enable;
                @SerializedName("EndTime")
                private String endTime;
                @SerializedName("StartTime")
                private String startTime;
                @SerializedName("WeekMask")
                private Integer weekMask;

                public Boolean getEnable() {
                    return enable;
                }

                public void setEnable(Boolean enable) {
                    this.enable = enable;
                }

                public String getEndTime() {
                    return endTime;
                }

                public void setEndTime(String endTime) {
                    this.endTime = endTime;
                }

                public String getStartTime() {
                    return startTime;
                }

                public void setStartTime(String startTime) {
                    this.startTime = startTime;
                }

                public Integer getWeekMask() {
                    return weekMask;
                }

                public void setWeekMask(Integer weekMask) {
                    this.weekMask = weekMask;
                }
            }

            public static class PirTimeSectionTwoDTO {
                @SerializedName("Enable")
                private Boolean enable;
                @SerializedName("EndTime")
                private String endTime;
                @SerializedName("StartTime")
                private String startTime;
                @SerializedName("WeekMask")
                private Integer weekMask;

                public Boolean getEnable() {
                    return enable;
                }

                public void setEnable(Boolean enable) {
                    this.enable = enable;
                }

                public String getEndTime() {
                    return endTime;
                }

                public void setEndTime(String endTime) {
                    this.endTime = endTime;
                }

                public String getStartTime() {
                    return startTime;
                }

                public void setStartTime(String startTime) {
                    this.startTime = startTime;
                }

                public Integer getWeekMask() {
                    return weekMask;
                }

                public void setWeekMask(Integer weekMask) {
                    this.weekMask = weekMask;
                }
            }

            public PirTimeSectionOneDTO getPirTimeSectionOne() {
                return pirTimeSectionOne;
            }

            public void setPirTimeSectionOne(PirTimeSectionOneDTO pirTimeSectionOne) {
                this.pirTimeSectionOne = pirTimeSectionOne;
            }

            public PirTimeSectionTwoDTO getPirTimeSectionTwo() {
                return pirTimeSectionTwo;
            }

            public void setPirTimeSectionTwo(PirTimeSectionTwoDTO pirTimeSectionTwo) {
                this.pirTimeSectionTwo = pirTimeSectionTwo;
            }
        }

        @SerializedName("AlarmType")
        private Integer alarmType;
        @SerializedName("Enable")
        private Boolean enable;
        @SerializedName("EventHandler")
        private EventHandlerDTO eventHandler;
        @SerializedName("Level")
        private Integer level;
        @SerializedName("PIRCheckTime")
        private Integer pIRCheckTime;
        @SerializedName("PirSensitive")
        private Integer pirSensitive;
        @SerializedName("PirTimeSection")
        private PirTimeSectionDTO pirTimeSection;

        public Integer getAlarmType() {
            return alarmType;
        }

        public void setAlarmType(Integer alarmType) {
            this.alarmType = alarmType;
        }

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }

        public EventHandlerDTO getEventHandler() {
            return eventHandler;
        }

        public void setEventHandler(EventHandlerDTO eventHandler) {
            this.eventHandler = eventHandler;
        }

        public Integer getLevel() {
            return level;
        }

        public void setLevel(Integer level) {
            this.level = level;
        }

        public Integer getpIRCheckTime() {
            return pIRCheckTime;
        }

        public void setpIRCheckTime(Integer pIRCheckTime) {
            this.pIRCheckTime = pIRCheckTime;
        }

        public Integer getPirSensitive() {
            return pirSensitive;
        }

        public void setPirSensitive(Integer pirSensitive) {
            this.pirSensitive = pirSensitive;
        }

        public PirTimeSectionDTO getPirTimeSection() {
            return pirTimeSection;
        }

        public void setPirTimeSection(PirTimeSectionDTO pirTimeSection) {
            this.pirTimeSection = pirTimeSection;
        }
    }
}
