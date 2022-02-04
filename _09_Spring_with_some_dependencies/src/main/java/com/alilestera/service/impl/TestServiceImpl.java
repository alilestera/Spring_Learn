package com.alilestera.service.impl;

import com.alilestera.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Alilestera
 * @date 2/4/2022
 */
@Service
public class TestServiceImpl {

    @Autowired
    private UserService userService;

    @Transactional
    public void test() {
        userService.updateUserAge(8, 14);
        userService.log();
    }
}
