package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Get the humanoid configuration for NVR single channel and IPC
 *
 * @author luojx
 * @date 2022/6/13 16:24
 */
public class DetectHumanDetection0Config extends DeviceConfig{
    @SerializedName("Detect.HumanDetection.[0]")
    protected List<DetectHumanDetectionConfig.DetectHumanDetectionDTO> detectHumanDetectionDTOS;
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

    public List<DetectHumanDetectionConfig.DetectHumanDetectionDTO> getDetectHumanDetectionDTOS() {
        return detectHumanDetectionDTOS;
    }

    public void setDetectHumanDetectionDTOS(List<DetectHumanDetectionConfig.DetectHumanDetectionDTO> detectHumanDetectionDTOS) {
        this.detectHumanDetectionDTOS = detectHumanDetectionDTOS;
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
}
