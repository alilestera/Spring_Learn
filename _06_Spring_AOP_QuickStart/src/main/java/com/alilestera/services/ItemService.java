package com.alilestera.services;

import com.alilestera.aspect.InvokeLog;
import org.springframework.stereotype.Service;

/**
 * @author Alilestera
 * @date 1/29/2022
 */
@Service("itemService")
public class ItemService {

    @InvokeLog
    public void findAnyItem() {
        System.out.println("findAnyItem的具体实现代码");
    }

    @InvokeLog
    public void deleteAll() {
        System.out.println("deleteAll的具体实现代码");
    }
}
