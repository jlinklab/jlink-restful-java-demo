package jlink.restful.java.sdk.module.opdev.opsystemconfig;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

import java.util.List;

/**
 * configureExport dto
 *
 * @author luojx
 * @date 2022/6/15 10:28
 */
public class OPSystemConfigExportDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPSystemConfig;
    }
    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();
    @SerializedName("OPSystemConfig")
    private OPSystemConfig opSystemConfig;

    public DeviceOperateEnum getName() {
        return name;
    }

    public OPSystemConfig getOpSystemConfig() {
        return opSystemConfig;
    }

    public void setOpSystemConfig(OPSystemConfig opSystemConfig) {
        this.opSystemConfig = opSystemConfig;
    }

    public static class OPSystemConfig{
        /**
         * commandCode
         */
        @SerializedName("Action")
        private String action;
        @SerializedName("Parameter")
        private List<ParameterDTO> parameterDTOS;

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public List<ParameterDTO> getParameterDTOS() {
            return parameterDTOS;
        }

        public void setParameterDTOS(List<ParameterDTO> parameterDTOS) {
            this.parameterDTOS = parameterDTOS;
        }

        public static class ParameterDTO{
            /**
             * type
             */
            @SerializedName("Type")
            private String type;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
