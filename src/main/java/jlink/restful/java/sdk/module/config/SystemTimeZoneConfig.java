package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;


/**
 * systemTimeZoneConfiguration
 *
 * @author hjm
 * @date 2023/06/07
 */
public class SystemTimeZoneConfig extends DeviceConfig {
    @SerializedName("System.TimeZone")
    protected SystemTimeZoneDTO systemTimeZoneDTO;
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

    public SystemTimeZoneDTO getSystemTimeZoneDTO() {
        return systemTimeZoneDTO;
    }

    public void setSystemTimeZoneDTO(SystemTimeZoneDTO systemTimeZoneDTO) {
        this.systemTimeZoneDTO = systemTimeZoneDTO;
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

    public static class SystemTimeZoneDTO {
        /**
         * firstUserTimeZones
         */
        @SerializedName("FirstUserTimeZone")
        private Integer firstUserTimeZone;
        /**
         * minimumTime
         */
        @SerializedName("timeMin")
        private Integer timeMin;

        public Integer getFirstUserTimeZone() {
            return firstUserTimeZone;
        }

        public void setFirstUserTimeZone(Integer firstUserTimeZone) {
            this.firstUserTimeZone = firstUserTimeZone;
        }

        public Integer getTimeMin() {
            return timeMin;
        }

        public void setTimeMin(Integer timeMin) {
            this.timeMin = timeMin;
        }
    }
}
