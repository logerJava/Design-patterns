package com.demo;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/15 11:52
 * @description:
 */
@Slf4j
public class DemoTest {

    @Test
    public void testAll(){
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult lotteryResult = lotteryService.draw("2765789109876");
        log.info("结果: {}", JSONObject.toJSONString(lotteryResult));
    }

}
