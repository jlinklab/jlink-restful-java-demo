package jlink.restful.java.sdk.competent;

/**
 * jlink MethodType
 *
 * @author hjm
 * @date 2022/06/18
 */
public enum JLinkMethodType {
    GET("GET"),
    PUT("PUT"),
    POST("POST"),
    DELETE("DELETE"),
    HEAD("HEAD"),
    OPTIONS("OPTIONS");

    private String httpMethod;

    JLinkMethodType(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String get() {
        return httpMethod;
    }
}
