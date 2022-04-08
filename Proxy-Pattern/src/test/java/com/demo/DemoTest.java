package com.demo;

import com.demo.impl.TestServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/8 10:48
 * @description:
 */
public class DemoTest {

    private Logger log = LoggerFactory.getLogger(DemoTest.class);

    // 普通方法
    @Test
    public void test_1(){
        TestService testService = new TestServiceImpl();
        testService.getTestInfo();
    }

    // 静态代理
    @Test
    public void test_2(){
        TestStaticProxy testStaticProxy = new TestStaticProxy();
        testStaticProxy.getTestInfo();
    }

    // 动态代理
    @Test
    public void test_3(){
        TestService testService = new TestServiceImpl();
        InvocationHandler invocationHandler = new TestJDKProxyHandler(testService);
        TestService testServiceJDKProxy = (TestService) Proxy.newProxyInstance(testService.getClass().getClassLoader(), testService.getClass().getInterfaces(), invocationHandler);
        testServiceJDKProxy.getTestInfo();
    }




}
