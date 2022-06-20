package jlink.restful.java.sdk.module.usermanage;


import com.google.gson.reflect.TypeToken;
import jlink.restful.java.sdk.module.usermanage.group.ADDGroupResponse;
import jlink.restful.java.sdk.module.usermanage.group.DeleteGroupResponse;
import jlink.restful.java.sdk.module.usermanage.group.GroupsResponse;
import jlink.restful.java.sdk.module.usermanage.group.ModifyGroupResponse;
import jlink.restful.java.sdk.module.usermanage.permission.FullAuthorityListResponse;
import jlink.restful.java.sdk.module.usermanage.user.*;

import java.lang.reflect.Type;

/**
 * User Management Device Enumeration
 *
 * @author hjm
 * @date 2022/04/26
 */
public enum DeviceUserManageEnum {
    //Get permission list
    FULLAUTHORITYLIST("FULLAUTHORITYLIST", new TypeToken<DeviceUserManageResponse<FullAuthorityListResponse>>() {
    }.getType()),
    //userGroups
    GROUPS("GROUPS", new TypeToken<DeviceUserManageResponse<GroupsResponse>>() {
    }.getType()),
    //addUserGroup
    ADDGROUP("ADDGROUP", new TypeToken<DeviceUserManageResponse<ADDGroupResponse>>() {
    }.getType()),
    //modifyUserGroup
    MODIFYGROUP("MODIFYGROUP", new TypeToken<DeviceUserManageResponse<ModifyGroupResponse>>() {
    }.getType()),
    //deleteUserGroup
    DELETEGROUP("DELETEGROUP", new TypeToken<DeviceUserManageResponse<DeleteGroupResponse>>() {
    }.getType()),
    //getUserList
    USERS("USERS", new TypeToken<DeviceUserManageResponse<UsersResponse>>() {
    }.getType()),
    //addUser
    ADDUSER("ADDUSER", new TypeToken<DeviceUserManageResponse<AddUserResponse>>() {
    }.getType()),
    //Modify user (cannot modify password)
    MODIFYUSER("MODIFYUSER", new TypeToken<DeviceUserManageResponse<ModifyUserResponse>>() {
    }.getType()),
    //deleteUser
    DELETEUSER("DELETEUSER", new TypeToken<DeviceUserManageResponse<DeleteUserResponse>>() {
    }.getType()),
    //modify User Password
    MODIFYPASSWORD("MODIFYPASSWORD", new TypeToken<DeviceUserManageResponse<ModifyPasswordResponse>>() {
    }.getType());


    private final String manageName;
    private final java.lang.reflect.Type type;

    DeviceUserManageEnum(String manageName, Type type) {
        this.manageName = manageName;
        this.type = type;
    }

    public static DeviceUserManageEnum get(String userMenu) {
        for (DeviceUserManageEnum value : values()) {
            if (userMenu.equals(value.getManageName())) {
                return value;
            }
        }
        return null;
    }

    public String getManageName() {
        return manageName;
    }

    public Type getType() {
        return type;
    }
}
