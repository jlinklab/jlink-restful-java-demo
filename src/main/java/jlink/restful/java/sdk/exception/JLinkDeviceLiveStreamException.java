package jlink.restful.java.sdk.exception;

/**
 * jlink LiveStreamException
 *
 * @author hjm
 * @date 2022/04/20
 */
public class JLinkDeviceLiveStreamException extends JLinkException {
    public JLinkDeviceLiveStreamException(Integer code, String msg) {
        super(code, msg);
    }
}
