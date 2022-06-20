package jlink.restful.java.sdk.module.opdev.PtzControl;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;


/**
 * 球机菜单dto
 *
 * @author hjm
 * @date 2022/06/10
 */
public class PtzMenuControlDTO implements DeviceOperate {
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
        private final PTZControlEnum command = PTZControlEnum.Menu;
        @SerializedName("Parameter")
        private ParameterDTO parameter = new ParameterDTO();

        public static class ParameterDTO {
            /**
             * menu selection
             */
            @SerializedName("MenuOpts")
            private PTZMenuEnum menuOpts = PTZMenuEnum.Enter;
            /**
             * channel
             */
            @SerializedName("Channel")
            private int channel = 0;

            public PTZMenuEnum getMenuOpts() {
                return menuOpts;
            }

            public void setMenuOpts(PTZMenuEnum menuOpts) {
                this.menuOpts = menuOpts;
            }

            public int getChannel() {
                return channel;
            }

            public void setChannel(int channel) {
                this.channel = channel;
            }
        }

        public PTZControlEnum getCommand() {
            return command;
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