package jlink.restful.java.sdk.exception;

/**
 * jlink设 SetConfigException
 *
 * @author hjm
 * @date 2022/04/20
 */
public class JLinkDeviceSetConfigException extends JLinkException {
    public JLinkDeviceSetConfigException(Integer code, String msg) {
        super(code, msg);
    }
}
