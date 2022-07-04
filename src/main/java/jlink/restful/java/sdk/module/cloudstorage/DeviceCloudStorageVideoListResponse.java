package jlink.restful.java.sdk.module.cloudstorage;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Device cloud storage video list response
 *
 * @author luojx
 * @date 2022/7/2 10:19
 */
public class DeviceCloudStorageVideoListResponse {
    @SerializedName("code")
    private Integer code;
    @SerializedName("msg")
    private String msg;
    @SerializedName("data")
    private DataDTO data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public static class DataDTO {
        @SerializedName("Ret")
        private Integer ret;
        @SerializedName("VideoArray")
        private List<VideoDTO> videoDTOS;

        public Integer getRet() {
            return ret;
        }

        public void setRet(Integer ret) {
            this.ret = ret;
        }

        public List<VideoDTO> getVideoDTOS() {
            return videoDTOS;
        }

        public void setVideoDTOS(List<VideoDTO> videoDTOS) {
            this.videoDTOS = videoDTOS;
        }

        public static class VideoDTO {
            @SerializedName("StartTime")
            private String startTime;
            @SerializedName("StopTime")
            private String stopTime;
            @SerializedName("IndexFile")
            private String indexFile;
            @SerializedName("PicFlag")
            private Integer picFlag;
            @SerializedName("StorageBucket")
            private String storageBucket;
            @SerializedName("VideoSize")
            private Integer videoSize;

            public String getStartTime() {
                return startTime;
            }

            public void setStartTime(String startTime) {
                this.startTime = startTime;
            }

            public String getStopTime() {
                return stopTime;
            }

            public void setStopTime(String stopTime) {
                this.stopTime = stopTime;
            }

            public String getIndexFile() {
                return indexFile;
            }

            public void setIndexFile(String indexFile) {
                this.indexFile = indexFile;
            }

            public Integer getPicFlag() {
                return picFlag;
            }

            public void setPicFlag(Integer picFlag) {
                this.picFlag = picFlag;
            }

            public String getStorageBucket() {
                return storageBucket;
            }

            public void setStorageBucket(String storageBucket) {
                this.storageBucket = storageBucket;
            }

            public Integer getVideoSize() {
                return videoSize;
            }

            public void setVideoSize(Integer videoSize) {
                this.videoSize = videoSize;
            }
        }
    }
}
