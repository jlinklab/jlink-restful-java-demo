package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

/**
 * @author luojx
 * @date 2023/7/1 17:16
 */
public class NetworkOnvifPwdCheckoutConfig extends DeviceConfig{

    @SerializedName("NetWork.OnvifPwdCheckout")
    protected NetworkOnvifPwdCheckoutDTO networkOnvifPwdCheckoutDTO;
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

    public NetworkOnvifPwdCheckoutDTO getNetworkOnvifPwdCheckoutDTO() {
        return networkOnvifPwdCheckoutDTO;
    }

    public void setNetworkOnvifPwdCheckoutDTO(NetworkOnvifPwdCheckoutDTO networkOnvifPwdCheckoutDTO) {
        this.networkOnvifPwdCheckoutDTO = networkOnvifPwdCheckoutDTO;
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

    public static class NetworkOnvifPwdCheckoutDTO {
        @SerializedName("Enable")
        private Boolean enable;

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }
    }
}
