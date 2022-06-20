package jlink.restful.java.sdk.module.usermanage.user;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManage;
import jlink.restful.java.sdk.module.usermanage.DeviceUserManageEnum;

/**
 * @author luojx
 * @date 2022/6/15 16:07
 */
public class ModifyPasswordDTO implements DeviceUserManage {
    @Override
    public DeviceUserManageEnum getUserManageEnum() {
        return DeviceUserManageEnum.MODIFYPASSWORD;
    }
    @SerializedName("Name")
    private final DeviceUserManageEnum name = getUserManageEnum();
    @SerializedName("EncryptType")
    private String encryptType = EncryptTypeEnum.MD5.getEncryptType();
    @SerializedName("NewPassWord")
    private String newPassWord;
    @SerializedName("PassWord")
    private String password;
    @SerializedName("UserName")
    private String username;

    public DeviceUserManageEnum getName() {
        return name;
    }

    public String getEncryptType() {
        return encryptType;
    }

    public void setEncryptType(String encryptType) {
        this.encryptType = encryptType;
    }

    public String getNewPassWord() {
        return newPassWord;
    }

    public void setNewPassWord(String newPassWord) {
        this.newPassWord = newPassWord;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
