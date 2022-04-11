package com.demo;

import com.demo.msg.EmailMsg;
import com.demo.msg.Message;
import com.demo.msg.NoteMsg;
import com.demo.warning.Low;
import com.demo.warning.Middle;
import com.demo.warning.Senior;
import org.junit.Test;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/11 17:59
 * @description:
 */
public class DemoTest {

    // 邮件通知场景
    @Test
    public void emailTest(){
        Message emailMsg_Low = new EmailMsg(new Low());
        emailMsg_Low.send("1001", 10, "漏洞到达 10 进行通知");

        Message emailMsg_Middle = new EmailMsg(new Middle());
        emailMsg_Middle.send("1001", 100, "漏洞到达 100 进行通知");

        Message emailMsg_Senior = new EmailMsg(new Senior());
        emailMsg_Senior.send("1001", 10, "漏洞到达 1000 进行通知");

    }

    // 短信通知场景
    @Test
    public void noteTest(){
        Message noteMsg_Low = new NoteMsg(new Low());
        noteMsg_Low.send("1001", 10, "漏洞到达 10 进行通知");

        Message noteMsg_Middle = new NoteMsg(new Middle());
        noteMsg_Middle.send("1001", 100, "漏洞到达 100 进行通知");

        Message noteMsg_Senior = new NoteMsg(new Senior());
        noteMsg_Senior.send("1001", 10, "漏洞到达 1000 进行通知");
    }







}
