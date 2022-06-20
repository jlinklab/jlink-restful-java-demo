package jlink.restful.java.sdk.exception;

/**
 * jlink StatusException
 *
 * @author hjm
 * @date 2022/04/20
 */
public class JLinkDeviceStatusException extends JLinkException {
    public JLinkDeviceStatusException(Integer code, String msg) {
        super(code, msg);
    }
}
