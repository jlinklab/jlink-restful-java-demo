package jlink.restful.java.sdk.module.opdev.oplogmanager;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 *
 * Log manager
 * 
 * @author luojx
 * @date 2022/6/21 14:37
 */
public class OPLogManagerDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPLogManager;
    }
    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();
    @SerializedName("OPLogManager")
    private OPLogManager opLogManager;

    public DeviceOperateEnum getName() {
        return name;
    }

    public OPLogManager getOpLogManager() {
        return opLogManager;
    }

    public void setOpLogManager(OPLogManager opLogManager) {
        this.opLogManager = opLogManager;
    }

    public static class OPLogManager{
        @SerializedName("Action")
        private String action = OPLogManagerEnum.LogOn.getAction();

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }
    }
}
