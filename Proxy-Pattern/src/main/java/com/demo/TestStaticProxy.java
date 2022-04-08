package com.demo;

import com.demo.impl.TestServiceImpl;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/8 10:29
 * @description:
 */
public class TestStaticProxy implements TestService{

    private TestService testService;

    @Override
    public void getTestInfo() {
        if(null == testService){
            testService = new TestServiceImpl();
        }
        System.out.println("静态代理, before get test info");
        testService.getTestInfo();
        System.out.println("静态代理, after get test info");
    }
}
