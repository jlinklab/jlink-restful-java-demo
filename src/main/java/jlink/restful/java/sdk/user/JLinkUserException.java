package jlink.restful.java.sdk.user;

import jlink.restful.java.sdk.exception.JLinkException;

/**
 * jlink UserException
 *
 * @author hjm
 * @date 2022/04/20
 */
public class JLinkUserException extends JLinkException {
    public JLinkUserException(Integer code, String msg) {
        super(code, msg);
    }
}
