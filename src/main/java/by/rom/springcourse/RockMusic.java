package by.rom.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();
    {
        songs.add("Pink Floyd - \"Going To California\"");
        songs.add("Queen - \"Bohemian Rhapsody\"");
        songs.add("Led Zeppelin - \"Going To California\"");
    }

    @Override
    public String getSong() {
        return songs.get(1);
    }

}
