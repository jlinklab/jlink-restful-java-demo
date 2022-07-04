package jlink.restful.java.sdk.module.opdev.opdiskmanager;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

import java.util.List;
import java.util.Map;

/**
 * @author luojx
 * @date 2022/6/21 15:56
 */
public class OPStoragePartitionDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPStorageManager;
    }

    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();
    @SerializedName("OPStorageManager")
    private OPStorageManager opStorageManager;

    public static class OPStorageManager{
        @SerializedName("Action")
        private String action;
        @SerializedName("SerialNo")
        private Integer serialNo;
        @SerializedName("PartitionSize")
        private List<Object> partitionSize;

        public List<Object> getPartitionSize() {
            return partitionSize;
        }

        public void setPartitionSize(List<Object> partitionSize) {
            this.partitionSize = partitionSize;
        }

        public static class Record{
            @SerializedName("Record")
            private Integer record;

            public Integer getRecord() {
                return record;
            }

            public void setRecord(Integer record) {
                this.record = record;
            }
        }

        public static class SnapShot{
            @SerializedName("SnapShot")
            private Integer snapShot;

            public Integer getSnapShot() {
                return snapShot;
            }

            public void setSnapShot(Integer snapShot) {
                this.snapShot = snapShot;
            }
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public Integer getSerialNo() {
            return serialNo;
        }

        public void setSerialNo(Integer serialNo) {
            this.serialNo = serialNo;
        }
    }
    public DeviceOperateEnum getName() {
        return name;
    }

    public OPStorageManager getOpStorageManager() {
        return opStorageManager;
    }

    public void setOpStorageManager(OPStorageManager opStorageManager) {
        this.opStorageManager = opStorageManager;
    }
}
