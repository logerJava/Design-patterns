package com.demo.impl;

import com.demo.CourseStatus;
import com.demo.Result;
import com.demo.State;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.impl
 * @date 2022/3/30 13:59
 * @description:
 */
public class CompletedState extends State {
    @Override
    public Result getInfo(String courseId, Enum<CourseStatus> currentStatus) {
        return new Result("0001", "上课完成, 查看回放");
    }
}
