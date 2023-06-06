package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * local Alarm Configuration
 *
 * @author hjm
 * @date 2023/04/06
 */
public class AlarmLocalAlarmConfig extends DeviceConfig {

    @SerializedName("Alarm.LocalAlarm")
    protected List<AlarmLocalAlarmDTO> alarmLocalAlarmDTOS;
    /**
     * name
     */
    @SerializedName("Name")
    protected String name;
    /**
     * Ret
     */
    @SerializedName("Ret")
    protected Integer ret;
    /**
     * sessionID
     */
    @SerializedName("SessionID")
    protected String sessionID;

    public List<AlarmLocalAlarmDTO> getAlarmLocalAlarmDTOS() {
        return alarmLocalAlarmDTOS;
    }

    public void setAlarmLocalAlarmDTOS(List<AlarmLocalAlarmDTO> alarmLocalAlarmDTOS) {
        this.alarmLocalAlarmDTOS = alarmLocalAlarmDTOS;
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

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public static class AlarmLocalAlarmDTO {

        @SerializedName("Enable")
        private Boolean enable;
        @SerializedName("EventHandler")
        private EventHandlerDTO eventHandler;
        @SerializedName("SensorType")
        private String sensorType;

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

        public String getSensorType() {
            return sensorType;
        }

        public void setSensorType(String sensorType) {
            this.sensorType = sensorType;
        }

        public static class EventHandlerDTO {
            @SerializedName("AlarmInfo")
            private String alarmInfo;
            @SerializedName("AlarmLedMode")
            private Integer alarmLedMode;
            @SerializedName("AlarmOutEnable")
            private Boolean alarmOutEnable;
            @SerializedName("AlarmOutLatch")
            private Integer alarmOutLatch;
            @SerializedName("AlarmOutMask")
            private String alarmOutMask;
            @SerializedName("BeepEnable")
            private Boolean beepEnable;
            @SerializedName("CheckDiskInterval")
            private Integer checkDiskInterval;
            @SerializedName("Dejitter")
            private Integer dejitter;
            @SerializedName("EventLatch")
            private Integer eventLatch;
            @SerializedName("FTPEnable")
            private Boolean fTPEnable;
            @SerializedName("LogEnable")
            private Boolean logEnable;
            @SerializedName("MMSEnable")
            private Boolean mMSEnable;
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
            @SerializedName("SaveSerEnable")
            private Boolean saveSerEnable;
            @SerializedName("ShortMsgEnable")
            private Boolean shortMsgEnable;
            @SerializedName("ShowInfo")
            private Boolean showInfo;
            @SerializedName("ShowInfoMask")
            private String showInfoMask;
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
            @SerializedName("TourMask")
            private String tourMask;
            @SerializedName("VoiceEnable")
            private Boolean voiceEnable;
            @SerializedName("VoiceTipInterval")
            private Integer voiceTipInterval;
            @SerializedName("VoiceType")
            private Integer voiceType;

            public String getAlarmInfo() {
                return alarmInfo;
            }

            public void setAlarmInfo(String alarmInfo) {
                this.alarmInfo = alarmInfo;
            }

            public Integer getAlarmLedMode() {
                return alarmLedMode;
            }

            public void setAlarmLedMode(Integer alarmLedMode) {
                this.alarmLedMode = alarmLedMode;
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

            public Integer getCheckDiskInterval() {
                return checkDiskInterval;
            }

            public void setCheckDiskInterval(Integer checkDiskInterval) {
                this.checkDiskInterval = checkDiskInterval;
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

            public Boolean getSaveSerEnable() {
                return saveSerEnable;
            }

            public void setSaveSerEnable(Boolean saveSerEnable) {
                this.saveSerEnable = saveSerEnable;
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
