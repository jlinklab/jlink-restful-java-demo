package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

/**
 * Configure when no storage device
 *
 * @author luojx
 * @date 2022/6/13 19:02
 */
public class StorageStorageNotExistConfig extends DeviceConfig {
    @SerializedName("Storage.StorageNotExist")
    protected StorageStorageNotExistDTO storageStorageNotExistDTO;
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

    public StorageStorageNotExistDTO getStorageStorageNotExistDTO() {
        return storageStorageNotExistDTO;
    }

    public void setStorageStorageNotExistDTO(StorageStorageNotExistDTO storageStorageNotExistDTO) {
        this.storageStorageNotExistDTO = storageStorageNotExistDTO;
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

    public static class StorageStorageNotExistDTO {
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
    }
}
