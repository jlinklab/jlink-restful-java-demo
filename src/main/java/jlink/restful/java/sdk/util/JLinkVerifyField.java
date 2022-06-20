package jlink.restful.java.sdk.util;

public class JLinkVerifyField {

    public static boolean verifyStr(String str) {
        return null != str && str.length() != 0;
    }

    public static boolean verifyInt(Integer intData) {
        return null != intData;
    }

    public static boolean verifyBol(Boolean bol) {
        return null != bol;
    }
}
