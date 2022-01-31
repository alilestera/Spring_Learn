package com.alilestera.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @author Alilestera
 * @date 1/29/2022
 */
@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(* com.alilestera.services..*.find*(..))")
    private void pt() {
    }

    @Pointcut("@annotation(com.alilestera.aspect.InvokeLog))")
    private void pt2() {
    }

    @Before("pt2()")
    private void methodBefore() {
        System.out.println("方法被调用了");
    }

    @AfterReturning(value = "pt()", returning = "ret")
    private void afterReturning(JoinPoint jp, Object ret) {
        System.out.println("afterReturning具体执行代码");
        System.out.println("ret = " + ret);
    }

    @AfterThrowing(value = "pt()", throwing = "t")
    private void afterThrowing(JoinPoint jp, Throwable t) {
        System.out.println("afterThrowing的具体执行代码");
        System.out.println("t.getMessage() = " + t.getMessage());
    }

    @Around("pt2()")
    private Object methodAround(ProceedingJoinPoint pjp) {
        Object[] args = pjp.getArgs();
        Object target = pjp.getTarget();
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        System.out.println("args = " + args);
        System.out.println("target = " + target);
        System.out.println("signature = " + signature);
        System.out.println("目标方法执行前");
        Object ret = null;
        try {
            ret = pjp.proceed();
            System.out.println("方法执行后");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("方法出现异常");
        } finally {
            System.out.println("finally中进行增强");
        }
        return ret;
    }
}
