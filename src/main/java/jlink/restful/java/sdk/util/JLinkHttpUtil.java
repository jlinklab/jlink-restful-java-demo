package jlink.restful.java.sdk.util;

import jlink.restful.java.sdk.competent.JLinkMethodType;
import jlink.restful.java.sdk.competent.JLinkResponseCode;
import jlink.restful.java.sdk.exception.JLinkHttpException;

import javax.net.ssl.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Map;
import java.util.Set;

/**
 * jlink http utilityClass
 *
 * @author hjm
 * @date 2022/04/21
 */
public class JLinkHttpUtil {

    /**
     * post
     *
     * @param requestUrl    request url
     * @param requestHeader requestHeader
     * @param body          body
     * @return {@link String}
     */
    public static String post(String requestUrl, Map<String, String> requestHeader, String body) {
        return httpsRequest(requestUrl, JLinkMethodType.POST.get(), requestHeader, body);
    }

    public static String httpsRequest(String requestUrl, String requestMethod, Map<String, String> requestHeader,
                                      String bodyParam) {
        if (!requestUrl.startsWith("https://")) {
            return httpRequest(requestUrl, requestMethod, requestHeader, bodyParam);
        }
        JLinkLog.i("httpsRequest url:<--" + requestUrl);
        try {
            bodyParam = URLDecoder.decode(bodyParam, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        JLinkLog.i("httpsRequest body:<--" + bodyParam);
        HttpsURLConnection conn = null;
        try {

            StringBuffer buffer = null;
            // create SSLContext
            SSLContext sslContext = SSLContext.getInstance("SSL");

            X509TrustManager x509TrustManager = new JLinkMyX509TrustManager();

            TrustManager[] tm = {x509TrustManager};
            sslContext.init(null, tm, new java.security.SecureRandom());
            ;
            //toObtain SSLSocketFactory object
            SSLSocketFactory ssf = sslContext.getSocketFactory();
            URL url = new URL(requestUrl);
            conn = (HttpsURLConnection) url.openConnection();
            conn.setSSLSocketFactory(ssf);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod(requestMethod);
            if ("POST".equalsIgnoreCase(requestMethod)) {
                conn.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            }
            if (null != requestHeader && requestHeader.size() > 0) {
                Set<String> keys = requestHeader.keySet();
                for (String key : keys) {
                    conn.setRequestProperty(key, requestHeader.get(key));
                }
            }
            conn.connect();
            if (null != bodyParam) {
                OutputStream os = conn.getOutputStream();
                os.write(bodyParam.getBytes("utf-8"));
                os.close();
            }
            InputStream is = null;
            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK
                    || conn.getResponseCode() == HttpURLConnection.HTTP_CREATED
                    || conn.getResponseCode() == HttpURLConnection.HTTP_ACCEPTED) {
                is = conn.getInputStream();
            } else {
                is = conn.getErrorStream();
            }
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            buffer = new StringBuffer();
            String line = null;
            while ((line = br.readLine()) != null) {
                buffer.append(line);
                buffer.append("\n");
            }

            br.close();
            isr.close();
            is.close();
            conn.disconnect();

            String res = buffer.toString();
            JLinkLog.i("httpsRequest response:-->" + res);
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            JLinkLog.e("httpsRequest failed:" + e.getMessage());
            if (null != conn) {
                conn.disconnect();
            }
            throw new JLinkHttpException(JLinkResponseCode.RESTFUL_HTTP_ERROR.getCode(), e.getMessage());
        }
    }

    private static String httpRequest(String requestUrl, String requestMethod, Map<String, String> requestHeader, String bodyParam) {
        JLinkLog.i("httpRequest url:<--" + requestUrl);
        try {
            bodyParam = URLDecoder.decode(bodyParam, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        JLinkLog.i("httpRequest body:<--" + bodyParam);
        HttpURLConnection conn = null;
        try {

            URL url = new URL(requestUrl);
            conn = (HttpURLConnection) url.openConnection();
            StringBuffer buffer = null;
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod(requestMethod);
            if ("POST".equalsIgnoreCase(requestMethod)) {
                conn.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            }
            if (null != requestHeader && requestHeader.size() > 0) {
                Set<String> keys = requestHeader.keySet();
                for (String key : keys) {
                    conn.setRequestProperty(key, requestHeader.get(key));
                }
            }
            conn.connect();
            if (null != bodyParam) {
                OutputStream os = conn.getOutputStream();
                os.write(bodyParam.getBytes("utf-8"));
                os.close();
            }
            InputStream is = null;
            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK
                    || conn.getResponseCode() == HttpURLConnection.HTTP_CREATED
                    || conn.getResponseCode() == HttpURLConnection.HTTP_ACCEPTED) {
                is = conn.getInputStream();
            } else {
                is = conn.getErrorStream();
            }
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            buffer = new StringBuffer();
            String line = null;
            while ((line = br.readLine()) != null) {
                buffer.append(line);
                buffer.append("\n");
            }

            br.close();
            isr.close();
            is.close();
            conn.disconnect();

            String res = buffer.toString();
            JLinkLog.i("httpRequest response:-->" + res);
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            JLinkLog.e("httpRequest failed:" + e.getMessage());
            if (null != conn) {
                conn.disconnect();
            }
            throw new JLinkHttpException(JLinkResponseCode.RESTFUL_HTTP_ERROR.getCode(), e.getMessage());
        }
    }
}
