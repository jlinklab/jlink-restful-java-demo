package jlink.restful.java.sdk.competent;

/**
 * RESTFul API Request ReturnCode
 */
public enum JLinkResponseCode {
    SUCCESS(2000, "Success"),
    SUCCESS_LOGIN_TOKEN(2001, "Device Login By LoginToken"),
    PARAM_ERROR(4000, "Param Error"),
    ILLEGAL_REQUEST(4100, "Illegal Request，Device Not Logged Or Logged Invalid"),
    DEVICE_OFFLINE(4101, "Device Offline"),
    CAPTURE_FAIL(4102, "Capture Error"),
    WAKEUP_FAIL(4103, "Wakeup Failed"),
    GET_LIVESTREAM_TIMEOUT(4104, "Get Livestream Timeout"),
    GWM_SERVICE_ERROR(4105, "GWM Service Error"),
    VOES_OP_ERROR(4106, "Voes Option Error"),
    SUBSCRIBE_ALARM_FAIL(4107, "Subscribe Alarm Fail"),
    MESSAGE_ALARM_FAIL(4108, "Message Alarm Fail"),
    VOICE_ALARM_FAIL(4109, "Voice Alarm Fail"),
    NET_DAT_NOT_SUPPORT(4110, "Net Dat Not Support"),
    NET_DAT_NOT_ENABLE(4111, "Net Dat Not Enable"),
    NET_DAT_EXPIRED(4112, "Net Dat Expired"),
    NET_DAT_ERROR(4113, "Net Dat Error"),
    NET_DAT_LIMIT(4117, "Net Dat Limit"),
    JSON_ERROR(4500, "JSON Parse Error"),
    DEVICE_TOKEN_ERROR(4501, "Please Refresh DeviceToken"),
    SERVICE_ERROR(5000, "Service Error"),
    SIGN_ERROR(5001, "Sign Error"),
    RESTFUL_NULL(5010, "RESTFul Null"),
    RESTFUL_HTTP_ERROR(5011, "RESTFul Http Error"),
    AES_ERROR(5012, "AES Error");

    private int code;
    private String msg;

    public static JLinkResponseCode get(int code) {
        for (JLinkResponseCode value : values()) {
            if (code == value.getCode()) {
                return value;
            }
        }
        return SERVICE_ERROR;
    }

    JLinkResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
