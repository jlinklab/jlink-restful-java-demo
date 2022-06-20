package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Comm
 *
 * @author luojx
 * @date 2022/6/13 16:32
 */
public class UartCommConfig extends DeviceConfig{
    @SerializedName("Uart.Comm")
    protected List<UartCommDTO> uartCommDTOS;
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

    public List<UartCommDTO> getUartCommDTOS() {
        return uartCommDTOS;
    }

    public void setUartCommDTOS(List<UartCommDTO> uartCommDTOS) {
        this.uartCommDTOS = uartCommDTOS;
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

    public static class UartCommDTO{
        /**
         * aSerialPortAttributes
         */
        @SerializedName("Attribute")
        private List<String> attribute;
        /**
         * portNumber
         */
        @SerializedName("PortNo")
        private Integer portNo;
        /**
         * nameOfProtocol
         */
        @SerializedName("ProtocolName")
        private String protocolName;


        public Integer getPortNo() {
            return portNo;
        }

        public void setPortNo(Integer portNo) {
            this.portNo = portNo;
        }

        public String getProtocolName() {
            return protocolName;
        }

        public void setProtocolName(String protocolName) {
            this.protocolName = protocolName;
        }

        public List<String> getAttribute() {
            return attribute;
        }

        public void setAttribute(List<String> attribute) {
            this.attribute = attribute;
        }
    }

}
