package jlink.restful.java.sdk.module.opdev.PtzControl;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;


/**
 * 云台变倍聚焦控制dto
 *
 * @author hjm
 * @date 2022/06/10
 */
public class PtzFocusIrisControlDTO implements DeviceOperate {
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
        private PTZControlEnum command = PTZControlEnum.FocusFar;
        @SerializedName("Parameter")
        private ParameterDTO parameter = new ParameterDTO();

        public static class ParameterDTO {
            /**
             * channel
             */
            @SerializedName("Channel")
            private int channel = 0;
            @SerializedName("Step")
            private int step = 1;

            public int getChannel() {
                return channel;
            }

            public void setChannel(int channel) {
                this.channel = channel;
            }

            public int getStep() {
                return step;
            }

            public void setStep(int step) {
                this.step = step;
            }
        }

        public PTZControlEnum getCommand() {
            return command;
        }

        public void setCommand(PTZControlEnum command) {
            this.command = command;
        }

        public ParameterDTO getParameter() {
            return parameter;
        }

        public void setParameter(ParameterDTO parameter) {
            this.parameter = parameter;
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