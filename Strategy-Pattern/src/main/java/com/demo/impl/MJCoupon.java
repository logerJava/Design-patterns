package com.demo.impl;

import com.demo.ICoupon;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.impl
 * @date 2022/4/7 10:10
 * @description:
 */
public class MJCoupon implements ICoupon<Map<String, String>> {


    @Override
    public BigDecimal discountCalculate(Map<String, String> couponInfo, BigDecimal standardPrice) {

        String condition = couponInfo.get("condition"); // 条件价格
        String derate = couponInfo.get("derate"); // 减免价格

        if(standardPrice.compareTo(new BigDecimal(condition)) < 0) {
            return standardPrice;
        }

        BigDecimal discountCalculate = standardPrice.subtract(new BigDecimal(derate));
        if(discountCalculate.compareTo(BigDecimal.ZERO) < 1){
            return BigDecimal.ONE;
        }

        return discountCalculate;
    }

}
