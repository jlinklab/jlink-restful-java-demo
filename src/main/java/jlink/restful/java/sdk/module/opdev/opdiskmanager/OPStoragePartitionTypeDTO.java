package jlink.restful.java.sdk.module.opdev.opdiskmanager;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * Storage Partition
 *
 * @author luojx
 * @date 2022/6/21 18:59
 */
public class OPStoragePartitionTypeDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPStorageManager;
    }

    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();
    @SerializedName("OPStorageManager")
    private OPStorageManager opStorageManager;

    public DeviceOperateEnum getName() {
        return name;
    }

    public OPStorageManager getOpStorageManager() {
        return opStorageManager;
    }

    public void setOpStorageManager(OPStorageManager opStorageManager) {
        this.opStorageManager = opStorageManager;
    }

    public static class OPStorageManager{
        @SerializedName("Action")
        private String action = OPStorageManagerActionEnum.SetType.name();
        @SerializedName("Type")
        private String type = OPStorageManagerTypeEnum.ReadWrite.name();
        @SerializedName("SerialNo")
        private Integer serialNo;
        @SerializedName("PartNo")
        private Integer partNo;

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getSerialNo() {
            return serialNo;
        }

        public void setSerialNo(Integer serialNo) {
            this.serialNo = serialNo;
        }

        public Integer getPartNo() {
            return partNo;
        }

        public void setPartNo(Integer partNo) {
            this.partNo = partNo;
        }
    }
}
