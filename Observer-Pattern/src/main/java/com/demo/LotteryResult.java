package com.demo;

import lombok.Data;

import java.util.Date;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.event.listener
 * @date 2022/4/15 10:56
 * @description:
 */
@Data
public class LotteryResult {

    private String uId;

    private String msg;

    private Date dateTime;

    public LotteryResult(String uId, String msg, Date dateTime) {
        this.uId = uId;
        this.msg = msg;
        this.dateTime = dateTime;
    }



}
