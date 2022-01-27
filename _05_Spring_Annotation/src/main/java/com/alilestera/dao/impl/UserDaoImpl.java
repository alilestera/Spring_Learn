package com.alilestera.dao.impl;

import com.alilestera.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author Alilestera
 * @date 1/24/2022
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void show() {
        System.out.println("获取到数据!");
    }
}
