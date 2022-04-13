package com.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.demo.impl.FinancialAuthLink;
import com.demo.impl.PresidentAuthLink;
import com.demo.impl.SupervisorAuthLink;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.util.Date;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/13 14:58
 * @description:
 */
public class DemoTest {

    private final Logger log = LoggerFactory.getLogger(DemoTest.class);

    @Test
    public void testAll() throws ParseException {
        AuthLink authLink = new SupervisorAuthLink("1", "王主管")
                .appendNext(new FinancialAuthLink("2", "张财务")
                        .appendNext(new PresidentAuthLink("3", "段总裁")));


        // 模拟主管
        AuthService.auth("1000013", "1000998004813441");
        log.info("测试结果：{}", "模拟主管审批，王主管");
        log.info("测试结果：{}", JSONObject.toJSONString(authLink.doAuth("1001", "1000998004813441", new Date())));

        // 模拟财务
        AuthService.auth("1000012", "1000998004813441");
        log.info("测试结果：{}", "模拟财务审批，张财务");
        log.info("测试结果：{}", JSONObject.toJSONString(authLink.doAuth("1001", "1000998004813441", new Date())));

        // 模拟总裁
        AuthService.auth("1000011", "1000998004813441");
        log.info("测试结果：{}", "模拟总裁审批，段总裁");
        log.info("测试结果：{}", JSONObject.toJSONString(authLink.doAuth("1001", "1000998004813441", new Date())));
    }



}
