package com.demo;

import com.demo.impl.MJCoupon;
import com.demo.impl.ZJCoupon;
import com.demo.impl.ZKCoupon;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/7 11:00
 * @description:
 */
public class DemoTest {

    private Logger log = LoggerFactory.getLogger(DemoTest.class);

    // 直减
    @Test
    public void test_zj(){
        Context<Double> context = new Context<>(new ZJCoupon());
        BigDecimal discountCalculate = context.discountCalculate(10D, new BigDecimal(100));
        log.info("直减后金额 : {}", discountCalculate);
    }

    // 满减
    @Test
    public void test_mj(){
        Context<Map<String, String>> context = new Context<>(new MJCoupon());
        Map<String, String> map = new HashMap<>();
        map.put("condition", "100");
        map.put("derate", "10");
        BigDecimal discountCalculate = context.discountCalculate(map, new BigDecimal(100));
        log.info("满减后金额 : {}", discountCalculate);
    }

    // 折扣
    @Test
    public void test_zk(){
        Context<Double> context = new Context<>(new ZKCoupon());
        BigDecimal discountCalculate = context.discountCalculate(0.9D, new BigDecimal(100));
        log.info("折扣后金额 : {}", discountCalculate);
    }

}
