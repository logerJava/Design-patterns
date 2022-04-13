package com.demo.impl;

import com.demo.AuthInfo;
import com.demo.AuthLink;
import com.demo.AuthService;

import java.text.ParseException;
import java.util.Date;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.impl
 * @date 2022/4/13 13:55
 * @description: 主管审批
 */
public class SupervisorAuthLink extends AuthLink {

    private Date beginDate = sdf.parse("2022-04-13 00:00:00");
    private Date endDate = sdf.parse("2022-04-13 23:59:59");

    public SupervisorAuthLink(String roleId, String userName) throws ParseException {
        super(roleId, userName);
    }

    @Override
    public AuthInfo doAuth(String uId, String taskId, Date authDate) {
        Date date = AuthService.queryAuthInfo(roleId, taskId);
        if (null == date) {
            return new AuthInfo("0001", "任务id：", taskId, " 状态：待审批主管 ", userName);
        }
        AuthLink next = super.next();
        if (null == next) {
            return new AuthInfo("0000", "任务id：", taskId, " 状态：主管审批完成", " 时间：", sdf.format(date), " 审批人：", userName);
        }

        if (authDate.before(beginDate) || authDate.after(endDate)) {
            return new AuthInfo("0000", "任务id：", taskId, " 状态：主管审批完成", " 时间：", sdf.format(date), " 审批人：", userName);
        }

        return next.doAuth(uId, taskId, authDate);
    }
}
