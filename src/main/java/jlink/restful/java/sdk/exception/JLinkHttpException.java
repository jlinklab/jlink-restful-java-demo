package jlink.restful.java.sdk.exception;

/**
 * jlink HttpException
 *
 * @author hjm
 * @date 2022/04/20
 */
public class JLinkHttpException extends JLinkException {
    public JLinkHttpException(Integer code, String msg) {
        super(code, msg);
    }
}
