import java.util.concurrent.ConcurrentHashMap;

public class Fibonacci {
    private static ConcurrentHashMap<Long, Long> chm = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        //System.out.println(fib(1L));
        //System.out.println(fib(2L));
        //System.out.println(fib(3L));
        System.out.println("Calling for 7");
        System.out.println(fib(7L));
        System.out.println("Calling for 7-2");
        System.out.println(fib(7L));
    }

    public static long fib(long n) {
        if (n == 1) {
            System.out.println("Called for " + n);
            return chm.computeIfAbsent(n, (k) -> 0L);
        } else if (n == 2) {
            System.out.println("Called for " + n);
            return chm.computeIfAbsent(n, (k) -> 1L);
        } else {
            return chm.computeIfAbsent(n, (k) -> fib(n - 1) + fib(n - 2));
        }
    }
}
