package jlink.restful.java.sdk.module.playback;


/**
 * Device playback enumeration
 *
 * @author hjm
 * @date 2022/04/28
 */
public enum DevicePlaybackEnum {
    STREAM_MAIN(0),
    STREAM_EXTRA(1),
    ;

    private int streamParam;

    DevicePlaybackEnum(int streamParam) {
        this.streamParam = streamParam;
    }

    public static DevicePlaybackEnum get(int streamParam) {
        for (DevicePlaybackEnum value : values()) {
            if (streamParam == value.get()) {
                return value;
            }
        }
        return STREAM_MAIN;
    }

    public int get() {
        return streamParam;
    }
}
