package jlink.restful.java.sdk.module.devicetoken;

/**
 * DeviceToken Data
 *
 * @author hjm
 * @date 2022/04/21
 */
public class DeviceTokenData {
    /**
     * devise serial number
     */
    private String sn;
    /**
     * Device Token
     */
    private String token;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
