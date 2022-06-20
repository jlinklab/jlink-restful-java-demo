package jlink.restful.java.sdk.databind;


/**
 * jlink Device Response
 *
 * @author hjm
 * @date 2022/04/21
 */
public class JLinkDeviceResponse<T extends JLinkDeviceResponseWrapper> {
    private Integer code;
    private String msg;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}