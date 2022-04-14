package com.demo.impl;

import com.demo.AdvancedMediaPlayer;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.impl
 * @date 2022/4/14 9:51
 * @description:
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放 vlc, 文件名 : " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
