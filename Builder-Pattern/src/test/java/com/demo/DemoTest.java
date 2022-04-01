package com.demo;

import org.junit.Test;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/1 11:49
 * @description:
 */
public class DemoTest {


    @Test
    public void testAll(){
        Builder builder = new Builder();
        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());
        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());
        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }


}
