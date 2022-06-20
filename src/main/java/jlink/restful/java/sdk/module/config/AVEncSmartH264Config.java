package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * H.264+
 *
 * @author luojx
 * @date 2022/6/13 10:43
 */
public class AVEncSmartH264Config extends DeviceConfig{

    @SerializedName("AVEnc.SmartH264")
    protected List<AVEncSmartH264DTO> avEncSmartH264DTOS;
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

    public List<AVEncSmartH264DTO> getAvEncSmartH264DTOS() {
        return avEncSmartH264DTOS;
    }

    public void setAvEncSmartH264DTOS(List<AVEncSmartH264DTO> avEncSmartH264DTOS) {
        this.avEncSmartH264DTOS = avEncSmartH264DTOS;
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

    public static class AVEncSmartH264DTO{
        /**
         * H.264+
         */
        @SerializedName("SmartH264")
        private Boolean smartH264;

        public Boolean getSmartH264() {
            return smartH264;
        }

        public void setSmartH264(Boolean smartH264) {
            this.smartH264 = smartH264;
        }
    }
}
