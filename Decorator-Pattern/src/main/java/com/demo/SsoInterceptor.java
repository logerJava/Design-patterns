package com.demo;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/12 11:32
 * @description:
 */
public class SsoInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandler(String request, String response, Object handler) {
        // 模拟获取 cookie
        String ticket = request.substring(1, 8);
        // 模拟校验
        return ticket.equals("success");
    }
}
