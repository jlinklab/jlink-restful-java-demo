package jlink.restful.java.sdk.module.opdev.oprecordtimequery;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * Get playback list and query dto based on time
 *
 * @author luojx
 * @date 2022/6/15 9:19
 */
public class OPRecordTimeQueryDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPRecordTimeQuery;
    }

    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();

    @SerializedName("OPFileQuery")
    private OPFileQuery opFileQuery;

    public DeviceOperateEnum getName() {
        return name;
    }

    public OPFileQuery getOpFileQuery() {
        return opFileQuery;
    }

    public void setOpFileQuery(OPFileQuery opFileQuery) {
        this.opFileQuery = opFileQuery;
    }

    public static class OPFileQuery{
        @SerializedName("BeginTime")
        private String beginTime;
        @SerializedName("EndTime")
        private String endTime;
        @SerializedName("Event")
        private String event;
        @SerializedName("HighChannel")
        private String highChannel;
        @SerializedName("HighStreamType")
        private String highStreamType;
        @SerializedName("LowChannel")
        private String lowChannel;
        @SerializedName("LowStreamType")
        private String lowStreamType;
        @SerializedName("Sync")
        private Integer sync;
        @SerializedName("Type")
        private String type;

        public String getBeginTime() {
            return beginTime;
        }

        public void setBeginTime(String beginTime) {
            this.beginTime = beginTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public String getEvent() {
            return event;
        }

        public void setEvent(String event) {
            this.event = event;
        }

        public String getHighChannel() {
            return highChannel;
        }

        public void setHighChannel(String highChannel) {
            this.highChannel = highChannel;
        }

        public String getHighStreamType() {
            return highStreamType;
        }

        public void setHighStreamType(String highStreamType) {
            this.highStreamType = highStreamType;
        }

        public String getLowChannel() {
            return lowChannel;
        }

        public void setLowChannel(String lowChannel) {
            this.lowChannel = lowChannel;
        }

        public String getLowStreamType() {
            return lowStreamType;
        }

        public void setLowStreamType(String lowStreamType) {
            this.lowStreamType = lowStreamType;
        }

        public Integer getSync() {
            return sync;
        }

        public void setSync(Integer sync) {
            this.sync = sync;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
