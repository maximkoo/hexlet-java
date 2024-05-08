import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var languages = new ArrayList<>(List.of("java", "javascript", "php", "ruby"));
        var result = ListUtils.filter(languages, l -> l.startsWith("j"));
        System.out.println(result); // => ["java", "javascript"]

        var numbers = new ArrayList<>(List.of(1, 2, 5, 0, 8, 3));
        var result1 = ListUtils.filter(numbers, n -> n > 4);
        System.out.println(result1); // => [5, 8]
    }
}
