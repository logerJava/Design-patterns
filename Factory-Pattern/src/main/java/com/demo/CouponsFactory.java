package com.demo;

import com.demo.coupon.DiscountCouponService;
import com.demo.impl.DiscountCoupon;
import com.demo.impl.FulCutCoupon;
import com.demo.impl.VoucherCoupon;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/3/31 11:05
 * @description:
 */
public class CouponsFactory {

    public Coupons getCouponsService(Integer type){
        if(null == type){
            return null;
        }
        if (1 == type) return new DiscountCoupon();
        if (2 == type) return new FulCutCoupon();
        if (3 == type) return new VoucherCoupon();
        throw new RuntimeException("不存在的商品服务类型");
    }

}
