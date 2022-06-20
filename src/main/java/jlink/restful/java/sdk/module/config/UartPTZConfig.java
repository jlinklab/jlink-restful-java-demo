package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * PTZ
 *
 * @author luojx
 * @date 2022/6/13 16:39
 */
public class UartPTZConfig extends DeviceConfig {
    @SerializedName("Uart.PTZ")
    protected List<UartPTZDTO> uartPTZDTOS;
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

    public List<UartPTZDTO> getUartPTZDTOS() {
        return uartPTZDTOS;
    }

    public void setUartPTZDTOS(List<UartPTZDTO> uartPTZDTOS) {
        this.uartPTZDTOS = uartPTZDTOS;
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

    public static class UartPTZDTO {
        /**
         * aSerialPortAttributes
         */
        @SerializedName("Attribute")
        private List<String> attribute;
        /**
         * deviceAddress
         */
        @SerializedName("DeviceNo")
        private Integer deviceNo;
        /**
         * Uniform numbering in the matrix
         */
        @SerializedName("NumberInMatrixs")
        private Integer numberInMatrixs;
        /**
         * serialPort [1, 4]
         */
        @SerializedName("PortNo")
        private Integer portNo;
        /**
         * nameOfProtocol
         */
        @SerializedName("ProtocolName")
        private String protocolName;

        public List<String> getAttribute() {
            return attribute;
        }

        public void setAttribute(List<String> attribute) {
            this.attribute = attribute;
        }

        public Integer getDeviceNo() {
            return deviceNo;
        }

        public void setDeviceNo(Integer deviceNo) {
            this.deviceNo = deviceNo;
        }

        public Integer getNumberInMatrixs() {
            return numberInMatrixs;
        }

        public void setNumberInMatrixs(Integer numberInMatrixs) {
            this.numberInMatrixs = numberInMatrixs;
        }

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
    }
}
