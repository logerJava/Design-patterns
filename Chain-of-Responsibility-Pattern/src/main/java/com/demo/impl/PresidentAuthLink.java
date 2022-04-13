package com.demo.impl;

import com.demo.AuthInfo;
import com.demo.AuthLink;
import com.demo.AuthService;

import java.util.Date;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.impl
 * @date 2022/4/13 13:54
 * @description: 总裁审批
 */
public class PresidentAuthLink extends AuthLink {
    public PresidentAuthLink(String roleId, String userName) {
        super(roleId, userName);
    }

    @Override
    public AuthInfo doAuth(String uId, String taskId, Date authDate) {
        Date date = AuthService.queryAuthInfo(roleId, taskId);
        if(null == date){
            return new AuthInfo("0001", "任务id : ", taskId, "状态 : 待审批总裁 ", roleId);
        }
        AuthLink next = super.next();
        if(null == next){
            return new AuthInfo("0000", "任务id : ", taskId, "状态 : 总裁审批完成", "时间 : ", sdf.format(date), "审批人 : ", userName);
        }

        return next.doAuth(uId, taskId, authDate);
    }
}
