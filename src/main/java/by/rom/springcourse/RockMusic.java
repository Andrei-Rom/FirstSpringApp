package by.rom.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Led Zeppelin - \"Going To California\"";
    }

}
