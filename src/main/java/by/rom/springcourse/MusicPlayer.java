package by.rom.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    //    @Autowired
//    @Qualifier ("classicalMusic")
//    private Music music1;
//    private Music music2;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

//    @Autowired
//    public MusicPlayer(@Qualifier ("classicalMusic")Music music1, @Qualifier ("rockMusic")Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if (genre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        } else {
            System.out.println(rockMusic.getSongs().get(randomNumber));
        }
    }
}