package jlink.restful.java.sdk.databind;

/**
 * jlink Device Response packaging
 *
 * @author hjm
 * @date 2022/04/21
 */
public interface JLinkDeviceResponseWrapper<T> {

    String getName();

    Integer getRet();

    String getSessionId();

    String getRetMsg();

    T getConfig();

    void setConfig(T t);
}
