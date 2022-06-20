package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Capture mode Configuration
 *
 * @author luojx
 * @date 2022/6/13 14:39
 */
public class StorageSnapshotConfig extends DeviceConfig {
    @SerializedName("Storage.Snapshot")
    protected List<StorageSnapshotDTO> storageSnapshotDTOS;
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

    public List<StorageSnapshotDTO> getStorageSnapshotDTOS() {
        return storageSnapshotDTOS;
    }

    public void setStorageSnapshotDTOS(List<StorageSnapshotDTO> storageSnapshotDTOS) {
        this.storageSnapshotDTOS = storageSnapshotDTOS;
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

    public static class StorageSnapshotDTO {
        @SerializedName("Mask")
        private List<List<String>> mask;
        /**
         * Number of pre-fetched pictures
         */
        @SerializedName("PreSnap")
        private Integer preSnap;
        /**
         * redundancySwitch
         */
        @SerializedName("Redundancy")
        private Boolean redundancy;
        /**
         * Capture mode, configuration capture, manual capture and close capture
         */
        @SerializedName("SnapMode")
        private String snapMode;
        /**
         * screenshotsWorksheet
         */
        @SerializedName("TimeSection")
        private List<List<String>> timeSection;

        public List<List<String>> getMask() {
            return mask;
        }

        public void setMask(List<List<String>> mask) {
            this.mask = mask;
        }

        public Integer getPreSnap() {
            return preSnap;
        }

        public void setPreSnap(Integer preSnap) {
            this.preSnap = preSnap;
        }

        public Boolean getRedundancy() {
            return redundancy;
        }

        public void setRedundancy(Boolean redundancy) {
            this.redundancy = redundancy;
        }

        public String getSnapMode() {
            return snapMode;
        }

        public void setSnapMode(String snapMode) {
            this.snapMode = snapMode;
        }

        public List<List<String>> getTimeSection() {
            return timeSection;
        }

        public void setTimeSection(List<List<String>> timeSection) {
            this.timeSection = timeSection;
        }
    }
}
