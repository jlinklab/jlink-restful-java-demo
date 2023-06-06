package jlink.restful.java.sdk.competent;

/**
 * RESTFul API RequestInterface Enum
 */
public enum JLinkDomain {
    //RESTFul API Request DomainName
    RESTFUL_DOMAIN("https://rds.jftechws.com"),
    //userToken and deviceToken Request DomainName
    TKS_DOMAIN("https://tks.jftechws.com"),
    RS_DOMAIN("https://rs.jftechws.com/login/va1");


    private String requestDomain;

    public String get() {
        return requestDomain;
    }

    public void set(String requestDomain) {
        this.requestDomain = requestDomain;
    }


    JLinkDomain(String requestDomain) {
        this.requestDomain = requestDomain;
    }
}
