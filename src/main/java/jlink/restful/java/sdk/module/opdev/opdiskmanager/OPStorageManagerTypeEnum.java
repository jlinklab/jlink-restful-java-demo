package jlink.restful.java.sdk.module.opdev.opdiskmanager;


/**
 * Partition type
 *
 * @author luojx
 * @date 2022/6/21 19:03
 */
public enum OPStorageManagerTypeEnum {
    /**
     * set as read-write disk
     */
    ReadWrite,
    /**
     * set as snapshot disk
     */
    SnapShot,
    /**
     * set as read-only disk
     */
    ReadOnly,
    /**
     * Set as redundant disk
     */
    Redundant;

    public static OPStorageManagerTypeEnum get(String type){
        for (OPStorageManagerTypeEnum value : OPStorageManagerTypeEnum.values()) {
            if(type.equals(value.name())){
                return value;
            }
        }
        return ReadWrite;
    }
}
