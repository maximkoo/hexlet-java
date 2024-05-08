import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println(findIndexOfNearest(new ArrayList<Integer>(), 0)); // -1

        List<Integer> coll1 = List.of(15, 10, 3, 4);
        System.out.println(findIndexOfNearest(coll1, 0)); // 2

        List<Integer> coll2 = List.of(7, 5, 3, 2);
        System.out.println(findIndexOfNearest(coll2, 4)); // 1

        List<Integer> coll3 = List.of(7, 5, 4, 4, 3); 
        System.out.println(findIndexOfNearest(coll3, 4)); // 2
    }

    public static int findIndexOfNearest(List<Integer> list, int val) {
        int q = list.stream().map(x -> Math.abs(x - val)).reduce(Integer::min).orElse(-1);
        return list.stream().map(x -> Math.abs(x - val)).toList().indexOf(q);
    }
}
