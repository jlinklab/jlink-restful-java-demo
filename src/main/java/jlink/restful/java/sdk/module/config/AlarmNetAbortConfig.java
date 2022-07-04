package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * NetAbort
 *
 * @author hjm
 * @date 2022/04/24
 */
public class AlarmNetAbortConfig extends DeviceConfig {

    @SerializedName("Alarm.NetAbort")
    protected AlarmNetAbortDTO alarmNetAbort;
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

    public AlarmNetAbortDTO getAlarmNetAbort() {
        return alarmNetAbort;
    }

    public void setAlarmNetAbort(AlarmNetAbortDTO alarmNetAbort) {
        this.alarmNetAbort = alarmNetAbort;
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

    public static class AlarmNetAbortDTO {
        /**
         * enable
         */
        @SerializedName("Enable")
        private Boolean enable;
        /**
         * eventHandler
         */
        @SerializedName("EventHandler")
        private EventHandlerDTO eventHandler;

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

        public static class EventHandlerDTO {
            /**
             * alarmInfo
             */
            @SerializedName("AlarmInfo")
            private String alarmInfo;
            /**
             * alarmOutEnable
             */
            @SerializedName("AlarmOutEnable")
            private Boolean alarmOutEnable;
            /**
             * alarmOutLatch
             */
            @SerializedName("AlarmOutLatch")
            private Integer alarmOutLatch;
            /**
             * alarmOutMask
             */
            @SerializedName("AlarmOutMask")
            private String alarmOutMask;
            /**
             * beepEnable
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
             * fTPEnable
             */
            @SerializedName("FTPEnable")
            private Boolean fTPEnable;
            /**
             * logEnable
             */
            @SerializedName("LogEnable")
            private Boolean logEnable;
            /**
             * mMSEnable
             */
            @SerializedName("MMSEnable")
            private Boolean mMSEnable;
            /**
             * email Support
             */
            @SerializedName("MailEnable")
            private Boolean mailEnable;
            /**
             * matrix
             */
            @SerializedName("MatrixEnable")
            private Boolean matrixEnable;
            /**
             * matrix Cover
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
             * ptzEnable
             */
            @SerializedName("PtzEnable")
            private Boolean ptzEnable;
            /**
             * ptz link
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
             * shortMessageToEnable
             */
            @SerializedName("ShortMsgEnable")
            private Boolean shortMsgEnable;
            /**
             * accordingToInformation
             */
            @SerializedName("ShowInfo")
            private Boolean showInfo;
            /**
             * coverInformation
             */
            @SerializedName("ShowInfoMask")
            private String showInfoMask;
            /**
             * disconnectCanMake
             */
            @SerializedName("SnapEnable")
            private Boolean snapEnable;
            @SerializedName("SnapShotMask")
            private String snapShotMask;
            /**
             * setTime
             */
            @SerializedName("TimeSection")
            private List<List<String>> timeSection;
            /**
             * promptIsEnabled
             */
            @SerializedName("TipEnable")
            private Boolean tipEnable;
            /**
             * cruise
             */
            @SerializedName("TourEnable")
            private Boolean tourEnable;
            @SerializedName("TourMask")
            private String tourMask;
            /**
             * voice
             */
            @SerializedName("VoiceEnable")
            private Boolean voiceEnable;

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

            public Boolean getFTPEnable() {
                return fTPEnable;
            }

            public void setFTPEnable(Boolean fTPEnable) {
                this.fTPEnable = fTPEnable;
            }

            public Boolean getLogEnable() {
                return logEnable;
            }

            public void setLogEnable(Boolean logEnable) {
                this.logEnable = logEnable;
            }

            public Boolean getMMSEnable() {
                return mMSEnable;
            }

            public void setMMSEnable(Boolean mMSEnable) {
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
        }
    }
}
