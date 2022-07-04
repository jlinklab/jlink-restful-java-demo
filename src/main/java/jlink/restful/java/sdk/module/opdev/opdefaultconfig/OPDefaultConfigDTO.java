package jlink.restful.java.sdk.module.opdev.opdefaultconfig;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * restore default dto
 *
 * @author luojx
 * @date 2022/6/15 10:08
 */
public class OPDefaultConfigDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPDefaultConfig;
    }

    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();

    @SerializedName("OPDefaultConfig")
    private OPDefaultConfig opDefaultConfig;

    public DeviceOperateEnum getName() {
        return name;
    }

    public OPDefaultConfig getOpDefaultConfig() {
        return opDefaultConfig;
    }

    public void setOpDefaultConfig(OPDefaultConfig opDefaultConfig) {
        this.opDefaultConfig = opDefaultConfig;
    }

    public static class OPDefaultConfig {
        /**
         * userManagement
         */
        @SerializedName("Account")
        private boolean account;
        /**
         * setting
         */
        @SerializedName("XMModeSwitch")
        private boolean xMModeSwitch;
        /**
         * outputMode
         */
        @SerializedName("Preview")
        private boolean preview;
        /**
         * networkServices
         */
        @SerializedName("NetServer")
        private boolean netServer;
        /**
         * encodingSetting
         */
        @SerializedName("Encode")
        private boolean encode;
        /**
         * networkSettings
         */
        @SerializedName("NetCommon")
        private boolean netCommon;
        /**
         * basicParametersOfCamera
         */
        @SerializedName("CameraPARAM")
        private boolean cameraPARAM;
        /**
         * serialPortSettings
         */
        @SerializedName("CommPtz")
        private boolean commPtz;
        /**
         * alarmSet
         */
        @SerializedName("Alarm")
        private boolean alarm;
        /**
         * generalSettings
         */
        @SerializedName("General")
        private boolean general;
        /**
         * videoSettings
         */
        @SerializedName("Record")
        private boolean record;
        /** restore default config */
        @SerializedName("RestoreDefaultConfig")
        private boolean restoreDefaultConfig;
        /** restore factory config */
        @SerializedName("RestoreFactoryConfig")
        private boolean restoreFactoryConfig;
        /**  */
        @SerializedName("RestoreNotCommonIPDefault")
        private boolean restoreNotCommonIPDefault;

        public boolean isRestoreFactoryConfig() {
            return restoreFactoryConfig;
        }

        public void setRestoreFactoryConfig(boolean restoreFactoryConfig) {
            this.restoreFactoryConfig = restoreFactoryConfig;
        }

        public boolean isRestoreDefaultConfig() {
            return restoreDefaultConfig;
        }

        public void setRestoreDefaultConfig(boolean restoreDefaultConfig) {
            this.restoreDefaultConfig = restoreDefaultConfig;
        }

        public boolean isAccount() {
            return account;
        }

        public void setAccount(boolean account) {
            this.account = account;
        }

        public boolean isxMModeSwitch() {
            return xMModeSwitch;
        }

        public void setxMModeSwitch(boolean xMModeSwitch) {
            this.xMModeSwitch = xMModeSwitch;
        }

        public boolean isPreview() {
            return preview;
        }

        public void setPreview(boolean preview) {
            this.preview = preview;
        }

        public boolean isNetServer() {
            return netServer;
        }

        public void setNetServer(boolean netServer) {
            this.netServer = netServer;
        }

        public boolean isEncode() {
            return encode;
        }

        public void setEncode(boolean encode) {
            this.encode = encode;
        }

        public boolean isNetCommon() {
            return netCommon;
        }

        public void setNetCommon(boolean netCommon) {
            this.netCommon = netCommon;
        }

        public boolean isCameraPARAM() {
            return cameraPARAM;
        }

        public void setCameraPARAM(boolean cameraPARAM) {
            this.cameraPARAM = cameraPARAM;
        }

        public boolean isCommPtz() {
            return commPtz;
        }

        public void setCommPtz(boolean commPtz) {
            this.commPtz = commPtz;
        }

        public boolean isAlarm() {
            return alarm;
        }

        public void setAlarm(boolean alarm) {
            this.alarm = alarm;
        }

        public boolean isGeneral() {
            return general;
        }

        public void setGeneral(boolean general) {
            this.general = general;
        }

        public boolean isRecord() {
            return record;
        }

        public void setRecord(boolean record) {
            this.record = record;
        }
    }
}
