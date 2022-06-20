package jlink.restful.java.demo;

import jlink.restful.java.sdk.JLinkClient;
import jlink.restful.java.sdk.JLinkDevice;
import jlink.restful.java.sdk.JLinkUser;
import jlink.restful.java.sdk.module.livestream.DeviceLiveStreamEnum;

public class JLinkLiveStreamCase {

    public static void main(String[] args) {
        JLinkClient jClient = new JLinkClient(
                "e0534f3240274897821a126be19b6d46",
                "0621ef206a1d4cafbe0c5545c3882ea8",
                "90f8bc17be2a425db6068c749dee4f5d",
                2
        );
        JLinkUser jUser = new JLinkUser(jClient, "test2022", "a1234567");
        JLinkDevice jDevice = new JLinkDevice(jClient, "b11ffe8d6b812473", "admin", "");

        String liveStream = jDevice.deviceLivestream(
                DeviceLiveStreamEnum.STREAM_EXTRA.get(),
                DeviceLiveStreamEnum.MEDIATYPE_HLS.get(),
                DeviceLiveStreamEnum.PROTOCOL_TS.get(),
                jUser
        );
        System.out.println(liveStream);
    }
}
