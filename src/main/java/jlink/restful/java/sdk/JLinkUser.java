package jlink.restful.java.sdk;

import jlink.restful.java.sdk.user.JLinkUserTokenRequest;

public class JLinkUser {
    /**
     * Users registered in the open platform user system
     */
    private String rsAccount;
    /**
     * User password for open platform user system registration
     */
    private String rsPass;

    /**
     * userToken
     */
    private String mUserToken;


    public JLinkUser(JLinkClient client, String account, String pass) {
        this.rsAccount = account;
        this.rsPass = pass;
        setUserToken(new JLinkUserTokenRequest().requestUserToken(client, this));
    }

    public String getAccount() {
        return rsAccount;
    }

    public void setAccount(String account) {
        rsAccount = account;
    }

    public String getPass() {
        return rsPass;
    }

    public void setPass(String pass) {
        rsPass = pass;
    }

    public String getUserToken() {
        return mUserToken;
    }

    public void setUserToken(String userToken) {
        mUserToken = userToken;
    }
}
