package com.demo.warning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.warning
 * @date 2022/4/11 17:54
 * @description:
 */
public class Middle implements IWarning{

    private Logger log = LoggerFactory.getLogger(Middle.class);

    @Override
    public void notice(String uId) {
        log.info("中级告警 ......");
    }
}
