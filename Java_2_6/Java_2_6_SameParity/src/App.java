import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> coll1 = List.of(-1, 0, 1, -3, 10, -2);
        List<Integer> result1 = App.sameParityFilter(coll1);
        System.out.println(result1); // [-1, 1, -3]

        List<Integer> coll2 = List.of(2, 0, 1, -3, 10, -2);
        List<Integer> result2 = App.sameParityFilter(coll2);
        System.out.println(result2); // [2, 0, 10, -2]

        List<Integer> emptyColl = new ArrayList<>();
        List<Integer> result3 = App.sameParityFilter(emptyColl);
        System.out.println(result3); // []

    }

    public static List<Integer> sameParityFilter(List<Integer> list) {
        if (list.isEmpty()) {
            return new ArrayList<>();
        }
        return list.stream().filter(x -> Math.abs(x % 2) == Math.abs(list.get(0) % 2)).toList();
    }
}
