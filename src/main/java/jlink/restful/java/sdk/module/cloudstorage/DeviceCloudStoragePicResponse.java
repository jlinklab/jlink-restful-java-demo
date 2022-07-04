package jlink.restful.java.sdk.module.cloudstorage;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Device cloud storage pic response
 * 
 * @author luojx
 * @date 2022/6/28 10:02
 */
public class DeviceCloudStoragePicResponse {
    @SerializedName("code")
    private Integer code;
    @SerializedName("msg")
    private String msg;
    @SerializedName("data")
    private List<UrlDto> data;

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

    public List<UrlDto> getData() {
        return data;
    }

    public void setData(List<UrlDto> data) {
        this.data = data;
    }

    public static class UrlDto{
            @SerializedName("url")
            private String url;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
}
