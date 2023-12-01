package kiryasay.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Neil Alishev
 */
@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    @Value("${MusicPlayer.name}")
    private String name;
    @Value("${MusicPlayer.volume}")
    private int volume;
    Random random= new Random();
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(Genre genre) {
        switch (genre){
            case ROCKMUSIC:
               return music1.getSong(random.nextInt(3));
            case CLASSICALMUSIC:
               return music2.getSong(random.nextInt(3));
        }
        return "";
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}