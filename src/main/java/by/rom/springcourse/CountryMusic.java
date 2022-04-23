package by.rom.springcourse;

import org.springframework.stereotype.Component;

@Component
public class CountryMusic  implements Music {
    @Override
    public String getSong() {
        return "Chris Young - \"Famous Friends\" ";
    }
}
