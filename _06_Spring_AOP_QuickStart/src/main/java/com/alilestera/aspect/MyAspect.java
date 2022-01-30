package com.alilestera.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Alilestera
 * @date 1/29/2022
 */
@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(* com.alilestera.services..*.*(..))")
    private void pt() {
    }

    @Before("pt()")
    private void methodBefore() {
        System.out.println("方法被调用了");
    }
}
