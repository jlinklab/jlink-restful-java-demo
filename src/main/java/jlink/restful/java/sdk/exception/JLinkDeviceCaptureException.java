package jlink.restful.java.sdk.exception;


/**
 * jlink Device CaptureException
 *
 * @author hjm
 * @date 2022/04/22
 */
public class JLinkDeviceCaptureException extends JLinkException {
    public JLinkDeviceCaptureException(Integer code, String msg) {
        super(code, msg);
    }
}
