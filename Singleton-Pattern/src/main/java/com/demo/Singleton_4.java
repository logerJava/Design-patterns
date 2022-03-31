package com.demo;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/3/31 14:52
 * @description: 内部类(线程安全)
 */
public class Singleton_4 {

    private static class singletonHolder{
        private static Singleton_4 instance = new Singleton_4();
    }

    private Singleton_4(){}

    public static Singleton_4 getInstance(){
        return singletonHolder.instance;
    }

}
