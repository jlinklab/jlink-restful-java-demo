package jlink.restful.java.sdk.module.usermanage.group;


/**
 * User group permission enumeration
 *
 * @author hjm
 * @date 2022/04/28
 */
public enum GroupAuthorityEnum {
    ShutDown, ChannelTitle, DefaultConfig, Talk_01, IPCCamera, ImExport,
    Monitor_01, EncodeConfig, Account, SysInfo, QueryLog, DelLog, SysUpgrade, AutoMaintain,
    GeneralConfig, NetConfig, AlarmConfig, VideoConfig, RecordConfig, StorageManager,
    Replay_01, CommConfig, PtzConfig, PTZControl, ElecPTZControl;

    public static GroupAuthorityEnum get(String auth) {
        for (GroupAuthorityEnum value : values()) {
            if (auth.equals(value.name())) {
                return value;
            }
        }
        return null;
    }

}
