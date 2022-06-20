package jlink.restful.java.sdk.exception;

/**
 * jlink GetConfigException
 *
 * @author hjm
 * @date 2022/04/20
 */
public class JLinkDeviceGetConfigException extends JLinkException {
    public JLinkDeviceGetConfigException(Integer code, String msg) {
        super(code, msg);
    }
}
