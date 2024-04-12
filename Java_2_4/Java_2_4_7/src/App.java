import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        var words = new ArrayList<String>();
        words.add("Java");
        words.add("Python");
        words.add("PHP");

        var result = App.map(words, word -> word.toUpperCase());

// Или используя ссылку на метод
// var result = App.map(words, String::toUpperCase());

        System.out.println(result); // ["JAVA", "PYTHON", "PHP"]
    }

    public static List<String> map (List <String>list, Function<String, String> fn){
        List<String> res = new ArrayList<>();
        list.forEach((v) -> res.add(fn.apply(v)));
        return res;
    }
}
