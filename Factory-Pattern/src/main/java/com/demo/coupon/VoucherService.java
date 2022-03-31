package com.demo.coupon;

import com.demo.Result;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.coupon
 * @date 2022/3/31 10:03
 * @description:
 */
public class VoucherService {

    public Result send(String uId, String couponNumber, String uuid, String limit){
        System.out.println("发放一张代金券: " + uId + "," + couponNumber + "," + uuid + "," + limit);
        return  new Result("0000", "SUCC");
    }


}
