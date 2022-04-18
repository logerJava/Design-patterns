package com.demo;

import com.demo.entity.LightTank;
import org.junit.Test;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/18 15:58
 * @description:
 */
public class DemoTest {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    @Test
    public void testAll(){

        for (int i = 0; i < 30; i++) {
            LightTank lightTank = (LightTank) TankFactory.getLightTank(getRandomColor());
            lightTank.setLength(getRandomLength());
            lightTank.setWidth(getRandomWidth());
            lightTank.setWeight(getRandomWeight());
            lightTank.getEquipmentInfo();
        }

    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomLength() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomWidth() {
        return (int)(Math.random()*100);
    }
    private static int getRandomWeight() {
        return (int)(Math.random()*100);
    }






}
