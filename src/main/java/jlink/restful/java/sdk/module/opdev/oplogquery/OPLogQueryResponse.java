package jlink.restful.java.sdk.module.opdev.oplogquery;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperateResponse;

import java.util.List;

/**
 * LogQuery Response
 * @author luojx
 * @date 2022/6/15 19:43
 */
public class OPLogQueryResponse extends DeviceOperateResponse {
    @SerializedName("Name")
    private String name;
    @SerializedName("Ret")
    private Integer ret;
    @SerializedName("SessionID")
    private String sessionID;
    @SerializedName("OPLogQuery")
    private List<OPLogQuery> opLogQuery;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRet() {
        return ret;
    }

    public void setRet(Integer ret) {
        this.ret = ret;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public List<OPLogQuery> getOpLogQuery() {
        return opLogQuery;
    }

    public void setOpLogQuery(List<OPLogQuery> opLogQuery) {
        this.opLogQuery = opLogQuery;
    }

    public static class OPLogQuery{
        @SerializedName("Data")
        private String data;
        @SerializedName("Position")
        private Integer position;
        @SerializedName("Time")
        private String time;
        @SerializedName("Type")
        private String type = OPLogQueryTypeEnum.LogAll.getLogType();
        @SerializedName("User")
        private String user;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Integer getPosition() {
            return position;
        }

        public void setPosition(Integer position) {
            this.position = position;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }
    }
}
