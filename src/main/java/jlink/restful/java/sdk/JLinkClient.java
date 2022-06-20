package jlink.restful.java.sdk;

public class JLinkClient {

    /**
     * openPlatform uuid
     */
    private String mUuid = "";
    /**
     * openPlatform appKey
     */
    private String mAppKey = "";
    /**
     * openPlatform appSecret
     */
    private String mAppSecret = "";
    /**
     * openPlatform moveCard
     */
    private int mMoveCard = -1;

    public JLinkClient(String uuid, String appKey, String appSecret, int moveCard) {
        mUuid = uuid;
        mAppKey = appKey;
        mAppSecret = appSecret;
        mMoveCard = moveCard;
    }

    public void setUuid(String uuid) {
        mUuid = uuid;
    }

    public void setAppKey(String appKey) {
        mAppKey = appKey;
    }

    public void setAppSecret(String appSecret) {
        mAppSecret = appSecret;
    }

    public void setMoveCard(int moveCard) {
        mMoveCard = moveCard;
    }

    public String getUuid() {
        return mUuid;
    }

    public String getAppKey() {
        return mAppKey;
    }

    public String getAppSecret() {
        return mAppSecret;
    }

    public int getMoveCard() {
        return mMoveCard;
    }

    public boolean verify() {
        return false;
    }

    public JLinkDevice buildJLinkDevice(String sn) {
        return new JLinkDevice(this, sn);
    }
}
