package jlink.restful.java.sdk.util;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLDecoder;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class JLinkAesUtil {
    static final String algorithmStr = "AES/ECB/PKCS5Padding";
    static final String encode = "utf-8";

    public JLinkAesUtil() {
    }

    public byte[] encrypt(byte[] content, byte[] keyBytes) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        Key key = this.getKey(keyGen, keyBytes);
        cipher.init(1, key);
        byte[] encryptedText = cipher.doFinal(content);
        return encryptedText;
    }

    public byte[] decryptToBytes(byte[] content, byte[] keyBytes) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        Key key = this.getKey(keyGen, keyBytes);
        cipher.init(2, key);
        byte[] originBytes = cipher.doFinal(content);
        return originBytes;
    }

    private Key getKey(KeyGenerator keyGen, byte[] keyBytes) throws NoSuchAlgorithmException {
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        secureRandom.setSeed(keyBytes);
        keyGen.init(128, secureRandom);
        return new SecretKeySpec(keyBytes, "AES");
    }

    public String byteToHexString(byte[] bytes) throws Exception {
        StringBuffer sb = new StringBuffer(bytes.length);

        for (int i = 0; i < bytes.length; ++i) {
            String sTemp = Integer.toHexString(255 & bytes[i]);
            if (sTemp.length() < 2) {
                sb.append(0);
            }

            sb.append(sTemp.toUpperCase());
        }

        return sb.toString();
    }

    public byte[] hexStringToByte(String hex) {
        int len = hex.length() / 2;
        byte[] result = new byte[len];
        char[] achar = hex.toCharArray();

        for (int i = 0; i < len; ++i) {
            int pos = i * 2;
            result[i] = (byte) (toByte(achar[pos]) << 4 | toByte(achar[pos + 1]));
        }

        return result;
    }

    private static byte toByte(char c) {
        byte b = (byte) "0123456789ABCDEF".indexOf(c);
        return b;
    }

    public String decryptToHexString(String str, String key) throws Exception {
        return URLDecoder.decode(new String(this.decryptToBytes(this.hexStringToByte(str), key.getBytes("utf-8")), "utf-8"));
    }

    public String encryptToHexString(String str, String key) throws Exception {
        return this.byteToHexString(this.encrypt(str.getBytes("utf-8"), key.getBytes("utf-8")));
    }

    private String keyFilter(String key) {
        int length = key.length();
        if (length > 16) {
            key = key.substring(0, 16);
        } else {
            for (int i = 0; i < 16 - length; ++i) {
                key = key + i;
            }
        }

        return key;
    }

    public String keyFilter(String timeMillis, String appSecret) {
        StringBuffer key = new StringBuffer();
        int timeLength = timeMillis.length();
        if (timeLength / 2 > 0) {
            key.append(timeMillis.substring(timeLength / 2));
        }

        key.append(appSecret);
        return this.keyFilter(key.toString());
    }
}

