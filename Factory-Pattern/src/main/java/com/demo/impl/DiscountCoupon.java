package com.demo.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.demo.Coupons;
import com.demo.Result;
import com.demo.coupon.DiscountCouponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/3/31 9:49
 * @description:
 */
public class DiscountCoupon implements Coupons {

    private Logger log = LoggerFactory.getLogger(DiscountCoupon.class);

    private DiscountCouponService discountCouponService = new DiscountCouponService();

    @Override
    public void sendCoupons(String uId, String couponsId, String activityId, Map<String, String> map) throws Exception {
        Result result = discountCouponService.send(uId, couponsId, activityId, map.get("discountRatio"));
        log.info("请求参数 : uId：{} couponsId：{} activityId：{} map：{}", uId, couponsId, activityId, JSONObject.toJSONString(map));
        log.info("结果 : {}", JSONObject.toJSONString(result));
        if(!"0000".equals(result.getCode())){
            throw new RuntimeException(result.getMsg());
        }

    }


}
