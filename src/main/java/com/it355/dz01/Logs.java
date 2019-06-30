/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.dz01;





import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author mirai
 */

@Aspect
public class Logs {
    
    private final Logger log = Logger.getLogger("");
    
    @After("execution(* com.it255.dz01.IndexController.*(..))")
    public void logAfter(JoinPoint point) {
        log.info(point.getSignature().getName() + " je pokrenuta. Valjda.");
    }
    
    @Before("execution(* com.it255.dz01.IndexController.*(..))")
    public void logBefore(JoinPoint point) {
        log.info(point.getSignature().getName() + " ce se pokrenuti. Valjda.");
    }

}
