import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var numbers = List.of(3, -5, 6, 1, 0, -2, 10);
        System.out.println(getSecondBiggest(numbers)); // 6
    }

    public static Integer getSecondBiggest(List<Integer> list) {
        List<Integer> res = list.stream().sorted(Comparator.reverseOrder()).toList();
        if (res.size() <= 1) {
            return null;
        }
        return res.get(1);
    }
}
