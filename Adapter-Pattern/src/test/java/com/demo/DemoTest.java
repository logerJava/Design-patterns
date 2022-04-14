package com.demo;

import com.demo.impl.AudioPlayer;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chao
 * @project Design-patterns
 * @package com.demo
 * @date 2022/4/14 10:02
 * @description:
 */
public class DemoTest {

    @Test
    public void testAll(){
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "这世界那么多人.mp3");
        audioPlayer.play("mp4", "鸡你太美.mp4");
        audioPlayer.play("vlc", "第三套中学生广播体操.vlc");
        audioPlayer.play("avi", "太太你也不想让弟弟难过吧.avi");

    }


}
