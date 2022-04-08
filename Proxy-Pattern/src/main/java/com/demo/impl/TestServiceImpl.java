package com.demo.impl;

import com.demo.TestService;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.impl
 * @date 2022/4/8 10:28
 * @description:
 */
public class TestServiceImpl implements TestService {
    @Override
    public void getTestInfo() {
        System.out.println("get test info succ");
    }
}
