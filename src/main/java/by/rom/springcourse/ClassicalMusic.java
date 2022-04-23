package by.rom.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Frederik Chopin - \"Polonaise in G Minor\"";
    }

    public void doMyInit() {
        System.out.println("Doing my initialization... .. .");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction... .. .");
    }
}
