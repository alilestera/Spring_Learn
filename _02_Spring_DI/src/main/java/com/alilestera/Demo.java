package com.alilestera;

import com.alilestera.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alilestera
 * @date 1/16/2022
 */
public class Demo {
    public static void main(String[] args) {

        //获取UserService的实现类，调用其show()方法

        //创建容器
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取对象
        UserService userService = (UserService) app.getBean("userService");
        userService.show();
    }
}
