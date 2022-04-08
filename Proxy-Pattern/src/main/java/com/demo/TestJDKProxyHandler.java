package com.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/8 10:35
 * @description:
 */
public class TestJDKProxyHandler implements InvocationHandler {

    private Object object;

    public TestJDKProxyHandler(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理, before " + method.getName());
        method.invoke(object, args);
        System.out.println("动态代理, after " + method.getName());
        return null;
    }

}
