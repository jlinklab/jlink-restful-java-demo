package jlink.restful.java.sdk.competent;

/**
 * Device Capability Set Enumeration
 */
public enum JLinkDeviceAbilityEnum {
    //system capability set
    SYSTEMFUNCTION("SystemFunction"),
    DOORFUNCTION("DoorFunction"),
    //Coding Capability Set
    ENCODECAPABILITY("EncodeCapability"),
    //Area Occlusion Capability Set
    BLINDCAPABILITY("BlindCapability"),
    //Dynamic area properties
    MOTIONAREA("MotionArea"),
    //Support DDNS service type
    DDNS_SERVICE("DDNSService"),
    //Support serial protocol
    COMPROTOCOL("ComProtocol"),
    //Camera parameters
    CAMERA("Camera"),
    CAMERAPARAMEX("Camera.ParamEx"),
    //Supports talkback audio properties
    TALKAUDIOFORMAT("TalkAudioFormat"),
    //Supported languages
    MULTILANGUAGE("MultiLanguage"),
    MULTIVSTD("MultiVstd"),
    //Support video format
    ABILITYSUPPORTVSTD("Ability.SupportVstd"),
    //Device Description
    ABILITYDEVICEDESC("Ability.DeviceDesc"),
    //List of device supported VGA resolutions
    ABILITYVGARESOLUTION("Ability.VGAResolution"),
    //List of GUI themes supported by the device
    ABILITYGUITHEMELIST("Ability.GUIThemeList"),
    //channel mode
    ABILITYDIGITALREAL("Ability.DigitalReal"),
    //Device Support Video Feature List
    VIDEOABILITY("VideoAbility"),
    //Asynchronous transceiver protocol
    UARTPROTOCOL("UartProtocol"),
    //Intelligent Analysis Capability Set
    INTELLIGENT("Intelligent"),
    //network link capability
    NETABILITY("NetAbility"),
    //Static Coding Capability Parameters
    ENCSTATICPARAM("EncStaticParam"),
    //Pre-recorded time
    MAXPRERECORD("MaxPreRecord"),
    //multi-channel Coding Capability Set
    MULTICHANNEL("MultiChannel"),
    //Whether to support adding the perimeter mixing function to the humanoid detection ChannelSystemFunction@SupportPeaInHumanPed
    CHANNELSYSTEMFUNCTIONSUPPORTPEAINHUMANPED("ChannelSystemFunction@SupportPeaInHumanPed"),
    //face configuration ChannelSystemFunction@SupportFaceDetectV2
    CHANNELSYSTEMFUNCTIONSUPPORTFACEDETECTV2("ChannelSystemFunction@SupportFaceDetectV2"),
    //Smart ability ChannelSystemFunction@SmartH264
    CHANNELSYSTEMFUNCTIONSMARTH264("ChannelSystemFunction@SmartH264");

    private String ability;

    JLinkDeviceAbilityEnum(String ability) {
        this.ability = ability;
    }

    public static JLinkDeviceAbilityEnum get(String ability) {
        for (JLinkDeviceAbilityEnum value : values()) {
            if (ability.equals(value.getAbility())) {
                return value;
            }
        }
        return SYSTEMFUNCTION;
    }

    public String getAbility() {
        return ability;
    }
}
