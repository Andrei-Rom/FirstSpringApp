package by.rom.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Mozart - \"The Marriage of Figaro\"");
        songs.add("Frederik Chopin - \"Polonaise in G Minor\"");
        songs.add("Schubert - \"Piano Trio No.2 In E Flat Major\"");
    }

    @Override
    public String getSong() {
        return songs.get(1);
    }
}
