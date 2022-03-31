package com.demo;

import java.util.Map;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/3/31 14:34
 * @description: 懒汉式(线程不安全)
 */
public class Singleton_1 {

    private static Singleton_1 instance;

    private Singleton_1(){

    }

    public static Singleton_1 getInstance(){
        if(null != instance){
            return instance;
        }
        instance = new Singleton_1();
        return instance;
    }

}
