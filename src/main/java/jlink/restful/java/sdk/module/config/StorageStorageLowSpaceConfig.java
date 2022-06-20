package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

/**
 * Low-capacity storage device configuration
 *
 * @author luojx
 * @date 2022/6/13 19:10
 */
public class StorageStorageLowSpaceConfig extends DeviceConfig {
    @SerializedName("Storage.StorageLowSpace")
    protected StorageStorageLowSpaceDTO storageStorageLowSpaceDTO;
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

    public StorageStorageLowSpaceDTO getStorageStorageLowSpaceDTO() {
        return storageStorageLowSpaceDTO;
    }

    public void setStorageStorageLowSpaceDTO(StorageStorageLowSpaceDTO storageStorageLowSpaceDTO) {
        this.storageStorageLowSpaceDTO = storageStorageLowSpaceDTO;
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

    public static class StorageStorageLowSpaceDTO {
        /**
         * canMakeSwitch
         */
        @SerializedName("Enable")
        private Boolean enable;
        /**
         * linkageParameters
         */
        @SerializedName("EventHandler")
        private AlarmNetAbortConfig.AlarmNetAbortDTO.EventHandlerDTO eventHandlerDTO;
        /**
         * The lower limit of the remaining capacity of the hard disk, percentage
         */
        @SerializedName("LowerLimit")
        private Integer lowerLimit;

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }

        public AlarmNetAbortConfig.AlarmNetAbortDTO.EventHandlerDTO getEventHandlerDTO() {
            return eventHandlerDTO;
        }

        public void setEventHandlerDTO(AlarmNetAbortConfig.AlarmNetAbortDTO.EventHandlerDTO eventHandlerDTO) {
            this.eventHandlerDTO = eventHandlerDTO;
        }

        public Integer getLowerLimit() {
            return lowerLimit;
        }

        public void setLowerLimit(Integer lowerLimit) {
            this.lowerLimit = lowerLimit;
        }
    }
}
