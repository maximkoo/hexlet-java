import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var capitals = List.of("london", "berlin", "tokio");

        System.out.println(getOrDefault(capitals, 1, "")); // "berlin"
        System.out.println(getOrDefault(capitals, 2, "")); // "tokio"
        System.out.println(getOrDefault(capitals, 5, "")); // ""
        System.out.println(getOrDefault(capitals, -2, "trololo")); // ""
    }

    public static String getOrDefault(List<String> list, int index, String def) {
        String res;
        try {
            res = (list.get(index));
        } catch (IndexOutOfBoundsException e) {
            return def;
        }
        return res;
    }
}
