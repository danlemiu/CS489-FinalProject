package com.online.store.cs489.service;

import com.online.store.cs489.domain.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();

    Role get(Integer id);

    List<Role> getAllRolesNotAdmin(Integer id);
}
