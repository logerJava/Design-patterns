package com.demo;

import java.math.BigDecimal;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/7 10:05
 * @description:
 */
public interface ICoupon<T> {

    BigDecimal discountCalculate(T couponInfo, BigDecimal standardPrice);


}
