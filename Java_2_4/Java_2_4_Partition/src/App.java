import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        var words = List.of("java", "php", "ruby", "clojure", "javascript", "lua");

        var parts = partition(words, s -> s.length() > 4);
        System.out.println(parts); // => [[clojure, javascript], [java, php, ruby, lua]]
    }

    public static List<List<String>> partition(List<String> list, Predicate<String> pre) {
        List<List<String>> res = new ArrayList<>(List.of(new ArrayList<>(), new ArrayList<>()));
//        Map<Integer, List<String>> map = new HashMap<>();
//        list.forEach((s) -> {
//            int f = pre.test(s) ? 0 : 1;
//            map.compute(f, (k, v) -> {
//                v = (v == null) ? new ArrayList<>() : v;
//                v.add(s);
//                return v;
//            });
//        });
//        res.add(map.get(0));
//        res.add(map.get(1));
//        res.add(new ArrayList<>());
//        res.add(new ArrayList<>());
        for (String s : list) {
            res.get((pre.test(s)) ? 0 : 1).add(s);
        }
        return res;
    }
}
