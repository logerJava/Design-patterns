package com.demo;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Copyright 2022 juzishu.com.cn Inc. All Rights Reserved.
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/3/30 14:02
 * @description:
 */
public class DemoTest {

    private Logger log = LoggerFactory.getLogger(DemoTest.class);

    @Test
    public void test(){
        String courseId = "1001";

        StateHandler stateHandler = new StateHandler();
        Result result = stateHandler.getInfo(courseId, CourseStatus.Cancel);

        log.info("测试结果: {}", JSONObject.toJSONString(result));


    }



}
