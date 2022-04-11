package com.demo.msg;

import com.demo.warning.IWarning;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.msg
 * @date 2022/4/11 17:40
 * @description:
 */
public abstract class Message {

    protected Logger log = LoggerFactory.getLogger(Message.class);

    protected IWarning iWarning;

    public Message(IWarning iWarning){
        this.iWarning = iWarning;
    }

    public abstract String send(String uId, Integer count, String remark);


}
