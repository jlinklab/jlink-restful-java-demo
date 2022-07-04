package jlink.restful.java.sdk.module.cloudstorage;

import com.google.gson.annotations.SerializedName;

/**
 * Device cloud storage video response
 *
 * @author luojx
 * @date 2022/7/1 15:34
 */
public class DeviceCloudStorageVideoResponse {
    @SerializedName("code")
    private Integer code;
    @SerializedName("msg")
    private String msg;
    @SerializedName("data")
    private DataDTO data;

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

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public static class DataDTO{
        @SerializedName("Ret")
        private Integer ret;
        @SerializedName("url")
        private String url;

        public Integer getRet() {
            return ret;
        }

        public void setRet(Integer ret) {
            this.ret = ret;
        }

        public String getUrl() {
            return url;
        }

        public void setUrls(String url) {
            this.url = url;
        }
    }
}
