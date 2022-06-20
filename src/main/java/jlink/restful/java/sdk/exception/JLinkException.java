package jlink.restful.java.sdk.exception;

/**
 * jlink Exception
 *
 * @author hjm
 * @date 2022/04/20
 */
public class JLinkException extends RuntimeException {
    private final Integer code;
    private final String msg;

    public JLinkException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return String.format("code:%s ,msg:%s",getCode(),getMsg());
    }
}
