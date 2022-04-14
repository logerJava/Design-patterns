package com.demo.impl;

import com.demo.MediaPlayer;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo.impl
 * @date 2022/4/14 9:58
 * @description:
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        if("mp3".equalsIgnoreCase(audioType)){
            System.out.println("播放 Mp3, 文件名 : " + fileName);
        }else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else {
            System.out.println("无效的媒体格式 : " + audioType);
        }

    }
}
