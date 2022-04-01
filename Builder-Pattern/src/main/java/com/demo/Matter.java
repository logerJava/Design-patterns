package com.demo;

import java.math.BigDecimal;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/1 11:34
 * @description:
 */
public interface Matter {

    /**
     * 场景；地板、地砖、涂料、吊顶
     */
    String scene();

    /**
     * 品牌
     */
    String brand();

    /**
     * 型号
     */
    String model();

    /**
     * 平米报价
     */
    BigDecimal price();

    /**
     * 描述
     */
    String desc();

}
