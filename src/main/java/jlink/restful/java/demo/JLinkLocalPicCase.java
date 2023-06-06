package jlink.restful.java.demo;

import jlink.restful.java.sdk.JLinkClient;
import jlink.restful.java.sdk.JLinkDevice;
import jlink.restful.java.sdk.JLinkUser;
import jlink.restful.java.sdk.competent.JLinkDeviceInfoEnum;
import jlink.restful.java.sdk.module.opdev.opfilequery.OPFileQueryDTO;
import jlink.restful.java.sdk.module.opdev.opfilequery.OPFileQueryResponse;

public class JLinkLocalPicCase {

    public static void main(String[] args) {
        JLinkClient jClient = new JLinkClient(
                "e0534f3240274897821a126be19b6d46",
                "0621ef206a1d4cafbe0c5545c3882ea8",
                "90f8bc17be2a425db6068c749dee4f5d",
                2
        );
        JLinkUser jUser = new JLinkUser(jClient, "乄轻骑", "hjm123456");
        JLinkDevice jDevice = new JLinkDevice(jClient, "6affcc4243a16829", "admin", "");

        jDevice.deviceStatus();
        //get file list
        OPFileQueryDTO dto = new OPFileQueryDTO();
        dto.getOpFileQuery().setBeginTime("2023-04-04 16:11:06");
        dto.getOpFileQuery().setEndTime("2022-04-04 16:11:06");
        dto.getOpFileQuery().setChannel(0);
        dto.getOpFileQuery().setType("jpg");
        dto.getOpFileQuery().setStreamType("0x00000001");
        OPFileQueryResponse response = (OPFileQueryResponse) jDevice.deviceOperate(dto);

        if (null != response.getOPFileQuery() && response.getOPFileQuery().size() > 0) {
            String fileName = response.getOPFileQuery().get(0).getFileName();
            String startTime = response.getOPFileQuery().get(0).getBeginTime();
            String endTime = response.getOPFileQuery().get(0).getEndTime();
//            String fileName = "/idea1/2023-04-04/001/16.25.08-16.25.09[A][@43][1].jpg";
//            String startTime = "2023-04-04 16:25:08";
//            String endTime = "2023-04-04 16:25:09";

            String image = jDevice.deviceLocalPic(
                    startTime,
                    endTime,
                    fileName,
                    jUser
            );
            System.out.println(image);
        }

//        jDevice.deviceInfo(JLinkDeviceInfoEnum.StorageInfo);
    }
}
