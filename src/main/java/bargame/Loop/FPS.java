package bargame.Loop;

public enum FPS {
    SIXTY (16_666_000),
    THIRTY (33_333_000),
    FIFTEEN (66_666_000),
    FIVE (200_000_000),
    ONE (1_000_000_000);

    long value;
    FPS (long value) {
        this.value = value;
    }

    public long getValue () {
        return value;
    }
}
