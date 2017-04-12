package com.bink.entity;

/**
 * Created by chenbinghao on 16/8/27.
 */
public enum RoleType {

    // 未知
    UNKONWN(0),

    // 系统管理员
    SYSTEM(10),

    // 管理员
    MANAGER(8),

    // 普通成员
    USER(6);

    private int roleType;

    RoleType(int roleType) {
        this.roleType = roleType;
    }

    public int getRoleType() {
        return roleType;
    }

    public void setRoleType(int roleType) {
        this.roleType = roleType;
    }

    public static RoleType getRoleType(int type) {
        for (RoleType roleType : RoleType.values()) {
            if (roleType.roleType == type)
                return roleType;
        }
        return UNKONWN;
    }
    
}
