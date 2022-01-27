package com.alilestera;

import com.alilestera.config.ApplicationConfig;
import com.alilestera.dao.UserDao;
import com.alilestera.dao.impl.UserDaoImpl;
import com.alilestera.domain.Student;
import com.alilestera.service.UserService;
import com.alilestera.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Alilestera
 * @date 1/24/2022
 */
public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UserDao userDao = (UserDaoImpl) app.getBean("userDao");
//        userDao.show();
        UserService userService = (UserServiceImpl) app.getBean("userService");
//        userService.show();
        Student student = (Student) app.getBean(Student.class);
        System.out.println("student = " + student);
    }
}
