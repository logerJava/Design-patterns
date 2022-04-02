package com.demo.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.util
 * @date 2022/4/2 15:24
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topic {

    private Map<String, String> option;  // 选项；A、B、C、D
    private String key;           // 答案；B


}
