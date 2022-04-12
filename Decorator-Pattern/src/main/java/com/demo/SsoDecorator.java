package com.demo;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/12 11:40
 * @description:
 */
public class SsoDecorator implements HandlerInterceptor{

    private HandlerInterceptor handlerInterceptor;

    public SsoDecorator(){}

    public SsoDecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    @Override
    public boolean preHandler(String request, String response, Object handler) {
        return handlerInterceptor.preHandler(request, response, handler);
    }
}
