package jlink.restful.java.sdk.module.usermanage.user;

/**
 * @author luojx
 * @date 2022/6/15 14:54
 */
public enum EncryptTypeEnum {
    /**
     * Private MD5 encryption
     */
    MD5("MD5"),
    /**
     * Universal 32-bit MD5 encryption
     */
    MD5_32("MD5_32"),
    /**
     * plaintext password
     */
    NONE("NONE");

    private String encryptType;

    EncryptTypeEnum(String encryptType) {
        this.encryptType = encryptType;
    }


    public String getEncryptType() {
        return encryptType;
    }

    public void setEncryptType(String encryptType) {
        this.encryptType = encryptType;
    }
}
