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
 * @date 2022/4/13 11:13
 * @description: 财务审批
 */
public class FinancialAuthLink extends AuthLink {

    private Date beginDate = sdf.parse("2022-04-13 00:00:00");
    private Date endDate = sdf.parse("2022-04-13 23:59:59");

    public FinancialAuthLink(String roleId, String userName) throws ParseException {
        super(roleId, userName);
    }

    @Override
    public AuthInfo doAuth(String uId, String taskId, Date authDate) {
        Date date = AuthService.queryAuthInfo(roleId, taskId);
        if (null == date) {
            return new AuthInfo("0001", "任务id：", taskId, " 状态：待审批财务 ", userName);
        }
        AuthLink next = super.next();
        if (null == next) {
            return new AuthInfo("0000", "任务id：", taskId, " 状态：财务审批完成", " 时间：", sdf.format(date), " 审批人：", userName);
        }

        if (authDate.before(beginDate) || authDate.after(endDate)) {
            return new AuthInfo("0000", "任务id：", taskId, " 状态：财务审批完成", " 时间：", sdf.format(date), " 审批人：", userName);
        }

        return next.doAuth(uId, taskId, authDate);
    }
}
