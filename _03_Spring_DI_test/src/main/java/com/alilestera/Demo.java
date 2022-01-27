package com.alilestera;

import com.alibaba.druid.pool.DruidDataSource;
import com.alilestera.domain.Phone;
import com.alilestera.domain.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alilestera
 * @date 1/17/2022
 */
public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) app.getBean("user");
        System.out.println(user);

        DruidDataSource dataSource = (DruidDataSource) app.getBean("dataSource");
        System.out.println("dataSource = " + dataSource);
    }
}
