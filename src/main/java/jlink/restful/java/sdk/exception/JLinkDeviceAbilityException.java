package jlink.restful.java.sdk.exception;

/**
 * jlink DeviceAbilityException
 *
 * @author hjm
 * @date 2022/04/20
 */
public class JLinkDeviceAbilityException extends JLinkException {
    public JLinkDeviceAbilityException(Integer code, String msg) {
        super(code, msg);
    }
}
