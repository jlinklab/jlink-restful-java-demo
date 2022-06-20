package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

/**
 * Storage related configuration
 *
 * @author luojx
 * @date 2022/6/13 18:59
 */
public class StorageStoragePositionConfig extends DeviceConfig {
    @SerializedName("Storage.StoragePosition")
    protected StorageStoragePositionDTO storageStoragePositionDTO;
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

    public StorageStoragePositionDTO getStorageStoragePositionDTO() {
        return storageStoragePositionDTO;
    }

    public void setStorageStoragePositionDTO(StorageStoragePositionDTO storageStoragePositionDTO) {
        this.storageStoragePositionDTO = storageStoragePositionDTO;
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

    public static class StorageStoragePositionDTO {
        /**
         * Whether the recorder is used as a storage device
         */
        @SerializedName("DVD")
        private Boolean DVD;
        /**
         * Whether the SATA device is used as a video storage device
         */
        @SerializedName("SATA")
        private Boolean SATA;
        /**
         * SD卡是否作为存储设备
         */
        @SerializedName("SD")
        private Boolean SD;
        /**
         * Whether the USB device is used as a video storage device
         */
        @SerializedName("USB")
        private Boolean USB;

        public Boolean getDVD() {
            return DVD;
        }

        public void setDVD(Boolean DVD) {
            this.DVD = DVD;
        }

        public Boolean getSATA() {
            return SATA;
        }

        public void setSATA(Boolean SATA) {
            this.SATA = SATA;
        }

        public Boolean getSD() {
            return SD;
        }

        public void setSD(Boolean SD) {
            this.SD = SD;
        }

        public Boolean getUSB() {
            return USB;
        }

        public void setUSB(Boolean USB) {
            this.USB = USB;
        }
    }
}
