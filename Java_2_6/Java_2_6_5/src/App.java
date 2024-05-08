import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var people = new ArrayList(
                List.of(
                        new Person("John", 17),
                        new Person("Anna", 24),
                        new Person("Alex", 57),
                        new Person("Jun", 32)
                )
        );

        System.out.println(App.getAverageAge(people)); // 32.5
    }

    public static Double getAverageAge(List<Person> people) {
        if (people.isEmpty()) {
            return null;
        }
        double res = people.stream().reduce(0, (s, x) -> {
            return s + x.getAge();
        }, Integer::sum);
        return res / people.size();
    }
}
