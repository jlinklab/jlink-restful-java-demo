package jlink.restful.java.sdk.exception;

/**
 * jlink OperateException
 *
 * @author hjm
 * @date 2022/04/20
 */
public class JLinkDeviceOperateException extends JLinkException {
    public JLinkDeviceOperateException(Integer code, String msg) {
        super(code, msg);
    }
}
