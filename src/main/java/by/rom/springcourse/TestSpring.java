package by.rom.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer player = new MusicPlayer(music);
//        player.playMusic();
//
//        Music music1 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(music1);
//        classicalMusicPlayer.playMusic();

//        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
//        player.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
