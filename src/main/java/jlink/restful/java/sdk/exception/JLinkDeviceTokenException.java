package jlink.restful.java.sdk.exception;

/**
 * jlink deviceTokenException
 *
 * @author hjm
 * @date 2022/04/20
 */
public class JLinkDeviceTokenException extends JLinkException {
    public JLinkDeviceTokenException(Integer code, String msg) {
        super(code, msg);
    }
}
