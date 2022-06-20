package jlink.restful.java.sdk.module.opdev.opfilequery;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperateResponse;

import java.util.List;

/**
 * Video file query dto
 *
 * @author hjm
 * @date 2022/04/26
 */
public class OPFileQueryResponse extends DeviceOperateResponse {
    @SerializedName("Name")
    private String name;
    @SerializedName("OPFileQuery")
    private List<OPFileQueryDTO> oPFileQuery;
    @SerializedName("Ret")
    private Integer ret;
    @SerializedName("SessionID")
    private String sessionID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OPFileQueryDTO> getOPFileQuery() {
        return oPFileQuery;
    }

    public void setOPFileQuery(List<OPFileQueryDTO> oPFileQuery) {
        this.oPFileQuery = oPFileQuery;
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

    public static class OPFileQueryDTO {
        @SerializedName("BeginTime")
        private String beginTime;
        @SerializedName("DiskNo")
        private Integer diskNo;
        @SerializedName("EndTime")
        private String endTime;
        @SerializedName("FileLength")
        private String fileLength;
        @SerializedName("FileName")
        private String fileName;
        @SerializedName("SerialNo")
        private Integer serialNo;

        public String getBeginTime() {
            return beginTime;
        }

        public void setBeginTime(String beginTime) {
            this.beginTime = beginTime;
        }

        public Integer getDiskNo() {
            return diskNo;
        }

        public void setDiskNo(Integer diskNo) {
            this.diskNo = diskNo;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public String getFileLength() {
            return fileLength;
        }

        public void setFileLength(String fileLength) {
            this.fileLength = fileLength;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public Integer getSerialNo() {
            return serialNo;
        }

        public void setSerialNo(Integer serialNo) {
            this.serialNo = serialNo;
        }
    }
}