package com.demo.event.listener;

import com.demo.LotteryResult;
import lombok.extern.slf4j.Slf4j;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.event.listener
 * @date 2022/4/15 11:24
 * @description:
 */
@Slf4j
public class MQEventListener implements EventListener{
    @Override
    public void doEvent(LotteryResult result) {
        log.info("记录用户 {} 摇号结果(MQ): {}", result.getUId(), result.getMsg());
    }
}
