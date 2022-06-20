package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.config.DeviceConfig;


/**
 * NetDNS
 *
 * @author hjm
 * @date 2022/04/24
 */
public class NetWorkNetDNSConfig extends DeviceConfig {


    @SerializedName("NetWork.NetDNS")
    protected NetWorkNetDNSDTO netWorkNetDNSDTO;
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

    public static class NetWorkNetDNSDTO {

        /**
         * address
         */
        @SerializedName("Address")
        private String address;
        /**
         * standbyAddress
         */
        @SerializedName("SpareAddress")
        private String spareAddress;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getSpareAddress() {
            return spareAddress;
        }

        public void setSpareAddress(String spareAddress) {
            this.spareAddress = spareAddress;
        }
    }

    public NetWorkNetDNSDTO getNetWorkNetDNSDTO() {
        return netWorkNetDNSDTO;
    }

    public void setNetWorkNetDNSDTO(NetWorkNetDNSDTO netWorkNetDNSDTO) {
        this.netWorkNetDNSDTO = netWorkNetDNSDTO;
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
