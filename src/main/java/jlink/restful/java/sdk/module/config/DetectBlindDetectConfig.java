package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Video Blocking Configuration
 *
 * @author luojx
 * @date 2022/6/13 14:45
 */
public class DetectBlindDetectConfig extends DeviceConfig {
    @SerializedName("Detect.BlindDetect")
    protected List<DetectBlindDetectDTO> detectBlindDetectDTOS;
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

    public List<DetectBlindDetectDTO> getDetectBlindDetectDTOS() {
        return detectBlindDetectDTOS;
    }

    public void setDetectBlindDetectDTOS(List<DetectBlindDetectDTO> detectBlindDetectDTOS) {
        this.detectBlindDetectDTOS = detectBlindDetectDTOS;
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

    public static class DetectBlindDetectDTO {
        @SerializedName("Enable")
        private Boolean enable;
        @SerializedName("EventHandler")
        private EventHandlerDTO eventHandlerDTO;
        @SerializedName("Level")
        private Integer level;
        @SerializedName("Region")
        private List<String> region;

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }

        public EventHandlerDTO getEventHandlerDTO() {
            return eventHandlerDTO;
        }

        public void setEventHandlerDTO(EventHandlerDTO eventHandlerDTO) {
            this.eventHandlerDTO = eventHandlerDTO;
        }

        public Integer getLevel() {
            return level;
        }

        public void setLevel(Integer level) {
            this.level = level;
        }

        public List<String> getRegion() {
            return region;
        }

        public void setRegion(List<String> region) {
            this.region = region;
        }

        public static class EventHandlerDTO {
            /**
             * alarmInformation
             */
            @SerializedName("AlarmInfo")
            private String alarmInfo;
            /**
             * alarmOutputCanMake
             */
            @SerializedName("AlarmOutEnable")
            private Boolean alarmOutEnable;
            /**
             * alarmOutputThreshold
             */
            @SerializedName("AlarmOutLatch")
            private Integer alarmOutLatch;
            /**
             * alarmOutputCovered
             */
            @SerializedName("AlarmOutMask")
            private String alarmOutMask;
            /**
             * beep
             */
            @SerializedName("BeepEnable")
            private Boolean beepEnable;
            /**
             * dejitter
             */
            @SerializedName("Dejitter")
            private Integer dejitter;
            /**
             * eventLatch
             */
            @SerializedName("EventLatch")
            private Integer eventLatch;
            /**
             * ftp
             */
            @SerializedName("FTPEnable")
            private Boolean fTPEnable;
            /**
             * log
             */
            @SerializedName("LogEnable")
            private Boolean logEnable;
            /**
             * mms
             */
            @SerializedName("MMSEnable")
            private Boolean mMSEnable;
            /**
             * emailSupport
             */
            @SerializedName("MailEnable")
            private Boolean mailEnable;
            /**
             * matrix
             */
            @SerializedName("MatrixEnable")
            private Boolean matrixEnable;
            /**
             * matrixCover
             */
            @SerializedName("MatrixMask")
            private String matrixMask;
            /**
             * message
             */
            @SerializedName("MessageEnable")
            private Boolean messageEnable;
            /**
             * networkNews
             */
            @SerializedName("MsgtoNetEnable")
            private Boolean msgtoNetEnable;
            /**
             * multimediaMessage
             */
            @SerializedName("MultimediaMsgEnable")
            private Boolean multimediaMsgEnable;
            /**
             * ptz
             */
            @SerializedName("PtzEnable")
            private Boolean ptzEnable;
            /**
             * ptzlink
             */
            @SerializedName("PtzLink")
            private List<List<String>> ptzLink;
            /**
             * record
             */
            @SerializedName("RecordEnable")
            private Boolean recordEnable;
            /**
             * recordValue
             */
            @SerializedName("RecordLatch")
            private Integer recordLatch;
            /**
             * recordToCover
             */
            @SerializedName("RecordMask")
            private String recordMask;
            /**
             * shortMessage
             */
            @SerializedName("ShortMsgEnable")
            private Boolean shortMsgEnable;
            /**
             * accordingToInformation
             */
            @SerializedName("ShowInfo")
            private Boolean showInfo;
            @SerializedName("ShowInfoMask")
            private String showInfoMask;
            /**
             * snapshot
             */
            @SerializedName("SnapEnable")
            private Boolean snapEnable;
            /**
             * snapshotChannelNumberMask
             */
            @SerializedName("SnapShotMask")
            private String snapShotMask;
            /**
             * setTime
             */
            @SerializedName("TimeSection")
            private List<List<String>> timeSection;
            /**
             * prompt
             */
            @SerializedName("TipEnable")
            private Boolean tipEnable;
            /**
             * polling
             */
            @SerializedName("TourEnable")
            private Boolean tourEnable;
            /**
             * pollingMask
             */
            @SerializedName("TourMask")
            private String tourMask;
            /**
             * voicePrompt
             */
            @SerializedName("VoiceEnable")
            private Boolean voiceEnable;
            /**
             * voicePromptInterval
             */
            @SerializedName("VoiceTipInterval")
            private Integer voiceTipInterval;
            /**
             * voicePromptType
             */
            @SerializedName("VoiceType")
            private Integer voiceType;

            public String getAlarmInfo() {
                return alarmInfo;
            }

            public void setAlarmInfo(String alarmInfo) {
                this.alarmInfo = alarmInfo;
            }

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

            public Boolean getmMSEnable() {
                return mMSEnable;
            }

            public void setmMSEnable(Boolean mMSEnable) {
                this.mMSEnable = mMSEnable;
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

            public String getShowInfoMask() {
                return showInfoMask;
            }

            public void setShowInfoMask(String showInfoMask) {
                this.showInfoMask = showInfoMask;
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

            public String getTourMask() {
                return tourMask;
            }

            public void setTourMask(String tourMask) {
                this.tourMask = tourMask;
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
    }
}
