package jlink.restful.java.sdk.competent;

/**
 * RESTFul API RequestInterface Enum
 */
public enum JLinkDomain {
    //RESTFul API Request DomainName
    RESTFUL_DOMAIN("https://rds.bcloud365.net"),
    //userToken and deviceToken Request DomainName
    TKS_DOMAIN("https://tks.xmeye.net"),
    RS_DOMAIN("https://rs.xmeye.net/login/va1");


    private final String requestDomain;

    JLinkDomain(String requestDomain) {
        this.requestDomain = requestDomain;
    }

    public String get() {
        return requestDomain;
    }
}
