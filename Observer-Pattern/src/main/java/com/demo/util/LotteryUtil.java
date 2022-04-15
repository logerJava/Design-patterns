package com.demo.util;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.util
 * @date 2022/4/15 11:50
 * @description:
 */
public class LotteryUtil {

    /**
     * 简单模拟摇号
     *
     * @param uId 用户编号
     * @return 结果
     */
    public String lottery(String uId) {
        return Math.abs(uId.hashCode()) % 2 == 0 ? "恭喜你，编码".concat(uId).concat("在本次摇号中签") : "很遗憾，编码".concat(uId).concat("在本次摇号未中签或摇号资格已过期");
    }
}
