package com.demo;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/12 11:31
 * @description:
 */
public interface HandlerInterceptor {

    boolean preHandler(String request, String response, Object handler);

}
