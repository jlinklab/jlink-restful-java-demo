package jlink.restful.java.sdk.module.opdev.opfilequery;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * Video file query dto
 *
 * @author hjm
 * @date 2022/04/26
 */
public class OPFileQueryDTO implements DeviceOperate {
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
        @SerializedName("StreamType")
        private String streamType = "0x00000000";
        @SerializedName("EndTime")
        private String endTime;
        @SerializedName("Channel")
        private Integer channel = 0;
        @SerializedName("BeginTime")
        private String beginTime;
        @SerializedName("DriverTypeMask")
        private String driverTypeMask = "0x0000FFFF";
        @SerializedName("Type")
        private String type = "h264";
        @SerializedName("Event")
        private String event = OPFileEventEnum.ALL.getEvent();

        public String getStreamType() {
            return streamType;
        }

        public void setStreamType(String streamType) {
            this.streamType = streamType;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public Integer getChannel() {
            return channel;
        }

        public void setChannel(Integer channel) {
            this.channel = channel;
        }

        public String getBeginTime() {
            return beginTime;
        }

        public void setBeginTime(String beginTime) {
            this.beginTime = beginTime;
        }

        public String getDriverTypeMask() {
            return driverTypeMask;
        }

        public void setDriverTypeMask(String driverTypeMask) {
            this.driverTypeMask = driverTypeMask;
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