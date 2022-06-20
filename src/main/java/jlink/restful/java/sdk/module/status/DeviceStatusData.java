package jlink.restful.java.sdk.module.status;

import java.util.List;

/**
 * Device Status Data
 *
 * @author hjm
 * @date 2022/04/21
 */
public class DeviceStatusData {
    /**
     * devise serial number
     */
    private String uuid;
    /**
     * state
     */
    private String status;
    /**
     * wanIp
     */
    private String wanIp;
    /**
     * channel
     */
    private List<ChannelVo> channel;
    /**
     * Low power device return parameter, 0 means sleep, 1 means wake up
     */
    private String wakeUpStatus;
    /**
     * Low-power device return parameter, 1 means remote wake-up is supported, 0 means deep sleep requires manual wake-up
     */
    private String wakeUpEnable;

    /**
     * p2p
     */
    private String p2p;
    /**
     * dss
     */
    private String dss;
    /**
     * rps
     */
    private String rps;

    public static class ChannelVo {
        /**
         * 通道号 从1开始
         */
        private int channelNo;
        /**
         * Main stream ret; value greater than or equal to 0 means the main stream is online, -2 means not online, other unknown 0
         */
        private int main;
        /**
         * Auxiliary code stream ret; value greater than or equal to 0 means that the auxiliary code stream is online, -2 means not online, and others are unknown
         */
        private int extra;

        public int getMain() {
            return main;
        }

        public void setMain(int main) {
            this.main = main;
        }

        public int getExtra() {
            return extra;
        }

        public void setExtra(int extra) {
            this.extra = extra;
        }

        public int getChannelNo() {
            return channelNo;
        }

        public void setChannelNo(int channelNo) {
            this.channelNo = channelNo;
        }
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWanIp() {
        return wanIp;
    }

    public void setWanIp(String wanIp) {
        this.wanIp = wanIp;
    }

    public List<ChannelVo> getChannel() {
        return channel;
    }

    public void setChannel(List<ChannelVo> channel) {
        this.channel = channel;
    }

    public String getWakeUpStatus() {
        return wakeUpStatus;
    }

    public void setWakeUpStatus(String wakeUpStatus) {
        this.wakeUpStatus = wakeUpStatus;
    }

    public String getWakeUpEnable() {
        return wakeUpEnable;
    }

    public void setWakeUpEnable(String wakeUpEnable) {
        this.wakeUpEnable = wakeUpEnable;
    }

    public String getP2p() {
        return p2p;
    }

    public void setP2p(String p2p) {
        this.p2p = p2p;
    }

    public String getDss() {
        return dss;
    }

    public void setDss(String dss) {
        this.dss = dss;
    }

    public String getRps() {
        return rps;
    }

    public void setRps(String rps) {
        this.rps = rps;
    }
}
