package jlink.restful.java.sdk.module.opdev.oprecordtimequery;

import com.google.gson.annotations.SerializedName;
import jlink.restful.java.sdk.module.opdev.DeviceOperateResponse;

import java.util.List;

/**
 * Get playback list query response based on time
 *
 * @author luojx
 * @date 2022/6/15 9:14
 */
public class OPRecordTimeQueryResponse extends DeviceOperateResponse {
    @SerializedName("Name")
    private String name;
    @SerializedName("Ret")
    private Integer ret;
    @SerializedName("SessionID")
    private String sessionID;
    @SerializedName("OPFileQuery")
    private List<OPFileQueryDTO> oPFileQuery;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OPFileQueryDTO> getoPFileQuery() {
        return oPFileQuery;
    }

    public void setoPFileQuery(List<OPFileQueryDTO> oPFileQuery) {
        this.oPFileQuery = oPFileQuery;
    }

    public static class OPFileQueryDTO{
        @SerializedName("ByTimeInfo")
        private List<ByTimeInfoDTO> byTimeInfoDTOS;

        public List<ByTimeInfoDTO> getByTimeInfoDTOS() {
            return byTimeInfoDTOS;
        }

        public void setByTimeInfoDTOS(List<ByTimeInfoDTO> byTimeInfoDTOS) {
            this.byTimeInfoDTOS = byTimeInfoDTOS;
        }

        public static class ByTimeInfoDTO{
            /**
             * base64 encryptionTimeline
             */
            @SerializedName("cRecordBitMap")
            private String cRecordBitMap;
            /**
             * channelNumber
             */
            @SerializedName("iChannel")
            private Integer iChannel;

            public String getcRecordBitMap() {
                return cRecordBitMap;
            }

            public void setcRecordBitMap(String cRecordBitMap) {
                this.cRecordBitMap = cRecordBitMap;
            }

            public Integer getiChannel() {
                return iChannel;
            }

            public void setiChannel(Integer iChannel) {
                this.iChannel = iChannel;
            }
        }
    }

}
