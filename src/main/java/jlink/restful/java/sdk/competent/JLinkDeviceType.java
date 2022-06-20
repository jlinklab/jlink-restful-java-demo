package jlink.restful.java.sdk.competent;

/**
 * jlink Device Type
 *
 * @author hjm
 * @date 2022/04/20
 */
public enum JLinkDeviceType {
    IPC("IPC"),
    NVR("NVR"),
    DVR("DVR");

    private String mDeviceType;

    JLinkDeviceType(String deviceType) {
        this.mDeviceType = deviceType;
    }

    public String get() {
        return mDeviceType;
    }
}
