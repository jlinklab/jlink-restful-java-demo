package jlink.restful.java.sdk.module.opdev.opmachine;

/**
 * @author luojx
 * @date 2022/6/15 9:48
 */
public enum OPMachineActionEnum {
    ReBoot("Reboot"),
    Shutdown("Shutdown");

    public String action;

    OPMachineActionEnum(String action) {
        this.action = action;
    }

    public static OPMachineActionEnum get(String action){
        for (OPMachineActionEnum value : OPMachineActionEnum.values()) {
            if(action.equals(value.name())){
                return value;
            }
        }
        return ReBoot;
    }

    public String getAction() {
        return action;
    }
}
