import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        // Пустой список на входе
        Map<Integer, Map<Integer, Double>> result1 = App.calculateProbabilities(new ArrayList<Integer>());
        System.out.println(result1); // => {}

        Map<Integer, Map<Integer, Double>> result2 = App.calculateProbabilities(
                List.of(1, 3, 1, 5, 1, 2, 1, 6)
        );
        System.out.println(result2);
        // => {1={2=0.25, 3=0.25, 5=0.25, 6=0.25}, 2={1=1.0}, 3={1=1.0}, 5={1=1.0}, 6={}}

    }

    public static Map<Integer, Map<Integer, Double>> calculateProbabilities(List<Integer> list) {
//        if (list.isEmpty()) {
//            return new HashMap<Integer, Map<Integer, Double>>();
//        }
        Map<Integer, Map<Integer, Double>> map = new HashMap<>();
        Map<Integer, Double> map1 = new HashMap<>();
        for (Integer i : list.stream().distinct().toList()) {
            List<Integer> n = new ArrayList<>();
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) == i) {
                    n.add(list.get(j + 1));
                }
            }
            //System.out.println(n.toString());
            map1 = n.stream()
                    .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                    .entrySet()
                    .stream()
                    .collect(Collectors.toMap(e -> e.getKey(), e -> (0.0 + Math.toIntExact(e.getValue())) / n.size()));
            map.put(i, map1);
        }
        return map;
    }
}
