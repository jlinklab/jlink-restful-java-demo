package jlink.restful.java.sdk.module.config;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * MotionDetectConfig
 *
 * @author luojx
 * @date 2022/6/13 14:56
 */
public class DetectMotionDetectConfig extends DeviceConfig{
    @SerializedName("Detect.MotionDetect")
    protected List<DetectMotionDetectDTO> detectMotionDetectDTOS;
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

    public List<DetectMotionDetectDTO> getDetectMotionDetectDTOS() {
        return detectMotionDetectDTOS;
    }

    public void setDetectMotionDetectDTOS(List<DetectMotionDetectDTO> detectMotionDetectDTOS) {
        this.detectMotionDetectDTOS = detectMotionDetectDTOS;
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

    public static class DetectMotionDetectDTO{
        @SerializedName("AlarmType")
        private Integer alarmType;
        /**
         * dynamicTestingOpen
         */
        @SerializedName("Enable")
        private Boolean enable;
        @SerializedName("EventHandler")
        private DetectBlindDetectConfig.DetectBlindDetectDTO.EventHandlerDTO eventHandlerDTO;
        /**
         * sensitivity[1,6]
         */
        @SerializedName("Level")
        private Integer level;
        @SerializedName("PIRCheckTime")
        private Integer pIRCheckTime;
        @SerializedName("PirSensitive")
        private Integer pirSensitive;
        @SerializedName("PirTimeSection")
        private PirTimeSectionDTO pirTimeSectionDTO;
        @SerializedName("Region")
        private List<String> region;

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

        public DetectBlindDetectConfig.DetectBlindDetectDTO.EventHandlerDTO getEventHandlerDTO() {
            return eventHandlerDTO;
        }

        public void setEventHandlerDTO(DetectBlindDetectConfig.DetectBlindDetectDTO.EventHandlerDTO eventHandlerDTO) {
            this.eventHandlerDTO = eventHandlerDTO;
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

        public PirTimeSectionDTO getPirTimeSectionDTO() {
            return pirTimeSectionDTO;
        }

        public void setPirTimeSectionDTO(PirTimeSectionDTO pirTimeSectionDTO) {
            this.pirTimeSectionDTO = pirTimeSectionDTO;
        }

        public List<String> getRegion() {
            return region;
        }

        public void setRegion(List<String> region) {
            this.region = region;
        }

        public static class PirTimeSectionDTO{
            @SerializedName("PirTimeSectionOne")
            private PirTimeSectionPartDTO pirTimeSectionOneDTO;
            @SerializedName("PirTimeSectionTwo")
            private PirTimeSectionPartDTO pirTimeSectionTwoDTO;

            public PirTimeSectionPartDTO getPirTimeSectionOneDTO() {
                return pirTimeSectionOneDTO;
            }

            public void setPirTimeSectionOneDTO(PirTimeSectionPartDTO pirTimeSectionOneDTO) {
                this.pirTimeSectionOneDTO = pirTimeSectionOneDTO;
            }

            public PirTimeSectionPartDTO getPirTimeSectionTwoDTO() {
                return pirTimeSectionTwoDTO;
            }

            public void setPirTimeSectionTwoDTO(PirTimeSectionPartDTO pirTimeSectionTwoDTO) {
                this.pirTimeSectionTwoDTO = pirTimeSectionTwoDTO;
            }

            public static class PirTimeSectionPartDTO{
                @SerializedName("Enable")
                private Boolean enable;
                @SerializedName("WeekMask")
                private Integer weekMask;

                public Boolean getEnable() {
                    return enable;
                }

                public void setEnable(Boolean enable) {
                    this.enable = enable;
                }

                public Integer getWeekMask() {
                    return weekMask;
                }

                public void setWeekMask(Integer weekMask) {
                    this.weekMask = weekMask;
                }
            }
        }
    }
}
