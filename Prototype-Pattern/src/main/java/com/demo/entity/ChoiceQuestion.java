package com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * 单选题
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChoiceQuestion {

    private String name;                 // 题目
    private Map<String, String> option;  // 选项；A、B、C、D
    private String key;                  // 答案；B

}
