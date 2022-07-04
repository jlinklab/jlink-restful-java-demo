package jlink.restful.java.sdk.module.opdev.oplogquery;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperate;
import jlink.restful.java.sdk.module.opdev.DeviceOperateEnum;

/**
 * LogQuery
 * @author luojx
 * @date 2022/6/15 19:42
 */
public class OPLogQueryDTO implements DeviceOperate {
    @Override
    public DeviceOperateEnum getOperateEnum() {
        return DeviceOperateEnum.OPLogQuery;
    }

    @SerializedName("Name")
    private final DeviceOperateEnum name = getOperateEnum();
    @SerializedName("Type")
    private String type = OPLogQueryTypeEnum.LogAll.getLogType();
    @SerializedName("LogPosition")
    private Integer logPosition;
    @SerializedName("BeginTime")
    private String beginTime;
    @SerializedName("EndTime")
    private String endTime;

    public DeviceOperateEnum getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLogPosition() {
        return logPosition;
    }

    public void setLogPosition(Integer logPosition) {
        this.logPosition = logPosition;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
