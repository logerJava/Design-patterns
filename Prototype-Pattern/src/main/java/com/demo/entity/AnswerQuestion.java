package com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 解答题
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnswerQuestion {

    private String name;  // 问题
    private String key;   // 答案

}
