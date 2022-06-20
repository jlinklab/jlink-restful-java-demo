package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * NetOrder
 *
 * @author luojx
 * @date 2022/6/13 18:27
 */
public class NetWorkNetOrderConfig extends DeviceConfig {
    @SerializedName("NetWork.NetOrder")
    protected NetWorkNetOrderDTO netWorkNetOrderDTO;
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

    public NetWorkNetOrderDTO getNetWorkNetOrderDTO() {
        return netWorkNetOrderDTO;
    }

    public void setNetWorkNetOrderDTO(NetWorkNetOrderDTO netWorkNetOrderDTO) {
        this.netWorkNetOrderDTO = netWorkNetOrderDTO;
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

    public static class NetWorkNetOrderDTO {
        @SerializedName("Enable")
        private Boolean enable;
        @SerializedName("NetCount")
        private Integer netCount;
        @SerializedName("NetOrder")
        private List<NetOrderDTO> netOrderDTOS;

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }

        public Integer getNetCount() {
            return netCount;
        }

        public void setNetCount(Integer netCount) {
            this.netCount = netCount;
        }

        public List<NetOrderDTO> getNetOrderDTOS() {
            return netOrderDTOS;
        }

        public void setNetOrderDTOS(List<NetOrderDTO> netOrderDTOS) {
            this.netOrderDTOS = netOrderDTOS;
        }

        public static class NetOrderDTO {
            @SerializedName("NetOrder")
            private Integer netOrder;
            /**
             * networkType
             */
            @SerializedName("NetType")
            private Integer netType;

            public Integer getNetOrder() {
                return netOrder;
            }

            public void setNetOrder(Integer netOrder) {
                this.netOrder = netOrder;
            }

            public Integer getNetType() {
                return netType;
            }

            public void setNetType(Integer netType) {
                this.netType = netType;
            }
        }
    }
}
