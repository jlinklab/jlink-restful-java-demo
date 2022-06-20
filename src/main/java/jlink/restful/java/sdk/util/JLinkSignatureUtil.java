package jlink.restful.java.sdk.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;

public class JLinkSignatureUtil {
    /**
     * Get the signature string
     *
     * @param uuid       customers A Unique Identifier
     * @param appKey     application key
     * @param appSecret  application Secret
     * @param timeMillis timeStamp
     * @param movedCard  mobile BaseOf Modulus
     * @return
     * @throws Exception
     */
    public static String getEncryptStr(String uuid, String appKey, String appSecret, String timeMillis, int movedCard) throws Exception {
        String encryptStr = uuid + appKey + appSecret + timeMillis;
        byte[] encryptByte = encryptStr.getBytes("iso-8859-1");
        byte[] changeByte = change(encryptStr, movedCard);
        byte[] mergeByte = mergeByte(encryptByte, changeByte);
        return DigestUtils.md5Hex(mergeByte);
    }

    /**
     * aSimpleShift
     */
    private static byte[] change(String encryptStr, int moveCard) throws UnsupportedEncodingException {
        byte[] encryptByte = encryptStr.getBytes("iso-8859-1");
        int encryptLength = encryptByte.length;
        byte temp;
        for (int i = 0; i < encryptLength; i++) {
            temp = ((i % moveCard) > ((encryptLength - i) % moveCard)) ? encryptByte[i] : encryptByte[encryptLength - (i + 1)];
            encryptByte[i] = encryptByte[encryptLength - (i + 1)];
            encryptByte[encryptLength - (i + 1)] = temp;
        }
        return encryptByte;
    }

    /**
     * merge
     *
     * @param encryptByte
     * @param changeByte
     * @return
     */
    private static byte[] mergeByte(byte[] encryptByte, byte[] changeByte) {
        int encryptLength = encryptByte.length;
        int encryptLength2 = encryptLength * 2;
        byte[] temp = new byte[encryptLength2];
        for (int i = 0; i < encryptByte.length; i++) {
            temp[i] = encryptByte[i];
            temp[encryptLength2 - 1 - i] = changeByte[i];
        }
        return temp;
    }
}
