package com.demo;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/3/31 14:47
 * @description: 饿汉式(线程安全)
 */
public class Singleton_3 {

    private static Singleton_3 instance = new Singleton_3();

    private Singleton_3(){}

    public static Singleton_3 getInstance(){
        return instance;
    }


}
