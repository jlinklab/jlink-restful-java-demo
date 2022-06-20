package jlink.restful.java.sdk.util;

public class JLinkTimeMillisUtil {
    private static long timMillis;//时间戳
    private static long counter = 0l;//计数器

    /**
     * accessToCounter
     *
     * @return
     */
    private static synchronized String getCounter() {
        ++counter;
        if (counter < 10L)
            return "000000" + String.valueOf(counter);
        else if (counter < 100L)
            return "00000" + String.valueOf(counter);
        else if (counter < 1000L)
            return "0000" + String.valueOf(counter);
        else if (counter < 10000L)
            return "000" + String.valueOf(counter);
        else if (counter < 100000L)
            return "00" + String.valueOf(counter);
        else if (counter < 1000000L)
            return "0" + String.valueOf(counter);
        else if (counter < 10000000L)
            return String.valueOf(counter);
        else {
            counter = 1L;
            return "000000" + String.valueOf(counter);
        }
    }

    /**
     * Get the combined timestamp
     *
     * @return
     */
    public static String getTimMillis() {
        timMillis = System.currentTimeMillis();
        return getCounter() + String.valueOf(timMillis);
    }
}
