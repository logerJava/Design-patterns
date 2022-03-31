package com.demo.coupon;

import com.demo.Result;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.coupon
 * @date 2022/3/31 10:02
 * @description:
 */
public class FulCutCouponService {

    public Result send(String uId, String couponNumber, String uuid, String minusLimit){
        System.out.println("发放一张满减券: " + uId + "," + couponNumber + "," + uuid + "," + minusLimit);
        return  new Result("0000", "SUCC");
    }

}
