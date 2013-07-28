/**
 * Copyright_2006, Liao Xuefeng
 * Created on 2006-3-9
 * For more information, please visit: http://www.crackj2ee.com
 */
package com.javaeedev.example.spring;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class LogAdvisor implements MethodBeforeAdvice {

    public void before(Method m, Object[] args, Object target) throws Throwable {
        System.out.println("[Log] " + target.getClass().getName() + "." + m.getName() + "()");
    }

}
