package jlink.restful.java.demo;

import jlink.restful.java.sdk.JLinkClient;
import jlink.restful.java.sdk.JLinkDevice;
import jlink.restful.java.sdk.competent.JLinkDeviceConfigTypeEnum;
import jlink.restful.java.sdk.module.config.GeneralLocationConfig;
import jlink.restful.java.sdk.module.login.DeviceLoginData;

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
        }


    }
}
