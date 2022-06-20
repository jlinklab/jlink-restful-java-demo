package jlink.restful.java.sdk.util;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;


public class JLinkMyHostnameVerifier implements HostnameVerifier {
    @Override
    public boolean verify(String hostname, SSLSession session) {
        if ("localhost".equals(hostname)) {
            return true;
        } else {
            return false;
        }
    }
}

