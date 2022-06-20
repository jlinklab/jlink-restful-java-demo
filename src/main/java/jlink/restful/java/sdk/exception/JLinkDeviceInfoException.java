package jlink.restful.java.sdk.exception;

/**
 * jlink DeviceInfoException
 *
 * @author hjm
 * @date 2022/04/20
 */
public class JLinkDeviceInfoException extends JLinkException {
    public JLinkDeviceInfoException(Integer code, String msg) {
        super(code, msg);
    }
}
