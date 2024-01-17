package jlink.restful.java.sdk.module.opdev.opfilequery;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * Video file query by time
 *
 * @author hjm
 * @date 2023/11/16
 */
public class OPFileTimeQueryDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPFileQuery;
    }

    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();
    /**
     * 文件查询参数
     */
    @SerializedName("OPFileQuery")
    private OPFileQuery opFileQuery = new OPFileQuery();

    public static class OPFileQuery {
        @SerializedName("EndTime")
        private String endTime;
        @SerializedName("HighChannel")
        private Integer highChannel = 0;
        @SerializedName("HighStreamType")
        private String highStreamType = "0x00000000";
        @SerializedName("LowChannel")
        private Integer lowChannel = 0;
        @SerializedName("LowStreamType")
        private String lowStreamType = "0x00000000";
        @SerializedName("BeginTime")
        private String beginTime;
        @SerializedName("Type")
        private String type = "h264";
        @SerializedName("Event")
        private String event = OPFileEventEnum.ALL.getEvent();
        @SerializedName("Sync")
        private Integer sync = 0;

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public Integer getHighChannel() {
            return highChannel;
        }

        public void setHighChannel(Integer highChannel) {
            this.highChannel = highChannel;
        }

        public String getHighStreamType() {
            return highStreamType;
        }

        public void setHighStreamType(String highStreamType) {
            this.highStreamType = highStreamType;
        }

        public Integer getLowChannel() {
            return lowChannel;
        }

        public void setLowChannel(Integer lowChannel) {
            this.lowChannel = lowChannel;
        }

        public String getLowStreamType() {
            return lowStreamType;
        }

        public void setLowStreamType(String lowStreamType) {
            this.lowStreamType = lowStreamType;
        }

        public String getBeginTime() {
            return beginTime;
        }

        public void setBeginTime(String beginTime) {
            this.beginTime = beginTime;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getEvent() {
            return event;
        }

        public void setEvent(String event) {
            this.event = event;
        }

        public Integer getSync() {
            return sync;
        }

        public void setSync(Integer sync) {
            this.sync = sync;
        }
    }


    public DeviceOperateEnum getName() {
        return name;
    }

    public OPFileQuery getOpFileQuery() {
        return opFileQuery;
    }

    public void setOpFileQuery(OPFileQuery opFileQuery) {
        this.opFileQuery = opFileQuery;
    }
}