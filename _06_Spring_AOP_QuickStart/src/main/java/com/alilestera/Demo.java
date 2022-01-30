package com.alilestera;

import com.alilestera.services.ItemService;
import com.alilestera.services.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alilestera
 * @date 1/29/2022
 */
public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userSerive = (UserService) app.getBean("userService");
        ItemService itemService = (ItemService) app.getBean("itemService");
        itemService.deleteAll();
    }
}
