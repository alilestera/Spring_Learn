package com.alilestera.dao.impl;

import com.alilestera.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void show() {
        System.out.println("查询数据库，展示查询到的数据1");
    }
}
