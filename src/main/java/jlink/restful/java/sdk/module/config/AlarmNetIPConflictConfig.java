package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;


/**
 * NetIPConflict
 *
 * @author luojx
 * @date 2022/6/13 17:29
 */
public class AlarmNetIPConflictConfig extends DeviceConfig {
    @SerializedName("Alarm.NetIPConflict")
    protected AlarmNetIPConflictDTO alarmNetIPConflictDTO;
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

    public AlarmNetIPConflictDTO getAlarmNetIPConflictDTO() {
        return alarmNetIPConflictDTO;
    }

    public void setAlarmNetIPConflictDTO(AlarmNetIPConflictDTO alarmNetIPConflictDTO) {
        this.alarmNetIPConflictDTO = alarmNetIPConflictDTO;
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

    public static class AlarmNetIPConflictDTO {
        @SerializedName("Enable")
        private Boolean enable;
        @SerializedName("EventHandler")
        private AlarmNetAbortConfig.AlarmNetAbortDTO.EventHandlerDTO eventHandlerDTO;

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }

        public AlarmNetAbortConfig.AlarmNetAbortDTO.EventHandlerDTO getEventHandlerDTO() {
            return eventHandlerDTO;
        }

        public void setEventHandlerDTO(AlarmNetAbortConfig.AlarmNetAbortDTO.EventHandlerDTO eventHandlerDTO) {
            this.eventHandlerDTO = eventHandlerDTO;
        }
    }
}
