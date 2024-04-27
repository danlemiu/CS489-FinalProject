package com.online.store.cs489.service;

import com.online.store.cs489.domain.User;

import java.util.List;

public interface UserService {
    User save(User user);

    User findUserById(Long id);

    User findUserByUserName(String userName);

    List<User> getAllUsersByRole(Integer role);

    User getCurrentUser();

    void sendEmailRegisterUser(Long userId);

    void sendEmailApprovalSeller(Long userId);
}
