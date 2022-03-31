package com.demo;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/3/31 15:03
 * @description: CAS「AtomicReference」(线程安全)
 */
public class Singleton_6 {

    private static final AtomicReference<Singleton_6> INSTANCE = new AtomicReference<>();

    private Singleton_6(){}

    public static final Singleton_6 getInstance(){
        for (; ; ) {
             Singleton_6 instance = INSTANCE.get();
             if(null != instance){
                return instance;
             }
             INSTANCE.compareAndSet(null, new Singleton_6());
            return INSTANCE.get();
        }
    }

    /**
     * java并发库提供了很多原子类来支持并发访问的数据安全性；AtomicInteger、AtomicBoolean、AtomicLong、AtomicReference。
     * AtomicReference<V> 可以封装引用一个V实例，支持并发访问如上的单例方式就是使用了这样的一个特点。
     * 使用CAS的好处就是不需要使用传统的加锁方式保证线程安全，而是依赖于CAS的忙等算法，依赖于底层硬件的实现，来保证线程安全。相对于其他锁的实现没有线程的切换和阻塞也就没有了额外的开销，并且可以支持较大的并发性。
     * 当然CAS也有一个缺点就是忙等，如果一直没有获取到将会处于死循环中。
     */

    public static void main(String[] args) {
        System.out.println(Singleton_6.getInstance());
        System.out.println(Singleton_6.getInstance());
    }

}
