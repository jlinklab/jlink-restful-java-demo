package jlink.restful.java.sdk.competent;

/**
 * RESTFul API Device ReturnCode
 */
public enum JLinkDeviceResponseCode {
    SUCCESS(100, "SUCCESS"),
    UNKNOWN_ERROR(101, "Unknown error (probable cause: device does not support RESTFul API, etc.)"),
    VERSION_NOT_SUPPORTED(102, "Version not supported"),
    ILLEGAL_REQUEST(103, "illegal request"),
    USER_LOGGED_IN(104, "The user is already logged in"),
    USER_NOT_LOGGED_IN(105, "The user is not logged in"),
    USERNAME_OR_PASSWORD_WRONG(106, "username or password is incorrect"),
    NO_PERMISSION(107, "No permission"),
    TIMEOUT(108, "time out"),
    FIND_FAILED(109, "Search failed, no corresponding file found"),
    FIND_SUCCESS(110, "Find success, return all files"),
    FIND_SUCCESS2(111, "Find success, return some files"),
    USER_EXISTS(112, "The user already exists"),
    USER_NOT_EXISTS(113, "this user does not exist"),
    GROUP_EXISTS(114, "The user group already exists"),
    GROUP_NOT_EXISTS(115, "The user group does not exist"),
    PIRATED_SOFTWARE(116, "Pirated software"),
    MALFORMED_MESSAGE(117, "malformed message"),
    PTZ_PROTOCOL_NOT_SET(118, "PTZ protocol not set"),
    FILE_NOT_FOUND(119, "file not found"),
    CONFIGURED_TO_ENABLE(120, "configured to enable"),
    DIGITAL_CHANNEL_NOT_CONNECTED(121, "Digital channel not connected"),
    NAT_VIDEO_LINKS_MAXED_OUT(122, "Nat video links maxed out, no new Nat video links allowed"),
    TCP_VIDEO_LINKS_MAXED_OUT(123, "Tcp video link maxed out, no new Tcp video links allowed"),
    INCORRECT_ENCRYPTION_ALGORITHM_FOR_USERNAME_AND_PASSWORD(124, "Incorrect encryption algorithm for username and password"),
    ADMIN_NOT_ALLOWED(125, "Created other users, can no longer log in with admin"),
    AES_ENCRYPTED_DATA_FORMAT_ERROR(126, "AES encrypted data format error"),
    CLOSED_VIDEO(127, "The user has turned off the video recording and preview functions through functions such as one-click masking"),
    NAS_ADDRESS_EXISTS(130, "NAS address already exists"),
    PATH_USED(131, "The path is in use and cannot be operated"),
    NAS_REACHED_MAX(132, "The NAS has reached the maximum supported value, and further additions are not allowed"),
    CONSUMER_PRODUCTS_BUTTON_ERROR(140, "Consumer product remote control is bound to the wrong key"),
    SUCCESS_NEED_REBOOT(150, "Success, the device needs to be restarted"),
    VIDEO_BACKUP_FAILED(160, "Video backup failed"),
    NO_RECORDING_EQUIPMENT(161, "There is no recording device or the device is not recording"),
    DEVICE_ADDING(162, "Device is being added"),
    NOT_LOGIN_YET(202, "Doing some operations without logging in, please log in first"),
    PASSWORD_NOT_VALID(203, "wrong login password"),
    USER_NOT_VALID(206, "Username is invalid"),
    HAS_BEEN_LOCKED(206, "If the user name or password is wrong 6 times, it will be locked, wait for 30 minutes or restart"),
    IN_BLACKLIST(207, "User is blacklisted and not allowed to log in"),
    HAS_BEEN_USED(208, "When adding a new user, the user name is the same"),
    ILLEGAL_COMMAND(502, "illegal command"),
    INTERCOM_IS_ON(503, "Intercom is on"),
    INTERCOM_IS_OFF(504, "Intercom is not on"),
    UPGRADE_HAS_STARTED(511, "Upgrade has started"),
    UPGRADE_NOT_STARTED(512, "Upgrade not started"),
    UPGRADE_DATA_ERROR(513, "upgrade data error"),
    UPGRADE_FAILED(514, "upgrade unsuccessful"),
    UPDATE_SUCCESS(515, "update successed"),
    DEVICE_BUSY(516, "The device is busy or the cloud upgrade server is busy"),
    NOT_ALLOWED_STOP_OTHER_CONNECT(517, "The upgrade was started by another connection and cannot be stopped"),
    FRONTEND_EQUIPMENT_IS_THE_LATEST_VERSION(518, "Front-end device is already the latest version"),
    UPGRADE_FILES_NOT_MATCH(519, "Upgrade files do not match"),
    FRONTEND_DEVICE_OFFLINE(520, "Front-end device is offline"),
    FAILED_RESTORE_DEFAULT(521, "Failed to restore default"),
    NEED_REBOOT(522, "Need to restart the device"),
    ILLEGAL_DEFAULT_CONFIGURATION(523, "Illegal default configuration"),
    NEED_RESTART_APPLICATION(602, "Need to restart the application"),
    REBOOT_SYSTEM(603, "reboot the system"),
    WRITING_FILE_ERROR(604, "error writing file"),
    FEATURE_NOT_SUPPORTED(605, "Feature not supported"),
    VERIFICATION_FAILED(606, "verification failed"),
    CONFIGURATION_PARSING_ERROR(607, "Configuration parsing error"),
    CONFIGURATION_NOT_EXIST(609, "Configuration does not exist");

    private int code;
    private String msg;

    JLinkDeviceResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static JLinkDeviceResponseCode get(int ret) {
        for (JLinkDeviceResponseCode value : values()) {
            if (ret == value.getCode()) {
                return value;
            }
        }
        return UNKNOWN_ERROR;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
