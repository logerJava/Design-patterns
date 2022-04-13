package com.demo;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/13 14:00
 * @description:
 */
public class AuthService {

    private static Map<String, Date> authMap = new ConcurrentHashMap<>();

    // 模拟查询审批结果
    public static Date queryAuthInfo(String uId, String taskId) {
        return authMap.get(uId.concat(taskId));
    }

    // 模拟审批
    public static void auth(String uId, String taskId) {
        authMap.put(uId.concat(taskId), new Date());
    }

}
