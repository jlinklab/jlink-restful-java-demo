package jlink.restful.java.sdk.module.opdev.opfilequery;

/**
 * QueryFileTypeEvents
 *
 * @author hjm
 * @date 2022/04/21
 */
public enum OPFileEventEnum {
    //callPolice
    A("A"),
    //dynamicTesting
    M("M"),
    //ordinary
    R("R"),
    //manual
    H("H"),
    //allTypesOf
    ALL("*");

    public String mEvent;

    OPFileEventEnum(String mEvent) {
        this.mEvent = mEvent;
    }

    public static OPFileEventEnum get(String mEvent) {
        for (OPFileEventEnum value : values()) {
            if (mEvent.equals(value.name())) {
                return value;
            }
        }
        return ALL;
    }

    public String getEvent() {
        return mEvent;
    }
}
