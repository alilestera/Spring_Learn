package com.alilestera;

import com.alilestera.dao.StudentDao;
import com.alilestera.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alilestera
 * @date 1/15/2022
 */
public class Demo {
    public static void main(String[] args) {
        //创建容器
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        StudentDao studentDao = (StudentDao) app.getBean("studentDao");
        StudentDao studentDao2 = (StudentDao) app.getBean("studentDao");
        System.out.println("studentDao.hashCode() = " + studentDao.hashCode());
        System.out.println("studentDao2.hashCode() = " + studentDao2.hashCode());
        //测试
        Student stu = studentDao.getStudentById(2);
        System.out.println(stu);
    }
}
