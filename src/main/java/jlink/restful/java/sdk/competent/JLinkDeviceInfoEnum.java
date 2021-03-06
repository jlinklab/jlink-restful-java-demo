package jlink.restful.java.sdk.competent;

/**
 * jlink DeviceInformation Enum
 *
 * @author hjm
 * @date 2022/04/21
 */
public enum JLinkDeviceInfoEnum {
    //systemInformation
    SystemInfo,
    StorageInfo
    ;

    public static JLinkDeviceInfoEnum get(String mInfo) {
        for (JLinkDeviceInfoEnum value : values()) {
            if (mInfo.equals(value.name())) {
                return value;
            }
        }
        return SystemInfo;
    }
}
