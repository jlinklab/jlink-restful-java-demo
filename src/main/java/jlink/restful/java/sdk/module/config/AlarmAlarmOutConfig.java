package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * alarm Configuration
 *
 * @author hjm
 * @date 2023/04/06
 */
public class AlarmAlarmOutConfig extends DeviceConfig {

    @SerializedName("Alarm.AlarmOut")
    protected List<AlarmAlarmOutDTO> alarmOutDTOs;
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

    public List<AlarmAlarmOutDTO> getAlarmOutDTOs() {
        return alarmOutDTOs;
    }

    public void setAlarmOutDTOs(List<AlarmAlarmOutDTO> alarmOutDTOs) {
        this.alarmOutDTOs = alarmOutDTOs;
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

    public static class AlarmAlarmOutDTO {
        /**
         * AlarmOutStatus
         */
        @SerializedName("AlarmOutStatus")
        private String alarmOutStatus;
        /**
         * AlarmOutType
         */
        @SerializedName("AlarmOutType")
        private String alarmOutType;

        public String getAlarmOutStatus() {
            return alarmOutStatus;
        }

        public void setAlarmOutStatus(String alarmOutStatus) {
            this.alarmOutStatus = alarmOutStatus;
        }

        public String getAlarmOutType() {
            return alarmOutType;
        }

        public void setAlarmOutType(String alarmOutType) {
            this.alarmOutType = alarmOutType;
        }
    }
}
