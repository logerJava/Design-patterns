package com.demo;

import org.junit.Test;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/12 11:47
 * @description:
 */
public class DemoTest {

    @Test
    public void testAll(){
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator(new SsoInterceptor());
        String request = "1successzhangsan";
        boolean success = ssoDecorator.preHandler(request, "dasjdks", "t");
        System.out.println("登录校验: " + request + (success ? "通过" : "拦截"));
    }


}
