package jlink.restful.java.sdk.module.ability;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.competent.JLinkResponseCode;

import java.util.List;

public class DeviceAbilityResponse {
    private Integer code;
    private String msg;
    private DevAbility data;

    public DeviceAbilityResponse(Integer code, String msg, DevAbility data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static class DevAbility {
        @SerializedName("Name")
        private String name;
        @SerializedName("Ret")
        private Integer ret;
        @SerializedName("SessionID")
        private String sessionID;
        /**
         * system capability set
         */
        @SerializedName("SystemFunction")
        private SystemFunctionDTO systemFunction;
        /**
         * Coding Capability Set
         */
        @SerializedName("EncodeCapability")
        private EncodeCapabilityDTO encodeCapability;
        /**
         * Area Occlusion Capability Set
         */
        @SerializedName("BlindCapability")
        private BlindCapabilityDTO blindCapability;
        /**
         * Dynamic area properties
         */
        @SerializedName("MotionArea")
        private MotionAreaDTO motionArea;

        /**
         * Support serial protocol
         */
        @SerializedName("ComProtocol")
        private List<String> comProtocol;

        /**
         * Camera parameters
         */
        @SerializedName("Camera")
        private CameraDTO camera;

        /**
         * Supports talkback audio properties
         */
        @SerializedName("TalkAudioFormat")
        private List<TalkAudioFormatDTO> talkAudioFormat;

        /**
         * Supported languages
         */
        @SerializedName("MultiLanguage")
        private List<String> multiLanguage;

        /**
         * Asynchronous transceiver protocol
         */
        @SerializedName("UartProtocol")
        private List<String> uartProtocol;

        /**
         * Intelligent Analysis Capability Set
         */
        @SerializedName("Intelligent")
        private IntelligentDTO intelligent;

        public static class SystemFunctionDTO {
            /**
             * system capability set->AlarmFunction
             */
            @SerializedName("AlarmFunction")
            private AlarmFunctionDTO alarmFunction;
            /**
             * system capability set->CommFunction
             */
            @SerializedName("CommFunction")
            private CommFunctionDTO commFunction;
            /**
             * system capability set->Coding Capability Set
             */
            @SerializedName("EncodeFunction")
            private EncodeFunctionDTO encodeFunction;
            /**
             * system capability set->NetServerFunction
             */
            @SerializedName("NetServerFunction")
            private NetServerFunctionDTO netServerFunction;
            /**
             * system capability set->OtherFunction
             */
            @SerializedName("OtherFunction")
            private OtherFunctionDTO otherFunction;
            /**
             * system capability set->PreviewFunction
             */
            @SerializedName("PreviewFunction")
            private PreviewFunctionDTO previewFunction;
            /**
             * system capability set->TipShow
             */
            @SerializedName("TipShow")
            private TipShowDTO tipShow;

            public static class AlarmFunctionDTO {
                @SerializedName("AlarmConfig")
                private Boolean alarmConfig;
                @SerializedName("BlindDetect")
                private Boolean blindDetect;
                @SerializedName("HumanDection")
                private Boolean humanDection;
                @SerializedName("HumanPedDetection")
                private Boolean humanPedDetection;
                @SerializedName("LossDetect")
                private Boolean lossDetect;
                @SerializedName("MotionDetect")
                private Boolean motionDetect;
                @SerializedName("NetAbort")
                private Boolean netAbort;
                @SerializedName("NetAlarm")
                private Boolean netAlarm;
                @SerializedName("NetIpConflict")
                private Boolean netIpConflict;
                @SerializedName("NewVideoAnalyze")
                private Boolean newVideoAnalyze;
                @SerializedName("PEAInHumanPed")
                private Boolean pEAInHumanPed;
                @SerializedName("StorageFailure")
                private Boolean storageFailure;
                @SerializedName("StorageLowSpace")
                private Boolean storageLowSpace;
                @SerializedName("StorageNotExist")
                private Boolean storageNotExist;
                @SerializedName("VideoAnalyze")
                private Boolean videoAnalyze;

                public Boolean getAlarmConfig() {
                    return alarmConfig;
                }

                public void setAlarmConfig(Boolean alarmConfig) {
                    this.alarmConfig = alarmConfig;
                }

                public Boolean getBlindDetect() {
                    return blindDetect;
                }

                public void setBlindDetect(Boolean blindDetect) {
                    this.blindDetect = blindDetect;
                }

                public Boolean getHumanDection() {
                    return humanDection;
                }

                public void setHumanDection(Boolean humanDection) {
                    this.humanDection = humanDection;
                }

                public Boolean getHumanPedDetection() {
                    return humanPedDetection;
                }

                public void setHumanPedDetection(Boolean humanPedDetection) {
                    this.humanPedDetection = humanPedDetection;
                }

                public Boolean getLossDetect() {
                    return lossDetect;
                }

                public void setLossDetect(Boolean lossDetect) {
                    this.lossDetect = lossDetect;
                }

                public Boolean getMotionDetect() {
                    return motionDetect;
                }

                public void setMotionDetect(Boolean motionDetect) {
                    this.motionDetect = motionDetect;
                }

                public Boolean getNetAbort() {
                    return netAbort;
                }

                public void setNetAbort(Boolean netAbort) {
                    this.netAbort = netAbort;
                }

                public Boolean getNetAlarm() {
                    return netAlarm;
                }

                public void setNetAlarm(Boolean netAlarm) {
                    this.netAlarm = netAlarm;
                }

                public Boolean getNetIpConflict() {
                    return netIpConflict;
                }

                public void setNetIpConflict(Boolean netIpConflict) {
                    this.netIpConflict = netIpConflict;
                }

                public Boolean getNewVideoAnalyze() {
                    return newVideoAnalyze;
                }

                public void setNewVideoAnalyze(Boolean newVideoAnalyze) {
                    this.newVideoAnalyze = newVideoAnalyze;
                }

                public Boolean getpEAInHumanPed() {
                    return pEAInHumanPed;
                }

                public void setpEAInHumanPed(Boolean pEAInHumanPed) {
                    this.pEAInHumanPed = pEAInHumanPed;
                }

                public Boolean getStorageFailure() {
                    return storageFailure;
                }

                public void setStorageFailure(Boolean storageFailure) {
                    this.storageFailure = storageFailure;
                }

                public Boolean getStorageLowSpace() {
                    return storageLowSpace;
                }

                public void setStorageLowSpace(Boolean storageLowSpace) {
                    this.storageLowSpace = storageLowSpace;
                }

                public Boolean getStorageNotExist() {
                    return storageNotExist;
                }

                public void setStorageNotExist(Boolean storageNotExist) {
                    this.storageNotExist = storageNotExist;
                }

                public Boolean getVideoAnalyze() {
                    return videoAnalyze;
                }

                public void setVideoAnalyze(Boolean videoAnalyze) {
                    this.videoAnalyze = videoAnalyze;
                }
            }

            public static class CommFunctionDTO {
                @SerializedName("CommRS232")
                private Boolean commRS232;
                @SerializedName("CommRS485")
                private Boolean commRS485;

                public Boolean getCommRS232() {
                    return commRS232;
                }

                public void setCommRS232(Boolean commRS232) {
                    this.commRS232 = commRS232;
                }

                public Boolean getCommRS485() {
                    return commRS485;
                }

                public void setCommRS485(Boolean commRS485) {
                    this.commRS485 = commRS485;
                }
            }

            public static class EncodeFunctionDTO {
                @SerializedName("DoubleStream")
                private Boolean doubleStream;
                @SerializedName("SmartH264")
                private Boolean smartH264;
                @SerializedName("SmartH264V2")
                private Boolean smartH264V2;
                @SerializedName("SnapStream")
                private Boolean snapStream;

                public Boolean getDoubleStream() {
                    return doubleStream;
                }

                public void setDoubleStream(Boolean doubleStream) {
                    this.doubleStream = doubleStream;
                }

                public Boolean getSmartH264() {
                    return smartH264;
                }

                public void setSmartH264(Boolean smartH264) {
                    this.smartH264 = smartH264;
                }

                public Boolean getSmartH264V2() {
                    return smartH264V2;
                }

                public void setSmartH264V2(Boolean smartH264V2) {
                    this.smartH264V2 = smartH264V2;
                }

                public Boolean getSnapStream() {
                    return snapStream;
                }

                public void setSnapStream(Boolean snapStream) {
                    this.snapStream = snapStream;
                }
            }

            public static class NetServerFunctionDTO {
                @SerializedName("IPAdaptive")
                private Boolean iPAdaptive;
                @SerializedName("Net3G")
                private Boolean net3G;
                @SerializedName("Net4GSignalLevel")
                private Boolean net4GSignalLevel;
                @SerializedName("NetAlarmCenter")
                private Boolean netAlarmCenter;
                @SerializedName("NetDAS")
                private Boolean netDAS;
                @SerializedName("NetDDNS")
                private Boolean netDDNS;
                @SerializedName("NetDHCP")
                private Boolean netDHCP;
                @SerializedName("NetDNS")
                private Boolean netDNS;
                @SerializedName("NetEmail")
                private Boolean netEmail;
                @SerializedName("NetFTP")
                private Boolean netFTP;
                @SerializedName("NetIPFilter")
                private Boolean netIPFilter;
                @SerializedName("NetIPv6")
                private Boolean netIPv6;
                @SerializedName("NetMutlicast")
                private Boolean netMutlicast;
                @SerializedName("NetNTP")
                private Boolean netNTP;
                @SerializedName("NetNat")
                private Boolean netNat;
                @SerializedName("NetPMS")
                private Boolean netPMS;
                @SerializedName("NetPMSV2")
                private Boolean netPMSV2;
                @SerializedName("NetPPPoE")
                private Boolean netPPPoE;
                @SerializedName("NetRTSP")
                private Boolean netRTSP;
                @SerializedName("NetSPVMN")
                private Boolean netSPVMN;
                @SerializedName("NetUPNP")
                private Boolean netUPNP;
                @SerializedName("NetWifi")
                private Boolean netWifi;
                @SerializedName("OnvifPwdCheckout")
                private Boolean onvifPwdCheckout;
                @SerializedName("RTMP")
                private Boolean rtmp;
                @SerializedName("WifiModeSwitch")
                private Boolean wifiModeSwitch;
                @SerializedName("WifiRouteSignalLevel")
                private Boolean wifiRouteSignalLevel;

                public Boolean getiPAdaptive() {
                    return iPAdaptive;
                }

                public void setiPAdaptive(Boolean iPAdaptive) {
                    this.iPAdaptive = iPAdaptive;
                }

                public Boolean getNet3G() {
                    return net3G;
                }

                public void setNet3G(Boolean net3G) {
                    this.net3G = net3G;
                }

                public Boolean getNet4GSignalLevel() {
                    return net4GSignalLevel;
                }

                public void setNet4GSignalLevel(Boolean net4GSignalLevel) {
                    this.net4GSignalLevel = net4GSignalLevel;
                }

                public Boolean getNetAlarmCenter() {
                    return netAlarmCenter;
                }

                public void setNetAlarmCenter(Boolean netAlarmCenter) {
                    this.netAlarmCenter = netAlarmCenter;
                }

                public Boolean getNetDAS() {
                    return netDAS;
                }

                public void setNetDAS(Boolean netDAS) {
                    this.netDAS = netDAS;
                }

                public Boolean getNetDDNS() {
                    return netDDNS;
                }

                public void setNetDDNS(Boolean netDDNS) {
                    this.netDDNS = netDDNS;
                }

                public Boolean getNetDHCP() {
                    return netDHCP;
                }

                public void setNetDHCP(Boolean netDHCP) {
                    this.netDHCP = netDHCP;
                }

                public Boolean getNetDNS() {
                    return netDNS;
                }

                public void setNetDNS(Boolean netDNS) {
                    this.netDNS = netDNS;
                }

                public Boolean getNetEmail() {
                    return netEmail;
                }

                public void setNetEmail(Boolean netEmail) {
                    this.netEmail = netEmail;
                }

                public Boolean getNetFTP() {
                    return netFTP;
                }

                public void setNetFTP(Boolean netFTP) {
                    this.netFTP = netFTP;
                }

                public Boolean getNetIPFilter() {
                    return netIPFilter;
                }

                public void setNetIPFilter(Boolean netIPFilter) {
                    this.netIPFilter = netIPFilter;
                }

                public Boolean getNetIPv6() {
                    return netIPv6;
                }

                public void setNetIPv6(Boolean netIPv6) {
                    this.netIPv6 = netIPv6;
                }

                public Boolean getNetMutlicast() {
                    return netMutlicast;
                }

                public void setNetMutlicast(Boolean netMutlicast) {
                    this.netMutlicast = netMutlicast;
                }

                public Boolean getNetNTP() {
                    return netNTP;
                }

                public void setNetNTP(Boolean netNTP) {
                    this.netNTP = netNTP;
                }

                public Boolean getNetNat() {
                    return netNat;
                }

                public void setNetNat(Boolean netNat) {
                    this.netNat = netNat;
                }

                public Boolean getNetPMS() {
                    return netPMS;
                }

                public void setNetPMS(Boolean netPMS) {
                    this.netPMS = netPMS;
                }

                public Boolean getNetPMSV2() {
                    return netPMSV2;
                }

                public void setNetPMSV2(Boolean netPMSV2) {
                    this.netPMSV2 = netPMSV2;
                }

                public Boolean getNetPPPoE() {
                    return netPPPoE;
                }

                public void setNetPPPoE(Boolean netPPPoE) {
                    this.netPPPoE = netPPPoE;
                }

                public Boolean getNetRTSP() {
                    return netRTSP;
                }

                public void setNetRTSP(Boolean netRTSP) {
                    this.netRTSP = netRTSP;
                }

                public Boolean getNetSPVMN() {
                    return netSPVMN;
                }

                public void setNetSPVMN(Boolean netSPVMN) {
                    this.netSPVMN = netSPVMN;
                }

                public Boolean getNetUPNP() {
                    return netUPNP;
                }

                public void setNetUPNP(Boolean netUPNP) {
                    this.netUPNP = netUPNP;
                }

                public Boolean getNetWifi() {
                    return netWifi;
                }

                public void setNetWifi(Boolean netWifi) {
                    this.netWifi = netWifi;
                }

                public Boolean getOnvifPwdCheckout() {
                    return onvifPwdCheckout;
                }

                public void setOnvifPwdCheckout(Boolean onvifPwdCheckout) {
                    this.onvifPwdCheckout = onvifPwdCheckout;
                }

                public Boolean getRtmp() {
                    return rtmp;
                }

                public void setRtmp(Boolean rtmp) {
                    this.rtmp = rtmp;
                }

                public Boolean getWifiModeSwitch() {
                    return wifiModeSwitch;
                }

                public void setWifiModeSwitch(Boolean wifiModeSwitch) {
                    this.wifiModeSwitch = wifiModeSwitch;
                }

                public Boolean getWifiRouteSignalLevel() {
                    return wifiRouteSignalLevel;
                }

                public void setWifiRouteSignalLevel(Boolean wifiRouteSignalLevel) {
                    this.wifiRouteSignalLevel = wifiRouteSignalLevel;
                }
            }

            public static class OtherFunctionDTO {
                @SerializedName("NOHDDRECORD")
                private Boolean nohddrecord;
                @SerializedName("NoSupportSafetyQuestion")
                private Boolean noSupportSafetyQuestion;
                @SerializedName("NotSupportAutoAndIntelligent")
                private Boolean notSupportAutoAndIntelligent;
                @SerializedName("SupportAdminContactInfo")
                private Boolean supportAdminContactInfo;
                @SerializedName("SupportAlarmRemoteCall")
                private Boolean supportAlarmRemoteCall;
                @SerializedName("SupportAlarmVoiceTips")
                private Boolean supportAlarmVoiceTips;
                @SerializedName("SupportAlarmVoiceTipsType")
                private Boolean supportAlarmVoiceTipsType;
                @SerializedName("SupportAppBindFlag")
                private Boolean supportAppBindFlag;
                @SerializedName("SupportAudioFormat")
                private Boolean supportAudioFormat;
                @SerializedName("SupportBT")
                private Boolean supportBT;
                @SerializedName("SupportBallTelescopic")
                private Boolean supportBallTelescopic;
                @SerializedName("SupportBoxCameraBulb")
                private Boolean supportBoxCameraBulb;
                @SerializedName("SupportCamareStyle")
                private Boolean supportCamareStyle;
                @SerializedName("SupportCameraWhiteLight")
                private Boolean supportCameraWhiteLight;
                @SerializedName("SupportCfgCloudupgrade")
                private Boolean supportCfgCloudupgrade;
                @SerializedName("SupportChangeLanguageNoReboot")
                private Boolean supportChangeLanguageNoReboot;
                @SerializedName("SupportCloseVoiceTip")
                private Boolean supportCloseVoiceTip;
                @SerializedName("SupportCloudUpgrade")
                private Boolean supportCloudUpgrade;
                @SerializedName("SupportCommDataUpload")
                private Boolean supportCommDataUpload;
                @SerializedName("SupportCorridorMode")
                private Boolean supportCorridorMode;
                @SerializedName("SupportCustomizeLpRect")
                private Boolean supportCustomizeLpRect;
                @SerializedName("SupportDNChangeByImage")
                private Boolean supportDNChangeByImage;
                @SerializedName("SupportDetectTrack")
                private Boolean supportDetectTrack;
                @SerializedName("SupportDimenCode")
                private Boolean supportDimenCode;
                @SerializedName("SupportDoubleLightBoxCamera")
                private Boolean supportDoubleLightBoxCamera;
                @SerializedName("SupportDoubleLightBulb")
                private Boolean supportDoubleLightBulb;
                @SerializedName("SupportElectronicPTZ")
                private Boolean supportElectronicPTZ;
                @SerializedName("SupportFTPTest")
                private Boolean supportFTPTest;
                @SerializedName("SupportFaceDetectV2")
                private Boolean supportFaceDetectV2;
                @SerializedName("SupportFaceRecognition")
                private Boolean supportFaceRecognition;
                @SerializedName("SupportHideNormalDLMode")
                private Boolean supportHideNormalDLMode;
                @SerializedName("SupportMailTest")
                private Boolean supportMailTest;
                @SerializedName("SupportMusicBulb433Pair")
                private Boolean supportMusicBulb433Pair;
                @SerializedName("SupportMusicLightBulb")
                private Boolean supportMusicLightBulb;
                @SerializedName("SupportNetWorkMode")
                private Boolean supportNetWorkMode;
                @SerializedName("SupportOSDInfo")
                private Boolean supportOSDInfo;
                @SerializedName("SupportOneKeyMaskVideo")
                private Boolean supportOneKeyMaskVideo;
                @SerializedName("SupportPCSetDoubleLight")
                private Boolean supportPCSetDoubleLight;
                @SerializedName("SupportPTZDirectionControl")
                private Boolean supportPTZDirectionControl;
                @SerializedName("SupportPTZTour")
                private Boolean supportPTZTour;
                @SerializedName("SupportPWDSafety")
                private Boolean supportPWDSafety;
                @SerializedName("SupportParkingGuide")
                private Boolean supportParkingGuide;
                @SerializedName("SupportPtz360Spin")
                private Boolean supportPtz360Spin;
                @SerializedName("SupportRPSVideo")
                private Boolean supportRPSVideo;
                @SerializedName("SupportSetBrightness")
                private Boolean supportSetBrightness;
                @SerializedName("SupportSetDetectTrackWatchPoint")
                private Boolean supportSetDetectTrackWatchPoint;
                @SerializedName("SupportSetHardwareAbility")
                private Boolean supportSetHardwareAbility;
                @SerializedName("SupportSetPTZPresetAttribute")
                private Boolean supportSetPTZPresetAttribute;
                @SerializedName("SupportSetVolume")
                private Boolean supportSetVolume;
                @SerializedName("SupportShowH265X")
                private Boolean supportShowH265X;
                @SerializedName("SupportSmartAppFaceDetect")
                private Boolean supportSmartAppFaceDetect;
                @SerializedName("SupportSnapCfg")
                private Boolean supportSnapCfg;
                @SerializedName("SupportSnapV2Stream")
                private Boolean supportSnapV2Stream;
                @SerializedName("SupportSnapshotConfigV2")
                private Boolean supportSnapshotConfigV2;
                @SerializedName("SupportSoftPhotosensitive")
                private Boolean supportSoftPhotosensitive;
                @SerializedName("SupportStatusLed")
                private Boolean supportStatusLed;
                @SerializedName("SupportSwitchMaxRes")
                private Boolean supportSwitchMaxRes;
                @SerializedName("SupportTargetDetect")
                private Boolean supportTargetDetect;
                @SerializedName("SupportTextPassword")
                private Boolean supportTextPassword;
                @SerializedName("SupportTimeZone")
                private Boolean supportTimeZone;
                @SerializedName("SupportTimingSleep")
                private Boolean supportTimingSleep;
                @SerializedName("SupportVolumeDetect")
                private Boolean supportVolumeDetect;
                @SerializedName("SupportWebRTCModule")
                private Boolean supportWebRTCModule;
                @SerializedName("SupportWriteLog")
                private Boolean supportWriteLog;
                @SerializedName("SuppportChangeOnvifPort")
                private Boolean suppportChangeOnvifPort;

                public Boolean getNohddrecord() {
                    return nohddrecord;
                }

                public void setNohddrecord(Boolean nohddrecord) {
                    this.nohddrecord = nohddrecord;
                }

                public Boolean getNoSupportSafetyQuestion() {
                    return noSupportSafetyQuestion;
                }

                public void setNoSupportSafetyQuestion(Boolean noSupportSafetyQuestion) {
                    this.noSupportSafetyQuestion = noSupportSafetyQuestion;
                }

                public Boolean getNotSupportAutoAndIntelligent() {
                    return notSupportAutoAndIntelligent;
                }

                public void setNotSupportAutoAndIntelligent(Boolean notSupportAutoAndIntelligent) {
                    this.notSupportAutoAndIntelligent = notSupportAutoAndIntelligent;
                }

                public Boolean getSupportAdminContactInfo() {
                    return supportAdminContactInfo;
                }

                public void setSupportAdminContactInfo(Boolean supportAdminContactInfo) {
                    this.supportAdminContactInfo = supportAdminContactInfo;
                }

                public Boolean getSupportAlarmRemoteCall() {
                    return supportAlarmRemoteCall;
                }

                public void setSupportAlarmRemoteCall(Boolean supportAlarmRemoteCall) {
                    this.supportAlarmRemoteCall = supportAlarmRemoteCall;
                }

                public Boolean getSupportAlarmVoiceTips() {
                    return supportAlarmVoiceTips;
                }

                public void setSupportAlarmVoiceTips(Boolean supportAlarmVoiceTips) {
                    this.supportAlarmVoiceTips = supportAlarmVoiceTips;
                }

                public Boolean getSupportAlarmVoiceTipsType() {
                    return supportAlarmVoiceTipsType;
                }

                public void setSupportAlarmVoiceTipsType(Boolean supportAlarmVoiceTipsType) {
                    this.supportAlarmVoiceTipsType = supportAlarmVoiceTipsType;
                }

                public Boolean getSupportAppBindFlag() {
                    return supportAppBindFlag;
                }

                public void setSupportAppBindFlag(Boolean supportAppBindFlag) {
                    this.supportAppBindFlag = supportAppBindFlag;
                }

                public Boolean getSupportAudioFormat() {
                    return supportAudioFormat;
                }

                public void setSupportAudioFormat(Boolean supportAudioFormat) {
                    this.supportAudioFormat = supportAudioFormat;
                }

                public Boolean getSupportBT() {
                    return supportBT;
                }

                public void setSupportBT(Boolean supportBT) {
                    this.supportBT = supportBT;
                }

                public Boolean getSupportBallTelescopic() {
                    return supportBallTelescopic;
                }

                public void setSupportBallTelescopic(Boolean supportBallTelescopic) {
                    this.supportBallTelescopic = supportBallTelescopic;
                }

                public Boolean getSupportBoxCameraBulb() {
                    return supportBoxCameraBulb;
                }

                public void setSupportBoxCameraBulb(Boolean supportBoxCameraBulb) {
                    this.supportBoxCameraBulb = supportBoxCameraBulb;
                }

                public Boolean getSupportCamareStyle() {
                    return supportCamareStyle;
                }

                public void setSupportCamareStyle(Boolean supportCamareStyle) {
                    this.supportCamareStyle = supportCamareStyle;
                }

                public Boolean getSupportCameraWhiteLight() {
                    return supportCameraWhiteLight;
                }

                public void setSupportCameraWhiteLight(Boolean supportCameraWhiteLight) {
                    this.supportCameraWhiteLight = supportCameraWhiteLight;
                }

                public Boolean getSupportCfgCloudupgrade() {
                    return supportCfgCloudupgrade;
                }

                public void setSupportCfgCloudupgrade(Boolean supportCfgCloudupgrade) {
                    this.supportCfgCloudupgrade = supportCfgCloudupgrade;
                }

                public Boolean getSupportChangeLanguageNoReboot() {
                    return supportChangeLanguageNoReboot;
                }

                public void setSupportChangeLanguageNoReboot(Boolean supportChangeLanguageNoReboot) {
                    this.supportChangeLanguageNoReboot = supportChangeLanguageNoReboot;
                }

                public Boolean getSupportCloseVoiceTip() {
                    return supportCloseVoiceTip;
                }

                public void setSupportCloseVoiceTip(Boolean supportCloseVoiceTip) {
                    this.supportCloseVoiceTip = supportCloseVoiceTip;
                }

                public Boolean getSupportCloudUpgrade() {
                    return supportCloudUpgrade;
                }

                public void setSupportCloudUpgrade(Boolean supportCloudUpgrade) {
                    this.supportCloudUpgrade = supportCloudUpgrade;
                }

                public Boolean getSupportCommDataUpload() {
                    return supportCommDataUpload;
                }

                public void setSupportCommDataUpload(Boolean supportCommDataUpload) {
                    this.supportCommDataUpload = supportCommDataUpload;
                }

                public Boolean getSupportCorridorMode() {
                    return supportCorridorMode;
                }

                public void setSupportCorridorMode(Boolean supportCorridorMode) {
                    this.supportCorridorMode = supportCorridorMode;
                }

                public Boolean getSupportCustomizeLpRect() {
                    return supportCustomizeLpRect;
                }

                public void setSupportCustomizeLpRect(Boolean supportCustomizeLpRect) {
                    this.supportCustomizeLpRect = supportCustomizeLpRect;
                }

                public Boolean getSupportDNChangeByImage() {
                    return supportDNChangeByImage;
                }

                public void setSupportDNChangeByImage(Boolean supportDNChangeByImage) {
                    this.supportDNChangeByImage = supportDNChangeByImage;
                }

                public Boolean getSupportDetectTrack() {
                    return supportDetectTrack;
                }

                public void setSupportDetectTrack(Boolean supportDetectTrack) {
                    this.supportDetectTrack = supportDetectTrack;
                }

                public Boolean getSupportDimenCode() {
                    return supportDimenCode;
                }

                public void setSupportDimenCode(Boolean supportDimenCode) {
                    this.supportDimenCode = supportDimenCode;
                }

                public Boolean getSupportDoubleLightBoxCamera() {
                    return supportDoubleLightBoxCamera;
                }

                public void setSupportDoubleLightBoxCamera(Boolean supportDoubleLightBoxCamera) {
                    this.supportDoubleLightBoxCamera = supportDoubleLightBoxCamera;
                }

                public Boolean getSupportDoubleLightBulb() {
                    return supportDoubleLightBulb;
                }

                public void setSupportDoubleLightBulb(Boolean supportDoubleLightBulb) {
                    this.supportDoubleLightBulb = supportDoubleLightBulb;
                }

                public Boolean getSupportElectronicPTZ() {
                    return supportElectronicPTZ;
                }

                public void setSupportElectronicPTZ(Boolean supportElectronicPTZ) {
                    this.supportElectronicPTZ = supportElectronicPTZ;
                }

                public Boolean getSupportFTPTest() {
                    return supportFTPTest;
                }

                public void setSupportFTPTest(Boolean supportFTPTest) {
                    this.supportFTPTest = supportFTPTest;
                }

                public Boolean getSupportFaceDetectV2() {
                    return supportFaceDetectV2;
                }

                public void setSupportFaceDetectV2(Boolean supportFaceDetectV2) {
                    this.supportFaceDetectV2 = supportFaceDetectV2;
                }

                public Boolean getSupportFaceRecognition() {
                    return supportFaceRecognition;
                }

                public void setSupportFaceRecognition(Boolean supportFaceRecognition) {
                    this.supportFaceRecognition = supportFaceRecognition;
                }

                public Boolean getSupportHideNormalDLMode() {
                    return supportHideNormalDLMode;
                }

                public void setSupportHideNormalDLMode(Boolean supportHideNormalDLMode) {
                    this.supportHideNormalDLMode = supportHideNormalDLMode;
                }

                public Boolean getSupportMailTest() {
                    return supportMailTest;
                }

                public void setSupportMailTest(Boolean supportMailTest) {
                    this.supportMailTest = supportMailTest;
                }

                public Boolean getSupportMusicBulb433Pair() {
                    return supportMusicBulb433Pair;
                }

                public void setSupportMusicBulb433Pair(Boolean supportMusicBulb433Pair) {
                    this.supportMusicBulb433Pair = supportMusicBulb433Pair;
                }

                public Boolean getSupportMusicLightBulb() {
                    return supportMusicLightBulb;
                }

                public void setSupportMusicLightBulb(Boolean supportMusicLightBulb) {
                    this.supportMusicLightBulb = supportMusicLightBulb;
                }

                public Boolean getSupportNetWorkMode() {
                    return supportNetWorkMode;
                }

                public void setSupportNetWorkMode(Boolean supportNetWorkMode) {
                    this.supportNetWorkMode = supportNetWorkMode;
                }

                public Boolean getSupportOSDInfo() {
                    return supportOSDInfo;
                }

                public void setSupportOSDInfo(Boolean supportOSDInfo) {
                    this.supportOSDInfo = supportOSDInfo;
                }

                public Boolean getSupportOneKeyMaskVideo() {
                    return supportOneKeyMaskVideo;
                }

                public void setSupportOneKeyMaskVideo(Boolean supportOneKeyMaskVideo) {
                    this.supportOneKeyMaskVideo = supportOneKeyMaskVideo;
                }

                public Boolean getSupportPCSetDoubleLight() {
                    return supportPCSetDoubleLight;
                }

                public void setSupportPCSetDoubleLight(Boolean supportPCSetDoubleLight) {
                    this.supportPCSetDoubleLight = supportPCSetDoubleLight;
                }

                public Boolean getSupportPTZDirectionControl() {
                    return supportPTZDirectionControl;
                }

                public void setSupportPTZDirectionControl(Boolean supportPTZDirectionControl) {
                    this.supportPTZDirectionControl = supportPTZDirectionControl;
                }

                public Boolean getSupportPTZTour() {
                    return supportPTZTour;
                }

                public void setSupportPTZTour(Boolean supportPTZTour) {
                    this.supportPTZTour = supportPTZTour;
                }

                public Boolean getSupportPWDSafety() {
                    return supportPWDSafety;
                }

                public void setSupportPWDSafety(Boolean supportPWDSafety) {
                    this.supportPWDSafety = supportPWDSafety;
                }

                public Boolean getSupportParkingGuide() {
                    return supportParkingGuide;
                }

                public void setSupportParkingGuide(Boolean supportParkingGuide) {
                    this.supportParkingGuide = supportParkingGuide;
                }

                public Boolean getSupportPtz360Spin() {
                    return supportPtz360Spin;
                }

                public void setSupportPtz360Spin(Boolean supportPtz360Spin) {
                    this.supportPtz360Spin = supportPtz360Spin;
                }

                public Boolean getSupportRPSVideo() {
                    return supportRPSVideo;
                }

                public void setSupportRPSVideo(Boolean supportRPSVideo) {
                    this.supportRPSVideo = supportRPSVideo;
                }

                public Boolean getSupportSetBrightness() {
                    return supportSetBrightness;
                }

                public void setSupportSetBrightness(Boolean supportSetBrightness) {
                    this.supportSetBrightness = supportSetBrightness;
                }

                public Boolean getSupportSetDetectTrackWatchPoint() {
                    return supportSetDetectTrackWatchPoint;
                }

                public void setSupportSetDetectTrackWatchPoint(Boolean supportSetDetectTrackWatchPoint) {
                    this.supportSetDetectTrackWatchPoint = supportSetDetectTrackWatchPoint;
                }

                public Boolean getSupportSetHardwareAbility() {
                    return supportSetHardwareAbility;
                }

                public void setSupportSetHardwareAbility(Boolean supportSetHardwareAbility) {
                    this.supportSetHardwareAbility = supportSetHardwareAbility;
                }

                public Boolean getSupportSetPTZPresetAttribute() {
                    return supportSetPTZPresetAttribute;
                }

                public void setSupportSetPTZPresetAttribute(Boolean supportSetPTZPresetAttribute) {
                    this.supportSetPTZPresetAttribute = supportSetPTZPresetAttribute;
                }

                public Boolean getSupportSetVolume() {
                    return supportSetVolume;
                }

                public void setSupportSetVolume(Boolean supportSetVolume) {
                    this.supportSetVolume = supportSetVolume;
                }

                public Boolean getSupportShowH265X() {
                    return supportShowH265X;
                }

                public void setSupportShowH265X(Boolean supportShowH265X) {
                    this.supportShowH265X = supportShowH265X;
                }

                public Boolean getSupportSmartAppFaceDetect() {
                    return supportSmartAppFaceDetect;
                }

                public void setSupportSmartAppFaceDetect(Boolean supportSmartAppFaceDetect) {
                    this.supportSmartAppFaceDetect = supportSmartAppFaceDetect;
                }

                public Boolean getSupportSnapCfg() {
                    return supportSnapCfg;
                }

                public void setSupportSnapCfg(Boolean supportSnapCfg) {
                    this.supportSnapCfg = supportSnapCfg;
                }

                public Boolean getSupportSnapV2Stream() {
                    return supportSnapV2Stream;
                }

                public void setSupportSnapV2Stream(Boolean supportSnapV2Stream) {
                    this.supportSnapV2Stream = supportSnapV2Stream;
                }

                public Boolean getSupportSnapshotConfigV2() {
                    return supportSnapshotConfigV2;
                }

                public void setSupportSnapshotConfigV2(Boolean supportSnapshotConfigV2) {
                    this.supportSnapshotConfigV2 = supportSnapshotConfigV2;
                }

                public Boolean getSupportSoftPhotosensitive() {
                    return supportSoftPhotosensitive;
                }

                public void setSupportSoftPhotosensitive(Boolean supportSoftPhotosensitive) {
                    this.supportSoftPhotosensitive = supportSoftPhotosensitive;
                }

                public Boolean getSupportStatusLed() {
                    return supportStatusLed;
                }

                public void setSupportStatusLed(Boolean supportStatusLed) {
                    this.supportStatusLed = supportStatusLed;
                }

                public Boolean getSupportSwitchMaxRes() {
                    return supportSwitchMaxRes;
                }

                public void setSupportSwitchMaxRes(Boolean supportSwitchMaxRes) {
                    this.supportSwitchMaxRes = supportSwitchMaxRes;
                }

                public Boolean getSupportTargetDetect() {
                    return supportTargetDetect;
                }

                public void setSupportTargetDetect(Boolean supportTargetDetect) {
                    this.supportTargetDetect = supportTargetDetect;
                }

                public Boolean getSupportTextPassword() {
                    return supportTextPassword;
                }

                public void setSupportTextPassword(Boolean supportTextPassword) {
                    this.supportTextPassword = supportTextPassword;
                }

                public Boolean getSupportTimeZone() {
                    return supportTimeZone;
                }

                public void setSupportTimeZone(Boolean supportTimeZone) {
                    this.supportTimeZone = supportTimeZone;
                }

                public Boolean getSupportTimingSleep() {
                    return supportTimingSleep;
                }

                public void setSupportTimingSleep(Boolean supportTimingSleep) {
                    this.supportTimingSleep = supportTimingSleep;
                }

                public Boolean getSupportVolumeDetect() {
                    return supportVolumeDetect;
                }

                public void setSupportVolumeDetect(Boolean supportVolumeDetect) {
                    this.supportVolumeDetect = supportVolumeDetect;
                }

                public Boolean getSupportWebRTCModule() {
                    return supportWebRTCModule;
                }

                public void setSupportWebRTCModule(Boolean supportWebRTCModule) {
                    this.supportWebRTCModule = supportWebRTCModule;
                }

                public Boolean getSupportWriteLog() {
                    return supportWriteLog;
                }

                public void setSupportWriteLog(Boolean supportWriteLog) {
                    this.supportWriteLog = supportWriteLog;
                }

                public Boolean getSuppportChangeOnvifPort() {
                    return suppportChangeOnvifPort;
                }

                public void setSuppportChangeOnvifPort(Boolean suppportChangeOnvifPort) {
                    this.suppportChangeOnvifPort = suppportChangeOnvifPort;
                }
            }

            public static class PreviewFunctionDTO {
                @SerializedName("Talk")
                private Boolean talk;
                @SerializedName("Tour")
                private Boolean tour;

                public Boolean getTalk() {
                    return talk;
                }

                public void setTalk(Boolean talk) {
                    this.talk = talk;
                }

                public Boolean getTour() {
                    return tour;
                }

                public void setTour(Boolean tour) {
                    this.tour = tour;
                }
            }

            public static class TipShowDTO {
                @SerializedName("NoBeepTipShow")
                private Boolean noBeepTipShow;

                public Boolean getNoBeepTipShow() {
                    return noBeepTipShow;
                }

                public void setNoBeepTipShow(Boolean noBeepTipShow) {
                    this.noBeepTipShow = noBeepTipShow;
                }
            }

            public AlarmFunctionDTO getAlarmFunction() {
                return alarmFunction;
            }

            public void setAlarmFunction(AlarmFunctionDTO alarmFunction) {
                this.alarmFunction = alarmFunction;
            }

            public CommFunctionDTO getCommFunction() {
                return commFunction;
            }

            public void setCommFunction(CommFunctionDTO commFunction) {
                this.commFunction = commFunction;
            }

            public EncodeFunctionDTO getEncodeFunction() {
                return encodeFunction;
            }

            public void setEncodeFunction(EncodeFunctionDTO encodeFunction) {
                this.encodeFunction = encodeFunction;
            }

            public NetServerFunctionDTO getNetServerFunction() {
                return netServerFunction;
            }

            public void setNetServerFunction(NetServerFunctionDTO netServerFunction) {
                this.netServerFunction = netServerFunction;
            }

            public OtherFunctionDTO getOtherFunction() {
                return otherFunction;
            }

            public void setOtherFunction(OtherFunctionDTO otherFunction) {
                this.otherFunction = otherFunction;
            }

            public PreviewFunctionDTO getPreviewFunction() {
                return previewFunction;
            }

            public void setPreviewFunction(PreviewFunctionDTO previewFunction) {
                this.previewFunction = previewFunction;
            }

            public TipShowDTO getTipShow() {
                return tipShow;
            }

            public void setTipShow(TipShowDTO tipShow) {
                this.tipShow = tipShow;
            }
        }

        public static class EncodeCapabilityDTO {
            @SerializedName("ChannelMaxSetSync")
            private Integer channelMaxSetSync;
            @SerializedName("CombEncodeInfo")
            private List<CombEncodeInfoDTO> combEncodeInfo;
            @SerializedName("Compression")
            private List<String> compression;
            @SerializedName("EncodeInfo")
            private List<EncodeInfoDTO> encodeInfo;
            @SerializedName("ExImageSizePerChannel")
            private List<String> exImageSizePerChannel;
            @SerializedName("ExImageSizePerChannelEx")
            private List<List<String>> exImageSizePerChannelEx;
            @SerializedName("FourthStreamImageSize")
            private List<String> fourthStreamImageSize;
            @SerializedName("ImageSizePerChannel")
            private List<String> imageSizePerChannel;
            @SerializedName("MaxBitrate")
            private Integer maxBitrate;
            @SerializedName("MaxEncodePower")
            private Integer maxEncodePower;
            @SerializedName("MaxEncodePowerPerChannel")
            private List<String> maxEncodePowerPerChannel;
            @SerializedName("ThirdStreamImageSize")
            private List<String> thirdStreamImageSize;

            public static class CombEncodeInfoDTO {
                @SerializedName("CompressionMask")
                private String compressionMask;
                @SerializedName("Enable")
                private Boolean enable;
                @SerializedName("HaveAudio")
                private Boolean haveAudio;
                @SerializedName("ResolutionMask")
                private String resolutionMask;
                @SerializedName("StreamType")
                private String streamType;

                public String getCompressionMask() {
                    return compressionMask;
                }

                public void setCompressionMask(String compressionMask) {
                    this.compressionMask = compressionMask;
                }

                public Boolean getEnable() {
                    return enable;
                }

                public void setEnable(Boolean enable) {
                    this.enable = enable;
                }

                public Boolean getHaveAudio() {
                    return haveAudio;
                }

                public void setHaveAudio(Boolean haveAudio) {
                    this.haveAudio = haveAudio;
                }

                public String getResolutionMask() {
                    return resolutionMask;
                }

                public void setResolutionMask(String resolutionMask) {
                    this.resolutionMask = resolutionMask;
                }

                public String getStreamType() {
                    return streamType;
                }

                public void setStreamType(String streamType) {
                    this.streamType = streamType;
                }
            }

            public static class EncodeInfoDTO {
                @SerializedName("CompressionMask")
                private String compressionMask;
                @SerializedName("Enable")
                private Boolean enable;
                @SerializedName("HaveAudio")
                private Boolean haveAudio;
                @SerializedName("ResolutionMask")
                private String resolutionMask;
                @SerializedName("StreamType")
                private String streamType;

                public String getCompressionMask() {
                    return compressionMask;
                }

                public void setCompressionMask(String compressionMask) {
                    this.compressionMask = compressionMask;
                }

                public Boolean getEnable() {
                    return enable;
                }

                public void setEnable(Boolean enable) {
                    this.enable = enable;
                }

                public Boolean getHaveAudio() {
                    return haveAudio;
                }

                public void setHaveAudio(Boolean haveAudio) {
                    this.haveAudio = haveAudio;
                }

                public String getResolutionMask() {
                    return resolutionMask;
                }

                public void setResolutionMask(String resolutionMask) {
                    this.resolutionMask = resolutionMask;
                }

                public String getStreamType() {
                    return streamType;
                }

                public void setStreamType(String streamType) {
                    this.streamType = streamType;
                }
            }

            public Integer getChannelMaxSetSync() {
                return channelMaxSetSync;
            }

            public void setChannelMaxSetSync(Integer channelMaxSetSync) {
                this.channelMaxSetSync = channelMaxSetSync;
            }

            public List<CombEncodeInfoDTO> getCombEncodeInfo() {
                return combEncodeInfo;
            }

            public void setCombEncodeInfo(List<CombEncodeInfoDTO> combEncodeInfo) {
                this.combEncodeInfo = combEncodeInfo;
            }

            public List<String> getCompression() {
                return compression;
            }

            public void setCompression(List<String> compression) {
                this.compression = compression;
            }

            public List<EncodeInfoDTO> getEncodeInfo() {
                return encodeInfo;
            }

            public void setEncodeInfo(List<EncodeInfoDTO> encodeInfo) {
                this.encodeInfo = encodeInfo;
            }

            public List<String> getExImageSizePerChannel() {
                return exImageSizePerChannel;
            }

            public void setExImageSizePerChannel(List<String> exImageSizePerChannel) {
                this.exImageSizePerChannel = exImageSizePerChannel;
            }

            public List<List<String>> getExImageSizePerChannelEx() {
                return exImageSizePerChannelEx;
            }

            public void setExImageSizePerChannelEx(List<List<String>> exImageSizePerChannelEx) {
                this.exImageSizePerChannelEx = exImageSizePerChannelEx;
            }

            public List<String> getFourthStreamImageSize() {
                return fourthStreamImageSize;
            }

            public void setFourthStreamImageSize(List<String> fourthStreamImageSize) {
                this.fourthStreamImageSize = fourthStreamImageSize;
            }

            public List<String> getImageSizePerChannel() {
                return imageSizePerChannel;
            }

            public void setImageSizePerChannel(List<String> imageSizePerChannel) {
                this.imageSizePerChannel = imageSizePerChannel;
            }

            public Integer getMaxBitrate() {
                return maxBitrate;
            }

            public void setMaxBitrate(Integer maxBitrate) {
                this.maxBitrate = maxBitrate;
            }

            public Integer getMaxEncodePower() {
                return maxEncodePower;
            }

            public void setMaxEncodePower(Integer maxEncodePower) {
                this.maxEncodePower = maxEncodePower;
            }

            public List<String> getMaxEncodePowerPerChannel() {
                return maxEncodePowerPerChannel;
            }

            public void setMaxEncodePowerPerChannel(List<String> maxEncodePowerPerChannel) {
                this.maxEncodePowerPerChannel = maxEncodePowerPerChannel;
            }

            public List<String> getThirdStreamImageSize() {
                return thirdStreamImageSize;
            }

            public void setThirdStreamImageSize(List<String> thirdStreamImageSize) {
                this.thirdStreamImageSize = thirdStreamImageSize;
            }
        }

        public static class BlindCapabilityDTO {
            @SerializedName("BlindCoverNum")
            private Integer blindCoverNum;

            public Integer getBlindCoverNum() {
                return blindCoverNum;
            }

            public void setBlindCoverNum(Integer blindCoverNum) {
                this.blindCoverNum = blindCoverNum;
            }
        }

        public static class MotionAreaDTO {
            @SerializedName("GridColumn")
            private Integer gridColumn;
            @SerializedName("GridRow")
            private Integer gridRow;

            public Integer getGridColumn() {
                return gridColumn;
            }

            public void setGridColumn(Integer gridColumn) {
                this.gridColumn = gridColumn;
            }

            public Integer getGridRow() {
                return gridRow;
            }

            public void setGridRow(Integer gridRow) {
                this.gridRow = gridRow;
            }
        }

        public static class CameraDTO {
            @SerializedName("Count")
            private Integer count;
            @SerializedName("ElecLevel")
            private Integer elecLevel;
            @SerializedName("IsFishLens")
            private Integer isFishLens;
            @SerializedName("Luminance")
            private Integer luminance;
            @SerializedName("Speeds")
            private List<String> speeds;
            @SerializedName("Status")
            private Integer status;
            @SerializedName("SupportIntellDoubleLight")
            private Integer supportIntellDoubleLight;
            @SerializedName("SupportPreventOverExpo")
            private Integer supportPreventOverExpo;
            @SerializedName("Version")
            private String version;

            public Integer getCount() {
                return count;
            }

            public void setCount(Integer count) {
                this.count = count;
            }

            public Integer getElecLevel() {
                return elecLevel;
            }

            public void setElecLevel(Integer elecLevel) {
                this.elecLevel = elecLevel;
            }

            public Integer getIsFishLens() {
                return isFishLens;
            }

            public void setIsFishLens(Integer isFishLens) {
                this.isFishLens = isFishLens;
            }

            public Integer getLuminance() {
                return luminance;
            }

            public void setLuminance(Integer luminance) {
                this.luminance = luminance;
            }

            public List<String> getSpeeds() {
                return speeds;
            }

            public void setSpeeds(List<String> speeds) {
                this.speeds = speeds;
            }

            public Integer getStatus() {
                return status;
            }

            public void setStatus(Integer status) {
                this.status = status;
            }

            public Integer getSupportIntellDoubleLight() {
                return supportIntellDoubleLight;
            }

            public void setSupportIntellDoubleLight(Integer supportIntellDoubleLight) {
                this.supportIntellDoubleLight = supportIntellDoubleLight;
            }

            public Integer getSupportPreventOverExpo() {
                return supportPreventOverExpo;
            }

            public void setSupportPreventOverExpo(Integer supportPreventOverExpo) {
                this.supportPreventOverExpo = supportPreventOverExpo;
            }

            public String getVersion() {
                return version;
            }

            public void setVersion(String version) {
                this.version = version;
            }
        }

        public static class TalkAudioFormatDTO {
            @SerializedName("BitRate")
            private Integer bitRate;
            @SerializedName("EncodeType")
            private List<String> encodeType;
            @SerializedName("SampleBit")
            private Integer sampleBit;
            @SerializedName("SampleRate")
            private Integer sampleRate;

            public Integer getBitRate() {
                return bitRate;
            }

            public void setBitRate(Integer bitRate) {
                this.bitRate = bitRate;
            }

            public List<String> getEncodeType() {
                return encodeType;
            }

            public void setEncodeType(List<String> encodeType) {
                this.encodeType = encodeType;
            }

            public Integer getSampleBit() {
                return sampleBit;
            }

            public void setSampleBit(Integer sampleBit) {
                this.sampleBit = sampleBit;
            }

            public Integer getSampleRate() {
                return sampleRate;
            }

            public void setSampleRate(Integer sampleRate) {
                this.sampleRate = sampleRate;
            }
        }

        public static class IntelligentDTO {
            @SerializedName("AlgorithmAVD")
            private String algorithmAVD;
            @SerializedName("AlgorithmCPC")
            private String algorithmCPC;
            @SerializedName("AlgorithmPEA")
            private String algorithmPEA;
            @SerializedName("IntelAVD")
            private String intelAVD;
            @SerializedName("IntelCPC")
            private String intelCPC;
            @SerializedName("IntelPEA")
            private String intelPEA;
            @SerializedName("LimitOSC")
            private LimitOSCDTO limitOSC;
            @SerializedName("LimitPEA")
            private LimitPEADTO limitPEA;

            public static class LimitOSCDTO {
                @SerializedName("AreaMaxLineNum")
                private Integer areaMaxLineNum;
                @SerializedName("AreaNum")
                private Integer areaNum;
                @SerializedName("Rectangle")
                private Integer rectangle;

                public Integer getAreaMaxLineNum() {
                    return areaMaxLineNum;
                }

                public void setAreaMaxLineNum(Integer areaMaxLineNum) {
                    this.areaMaxLineNum = areaMaxLineNum;
                }

                public Integer getAreaNum() {
                    return areaNum;
                }

                public void setAreaNum(Integer areaNum) {
                    this.areaNum = areaNum;
                }

                public Integer getRectangle() {
                    return rectangle;
                }

                public void setRectangle(Integer rectangle) {
                    this.rectangle = rectangle;
                }
            }

            public static class LimitPEADTO {
                @SerializedName("AreaMaxLineNum")
                private Integer areaMaxLineNum;
                @SerializedName("AreaNum")
                private Integer areaNum;
                @SerializedName("LineNum")
                private Integer lineNum;
                @SerializedName("Rectangle")
                private Integer rectangle;

                public Integer getAreaMaxLineNum() {
                    return areaMaxLineNum;
                }

                public void setAreaMaxLineNum(Integer areaMaxLineNum) {
                    this.areaMaxLineNum = areaMaxLineNum;
                }

                public Integer getAreaNum() {
                    return areaNum;
                }

                public void setAreaNum(Integer areaNum) {
                    this.areaNum = areaNum;
                }

                public Integer getLineNum() {
                    return lineNum;
                }

                public void setLineNum(Integer lineNum) {
                    this.lineNum = lineNum;
                }

                public Integer getRectangle() {
                    return rectangle;
                }

                public void setRectangle(Integer rectangle) {
                    this.rectangle = rectangle;
                }
            }

            public String getAlgorithmAVD() {
                return algorithmAVD;
            }

            public void setAlgorithmAVD(String algorithmAVD) {
                this.algorithmAVD = algorithmAVD;
            }

            public String getAlgorithmCPC() {
                return algorithmCPC;
            }

            public void setAlgorithmCPC(String algorithmCPC) {
                this.algorithmCPC = algorithmCPC;
            }

            public String getAlgorithmPEA() {
                return algorithmPEA;
            }

            public void setAlgorithmPEA(String algorithmPEA) {
                this.algorithmPEA = algorithmPEA;
            }

            public String getIntelAVD() {
                return intelAVD;
            }

            public void setIntelAVD(String intelAVD) {
                this.intelAVD = intelAVD;
            }

            public String getIntelCPC() {
                return intelCPC;
            }

            public void setIntelCPC(String intelCPC) {
                this.intelCPC = intelCPC;
            }

            public String getIntelPEA() {
                return intelPEA;
            }

            public void setIntelPEA(String intelPEA) {
                this.intelPEA = intelPEA;
            }

            public LimitOSCDTO getLimitOSC() {
                return limitOSC;
            }

            public void setLimitOSC(LimitOSCDTO limitOSC) {
                this.limitOSC = limitOSC;
            }

            public LimitPEADTO getLimitPEA() {
                return limitPEA;
            }

            public void setLimitPEA(LimitPEADTO limitPEA) {
                this.limitPEA = limitPEA;
            }
        }

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

        public SystemFunctionDTO getSystemFunction() {
            return systemFunction;
        }

        public void setSystemFunction(SystemFunctionDTO systemFunction) {
            this.systemFunction = systemFunction;
        }

        public EncodeCapabilityDTO getEncodeCapability() {
            return encodeCapability;
        }

        public void setEncodeCapability(EncodeCapabilityDTO encodeCapability) {
            this.encodeCapability = encodeCapability;
        }

        public BlindCapabilityDTO getBlindCapability() {
            return blindCapability;
        }

        public void setBlindCapability(BlindCapabilityDTO blindCapability) {
            this.blindCapability = blindCapability;
        }

        public MotionAreaDTO getMotionArea() {
            return motionArea;
        }

        public void setMotionArea(MotionAreaDTO motionArea) {
            this.motionArea = motionArea;
        }

        public List<String> getComProtocol() {
            return comProtocol;
        }

        public void setComProtocol(List<String> comProtocol) {
            this.comProtocol = comProtocol;
        }

        public CameraDTO getCamera() {
            return camera;
        }

        public void setCamera(CameraDTO camera) {
            this.camera = camera;
        }

        public List<TalkAudioFormatDTO> getTalkAudioFormat() {
            return talkAudioFormat;
        }

        public void setTalkAudioFormat(List<TalkAudioFormatDTO> talkAudioFormat) {
            this.talkAudioFormat = talkAudioFormat;
        }

        public List<String> getMultiLanguage() {
            return multiLanguage;
        }

        public void setMultiLanguage(List<String> multiLanguage) {
            this.multiLanguage = multiLanguage;
        }

        public List<String> getUartProtocol() {
            return uartProtocol;
        }

        public void setUartProtocol(List<String> uartProtocol) {
            this.uartProtocol = uartProtocol;
        }

        public IntelligentDTO getIntelligent() {
            return intelligent;
        }

        public void setIntelligent(IntelligentDTO intelligent) {
            this.intelligent = intelligent;
        }
    }


    public static DeviceAbilityResponse newInstance() {
        return new DeviceAbilityResponse(JLinkResponseCode.SUCCESS.getCode(), JLinkResponseCode.SUCCESS.getMsg(), null);
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

    public DevAbility getData() {
        return data;
    }

    public void setData(DevAbility data) {
        this.data = data;
    }
}
