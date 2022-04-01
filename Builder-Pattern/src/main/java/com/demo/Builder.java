package com.demo;

import com.demo.ceiling.LevelOneCeiling;
import com.demo.ceiling.LevelTwoCeiling;
import com.demo.coat.DuluxCoat;
import com.demo.coat.LiBangCoat;
import com.demo.floor.ShengXiangFloor;
import com.demo.tile.DongPengTile;
import com.demo.tile.MarcoPoloTile;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/1 11:41
 * @description:
 */
public class Builder {

    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }

    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }


}
