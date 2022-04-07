package com.demo.impl;

import com.demo.ICoupon;

import java.math.BigDecimal;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.impl
 * @date 2022/4/7 10:54
 * @description:
 */
public class ZKCoupon implements ICoupon<Double> {
    @Override
    public BigDecimal discountCalculate(Double couponInfo, BigDecimal standardPrice) {
        BigDecimal discountCalculate = standardPrice.multiply(new BigDecimal(couponInfo)).setScale(2, BigDecimal.ROUND_HALF_UP);
        if(discountCalculate.compareTo(BigDecimal.ZERO) < 1){
            return BigDecimal.ONE;
        }
        return discountCalculate;
    }
}
