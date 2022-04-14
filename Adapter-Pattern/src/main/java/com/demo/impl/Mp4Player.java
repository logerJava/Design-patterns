package com.demo.impl;

import com.demo.AdvancedMediaPlayer;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.impl
 * @date 2022/4/14 9:52
 * @description:
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放 Mp4, 文件名 : " + fileName);
    }
}
