package com.online.store.cs489.repository;

import com.online.store.cs489.domain.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoleRepository extends CrudRepository<Role, Integer> {
    @Query(value = "select * from ROLE where role_id != :role_id", nativeQuery = true)
    public List<Role> getAllRolesNotAdmin(@Param("role_id") Integer role);
}
