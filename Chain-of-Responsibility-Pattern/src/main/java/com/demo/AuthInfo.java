package com.demo;

import lombok.Data;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/13 9:54
 * @description:
 */
@Data
public class AuthInfo {

    private String code;

    private String info = "";

    public AuthInfo(String code, String...infos){
        this.code = code;
        for (String str : infos) {
            this.info = this.info.concat(str);
        }
    }



}
