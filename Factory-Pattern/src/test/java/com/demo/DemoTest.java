package com.demo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/3/31 11:08
 * @description:
 */
public class DemoTest {


    @Test
    public void testAll() throws Exception {

        CouponsFactory couponsFactory = new CouponsFactory();


        // 1.折扣券
        Coupons coupons_1 = couponsFactory.getCouponsService(1);
        coupons_1.sendCoupons("101101", "ZK1023938910232121323432", "202203CX", new HashMap<String, String>() {
            {
                put("discountRatio", "5折");
            }
        });

        // 2.满减券
        Coupons coupons_2 = couponsFactory.getCouponsService(2);
        coupons_2.sendCoupons("101101", "MJ1023938910232121323432", "202203CX", new HashMap<String, String>() {
            {
                put("limit", "满200减50");
            }
        });

        // 3.代金券
        Coupons coupons_3 = couponsFactory.getCouponsService(3);
        coupons_3.sendCoupons("101101", "DJ1023938910232121323432", "202203CX", new HashMap<String, String>() {
            {
                put("minusLimit", "50元");
            }
        });

    }


}
