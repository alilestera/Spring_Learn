package com.alilestera;

import com.alilestera.domain.Student;
import com.alilestera.pojo.Toy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alilestera
 * @date 1/22/2022
 */
public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app =  new ClassPathXmlApplicationContext("applicationContext.xml");
        Toy dog = (Toy) app.getBean("monkey");
        Toy monkey = (Toy) app.getBean("dog");
        app.close();
    }
}
