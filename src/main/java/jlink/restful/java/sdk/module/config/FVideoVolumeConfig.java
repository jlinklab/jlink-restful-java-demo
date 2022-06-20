package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * TV Adjustment Settings (Audio)
 *
 * @author luojx
 * @date 2022/6/13 10:22
 */
public class FVideoVolumeConfig extends DeviceConfig {
    @SerializedName("fVideo.Volume")
    protected List<FVideoVolumeDTO> fVideoVolumeDTOs;

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

    public List<FVideoVolumeDTO> getfVideoVolumeDTOs() {
        return fVideoVolumeDTOs;
    }

    public void setfVideoVolumeDTOs(List<FVideoVolumeDTO> fVideoVolumeDTOs) {
        this.fVideoVolumeDTOs = fVideoVolumeDTOs;
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

    public static class FVideoVolumeDTO {
        /**
         * audio mode
         */
        @SerializedName("AudioMode")
        private String audioMode;
        /**
         * leftVolume
         */
        @SerializedName("LeftVolume")
        private Integer leftVolume;
        /**
         * mute
         */
        @SerializedName("Mute")
        private Integer mute;
        /**
         * rightVolume
         */
        @SerializedName("RightVolume")
        private Integer rightVolume;

        public String getAudioMode() {
            return audioMode;
        }

        public void setAudioMode(String audioMode) {
            this.audioMode = audioMode;
        }

        public Integer getLeftVolume() {
            return leftVolume;
        }

        public void setLeftVolume(Integer leftVolume) {
            this.leftVolume = leftVolume;
        }

        public Integer getMute() {
            return mute;
        }

        public void setMute(Integer mute) {
            this.mute = mute;
        }

        public Integer getRightVolume() {
            return rightVolume;
        }

        public void setRightVolume(Integer rightVolume) {
            this.rightVolume = rightVolume;
        }
    }
}
