package jlink.restful.java.sdk.module.alarm;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Device AlarmListData
 *
 * @author hjm
 * @date 2022/07/01
 */
public class DeviceAlarmListData {

    @SerializedName("SerialNumber")
    private String serialNumber;
    @SerializedName("AlarmTotal")
    private Integer alarmTotal;
    @SerializedName("AlarmArray")
    private List<AlarmArrayDTO> alarmArray;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getAlarmTotal() {
        return alarmTotal;
    }

    public void setAlarmTotal(Integer alarmTotal) {
        this.alarmTotal = alarmTotal;
    }

    public List<AlarmArrayDTO> getAlarmArray() {
        return alarmArray;
    }

    public void setAlarmArray(List<AlarmArrayDTO> alarmArray) {
        this.alarmArray = alarmArray;
    }

    public static class AlarmArrayDTO {
        @SerializedName("AlarmEvent")
        private String alarmEvent;
        @SerializedName("AlarmId")
        private String alarmId;
        @SerializedName("AlarmMsg")
        private String alarmMsg;
        @SerializedName("AlarmTime")
        private String alarmTime;
        @SerializedName("Channel")
        private String channel;
        @SerializedName("PicInfo")
        private PicInfoDTO picInfo;
        @SerializedName("VideoInfo")
        private VideoInfoDTO videoInfo;

        public String getAlarmEvent() {
            return alarmEvent;
        }

        public void setAlarmEvent(String alarmEvent) {
            this.alarmEvent = alarmEvent;
        }

        public String getAlarmId() {
            return alarmId;
        }

        public void setAlarmId(String alarmId) {
            this.alarmId = alarmId;
        }

        public String getAlarmMsg() {
            return alarmMsg;
        }

        public void setAlarmMsg(String alarmMsg) {
            this.alarmMsg = alarmMsg;
        }

        public String getAlarmTime() {
            return alarmTime;
        }

        public void setAlarmTime(String alarmTime) {
            this.alarmTime = alarmTime;
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public PicInfoDTO getPicInfo() {
            return picInfo;
        }

        public void setPicInfo(PicInfoDTO picInfo) {
            this.picInfo = picInfo;
        }

        public VideoInfoDTO getVideoInfo() {
            return videoInfo;
        }

        public void setVideoInfo(VideoInfoDTO videoInfo) {
            this.videoInfo = videoInfo;
        }

        public static class PicInfoDTO {
            @SerializedName("ObjName")
            private String objName;
            @SerializedName("ObjSize")
            private Integer objSize;
            @SerializedName("StorageBucket")
            private String storageBucket;

            public String getObjName() {
                return objName;
            }

            public void setObjName(String objName) {
                this.objName = objName;
            }

            public Integer getObjSize() {
                return objSize;
            }

            public void setObjSize(Integer objSize) {
                this.objSize = objSize;
            }

            public String getStorageBucket() {
                return storageBucket;
            }

            public void setStorageBucket(String storageBucket) {
                this.storageBucket = storageBucket;
            }
        }

        public static class VideoInfoDTO {
            @SerializedName("VideoLength")
            private Integer videoLength;

            public Integer getVideoLength() {
                return videoLength;
            }

            public void setVideoLength(Integer videoLength) {
                this.videoLength = videoLength;
            }
        }
    }
}
