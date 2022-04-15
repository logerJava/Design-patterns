package com.demo;

import com.demo.util.LotteryUtil;

import java.util.Date;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/15 11:47
 * @description:
 */
public class LotteryServiceImpl extends LotteryService{

    private LotteryUtil lotteryUtil = new LotteryUtil();

    @Override
    protected LotteryResult doDraw(String uId) {
        String lottery = lotteryUtil.lottery(uId);
        return new LotteryResult(uId, lottery, new Date());
    }
}
