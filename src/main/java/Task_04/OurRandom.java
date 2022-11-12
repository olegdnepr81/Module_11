package Task_04;

public class OurRandom {
    private final long a, c, m;
    private long seed;

    public OurRandom changeSeed(long seed) {
        this.seed = seed;
        return this;
    }

    public OurRandom(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public long next() {
        return (a * seed + c) % m;
    }
}
