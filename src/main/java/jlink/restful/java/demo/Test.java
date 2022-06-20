package jlink.restful.java.demo;

import com.google.gson.Gson;
import jlink.restful.java.sdk.JLinkClient;
import jlink.restful.java.sdk.JLinkDevice;
import jlink.restful.java.sdk.module.status.DeviceStatusData;

public class Test {
    public static void main(String[] args) {
        JLinkClient jClient = new JLinkClient(
                "62a6f6f01274535cf74bff94",
                "3d1d444a201aabebf3d56def6370dbd0",
                "815fec415d20479a954ea71cd0abc159",
                5);
        /**
         * sn devise serial number；
         * devUsername Device login user name;
         * devPassword Device login password
         */
        JLinkDevice jDevice = new JLinkDevice(jClient, "b11ffe8d6b812473", "admin", "1qaz2wsx");

        DeviceStatusData deviceStatusData = jDevice.deviceStatus();

        System.out.println(new Gson().toJson(deviceStatusData));
    }
}
