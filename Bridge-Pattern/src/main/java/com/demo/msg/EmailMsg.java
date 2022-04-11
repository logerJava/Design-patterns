package com.demo.msg;

import com.demo.warning.IWarning;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.msg
 * @date 2022/4/11 17:48
 * @description:
 */
public class EmailMsg extends Message{

    public EmailMsg(IWarning iWarning) {
        super(iWarning);
    }

    @Override
    public String send(String uId, Integer count, String remark) {
        log.info("发送邮件信息 : uId : {}, count : {}, remark : {}", uId, count, remark);
        iWarning.notice(uId);
        return "succ";
    }
}
