public class Random {
    private int seed;
    public Random(int seed) {
        this.seed = seed;
        this.next = seed;
    }

    private int a = 17;
    private int c = 17;
    private int m = 100;
    private int next;

    public int getNext() {
        next = (a * next + c) % m;
        return next;
    }

    public void reset() {
        next = seed;
    }
}
