package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Catalog configuration
 *
 * @author hjm
 * @date 2022/06/10
 */
public class CatalogConfig extends DeviceConfig {

    @SerializedName("Catalog")
    private CatalogDTO catalog;
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

    public static class CatalogDTO {
        @SerializedName("Authorized")
        private Integer authorized;
        @SerializedName("Channels")
        private List<ChannelsDTO> channels;
        @SerializedName("DeviceID")
        private String deviceID;
        @SerializedName("Name")
        private String name;
        @SerializedName("Status")
        private String status;

        public static class ChannelsDTO {
            @SerializedName("Address")
            private String address;
            @SerializedName("CivilCode")
            private String civilCode;
            @SerializedName("DeviceID")
            private String deviceID;
            @SerializedName("Manufacturer")
            private String manufacturer;
            @SerializedName("Model")
            private String model;
            @SerializedName("Name")
            private String name;
            @SerializedName("Owner")
            private String owner;
            @SerializedName("ParentID")
            private String parentID;
            @SerializedName("Parental")
            private String parental;
            @SerializedName("RegisterWay")
            private String registerWay;
            @SerializedName("SafetyWay")
            private String safetyWay;
            @SerializedName("Secrecy")
            private String secrecy;
            @SerializedName("Status")
            private String status;

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getCivilCode() {
                return civilCode;
            }

            public void setCivilCode(String civilCode) {
                this.civilCode = civilCode;
            }

            public String getDeviceID() {
                return deviceID;
            }

            public void setDeviceID(String deviceID) {
                this.deviceID = deviceID;
            }

            public String getManufacturer() {
                return manufacturer;
            }

            public void setManufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
            }

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getOwner() {
                return owner;
            }

            public void setOwner(String owner) {
                this.owner = owner;
            }

            public String getParentID() {
                return parentID;
            }

            public void setParentID(String parentID) {
                this.parentID = parentID;
            }

            public String getParental() {
                return parental;
            }

            public void setParental(String parental) {
                this.parental = parental;
            }

            public String getRegisterWay() {
                return registerWay;
            }

            public void setRegisterWay(String registerWay) {
                this.registerWay = registerWay;
            }

            public String getSafetyWay() {
                return safetyWay;
            }

            public void setSafetyWay(String safetyWay) {
                this.safetyWay = safetyWay;
            }

            public String getSecrecy() {
                return secrecy;
            }

            public void setSecrecy(String secrecy) {
                this.secrecy = secrecy;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }
        }

        public Integer getAuthorized() {
            return authorized;
        }

        public void setAuthorized(Integer authorized) {
            this.authorized = authorized;
        }

        public List<ChannelsDTO> getChannels() {
            return channels;
        }

        public void setChannels(List<ChannelsDTO> channels) {
            this.channels = channels;
        }

        public String getDeviceID() {
            return deviceID;
        }

        public void setDeviceID(String deviceID) {
            this.deviceID = deviceID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    public CatalogDTO getCatalog() {
        return catalog;
    }

    public void setCatalog(CatalogDTO catalog) {
        this.catalog = catalog;
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
