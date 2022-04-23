package by.rom.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Frederik Chopin - \"Polonaise in G Minor\"";
    }
}
