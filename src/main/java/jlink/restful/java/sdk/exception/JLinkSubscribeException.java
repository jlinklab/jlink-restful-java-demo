package jlink.restful.java.sdk.exception;

/**
 * jlink SubscribeException
 *
 * @author hjm
 * @date 2022/04/20
 */
public class JLinkSubscribeException extends JLinkException {
    public JLinkSubscribeException(Integer code, String msg) {
        super(code, msg);
    }
}
