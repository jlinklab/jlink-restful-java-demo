package jlink.restful.java.sdk.module.playback;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DevicePlaybackTimeLineResponse {
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
        @SerializedName("Name")
        private String name;
        @SerializedName("retMsg")
        private String retMsg;
        @SerializedName("PlaybackList")
        private List<PlaybackList> playbackList;

        public static class PlaybackList{
            @SerializedName("channel")
            private Integer channel;
            @SerializedName("timeline")
            private List<Integer> timeline;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<PlaybackList> getPlaybackList() {
            return playbackList;
        }

        public void setPlaybackList(List<PlaybackList> playbackList) {
            this.playbackList = playbackList;
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
    }
}
