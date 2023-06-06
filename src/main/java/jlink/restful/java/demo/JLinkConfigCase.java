package jlink.restful.java.demo;

import jlink.restful.java.sdk.JLinkClient;
import jlink.restful.java.sdk.JLinkDevice;
import jlink.restful.java.sdk.competent.JLinkDeviceConfigTypeEnum;
import jlink.restful.java.sdk.module.config.DetectBlindDetectConfig;
import jlink.restful.java.sdk.module.config.DetectMotionDetectConfig;
import jlink.restful.java.sdk.module.config.GeneralLocationConfig;
import jlink.restful.java.sdk.module.login.DeviceLoginData;

import java.util.Arrays;

public class JLinkConfigCase {
    public static void main(String[] args) {
        JLinkClient jClient = new JLinkClient(
                "e0534f3240274897821a126be19b6d46",
                "0621ef206a1d4cafbe0c5545c3882ea8",
                "90f8bc17be2a425db6068c749dee4f5d",
                2);
        /**
         * sn devise serial number；
         * devUsername Device login user name;
         * devPassword Device login password
         */
        JLinkDevice jDevice = new JLinkDevice(jClient, "b11ffe8d6b812473", "admin", "1qaz2wsx");

        DeviceLoginData loginData = jDevice.login();

        if (loginData.getRet() == 100) {
//Video Object Configuration
//            AVEncVideoWidgetConfig avEncVideoWidgetConfig = (AVEncVideoWidgetConfig) jDevice.getConfig(JLinkDeviceConfigTypeEnum.AVENCVIDEOWIDGET);
//            System.out.println(avEncVideoWidgetConfig.getVideoWidgetDTOS().get(0).getChannelTitle().getName());
            //General configuration
//            GeneralConfig generalConfig = (GeneralConfig) jDevice.getConfig(JLinkDeviceConfigTypeEnum.GENERALGENERAL);
//            System.out.println(generalConfig.getGeneralDTO().getFontSize());
            //localized configuration
            GeneralLocationConfig locationConfig = (GeneralLocationConfig) jDevice.getConfig(JLinkDeviceConfigTypeEnum.GENERALLOCATION);
            System.out.println(locationConfig.getGeneralLocationDTO().getVideoFormat());
            //get alarm sound list
//            jDevice.getConfig(JLinkDeviceConfigTypeEnum.ABILITYVOICETIPTYPE);
            //custom motion detect alarm sound
//            jDevice.setConfig(getDetectionConfig());
        }


    }

    private static DetectMotionDetectConfig getDetectionConfig() {
        DetectMotionDetectConfig config = new DetectMotionDetectConfig();
        config.setName("Detect.MotionDetect");

        DetectMotionDetectConfig.DetectMotionDetectDTO motionDetectDTO = new DetectMotionDetectConfig.DetectMotionDetectDTO();
        config.setDetectMotionDetectDTOS(Arrays.asList(motionDetectDTO));

        DetectBlindDetectConfig.DetectBlindDetectDTO.EventHandlerDTO eventHandlerDTO = new DetectBlindDetectConfig.DetectBlindDetectDTO.EventHandlerDTO();

        motionDetectDTO.setEventHandlerDTO(eventHandlerDTO);
        motionDetectDTO.setEnable(true);
        motionDetectDTO.setLevel(3);
        motionDetectDTO.setRegion(Arrays.asList("0xFFFFFF", "0xFFFFFF"));

        eventHandlerDTO.setEventLatch(1);
        eventHandlerDTO.setTimeSection(Arrays.asList(Arrays.asList(
                "1 00:00:00-24:00:00",
                "0 00:00:00-24:00:00",
                "0 00:00:00-24:00:00",
                "0 00:00:00-24:00:00",
                "0 00:00:00-24:00:00",
                "0 00:00:00-24:00:00")));
        eventHandlerDTO.setRecordMask("0x0F");
        eventHandlerDTO.setRecordEnable(true);
        eventHandlerDTO.setRecordLatch(10);
        eventHandlerDTO.setAlarmOutEnable(true);
        eventHandlerDTO.setAlarmOutMask("0x0F");
        eventHandlerDTO.setAlarmOutLatch(10);
        eventHandlerDTO.setPtzEnable(true);
        eventHandlerDTO.setPtzLink(Arrays.asList(Arrays.asList("None", "0"), Arrays.asList("Preset", "3")));
        eventHandlerDTO.setTourEnable(true);
        eventHandlerDTO.setTourMask("0x001");
        eventHandlerDTO.setSnapShotMask("0x001");
        eventHandlerDTO.setSnapEnable(true);
        eventHandlerDTO.setTipEnable(true);
        eventHandlerDTO.setMailEnable(true);
        eventHandlerDTO.setMessageEnable(true);
        eventHandlerDTO.setMsgtoNetEnable(true);
        eventHandlerDTO.setBeepEnable(true);
        eventHandlerDTO.setVoiceEnable(true);
        eventHandlerDTO.setMatrixEnable(true);
        eventHandlerDTO.setMatrixMask("0x000F");
        eventHandlerDTO.setLogEnable(true);
        eventHandlerDTO.setfTPEnable(true);
        //setting alarm sound
        eventHandlerDTO.setVoiceType(522);
        return config;
    }
}
