package com.alilestera.service.impl;

import com.alilestera.dao.UserDao;
import com.alilestera.domain.User;
import com.alilestera.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alilestera
 * @date 2/3/2022
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        List<User> list = userDao.findAll();
        return list;
    }
}
