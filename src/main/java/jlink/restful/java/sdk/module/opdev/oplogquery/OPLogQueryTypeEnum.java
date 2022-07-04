package jlink.restful.java.sdk.module.opdev.oplogquery;


/**
 * LogQuery enum
 *
 * @author luojx
 * @date 2022/6/15 19:43
 */
public enum OPLogQueryTypeEnum {
    LogAll("LogAll"),
    LogSystem("LogSystem"),
    LogConfig("LogConfig"),
    LogStorage("LogStorage"),
    LogAlarm("LogAlarm"),
    LogRecord("LogRecord"),
    LogAccount("LogAccount"),
    LogFile("LogFile");

    public String getLogType() {
        return logType;
    }

    private String logType;

    OPLogQueryTypeEnum(String logType) {
        this.logType = logType;
    }

    public static OPLogQueryTypeEnum get(String logType) {
        for (OPLogQueryTypeEnum value : OPLogQueryTypeEnum.values()) {
            if (logType.equals(value.name())) {
                return value;
            }
        }
        return LogAll;
    }

}
