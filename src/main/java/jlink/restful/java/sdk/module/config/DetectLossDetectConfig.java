package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * LossDetectConfig
 *
 * @author luojx
 * @date 2022/6/13 15:15
 */
public class DetectLossDetectConfig extends DeviceConfig {
    @SerializedName("Detect.LossDetect")
    protected List<DetectLossDetectDTO> detectLossDetectDTOS;
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

    public List<DetectLossDetectDTO> getDetectLossDetectDTOS() {
        return detectLossDetectDTOS;
    }

    public void setDetectLossDetectDTOS(List<DetectLossDetectDTO> detectLossDetectDTOS) {
        this.detectLossDetectDTOS = detectLossDetectDTOS;
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

    public static class DetectLossDetectDTO {
        @SerializedName("Enable")
        private Boolean enable;
        @SerializedName("EventHandler")
        private DetectBlindDetectConfig.DetectBlindDetectDTO.EventHandlerDTO eventHandlerDTO;
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

        public List<String> getRegion() {
            return region;
        }

        public void setRegion(List<String> region) {
            this.region = region;
        }
    }
}
