import java.util.Map;

public class App {
    public static void main(String[] args) {
        var cities = Map.of(
                "White River", 114958,
                "Kashmor", 210451,
                "Oxford", 152450
        );

        System.out.println(getMostPopulatedCity(cities)); // Kashmor
    }

    public static String getMostPopulatedCity(Map<String, Integer> m) {
        String name = null;
        int pop = 0;
        for (String key : m.keySet()) {
            if (m.get(key) > pop) {
                pop = m.get(key);
                name = key;
            }
        }
        return name;
    }
}
