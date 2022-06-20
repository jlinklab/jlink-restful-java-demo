package jlink.restful.java.sdk.module.opdev.PtzControl;

/**
 * jlink ptzcontrol enumeration
 *
 * @author hjm
 * @date 2022/04/21
 */
public enum PTZControlEnum {
    /**
     * inDirection
     */
    DirectionUp,
    /**
     * underDirectionOf
     */
    DirectionDown,
    /**
     * directionOfLeft
     */
    DirectionLeft,
    /**
     * rightDirection
     */
    DirectionRight,
    /**
     * directionOfUpperLeft
     */
    DirectionLeftUp,
    /**
     * directionOfLowerLeft
     */
    DirectionLeftDown,
    /**
     * upperRightOfDirection
     */
    DirectionRightUp,
    /**
     * directionOfLowerRight
     */
    DirectionRightDown,
    /**
     * SetPreset
     */
    SetPreset,
    /**
     * ClearPreset
     */
    ClearPreset,
    /**
     * GotoPreset
     */
    GotoPreset,
    /**
     * SetPresetName
     */
    SetPresetName,
    /**
     * PositionReset
     */
    PositionReset,

    /**
     * FocusFar
     */
    FocusFar,
    /**
     * FocusNear
     */
    FocusNear,
    /**
     * IrisSmall
     */
    IrisSmall,
    /**
     * IrisLarge
     */
    IrisLarge,
    /**
     * Menu
     */
    Menu,
    ;


    public static PTZControlEnum get(String ptz) {
        for (PTZControlEnum value : values()) {
            if (ptz.equals(value.name())) {
                return value;
            }
        }
        return DirectionUp;
    }

}
