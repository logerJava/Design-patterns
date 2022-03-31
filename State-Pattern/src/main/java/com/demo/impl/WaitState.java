package com.demo.impl;

import com.demo.CourseStatus;
import com.demo.Result;
import com.demo.State;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.impl
 * @date 2022/3/30 13:48
 * @description:
 */
public class WaitState extends State {

    @Override
    public Result getInfo(String courseId, Enum<CourseStatus> currentStatus) {
        return new Result("0001", "马上就要上课啦, 请进入教室等待");
    }

}
