package jlink.restful.java.sdk.exception;

/**
 * jlink JsonException
 *
 * @author hjm
 * @date 2022/04/20
 */
public class JLinkJsonException extends JLinkException {
    public JLinkJsonException(Integer code, String msg) {
        super(code, msg);
    }
}
