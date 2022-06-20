package jlink.restful.java.demo;

import com.google.gson.Gson;
import jlink.restful.java.sdk.JLinkClient;
import jlink.restful.java.sdk.JLinkDevice;
import jlink.restful.java.sdk.module.login.DeviceLoginData;
import jlink.restful.java.sdk.module.opdev.opreqversion.OPReqVersionDTO;
import jlink.restful.java.sdk.module.opdev.opreqversion.OPReqVersionResponse;
import jlink.restful.java.sdk.module.opdev.opversionlist.OPVersionListQueryDTO;
import jlink.restful.java.sdk.module.opdev.opversionlist.OPVersionListResponse;
import jlink.restful.java.sdk.util.JLinkLog;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class JLinkFirmwareUpgradeDemo {


    private static boolean demoDeviceFirmwareUpgrade(JLinkDevice jDevice, String sn) {
        try {
            // Upgrade detection
            OPVersionListResponse response = (OPVersionListResponse) jDevice.deviceOperate(new OPVersionListQueryDTO());
            if (response.getRet() == 100) {
                List<OPVersionListResponse.OPVersionListDTO> list = response.getOPVersionList();
                if (null != list && list.size() > 0) {
                    OPVersionListResponse.OPVersionListDTO dto = list.get(0);
                    if (StringUtils.isNotBlank(dto.getVersionName())) {
                        // If there is a new version, send the upgrade command
                        JLinkLog.i("VersionDate:" + dto.getVersionDate() + ",VersionName:" + dto.getVersionName());
                        OPReqVersionDTO upgradeDto = new OPReqVersionDTO();
                        upgradeDto.getOpReqVersion().setLength(dto.getLength());
                        upgradeDto.getOpReqVersion().setVersionName(dto.getVersionName());
                        upgradeDto.getOpReqVersion().setVersionDate(dto.getVersionDate());
                        OPReqVersionResponse versionResponse = (OPReqVersionResponse) jDevice.deviceOperate(upgradeDto);
                        JLinkLog.i("Upgrade Res:" + new Gson().toJson(versionResponse));
                        if (versionResponse.getRet() == 100) {
                            Thread.sleep(30000);
                            return true;
                        }
                    } else {
                        JLinkLog.i(sn + ":No New Version");
                    }
                }
            } else {
                JLinkLog.i(sn + ":Get OPVersionList Error:" + new Gson().toJson(response));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {

        /**
         * uuid/appKey/appSecret/moveCard Apply for an application through the open platform (https://open.jftech.com) console, and obtain it after successful review
         */
        JLinkClient jClient = new JLinkClient(
                "e0534f3240274897821a126be19b6d46",
                "0621ef206a1d4cafbe0c5545c3882ea8",
                "90f8bc17be2a425db6068c749dee4f5d",
                2);

        //Array to be upgraded
        String[] sns = {};

        for (String sn : sns) {
            JLinkDevice jDevice = new JLinkDevice(jClient, sn, "admin", "");
            jDevice.deviceStatus();
            try {
                DeviceLoginData loginData = jDevice.login();
                if (loginData.getRet() == 100) {
                    boolean flag = demoDeviceFirmwareUpgrade(jDevice, sn);
                    if (flag) {
                        JLinkLog.i(sn + ":Upgrade Success");
                    }
                } else {
                    JLinkLog.e(sn + ":Login Error" + new Gson().toJson(loginData));
                }

            } catch (Exception e) {
                JLinkLog.e(sn + ":" + e);
            }

        }
    }
}
