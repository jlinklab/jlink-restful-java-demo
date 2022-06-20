package jlink.restful.java.sdk.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * logManagement
 */
public class JLinkLog {

    private static final int LEVEL_DEBUG = 3;
    private static final int LEVEL_INFO = 2;
    private static final int LEVEL_ERROR = 1;

    private static int myLogLevel = LEVEL_INFO;

    /**
     * Time format when outputting debug information
     */
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    /**
     * DEBUG Output
     *
     * @param x debug Output Information
     */
    public static void d(String x) {
        if (needOutput(LEVEL_DEBUG)) {
            String log = "[" + sdf.format(new Date()) + "][DEBUG] " + x;
            System.out.println(log);
        }
    }

    /**
     * ERROR output
     *
     * @param x error Output Information
     */
    public static void e(String x) {
        if (needOutput(LEVEL_ERROR)) {
            String log = "[" + sdf.format(new Date()) + "][ERROR] " + x;
            System.out.println(log);
        }
    }

    /**
     * INFO output
     *
     * @param x info Output Information
     */
    public static void i(String x) {
        if (needOutput(LEVEL_INFO)) {
            String log = "[" + sdf.format(new Date()) + "][INFO] " + x;
            System.out.println(log);
        }
    }

    private static boolean needOutput(int level) {
        return (myLogLevel >= level);
    }

    public static void setLogLevel(int level) {
        myLogLevel = level;
    }
}
