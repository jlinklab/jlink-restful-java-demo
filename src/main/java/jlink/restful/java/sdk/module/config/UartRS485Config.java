package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * UartRS485 Config
 *
 * @author luojx
 * @date 2022/6/13 17:00
 */
public class UartRS485Config extends DeviceConfig {
    @SerializedName("Uart.RS485")
    protected List<UartRS485DTO> uartRS485DTOS;
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

    public List<UartRS485DTO> getUartRS485DTOS() {
        return uartRS485DTOS;
    }

    public void setUartRS485DTOS(List<UartRS485DTO> uartRS485DTOS) {
        this.uartRS485DTOS = uartRS485DTOS;
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

    public static class UartRS485DTO {
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
         * portNumber
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
