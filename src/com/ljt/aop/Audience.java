package com.ljt.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {

    @Before("execution(* com.ljt.aop.Performance.perform(..))")
    public void silenceCellPhone(){
        System.out.println("Silencing cell phones");
    }

}
