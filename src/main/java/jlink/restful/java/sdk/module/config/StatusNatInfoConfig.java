package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

/**
 * @author luojx
 * @date 2023/6/28 10:58
 */
public class StatusNatInfoConfig extends DeviceConfig{
    @SerializedName("Status.NatInfo")
    protected StatusNatInfoDTO statusNatInfoDTO;
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

    public StatusNatInfoDTO getStatusNatInfoDTO() {
        return statusNatInfoDTO;
    }

    public void setStatusNatInfoDTO(StatusNatInfoDTO statusNatInfoDTO) {
        this.statusNatInfoDTO = statusNatInfoDTO;
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

    public static class StatusNatInfoDTO {
        @SerializedName("NaInfoCode")
        private String naInfoCode;
        @SerializedName("NatStatus")
        private String natStatus;

        public String getNaInfoCode() {
            return naInfoCode;
        }

        public void setNaInfoCode(String naInfoCode) {
            this.naInfoCode = naInfoCode;
        }

        public String getNatStatus() {
            return natStatus;
        }

        public void setNatStatus(String natStatus) {
            this.natStatus = natStatus;
        }
    }
}
