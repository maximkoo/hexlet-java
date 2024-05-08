import java.util.List;

public class App {
    public static void main(String[] args) {
        var fruits = List.of("lemon", "apple", "banana");
        var result = App.sortWords(fruits);
        System.out.println(result); // => [apple, banana, lemon]
    }

    public static List<String> sortWords(List<String> list) {
        List<String> res = list.stream().sorted(String::compareTo).toList();
        return res;
    }
}
