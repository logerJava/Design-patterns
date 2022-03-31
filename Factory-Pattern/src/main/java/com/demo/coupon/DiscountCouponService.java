package com.demo.coupon;

import com.demo.Result;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.coupon
 * @date 2022/3/31 10:01
 * @description:
 */
public class DiscountCouponService {

    public Result send(String uId, String couponNumber, String uuid, String discountRatio){
        System.out.println("发放一张折扣券: " + uId + "," + couponNumber + "," + uuid + "," + discountRatio);
        return  new Result("0000", "SUCC");
    }


}
