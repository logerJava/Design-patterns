package com.demo;

import java.util.Map;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/3/31 9:44
 * @description:
 */
public interface Coupons {

    void sendCoupons(String uId, String couponsId, String activityId, Map<String, String> map)throws Exception;

}
