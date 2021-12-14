package com.myproject.laba3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.security.sasl.SaslServer;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Component
@Aspect
public class AspectClass {

    @Before("execution(public void PushToStore(*))")
    public void beforePushToStore(){ System.out.println("@BeforeAdvice: метод PushToStore"); }

    @Before("execution(public void getItemFromStore(*))")
    public void beforeGetItemFromStore(){
        System.out.println("@BeforeAdvice: метод getItemFromStore");
    }

    @AfterReturning("execution(public void getItemFromStore(int))")
    public void afterReturning() {
        System.out.println();
        System.out.println("@AfterReturning: метод getItemFromStore");
    }

    @AfterThrowing("execution(public void getItemFromStore(int))")
    public void afterThrowingOutOfBoundsExcept(){
        System.out.println();
        System.out.println("@AfterThrowing: метод getItemFromStore");
    }

    @After("execution(public static void Task())")
    public void AfterFinnaly() {
        System.out.println("@After(finnaly): После выполнения основного метода");
    }

    @Around("execution(public static String Task())")
    public Object AroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("@Around: начало: " + getCurTime());
        MethodSignature ms = (MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature: " + ms);
        System.out.println("method = : " + ms.getMethod());
        System.out.println("methodReturnType = : " + ms.getReturnType());
        System.out.println("methodName = : " + ms.getName());
        if(ms.getName().equals("Task")){
            System.out.println("MethodSignature equals 'Task': Всё работает");
        }
        Object obj = null;

        try{
            obj = joinPoint.proceed();
        }
        catch (Exception e) {
            System.out.println("@Around_Exception: Ошибка выполнения метода: " + e.getMessage());
            obj = "@Around_TargetMethodResult: Была отловлена ошибка";
        }

        System.out.println("@Around: конец: " + getCurTime());
        return obj;
    }

    private String getCurTime(){
        return new SimpleDateFormat("HH:mm:ss dd:MM:yyyy").format(Calendar.getInstance().getTime());
    }
}
