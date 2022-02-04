package com.alilestera.service;

import com.alilestera.domain.User;

import java.util.List;

/**
 * @author Alilestera
 * @date 2/3/2022
 */
public interface UserService {

    List<User> findAll();

    void updateUserAge(Integer id, Integer age);

    void log();
}
