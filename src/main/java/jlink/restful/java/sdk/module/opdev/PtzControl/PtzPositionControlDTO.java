package jlink.restful.java.sdk.module.opdev.PtzControl;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * PTZ position control dto
 *
 * @author hjm
 * @date 2022/04/26
 */
public class PtzPositionControlDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPPTZControl;
    }

    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();
    @SerializedName("OPPTZControl")
    private OPPTZControl opptzControl = new OPPTZControl();

    public static class OPPTZControl {
        @SerializedName("Command")
        private PTZControlEnum command = PTZControlEnum.PositionReset;

        public PTZControlEnum getCommand() {
            return command;
        }
    }


    public DeviceOperateEnum getName() {
        return name;
    }

    public OPPTZControl getOpptzControl() {
        return opptzControl;
    }

    public void setOpptzControl(OPPTZControl opptzControl) {
        this.opptzControl = opptzControl;
    }
}