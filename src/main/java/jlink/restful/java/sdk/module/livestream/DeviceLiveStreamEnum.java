package jlink.restful.java.sdk.module.livestream;

/**
 * Device LiveStream Enum
 *
 * @author hjm
 * @date 2022/04/21
 */
public enum DeviceLiveStreamEnum {
    MEDIATYPE_HLS("hls"),
    MEDIATYPE_RTSP("rtsp"),
    MEDIATYPE_RTSP_PRI("rtsp-pri"),
    MEDIATYPE_FLV("flv"),
    STREAM_MAIN("0"),
    STREAM_EXTRA("1"),
    PROTOCOL_TS("ts"),
    PROTOCOL_FMP4("fmp4"),
    ;

    private String streamParam;

    DeviceLiveStreamEnum(String streamParam) {
        this.streamParam = streamParam;
    }

    public static DeviceLiveStreamEnum get(String streamParam) {
        for (DeviceLiveStreamEnum value : values()) {
            if (streamParam.equals(value.get())) {
                return value;
            }
        }
        return MEDIATYPE_HLS;
    }

    public String get() {
        return streamParam;
    }
}
