package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * VoiceTipType
 *
 * @author luojx
 * @date 2022/6/22 10:24
 */
public class AbilityVoiceTipTypeConfig extends DeviceConfig{
    @SerializedName("Ability.VoiceTipType")
    protected AbilityVoiceTipTypeDTO abilityVoiceTipTypeDTO;
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
     * sessionID
     */
    @SerializedName("SessionID")
    protected String sessionID;

    public AbilityVoiceTipTypeDTO getAbilityVoiceTipTypeDTO() {
        return abilityVoiceTipTypeDTO;
    }

    public void setAbilityVoiceTipTypeDTO(AbilityVoiceTipTypeDTO abilityVoiceTipTypeDTO) {
        this.abilityVoiceTipTypeDTO = abilityVoiceTipTypeDTO;
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

    public static class AbilityVoiceTipTypeDTO{
        @SerializedName("VoiceTip")
        private List<VoiceTipDTO> voiceTipDTOS;

        public List<VoiceTipDTO> getVoiceTipDTOS() {
            return voiceTipDTOS;
        }

        public void setVoiceTipDTOS(List<VoiceTipDTO> voiceTipDTOS) {
            this.voiceTipDTOS = voiceTipDTOS;
        }

        public static class VoiceTipDTO{
            /**
             * Alarm voice type, set the VoiceType field in motion detection
             */
            @SerializedName("VoiceEnum")
            private Integer voiceEnum;
            /**
             * voice text
             */
            @SerializedName("VoiceText")
            private String voiceText;

            public Integer getVoiceEnum() {
                return voiceEnum;
            }

            public void setVoiceEnum(Integer voiceEnum) {
                this.voiceEnum = voiceEnum;
            }

            public String getVoiceText() {
                return voiceText;
            }

            public void setVoiceText(String voiceText) {
                this.voiceText = voiceText;
            }
        }
    }
}
