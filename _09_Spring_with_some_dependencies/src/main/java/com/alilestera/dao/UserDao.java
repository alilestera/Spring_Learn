package com.alilestera.dao;

import com.alilestera.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Alilestera
 * @date 2/3/2022
 */

public interface UserDao {
    List<User> findAll();

    void updateUserAge(@Param("id") Integer id, @Param("age") Integer age);
}
