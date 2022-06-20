package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * RecordConfig
 *
 * @author luojx
 * @date 2022/6/13 14:28
 */
public class RecordConfig extends DeviceConfig {
    @SerializedName("Record")
    protected List<RecordDTO> recordDTOS;
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

    public List<RecordDTO> getRecordDTOS() {
        return recordDTOS;
    }

    public void setRecordDTOS(List<RecordDTO> recordDTOS) {
        this.recordDTOS = recordDTOS;
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

    public static class RecordDTO {
        @SerializedName("Mask")
        private List<List<String>> mask;
        /**
         * videoPackagingTime
         */
        @SerializedName("PacketLength")
        private Integer packetLength;
        /**
         * Pre-recorded time, 0 is closed
         */
        @SerializedName("PreRecord")
        private Integer preRecord;
        /**
         * Recording Mode Configure Recording, Manual Recording, Disable Recording
         */
        @SerializedName("RecordMode")
        private String recordMode;
        /**
         * redundancySwitch
         */
        @SerializedName("Redundancy")
        private Boolean redundancy;
        /**
         * videoWorkTable
         */
        @SerializedName("TimeSection")
        private List<List<String>> timeSection;

        public List<List<String>> getMask() {
            return mask;
        }

        public void setMask(List<List<String>> mask) {
            this.mask = mask;
        }

        public Integer getPacketLength() {
            return packetLength;
        }

        public void setPacketLength(Integer packetLength) {
            this.packetLength = packetLength;
        }

        public Integer getPreRecord() {
            return preRecord;
        }

        public void setPreRecord(Integer preRecord) {
            this.preRecord = preRecord;
        }

        public String getRecordMode() {
            return recordMode;
        }

        public void setRecordMode(String recordMode) {
            this.recordMode = recordMode;
        }

        public Boolean getRedundancy() {
            return redundancy;
        }

        public void setRedundancy(Boolean redundancy) {
            this.redundancy = redundancy;
        }

        public List<List<String>> getTimeSection() {
            return timeSection;
        }

        public void setTimeSection(List<List<String>> timeSection) {
            this.timeSection = timeSection;
        }
    }
}
