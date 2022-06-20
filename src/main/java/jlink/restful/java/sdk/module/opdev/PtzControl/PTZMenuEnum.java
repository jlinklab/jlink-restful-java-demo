package jlink.restful.java.sdk.module.opdev.PtzControl;


/**
 * ballMachineMenu
 *
 * @author hjm
 * @date 2022/06/10
 */
public enum PTZMenuEnum {
    /**
     * input
     */
    Enter,
    /**
     * exit
     */
    Leave,
    /**
     * confirm
     */
    Ok,
    /**
     * cancel
     */
    Cancel,
    /**
     * upward
     */
    Up,
    /**
     * down
     */
    Down,
    /**
     * onLeft
     */
    Left,
    /**
     * Right
     */
    Right;


    public static PTZMenuEnum get(String ptz) {
        for (PTZMenuEnum value : values()) {
            if (ptz.equals(value.name())) {
                return value;
            }
        }
        return Enter;
    }

}
