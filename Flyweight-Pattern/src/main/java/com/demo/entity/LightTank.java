package com.demo.entity;

import com.demo.Tank;
import lombok.Data;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.entity
 * @date 2022/4/18 16:23
 * @description:
 */
@Data
public class LightTank implements Tank {

    private String color;

    private double length;

    private double width;

    private double weight;

    @Override
    public void getEquipmentInfo() {
        System.out.println("轻型坦克 : [颜色: " + color + ", 长: " + length + ", 宽: " + width + ", 重: " + weight + "]");
    }
}
