package com.ljt.aop;

import org.aspectj.lang.annotation.*;


@Aspect
public class Audience {

    @Pointcut("execution(* com.ljt.aop.Performance.perform(..))")
    public void performance(){

    }

    @Before("execution(* com.ljt.aop.Performance.perform(..))")
    public void silenceCellPhone(){
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }


    @After("performance()")
    public void leave(){
        System.out.println("Leaving");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Deamnding a refund");
    }

}
