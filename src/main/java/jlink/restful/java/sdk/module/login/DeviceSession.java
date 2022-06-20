package jlink.restful.java.sdk.module.login;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * jlink DeviceSession
 *
 * @author hjm
 * @date 2022/04/20
 */
public class DeviceSession {
    /**
     * login
     */
    private AtomicBoolean login = new AtomicBoolean(false);
    /**
     * deviceToken
     */
    private String deviceToken;

    public boolean isLogin() {
        return login.get();
    }

    public void setLogin(boolean flag) {
        this.login.set(flag);
    }

    public AtomicBoolean getLogin() {
        return login;
    }

    public void setLogin(AtomicBoolean login) {
        this.login = login;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }
}
