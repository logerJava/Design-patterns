package com.demo;

import java.math.BigDecimal;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/7 10:56
 * @description:
 */
public class Context<T> {

    private ICoupon<T> coupon;

    public Context(ICoupon<T> coupon){
        this.coupon = coupon;
    }

    public BigDecimal discountCalculate(T couponInfo, BigDecimal standardPrice){
        return coupon.discountCalculate(couponInfo, standardPrice);
    }


}
