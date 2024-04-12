import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        var words = List.of("java", "javascript", "php", "ruby", "lisp", "lua");

        // Группируем слова по их длине
        var result = App.groupBy(words, s -> Integer.toString(s.length()));
        System.out.println(result); // => {3=[php, lua], 4=[java, ruby, lisp], 10=[javascript]}
    }

    public static Map<String, List<String>> groupBy(List<String> list, Function<String, String> fn) {
        Map<String, List<String>> res = new TreeMap<>();
        //list.forEach();
//        for (String s : list) {
//            String f = fn.apply(s);
//            if (res.containsKey(f)) {
//                res.get(f).add(s);
//            } else {
//                res.put(f, new ArrayList<String>(List.of(s)));
//            }
//        }

        list.forEach((s) -> {
            String f = fn.apply(s);
            if (res.containsKey(f)) {
                res.get(f).add(s);
            } else {
                res.put(f, new ArrayList<String>(List.of(s)));
            }
        });
        return res;
    }
}
