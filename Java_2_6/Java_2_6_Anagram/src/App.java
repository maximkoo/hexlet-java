import java.util.*;

import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> coll1 = List.of("aabb", "abcd", "bbaa", "dada");
        List<String> result1 = App.filterAnagram("abba", coll1);
        System.out.println(result1); // ["aabb", "bbaa"]

        List<String> coll2 = List.of("crazer", "carer", "racar", "caers", "racer");
        List<String> result2 = App.filterAnagram("racer", coll2);
        System.out.println(result2); // ["carer", "racer"]

        List<String> coll3 = List.of("lazing", "lazy", "lacer");
        List<String> result3 = App.filterAnagram("laser", coll3);
        System.out.println(result3); // []

    }

    public static List<String> filterAnagram(String str, List<String> list) {
        List<String> res = new ArrayList<>();
        Map<String, Long> map0 = getMap(str);
        //
        for (String s : list) {
            if (map0.equals(getMap(s))) {
                res.add(s);
            }
        }

        return res;
    }

    private static Map<String, Long> getMap(String str) {
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(str.split("")));
        Map<String, Long> map = strList.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        return map;
    }
}
