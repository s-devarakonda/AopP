package org.neoteric.javaMavenDemo.cglibproxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* org.neoteric.javaMavenDemo.cglibproxy.VideoService.*(..))")
    public void videoServiceMethods() {
        // Pointcut signature
    }

    @Before("videoServiceMethods()")
    public void beforeVideoServiceMethod(JoinPoint joinPoint) {
        System.out.println("Before method: " + joinPoint.getSignature().getName());
    }

    @After("videoServiceMethods()")
    public void afterVideoServiceMethod(JoinPoint joinPoint) {
        System.out.println("After method: " + joinPoint.getSignature().getName());
    }
}
