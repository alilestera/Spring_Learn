package com.alilestera.services;

import org.springframework.stereotype.Service;

/**
 * @author Alilestera
 * @date 1/29/2022
 */
@Service("userService")
public class UserService {

    public void findAnyUser() {
        System.out.println("findAnyUser的具体实现代码");
    }

    public void fingUserById(Integer id) {
        System.out.println("fingUserById的具体实现代码");
    }
}
