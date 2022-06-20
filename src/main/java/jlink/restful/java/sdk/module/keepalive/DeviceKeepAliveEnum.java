package jlink.restful.java.sdk.module.keepalive;

/**
 * jlink KeepAliveEnum
 *
 * @author hjm
 * @date 2022/04/21
 */
public enum DeviceKeepAliveEnum {
    KEEPALIVE("KeepAlive"),
    ;

    private String keepalive;

    DeviceKeepAliveEnum(String keepalive) {
        this.keepalive = keepalive;
    }

    public String get() {
        return keepalive;
    }
}
