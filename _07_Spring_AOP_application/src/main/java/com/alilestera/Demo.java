package com.alilestera;

import com.alilestera.controller.AIController;
import com.alilestera.utils.CryptUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alilestera
 * @date 1/31/2022
 */
public class Demo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AIController aiController = applicationContext.getBean(AIController.class);
        String name = CryptUtil.AESencode("好的好的");
        String result = aiController.fortuneTelling(name);
        System.out.println("result = " + result);
    }
}
