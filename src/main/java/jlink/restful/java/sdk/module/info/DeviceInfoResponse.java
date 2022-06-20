package jlink.restful.java.sdk.module.info;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.competent.JLinkResponseCode;

public class DeviceInfoResponse {
    private Integer code;
    private String msg;
    private DevInfo data;

    public DeviceInfoResponse(Integer code, String msg, DevInfo data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static class DevInfo {
        @SerializedName("Name")
        private String name;
        @SerializedName("Ret")
        private Integer ret;
        @SerializedName("SessionID")
        private String sessionID;
        @SerializedName("SystemInfo")
        private SystemInfoDTO systemInfo;

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

        public SystemInfoDTO getSystemInfo() {
            return systemInfo;
        }

        public void setSystemInfo(SystemInfoDTO systemInfo) {
            this.systemInfo = systemInfo;
        }

        public static class SystemInfoDTO {
            @SerializedName("AlarmInChannel")
            private Integer alarmInChannel;
            @SerializedName("AlarmOutChannel")
            private Integer alarmOutChannel;
            @SerializedName("AudioInChannel")
            private Integer audioInChannel;
            @SerializedName("BuildTime")
            private String buildTime;
            @SerializedName("CombineSwitch")
            private Integer combineSwitch;
            @SerializedName("DeviceModel")
            private String deviceModel;
            @SerializedName("DeviceRunTime")
            private String deviceRunTime;
            @SerializedName("DigChannel")
            private Integer digChannel;
            @SerializedName("EncryptVersion")
            private String encryptVersion;
            @SerializedName("ExtraChannel")
            private Integer extraChannel;
            @SerializedName("HardWare")
            private String hardWare;
            @SerializedName("HardWareVersion")
            private String hardWareVersion;
            @SerializedName("SerialNo")
            private String serialNo;
            @SerializedName("SoftWareVersion")
            private String softWareVersion;
            @SerializedName("TalkInChannel")
            private Integer talkInChannel;
            @SerializedName("TalkOutChannel")
            private Integer talkOutChannel;
            @SerializedName("UpdataTime")
            private String updataTime;
            @SerializedName("UpdataType")
            private String updataType;
            @SerializedName("VideoInChannel")
            private Integer videoInChannel;
            @SerializedName("VideoOutChannel")
            private Integer videoOutChannel;

            public Integer getAlarmInChannel() {
                return alarmInChannel;
            }

            public void setAlarmInChannel(Integer alarmInChannel) {
                this.alarmInChannel = alarmInChannel;
            }

            public Integer getAlarmOutChannel() {
                return alarmOutChannel;
            }

            public void setAlarmOutChannel(Integer alarmOutChannel) {
                this.alarmOutChannel = alarmOutChannel;
            }

            public Integer getAudioInChannel() {
                return audioInChannel;
            }

            public void setAudioInChannel(Integer audioInChannel) {
                this.audioInChannel = audioInChannel;
            }

            public String getBuildTime() {
                return buildTime;
            }

            public void setBuildTime(String buildTime) {
                this.buildTime = buildTime;
            }

            public Integer getCombineSwitch() {
                return combineSwitch;
            }

            public void setCombineSwitch(Integer combineSwitch) {
                this.combineSwitch = combineSwitch;
            }

            public String getDeviceModel() {
                return deviceModel;
            }

            public void setDeviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
            }

            public String getDeviceRunTime() {
                return deviceRunTime;
            }

            public void setDeviceRunTime(String deviceRunTime) {
                this.deviceRunTime = deviceRunTime;
            }

            public Integer getDigChannel() {
                return digChannel;
            }

            public void setDigChannel(Integer digChannel) {
                this.digChannel = digChannel;
            }

            public String getEncryptVersion() {
                return encryptVersion;
            }

            public void setEncryptVersion(String encryptVersion) {
                this.encryptVersion = encryptVersion;
            }

            public Integer getExtraChannel() {
                return extraChannel;
            }

            public void setExtraChannel(Integer extraChannel) {
                this.extraChannel = extraChannel;
            }

            public String getHardWare() {
                return hardWare;
            }

            public void setHardWare(String hardWare) {
                this.hardWare = hardWare;
            }

            public String getHardWareVersion() {
                return hardWareVersion;
            }

            public void setHardWareVersion(String hardWareVersion) {
                this.hardWareVersion = hardWareVersion;
            }

            public String getSerialNo() {
                return serialNo;
            }

            public void setSerialNo(String serialNo) {
                this.serialNo = serialNo;
            }

            public String getSoftWareVersion() {
                return softWareVersion;
            }

            public void setSoftWareVersion(String softWareVersion) {
                this.softWareVersion = softWareVersion;
            }

            public Integer getTalkInChannel() {
                return talkInChannel;
            }

            public void setTalkInChannel(Integer talkInChannel) {
                this.talkInChannel = talkInChannel;
            }

            public Integer getTalkOutChannel() {
                return talkOutChannel;
            }

            public void setTalkOutChannel(Integer talkOutChannel) {
                this.talkOutChannel = talkOutChannel;
            }

            public String getUpdataTime() {
                return updataTime;
            }

            public void setUpdataTime(String updataTime) {
                this.updataTime = updataTime;
            }

            public String getUpdataType() {
                return updataType;
            }

            public void setUpdataType(String updataType) {
                this.updataType = updataType;
            }

            public Integer getVideoInChannel() {
                return videoInChannel;
            }

            public void setVideoInChannel(Integer videoInChannel) {
                this.videoInChannel = videoInChannel;
            }

            public Integer getVideoOutChannel() {
                return videoOutChannel;
            }

            public void setVideoOutChannel(Integer videoOutChannel) {
                this.videoOutChannel = videoOutChannel;
            }
        }
    }


    public static DeviceInfoResponse newInstance() {
        return new DeviceInfoResponse(JLinkResponseCode.SUCCESS.getCode(), JLinkResponseCode.SUCCESS.getMsg(), null);
    }

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

    public DevInfo getData() {
        return data;
    }

    public void setData(DevInfo data) {
        this.data = data;
    }
}
