package jlink.restful.java.sdk.exception;

/**
 * jlink LoginException
 *
 * @author hjm
 * @date 2022/04/20
 */
public class JLinkDeviceLoginException extends JLinkException {
    public JLinkDeviceLoginException(Integer code, String msg) {
        super(code, msg);
    }
}
