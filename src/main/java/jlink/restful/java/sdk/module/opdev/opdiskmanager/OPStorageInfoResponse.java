package jlink.restful.java.sdk.module.opdev.opdiskmanager;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperateResponse;

import java.util.List;

/**
 * Hard disk information query
 *
 * @author luojx
 * @date 2022/6/21 15:16
 */
public class OPStorageInfoResponse extends DeviceOperateResponse {
    @SerializedName("StorageInfo")
    private List<StorageInfoDTO> storageInfoDTOS;
    @SerializedName("Name")
    private String name;
    @SerializedName("Ret")
    private Integer ret;
    @SerializedName("SessionID")
    private String sessionID;

    //storage device information
    public static class StorageInfoDTO {
        /** storage device information */
        @SerializedName("PlysicalNo")
        private Integer plysicalNo;
        /** serial number */
        @SerializedName("SerialNumber")
        private String serialNumber;
        @SerializedName("ModelNumber")
        private String modelNumber;
        /** number of disk partitions */
        @SerializedName("PartNumber")
        private Integer partNumber;
        @SerializedName("Partition")
        private List<PartitionDTO> partitionDTOS;

        public static class PartitionDTO {
            /** disk type */
            @SerializedName("DirverType")
            private Integer dirverType;
            /** Drive size, is the unit */
            @SerializedName("TotalSpace")
            private String totalSpace;
            /** Total space, M is the unit */
            @SerializedName("RemainSpace")
            private String remainSpace;
            /** Is it the current working drive */
            @SerializedName("IsCurrent")
            private Boolean isCurrent;
            /** Drive logical serial number */
            @SerializedName("LogicSerialNo")
            private Integer logicSerialNo;
            /** New recording file end time */
            @SerializedName("NewEndTime")
            private String newEndTime;
            /** New recording file start time */
            @SerializedName("NewStartTime")
            private String newStartTime;
            /** End time of last video file */
            @SerializedName("OldEndTime")
            private String oldEndTime;
            /** The start time of the last video file */
            @SerializedName("OldStartTime")
            private String oldStartTime;
            /** drive error flag */
            @SerializedName("Status")
            private Integer status;

            public Integer getDirverType() {
                return dirverType;
            }

            public void setDirverType(Integer dirverType) {
                this.dirverType = dirverType;
            }

            public String getTotalSpace() {
                return totalSpace;
            }

            public void setTotalSpace(String totalSpace) {
                this.totalSpace = totalSpace;
            }

            public String getRemainSpace() {
                return remainSpace;
            }

            public void setRemainSpace(String remainSpace) {
                this.remainSpace = remainSpace;
            }

            public Boolean getCurrent() {
                return isCurrent;
            }

            public void setCurrent(Boolean current) {
                isCurrent = current;
            }

            public Integer getLogicSerialNo() {
                return logicSerialNo;
            }

            public void setLogicSerialNo(Integer logicSerialNo) {
                this.logicSerialNo = logicSerialNo;
            }

            public String getNewEndTime() {
                return newEndTime;
            }

            public void setNewEndTime(String newEndTime) {
                this.newEndTime = newEndTime;
            }

            public String getNewStartTime() {
                return newStartTime;
            }

            public void setNewStartTime(String newStartTime) {
                this.newStartTime = newStartTime;
            }

            public String getOldEndTime() {
                return oldEndTime;
            }

            public void setOldEndTime(String oldEndTime) {
                this.oldEndTime = oldEndTime;
            }

            public String getOldStartTime() {
                return oldStartTime;
            }

            public void setOldStartTime(String oldStartTime) {
                this.oldStartTime = oldStartTime;
            }

            public Integer getStatus() {
                return status;
            }

            public void setStatus(Integer status) {
                this.status = status;
            }
        }

        public Integer getPlysicalNo() {
            return plysicalNo;
        }

        public void setPlysicalNo(Integer plysicalNo) {
            this.plysicalNo = plysicalNo;
        }

        public Integer getPartNumber() {
            return partNumber;
        }

        public void setPartNumber(Integer partNumber) {
            this.partNumber = partNumber;
        }

        public List<PartitionDTO> getPartitionDTOS() {
            return partitionDTOS;
        }

        public void setPartitionDTOS(List<PartitionDTO> partitionDTOS) {
            this.partitionDTOS = partitionDTOS;
        }
    }

    public List<StorageInfoDTO> getStorageInfoDTOS() {
        return storageInfoDTOS;
    }

    public void setStorageInfoDTOS(List<StorageInfoDTO> storageInfoDTOS) {
        this.storageInfoDTOS = storageInfoDTOS;
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

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }
}
