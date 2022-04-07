package com.demo.impl;

import com.demo.ICoupon;

import java.math.BigDecimal;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.impl
 * @date 2022/4/7 10:49
 * @description:
 */
public class ZJCoupon implements ICoupon<Double> {
    @Override
    public BigDecimal discountCalculate(Double couponInfo, BigDecimal standardPrice) {
        BigDecimal discountCalculate = standardPrice.subtract(new BigDecimal(couponInfo));
        if(discountCalculate.compareTo(BigDecimal.ZERO) < 1){
            return BigDecimal.ONE;
        }
        return discountCalculate;
    }
}
