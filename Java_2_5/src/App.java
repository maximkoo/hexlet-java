import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        var numbers = new ArrayList<>(List.of(2, 3, 5));
        var result = App.duplicate(numbers);
        System.out.println(result); // => [4, 6, 10]
        // Вернулся новый список
        System.out.println(numbers == result); // false
    }

    public static List<Integer> duplicate(List<Integer> list){
        List<Integer> res =  new ArrayList<>(list);
        UnaryOperator<Integer> uo = v -> v*2;
        res.replaceAll(uo);
        return res;
    }
}
