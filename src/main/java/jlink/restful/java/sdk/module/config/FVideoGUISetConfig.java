package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

/**
 * GUI Configuration
 *
 * @author luojx
 * @date 2022/6/13 18:49
 */
public class FVideoGUISetConfig extends DeviceConfig {
    @SerializedName("fVideo.GUISet")
    protected FVideoGUISetDTO fVideoGUISetDTO;
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

    public FVideoGUISetDTO getfVideoGUISetDTO() {
        return fVideoGUISetDTO;
    }

    public void setfVideoGUISetDTO(FVideoGUISetDTO fVideoGUISetDTO) {
        this.fVideoGUISetDTO = fVideoGUISetDTO;
    }

    public static class FVideoGUISetDTO {
        /**
         * alarmStatusCanMake
         */
        @SerializedName("AlarmStateEnable")
        private Boolean alarmStateEnable;
        @SerializedName("CarInfo")
        private Boolean carInfo;
        /**
         * codeFlowInformationCanMake
         */
        @SerializedName("ChanStateBitRateEnable")
        private Boolean chanStateBitRateEnable;
        /**
         * channelLockedCanMake
         */
        @SerializedName("ChanStateLckEnable")
        private Boolean chanStateLckEnable;
        /**
         * dongjianStateCanMake
         */
        @SerializedName("ChanStateMtdEnable")
        private Boolean chanStateMtdEnable;
        /**
         * canMakeVideoLostState
         */
        @SerializedName("ChanStateVlsEnable")
        private Boolean chanStateVlsEnable;
        /**
         * channelTitleCanMake
         */
        @SerializedName("ChannelTitleEnable")
        private Boolean channelTitleEnable;
        @SerializedName("Deflick")
        private Boolean deflick;
        /**
         *
         */
        @SerializedName("GPSInfo")
        private Boolean GPSInfo;
        /**
         * videoStateCanMake
         */
        @SerializedName("RecordStateEnable")
        private Boolean recordStateEnable;
        /**
         * remoteControlCanMake
         */
        @SerializedName("RemoteEnable")
        private Boolean remoteEnable;
        /**
         * headlinesShowCanMakeTime
         */
        @SerializedName("TimeTitleEnable")
        private Boolean timeTitleEnable;
        /**
         * windowBackgroundTransparency
         */
        @SerializedName("WindowAlpha")
        private Integer windowAlpha;

        public Boolean getAlarmStateEnable() {
            return alarmStateEnable;
        }

        public void setAlarmStateEnable(Boolean alarmStateEnable) {
            this.alarmStateEnable = alarmStateEnable;
        }

        public Boolean getCarInfo() {
            return carInfo;
        }

        public void setCarInfo(Boolean carInfo) {
            this.carInfo = carInfo;
        }

        public Boolean getChanStateBitRateEnable() {
            return chanStateBitRateEnable;
        }

        public void setChanStateBitRateEnable(Boolean chanStateBitRateEnable) {
            this.chanStateBitRateEnable = chanStateBitRateEnable;
        }

        public Boolean getChanStateLckEnable() {
            return chanStateLckEnable;
        }

        public void setChanStateLckEnable(Boolean chanStateLckEnable) {
            this.chanStateLckEnable = chanStateLckEnable;
        }

        public Boolean getChanStateMtdEnable() {
            return chanStateMtdEnable;
        }

        public void setChanStateMtdEnable(Boolean chanStateMtdEnable) {
            this.chanStateMtdEnable = chanStateMtdEnable;
        }

        public Boolean getChanStateVlsEnable() {
            return chanStateVlsEnable;
        }

        public void setChanStateVlsEnable(Boolean chanStateVlsEnable) {
            this.chanStateVlsEnable = chanStateVlsEnable;
        }

        public Boolean getChannelTitleEnable() {
            return channelTitleEnable;
        }

        public void setChannelTitleEnable(Boolean channelTitleEnable) {
            this.channelTitleEnable = channelTitleEnable;
        }

        public Boolean getDeflick() {
            return deflick;
        }

        public void setDeflick(Boolean deflick) {
            this.deflick = deflick;
        }

        public Boolean getGPSInfo() {
            return GPSInfo;
        }

        public void setGPSInfo(Boolean GPSInfo) {
            this.GPSInfo = GPSInfo;
        }

        public Boolean getRecordStateEnable() {
            return recordStateEnable;
        }

        public void setRecordStateEnable(Boolean recordStateEnable) {
            this.recordStateEnable = recordStateEnable;
        }

        public Boolean getRemoteEnable() {
            return remoteEnable;
        }

        public void setRemoteEnable(Boolean remoteEnable) {
            this.remoteEnable = remoteEnable;
        }

        public Boolean getTimeTitleEnable() {
            return timeTitleEnable;
        }

        public void setTimeTitleEnable(Boolean timeTitleEnable) {
            this.timeTitleEnable = timeTitleEnable;
        }

        public Integer getWindowAlpha() {
            return windowAlpha;
        }

        public void setWindowAlpha(Integer windowAlpha) {
            this.windowAlpha = windowAlpha;
        }
    }
}
