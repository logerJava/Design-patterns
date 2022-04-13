package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/13 9:56
 * @description:
 */
public abstract class AuthLink {

    protected Logger log = LoggerFactory.getLogger(AuthLink.class);

    protected SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    protected String roleId;

    protected String userName;

    private AuthLink next;

    public AuthLink(String roleId, String userName){
        this.roleId = roleId;
        this.userName = userName;
    }

    public AuthLink next(){
        return next;
    }

    public AuthLink appendNext(AuthLink next){
        this.next = next;
        return this;
    }

    public abstract AuthInfo doAuth(String uId, String taskId, Date authDate);













}
