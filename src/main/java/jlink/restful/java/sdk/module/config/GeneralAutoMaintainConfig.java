package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

/**
 * automatic Maintenance Configuration
 *
 * @author luojx
 * @date 2022/6/13 19:17
 */
public class GeneralAutoMaintainConfig extends DeviceConfig {
    @SerializedName("General.AutoMaintain")
    protected GeneralAutoMaintainDTO generalAutoMaintainDTO;
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

    public GeneralAutoMaintainDTO getGeneralAutoMaintainDTO() {
        return generalAutoMaintainDTO;
    }

    public void setGeneralAutoMaintainDTO(GeneralAutoMaintainDTO generalAutoMaintainDTO) {
        this.generalAutoMaintainDTO = generalAutoMaintainDTO;
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

    public static class GeneralAutoMaintainDTO {
        /**
         * How many days old video files are automatically deleted
         */
        @SerializedName("AutoDeleteFilesDays")
        private Integer autoDeleteFilesDays;
        /**
         * Auto restart date
         */
        @SerializedName("AutoRebootDay")
        private String autoRebootDay;
        /**
         * Auto restart hours
         */
        @SerializedName("AutoRebootHour")
        private Integer autoRebootHour;

        public Integer getAutoDeleteFilesDays() {
            return autoDeleteFilesDays;
        }

        public void setAutoDeleteFilesDays(Integer autoDeleteFilesDays) {
            this.autoDeleteFilesDays = autoDeleteFilesDays;
        }

        public String getAutoRebootDay() {
            return autoRebootDay;
        }

        public void setAutoRebootDay(String autoRebootDay) {
            this.autoRebootDay = autoRebootDay;
        }

        public Integer getAutoRebootHour() {
            return autoRebootHour;
        }

        public void setAutoRebootHour(Integer autoRebootHour) {
            this.autoRebootHour = autoRebootHour;
        }
    }
}
