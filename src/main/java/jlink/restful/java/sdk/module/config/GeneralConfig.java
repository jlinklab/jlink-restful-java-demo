package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

/**
 * General configuration
 *
 * @author hjm
 * @date 2022/06/10
 */
public class GeneralConfig extends DeviceConfig {
    @SerializedName("General.General")
    protected GeneralDTO generalDTO;
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

    public static class GeneralDTO {
        /**
         * Automatically log out, 0 means no automatic logout
         */
        @SerializedName("AutoLogout")
        private Integer autoLogout;
        /**
         * When DVR uses vector fonts in Persian, Thai, etc., the interface text size
         */
        @SerializedName("FontSize")
        private Integer fontSize;
        /**
         * When the DVR is in Persian, whether to use the Persian calendar 0: not use 1: use
         */
        @SerializedName("IranCalendarEnable")
        private Integer iranCalendarEnable;
        /**
         * Device number, used for one remote control to control only one of them when multiple DVRs are put together 0 - 998
         */
        @SerializedName("LocalNo")
        private Integer localNo;
        /**
         * nameOfMachine
         */
        @SerializedName("MachineName")
        private String machineName;
        /**
         * Handling policy when the hard disk is full ，”StopRecord”, “OverWrite”
         */
        @SerializedName("OverWrite")
        private String overWrite;
        /**
         * Auto off screen delay
         */
        @SerializedName("ScreenAutoShutdown")
        private Integer screenAutoShutdown;
        /**
         * screen save time
         */
        @SerializedName("ScreenSaveTime")
        private Integer screenSaveTime;
        /**
         * Video output method：“TV”, “VGA”, “AUTO”
         */
        @SerializedName("VideoOutPut")
        private String videoOutPut;

        public Integer getAutoLogout() {
            return autoLogout;
        }

        public void setAutoLogout(Integer autoLogout) {
            this.autoLogout = autoLogout;
        }

        public Integer getFontSize() {
            return fontSize;
        }

        public void setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
        }

        public Integer getIranCalendarEnable() {
            return iranCalendarEnable;
        }

        public void setIranCalendarEnable(Integer iranCalendarEnable) {
            this.iranCalendarEnable = iranCalendarEnable;
        }

        public Integer getLocalNo() {
            return localNo;
        }

        public void setLocalNo(Integer localNo) {
            this.localNo = localNo;
        }

        public String getMachineName() {
            return machineName;
        }

        public void setMachineName(String machineName) {
            this.machineName = machineName;
        }

        public String getOverWrite() {
            return overWrite;
        }

        public void setOverWrite(String overWrite) {
            this.overWrite = overWrite;
        }

        public Integer getScreenAutoShutdown() {
            return screenAutoShutdown;
        }

        public void setScreenAutoShutdown(Integer screenAutoShutdown) {
            this.screenAutoShutdown = screenAutoShutdown;
        }

        public Integer getScreenSaveTime() {
            return screenSaveTime;
        }

        public void setScreenSaveTime(Integer screenSaveTime) {
            this.screenSaveTime = screenSaveTime;
        }

        public String getVideoOutPut() {
            return videoOutPut;
        }

        public void setVideoOutPut(String videoOutPut) {
            this.videoOutPut = videoOutPut;
        }
    }

    public GeneralDTO getGeneralDTO() {
        return generalDTO;
    }

    public void setGeneralDTO(GeneralDTO generalDTO) {
        this.generalDTO = generalDTO;
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
