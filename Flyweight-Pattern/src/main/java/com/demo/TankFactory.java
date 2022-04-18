package com.demo;

import com.demo.entity.LightTank;

import java.util.HashMap;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/18 16:30
 * @description:
 */
public class TankFactory {

    private static final HashMap<String, Tank> map = new HashMap<>();

    public static Tank getLightTank(String color){
        LightTank lightTank = (LightTank) map.get(color);
        if(null == lightTank){
            lightTank = new LightTank();
            lightTank.setColor(color);
            map.put(color, lightTank);
        }
        return lightTank;
    }


}
