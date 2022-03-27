package com.hello.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author smile
 */
@Component
@Aspect
public class ServiceAspect {
    @Pointcut("execution(* com.hello.service.*.*(..))")
    public void point() {
    }

    @Before("point()")
    public void before() {
        System.out.println("hello before");
    }

    @After("point()")
    public void after() {
        System.out.println("hello after");
    }
}
