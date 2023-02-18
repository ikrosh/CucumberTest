package hw.config;

public enum Delay {

    PAGE_LOAD_TIMEOUT(20);

    private int seconds;

    Delay(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
}
