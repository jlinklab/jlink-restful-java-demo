package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * NetDNS
 *
 * @author hjm
 * @date 2022/04/24
 */
public class NetWorkNetIPFilterConfig extends DeviceConfig {
    @SerializedName("NetWork.NetIPFilter")
    protected NetWorkNetIPFilterDTO netWorkNetIPFilterDTO;
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

    public static class NetWorkNetIPFilterDTO {

        /**
         * ban
         */
        @SerializedName("Banned")
        private List<String> banned;
        /**
         * toEnable
         */
        @SerializedName("Enable")
        private Boolean enable;
        /**
         * aTrusted
         */
        @SerializedName("Trusted")
        private List<String> trusted;

        public List<String> getBanned() {
            return banned;
        }

        public void setBanned(List<String> banned) {
            this.banned = banned;
        }

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }

        public List<String> getTrusted() {
            return trusted;
        }

        public void setTrusted(List<String> trusted) {
            this.trusted = trusted;
        }
    }

    public NetWorkNetIPFilterDTO getNetWorkNetIPFilterDTO() {
        return netWorkNetIPFilterDTO;
    }

    public void setNetWorkNetIPFilterDTO(NetWorkNetIPFilterDTO netWorkNetIPFilterDTO) {
        this.netWorkNetIPFilterDTO = netWorkNetIPFilterDTO;
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
