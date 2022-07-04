package jlink.restful.java.sdk.module.opdev.oplogmanager;

/**
 * Log manager enum
 * @author luojx
 * @date 2022/6/21 14:38
 */
public enum OPLogManagerEnum {
    /**
     * clear
     */
    RemoveAll("RemoveAll"),
    /**
     * start
     */
    LogOn("LogOn"),
    /**
     * stop
     */
    LogOff("LogOff");

    private String action;

    OPLogManagerEnum(String action) {
        this.action = action;
    }

    public static OPLogManagerEnum get(String action){
        for (OPLogManagerEnum value : OPLogManagerEnum.values()) {
            if(action.equals(value.name())){
                return value;
            }
        }
        return RemoveAll;
    }
    public String getAction() {
        return action;
    }

}
