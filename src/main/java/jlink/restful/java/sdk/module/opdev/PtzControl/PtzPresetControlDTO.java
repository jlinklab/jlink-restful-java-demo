package jlink.restful.java.sdk.module.opdev.PtzControl;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * PTZ preset point control dto
 *
 * @author hjm
 * @date 2022/04/26
 */
public class PtzPresetControlDTO implements DeviceOperate {
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
        private PTZControlEnum command = PTZControlEnum.SetPreset;
        @SerializedName("Parameter")
        private ParameterDTO parameter = new ParameterDTO();

        public static class ParameterDTO {
            /**
             * Default value means start, pause
             */
            @SerializedName("Preset")
            private int preset = 65535;
            /**
             * channel
             */
            @SerializedName("Channel")
            private int channel = 0;
            /**
             * speed
             */
            @SerializedName("PresetName")
            private String presetName = "1";

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

            public String getPresetName() {
                return presetName;
            }

            public void setPresetName(String presetName) {
                this.presetName = presetName;
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