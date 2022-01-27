package com.alilestera.service.impl;

import com.alilestera.dao.UserDao;
import com.alilestera.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Alilestera
 * @date 1/24/2022
 */
@Service("userService")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Value("Alilestera")
    private String name;

    @Value("okgogogo")
    private String str;

    @Value("#{10 + 8}")
    private int age;

    @Override
    public void show() {
        System.out.println("userService回应");
    }
}
