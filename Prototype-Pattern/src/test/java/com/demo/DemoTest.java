package com.demo;

import org.junit.Test;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/2 15:47
 * @description:
 */
public class DemoTest {

    @Test
    public void testAll() throws CloneNotSupportedException {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("1001", "1000001921032"));
        System.out.println(questionBankController.createPaper("1002", "1000001921051"));
        System.out.println(questionBankController.createPaper("1003", "1000001921987"));
    }


}
