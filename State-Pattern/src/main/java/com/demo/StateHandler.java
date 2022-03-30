package com.demo;

import com.demo.impl.CancelState;
import com.demo.impl.CompletedState;
import com.demo.impl.InClassState;
import com.demo.impl.WaitState;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Copyright 2022 juzishu.com.cn Inc. All Rights Reserved.
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/3/30 14:03
 * @description:
 */
public class StateHandler {

    private Map<Enum<CourseStatus>, State> map = new ConcurrentHashMap<>();

    public StateHandler(){
        map.put(CourseStatus.Cancel, new CancelState());
        map.put(CourseStatus.WaitingClass, new WaitState());
        map.put(CourseStatus.InClass, new InClassState());
        map.put(CourseStatus.Completed, new CompletedState());
    }

    public Result getInfo(String courseId, Enum<CourseStatus> currentStatus) {
        return map.get(currentStatus).getInfo(courseId, currentStatus);
    }


}
