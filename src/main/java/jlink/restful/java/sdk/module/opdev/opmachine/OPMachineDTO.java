package jlink.restful.java.sdk.module.opdev.opmachine;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * restart/closing  dto
 *
 * @author luojx
 * @date 2022/6/15 9:45
 */
public class OPMachineDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return null;
    }

    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();
    @SerializedName("OPMachine")
    private OPMachine opMachine;

    public static class OPMachine{
        @SerializedName("Action")
        private String action = OPMachineActionEnum.ReBoot.getAction();
    }

}
