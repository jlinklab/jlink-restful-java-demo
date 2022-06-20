package jlink.restful.java.sdk.competent;

/**
 * RESTFul API Enum
 */
public enum JLinkDeviceRequestUrl {
    /**
     * capture
     */
    DEVICE_CAPTURE("v2/rtc/device/capture"),
    /**
     * getability
     */
    DEVICE_GETABILITY("v2/rtc/device/getability"),
    /**
     * getconfig
     */
    DEVICE_GETCONFIG("v2/rtc/device/getconfig"),
    /**
     * getinfo
     */
    DEVICE_INFO("v2/rtc/device/getinfo"),
    /**
     * RESTFul API keepalive
     */
    DEVICE_KEEPALIVE("v2/rtc/device/keepalive"),
    /**
     * livestream
     */
    DEVICE_LIVESTREAM("v2/rtc/device/livestream"),
    /**
     * login
     */
    DEVICE_LOGIN("v2/rtc/device/login"),
    /**
     * opdev
     */
    DEVICE_OPDEV("v2/rtc/device/opdev"),
    /**
     * playbackUrl
     */
    DEVICE_PLAYBACKSTREAM("v2/rtc/device/playbackUrl"),
    /**
     * setconfig
     */
    DEVICE_SETCONFIG("v2/rtc/device/setconfig"),
    /**
     * status
     */
    DEVICE_STATUS("v2/rtc/device/status"),
    /**
     * deviceToken
     */
    DEVICE_TOKEN("v2/device/token"),
    /**
     * user manage
     */
    DEVICE_USERMANAGE("v2/rtc/device/usermanage"),
    /**
     * wakeup
     */
    DEVICE_WAKEUP("v2/rtc/device/wakeup"),
    /**
     * subscribeMessage
     */
    SUBSCRIBE_MESSAGE("v2/rtc/device/subscribeMessage"),
    /**
     * unsubscribeMessage
     */
    UNSUBSCRIBE_MESSAGE("v2/rtc/device/unsubscribeMessage");


    private final String requestUrl;

    JLinkDeviceRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String get() {
        return requestUrl;
    }
}
