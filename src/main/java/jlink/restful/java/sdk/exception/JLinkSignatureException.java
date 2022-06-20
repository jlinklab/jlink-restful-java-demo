package jlink.restful.java.sdk.exception;

/**
 * jlink SignatureException
 *
 * @author hjm
 * @date 2022/04/20
 */
public class JLinkSignatureException extends JLinkException {
    public JLinkSignatureException(Integer code, String msg) {
        super(code, msg);
    }
}
