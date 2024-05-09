import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Supplier rollDie = new Supplier() {
            @Override
            public Object get() {
                return (int) (Math.random() * 6) + 1;
            }
        };
        App.play(100, rollDie);
// => 1|####################### 23
//    2|################## 18
//    3|############# 13
//    4|#################### 20
//    5|############ 12
//    6|############## 14
        App.play(13, rollDie);
// => 1|
//    2|## 2
//    3|# 1
//    4|## 2
//    5|#### 4
//    6|#### 4

    }

    public static void play(int n, Supplier rollDie) {
        List<Integer> list = Stream.generate(rollDie).limit(n).toList();
        //System.out.println(list.toString());
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        for (int key = 1; key <= 6; key++) {
            System.out.print(key + "|");
            if (map.get(key) != null) {
                Stream.generate(() -> "#").limit(map.get(key)).forEach(System.out::print);//collect(Collectors.joining());
                System.out.print(" " + map.get(key));
            }
            System.out.println();
        }
    }
}
