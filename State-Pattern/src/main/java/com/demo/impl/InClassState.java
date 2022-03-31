package com.demo.impl;

import com.demo.CourseStatus;
import com.demo.Result;
import com.demo.State;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.impl
 * @date 2022/3/30 13:58
 * @description:
 */
public class InClassState extends State {
    @Override
    public Result getInfo(String courseId, Enum<CourseStatus> currentStatus) {
        return new Result("0001", "正在上课...");
    }
}
