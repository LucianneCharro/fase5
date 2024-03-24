package com.fiap.postech.springsecurity.persistencia.util;

import java.util.Arrays;
import java.util.List;

public enum Role {
    ROLE_ADMINISTRATOR(Arrays.asList(
            RolePermission.READ_ALL_PRODUCTS,
            RolePermission.CREATE_ONE_PRODUCTS,
            RolePermission.UPDATE_ONE_CATEGORY,
            RolePermission.DISABLE_ONE_PRODUCTS,
            RolePermission.READ_ONE_CATEGORY,
            RolePermission.CREATE_ONE_CATEGORY,
            RolePermission.UPDATE_ONE_CATEGORY,
            RolePermission.DISABLE_ONE_CATEGORY,
            RolePermission.READ_MY_PROFILE


    )),
    ROLE_ASSISTANT_ADMINISTRATOR(Arrays.asList(
            RolePermission.READ_ALL_PRODUCTS,
            RolePermission.CREATE_ONE_PRODUCTS,
            RolePermission.UPDATE_ONE_CATEGORY,
            RolePermission.READ_ONE_CATEGORY,
            RolePermission.CREATE_ONE_CATEGORY,
            RolePermission.UPDATE_ONE_CATEGORY,
            RolePermission.READ_MY_PROFILE
    )),
    ROLE_CUSTOMER(List.of(
            RolePermission.READ_MY_PROFILE
    ));

    private List<RolePermission> permission;
    Role(List<RolePermission> permission){
        this.permission = permission;
    }

    public List<RolePermission> getPermission() {
        return permission;
    }

    public void setPermission(List<RolePermission> permission) {
        this.permission = permission;
    }
}
