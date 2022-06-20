package jlink.restful.java.sdk.exception;

/**
 * jlink UserManageException
 *
 * @author hjm
 * @date 2022/04/20
 */
public class JLinkDeviceUserManageException extends JLinkException {
    public JLinkDeviceUserManageException(Integer code, String msg) {
        super(code, msg);
    }
}
