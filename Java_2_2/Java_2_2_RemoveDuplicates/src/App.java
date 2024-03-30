import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var words = List.of("a", "a", "b", "c", "c");
        var uniqWords = removeDuplicates(words);
        System.out.println(uniqWords); // => [a, b, c]
    }

    public static List<String> removeDuplicates(List<String> list) {
        List<String> res = new ArrayList<>();
        for (String s : list) {
            if (!res.contains(s)) {
                res.add(s);
            }
        }
        return res;
    }
}
