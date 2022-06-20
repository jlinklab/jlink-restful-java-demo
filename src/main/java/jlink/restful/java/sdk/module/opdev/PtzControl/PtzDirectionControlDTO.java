package jlink.restful.java.sdk.module.opdev.PtzControl;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * PTZ direction control dto
 *
 * @author hjm
 * @date 2022/04/26
 */
public class PtzDirectionControlDTO implements DeviceOperate {
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
        private PTZControlEnum command = PTZControlEnum.DirectionLeft;
        @SerializedName("Parameter")
        private ParameterDTO parameter = new ParameterDTO();

        public static class ParameterDTO {
            /**
             * Default value means start, pause
             */
            @SerializedName("Preset")
            private int preset = 65535;
            /**
             * 通道
             */
            @SerializedName("Channel")
            private int channel = 0;
            /**
             * speed
             */
            @SerializedName("Step")
            private int step = 8;

            public int getPreset() {
                return preset;
            }

            public void setPreset(int preset) {
                this.preset = preset;
            }

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