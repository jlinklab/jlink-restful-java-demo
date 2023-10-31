package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author luojx
 * @date 2023/7/5 10:24
 */
public class CameraParamExConfig extends DeviceConfig{
    @SerializedName("Camera.ParamEx")
    protected List<CameraParamExDTO> cameraParamExDTO;
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

    public List<CameraParamExDTO> getCameraParamExDTO() {
        return cameraParamExDTO;
    }

    public void setCameraParamExDTO(List<CameraParamExDTO> cameraParamExDTO) {
        this.cameraParamExDTO = cameraParamExDTO;
    }

    public class CameraParamExDTO{
        @SerializedName("AeMeansure")
        public int aeMeansure;
        @SerializedName("AutomaticAdjustment")
        public int automaticAdjustment;
        @SerializedName("BroadTrends")
        public BroadTrends broadTrends;
        @SerializedName("CorridorMode")
        public int corridorMode;
        @SerializedName("Dis")
        public int dis;
        @SerializedName("ExposureTime")
        public String exposureTime;
        @SerializedName("LDCValue")
        public int lDCValue;
        @SerializedName("Ldc")
        public int ldc;
        @SerializedName("LightRestrainLevel")
        public int lightRestrainLevel;
        @SerializedName("LowLuxMode")
        public int lowLuxMode;
        @SerializedName("PreventOverExpo")
        public int preventOverExpo;
        @SerializedName("SoftPhotosensitivecontrol")
        public int softPhotosensitivecontrol;
        @SerializedName("Style")
        public String style;

        public int getAeMeansure() {
            return aeMeansure;
        }

        public void setAeMeansure(int aeMeansure) {
            this.aeMeansure = aeMeansure;
        }

        public int getAutomaticAdjustment() {
            return automaticAdjustment;
        }

        public void setAutomaticAdjustment(int automaticAdjustment) {
            this.automaticAdjustment = automaticAdjustment;
        }

        public BroadTrends getBroadTrends() {
            return broadTrends;
        }

        public void setBroadTrends(BroadTrends broadTrends) {
            this.broadTrends = broadTrends;
        }

        public int getCorridorMode() {
            return corridorMode;
        }

        public void setCorridorMode(int corridorMode) {
            this.corridorMode = corridorMode;
        }

        public int getDis() {
            return dis;
        }

        public void setDis(int dis) {
            this.dis = dis;
        }

        public String getExposureTime() {
            return exposureTime;
        }

        public void setExposureTime(String exposureTime) {
            this.exposureTime = exposureTime;
        }

        public int getlDCValue() {
            return lDCValue;
        }

        public void setlDCValue(int lDCValue) {
            this.lDCValue = lDCValue;
        }

        public int getLdc() {
            return ldc;
        }

        public void setLdc(int ldc) {
            this.ldc = ldc;
        }

        public int getLightRestrainLevel() {
            return lightRestrainLevel;
        }

        public void setLightRestrainLevel(int lightRestrainLevel) {
            this.lightRestrainLevel = lightRestrainLevel;
        }

        public int getLowLuxMode() {
            return lowLuxMode;
        }

        public void setLowLuxMode(int lowLuxMode) {
            this.lowLuxMode = lowLuxMode;
        }

        public int getPreventOverExpo() {
            return preventOverExpo;
        }

        public void setPreventOverExpo(int preventOverExpo) {
            this.preventOverExpo = preventOverExpo;
        }

        public int getSoftPhotosensitivecontrol() {
            return softPhotosensitivecontrol;
        }

        public void setSoftPhotosensitivecontrol(int softPhotosensitivecontrol) {
            this.softPhotosensitivecontrol = softPhotosensitivecontrol;
        }

        public String getStyle() {
            return style;
        }

        public void setStyle(String style) {
            this.style = style;
        }
    }

    public class BroadTrends{
        @SerializedName("AutoGain")
        public int autoGain;
        @SerializedName("Gain")
        public int gain;

        public int getAutoGain() {
            return autoGain;
        }

        public void setAutoGain(int autoGain) {
            this.autoGain = autoGain;
        }

        public int getGain() {
            return gain;
        }

        public void setGain(int gain) {
            this.gain = gain;
        }
    }
}
