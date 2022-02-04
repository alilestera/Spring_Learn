package com.alilestera.service.impl;

import com.alilestera.dao.UserDao;
import com.alilestera.domain.User;
import com.alilestera.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.DEFAULT)
    public void updateUserAge(Integer id, Integer age) {
        userDao.updateUserAge(id, age);
//        System.out.println(1/0);
    }

    @Override
    @Transactional(readOnly = true)
    public void log() {
        System.out.println("输入log日志");
        System.out.println(1/0);
    }
}
