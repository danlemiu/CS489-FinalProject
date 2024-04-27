package com.online.store.cs489.service.impl;

import com.online.store.cs489.domain.Role;
import com.online.store.cs489.repository.RoleRepository;
import com.online.store.cs489.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return (List<Role>) roleRepository.findAll();
    }

    @Override
    public Role get(Integer id) {
        return roleRepository.findById(id).get();
    }

    @Override
    public List<Role> getAllRolesNotAdmin(Integer id){
        return roleRepository.getAllRolesNotAdmin(id);
    }
}
