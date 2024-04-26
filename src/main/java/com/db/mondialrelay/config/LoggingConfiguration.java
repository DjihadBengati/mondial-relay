package com.db.mondialrelay.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Mondial Relay logging configuration
 *
 * @Author Djihad BENGATI
 */
@Aspect
@Component
@Slf4j
public class LoggingConfiguration {

    @Before("execution(* com.db.mondialrelay.service.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String methodName = methodSignature.getMethod().getName();
        Object[] arguments = joinPoint.getArgs();
        log.info("{method: {}, Request: {}}", methodName, Arrays.toString(arguments));
    }
}
