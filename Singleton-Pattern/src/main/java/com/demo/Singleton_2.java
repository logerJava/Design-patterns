package com.demo;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/3/31 14:39
 * @description: 懒汉式(线程安全)
 */
public class Singleton_2 {

    private static Singleton_2 instance;

    private Singleton_2(){

    }

    public static synchronized Singleton_2 getInstance(){
        if(null != instance){
            return instance;
        }
        instance = new Singleton_2();
        return instance;
    }


}
