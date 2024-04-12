import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        var words = List.of("javascript", "java", "joker", "james");

        System.out.println(every(words, s -> s.startsWith("j")));
        System.out.println(every(words, s -> s.endsWith("a")));
    }

    public static boolean every(List<String> list, Predicate<String> pre) {
        for (String s : list) {
            if (!pre.test(s)) {
                return false;
            }
        }
        return true;
    }
}
