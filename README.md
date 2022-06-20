# SDK Development Reference Package

> gson                  version 2.8.5
> commons-codec         version 1.11
> commons-lang3         version 3.8.1

# SDK Methods

## Initialization JLinkClient

> uuid,appKey,appSecret,movecard Obtained from (open.jftech.com).

```
JLinkClient jClient = new JLinkClient(uuid,appKey,appSecret,movecard);
```

## Initialization JLinkDevice

> Sn is the device serial number
> devUsername indicates the device login username
> devPassword indicates the device login password

```
JLinkDevice jDevice = new JLinkDevice(jClient, sn, devUsername, devPassword);
```

## Get Device Token

```
String JDToken = jDevice.getDeviceToken();
```

## Get Device Status

```
DeviceStatusData jDStatus = jDevice.deviceStatus();
```

## Low-power Device Wakeup

```
boolean wakeupFlag = jDevice.wakeUp();
```

## Device Login

> 1.Login with devUsername and decPassword

```
DeviceLoginData jDLogin = jDevice.login();
```

> 2.Log in to the device with the Token obtained from device sharing

```
JLinkDeviceResponse jDLogin = jDevice.deviceLoginByToken(loginToken);
```

## Get Device Information

> Take obtaining system information as an example

```
DeviceInfoResponse.DevInfo devInfo = jDevice.deviceInfo(JLinkDeviceInfoEnum.SystemInfo);
```

## Device Capability Set Acquisition

> Obtain the device capability set after the device is successfully logged in. Take obtaining the system capability set as an example

```
DeviceAbilityResponse.DevAbility jDAbility = jDevice.deviceAbility(JLinkDeviceAbilityEnum.SYSTEMFUNCTION);
```

## Get Device Configuration

> Take obtaining the device active registration service DAS configuration as an example

```
NetWorkDasConfig jDConfig = jDevice.getConfig(JLinkDeviceConfigTypeEnum.NETWORKDAS);
```

## Set Device Configuration

> Take the device actively registering the DAS service as an example enable: enable serverAddr: server address Port: server port

```
NetWorkDasConfig dasConfig = new NetWorkDasConfig();
dasConfig.setEnable(true);
dasConfig.setServerAddr("122.112.239.62");
dasConfig.setPort(6601);
boolean setConfigFlag = jDevice.setConfig(dasConfig);
```

## Device Keepalive

```
boolean keepalive = jDevice.keepalive();
```

## Device Operate

> Take the PTZ direction control as an example

```
PtzDirectionControlDTO ptzDirectionControlDTO = new PtzDirectionControlDTO();
ptzDirectionControlDTO.getOpptzControl().setCommand(PTZControlEnum.DirectionLeft);
ptzDirectionControlDTO.getOpptzControl().getParameter().setChannel(0);
ptzDirectionControlDTO.getOpptzControl().getParameter().setPreset(65535);
ptzDirectionControlDTO.getOpptzControl().getParameter().setStep(6);
jDevice.deviceOperate(ptzDirectionControlDTO);
```

## Get the liveStream

> Take obtaining the live address of the main stream of the device in hls format as an example;
> rs Account represents the user registered by the open platform through the RS interface,
> and rs Pass represents the user password registered by the open platform through the RS interface

```
JUser jUser = new JLinkUser(jClient, rsAccount, rsPass);
String liveStream = jDevice.deviceLivePlayUrl(DeviceLiveStreamEnum.STREAM_EXTRA.get(), DeviceLiveStreamEnum.MEDIATYPE_HLS.get(), DeviceLiveStreamEnum.PROTOCOL_TS.get(), jUser);
```

## Device Snapshot

> Capture a picture of a channel, The channel number defaults to 0

```
String captureUrl = jDevice.capture(channel, jUser);
```