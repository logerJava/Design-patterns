package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/12 11:34
 * @description:
 */
public class LoginSsoDecorator extends SsoDecorator{

    private Logger log = LoggerFactory.getLogger(LoginSsoDecorator.class);

    private static Map<String, String> authMap = new ConcurrentHashMap<>();

    static {
        authMap.put("zhangsan", "queryUserInfo");
        authMap.put("lisi", "queryUserInfo");
    }

    public LoginSsoDecorator(HandlerInterceptor handlerInterceptor) {
        super(handlerInterceptor);
    }

    @Override
    public boolean preHandler(String request, String response, Object handler) {
        boolean success = super.preHandler(request, response, handler);
        if(!success){
            return false;
        }
        String uId = request.substring(8);
        String method = authMap.get(uId);
        log.info("模拟单点登录方法访问拦截校验 : {} {}", uId, method);
        return "queryUserInfo".equals(method);
    }
}
