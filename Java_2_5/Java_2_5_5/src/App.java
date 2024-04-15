import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var util = new ListUtils<Integer>();

        var coll1 = new ArrayList<>(List.of(1, 2, 3));
        var coll2 = new ArrayList<>(List.of(3, 4, 5));

        var result = util.merge(coll1, coll2);
        System.out.println(result); // [1, 2, 3, 3, 4, 5]
    }
}
