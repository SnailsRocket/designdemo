package com.xubo.snailsrocket;

import com.xubo.snailsrocket.ceiling.LevelOneCeiling;
import com.xubo.snailsrocket.ceiling.LevelTwoCeiling;
import com.xubo.snailsrocket.coat.DuluxCoat;
import com.xubo.snailsrocket.coat.LiBangCoat;
import com.xubo.snailsrocket.floor.ShengXiangFloor;
import com.xubo.snailsrocket.tile.DongPengTile;
import com.xubo.snailsrocket.tile.MarcoPoloTile;

/**
 * @Author xubo
 * @Date 2023/10/26 16:56
 * @Description：
 * @Version 1.0
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
