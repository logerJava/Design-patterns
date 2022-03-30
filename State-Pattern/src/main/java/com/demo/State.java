package com.demo;

/**
 * Copyright 2022 juzishu.com.cn Inc. All Rights Reserved.
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/3/30 13:30
 * @description:
 */
public abstract class State {

    public abstract Result getInfo (String courseId, Enum<CourseStatus> currentStatus);


}
