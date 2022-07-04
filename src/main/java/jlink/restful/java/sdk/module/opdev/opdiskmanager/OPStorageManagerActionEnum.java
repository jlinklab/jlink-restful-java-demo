package jlink.restful.java.sdk.module.opdev.opdiskmanager;

/**
 * Storage Manager
 * 
 * @author luojx
 * @date 2022/6/21 18:33
 */
public enum OPStorageManagerActionEnum {
    /**
     * set partition type
     */
    SetType,
    Recover,
    /**
     * formatting
     */
    Clear,
    /**
     * partition
     */
    Partition;

    public static OPStorageManagerActionEnum get(String action){
        for (OPStorageManagerActionEnum value : OPStorageManagerActionEnum.values()) {
            if(action.equals(value.name())){
                return value;
            }
        }
            return OPStorageManagerActionEnum.SetType;
    }
}
