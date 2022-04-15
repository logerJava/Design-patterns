package com.demo.event.listener;

import com.demo.LotteryResult;
import lombok.extern.slf4j.Slf4j;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.event.listener
 * @date 2022/4/15 11:20
 * @description:
 */
@Slf4j
public class MessageEventListener implements EventListener{

    @Override
    public void doEvent(LotteryResult result) {
        log.info("给用户 {} 发送短信通知(短信): {}", result.getUId(), result.getMsg());
    }
}
