package jlink.restful.java.demo;

import jlink.restful.java.sdk.JLinkClient;
import jlink.restful.java.sdk.JLinkDevice;
import jlink.restful.java.sdk.JLinkUser;
import jlink.restful.java.sdk.module.opdev.opfilequery.OPFileQueryDTO;
import jlink.restful.java.sdk.module.opdev.opfilequery.OPFileQueryResponse;
import jlink.restful.java.sdk.module.playback.DevicePlaybackEnum;

public class JLinkPlaybackCase {

    public static void main(String[] args) {
        JLinkClient jClient = new JLinkClient(
                "e0534f3240274897821a126be19b6d46",
                "0621ef206a1d4cafbe0c5545c3882ea8",
                "90f8bc17be2a425db6068c749dee4f5d",
                2
        );
        JLinkUser jUser = new JLinkUser(jClient, "test2022", "a1234567");
        JLinkDevice jDevice = new JLinkDevice(jClient, "b11ffe8d6b812473", "admin", "qwertyu1");

        //get file list
        OPFileQueryDTO dto = new OPFileQueryDTO();
        dto.getOpFileQuery().setBeginTime("2022-04-28 18:00:00");
        dto.getOpFileQuery().setEndTime("2022-04-28 19:00:00");
        OPFileQueryResponse response = (OPFileQueryResponse) jDevice.deviceOperate(dto);

        if (null != response.getOPFileQuery() && response.getOPFileQuery().size() > 0) {
            String fileName = response.getOPFileQuery().get(0).getFileName();
            String startTime = response.getOPFileQuery().get(0).getBeginTime();
            String endTime = response.getOPFileQuery().get(0).getEndTime();

            String playback = jDevice.devicePlayback(
                    DevicePlaybackEnum.STREAM_EXTRA.get(),
                    startTime,
                    endTime,
                    fileName,
                    jUser
            );
            System.out.println(playback);
        }

    }
}
