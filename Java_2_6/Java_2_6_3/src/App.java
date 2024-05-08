import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var people = new ArrayList(
                List.of(
                        new Person("John", 17),
                        new Person("Anna", 24),
                        new Person("Alex", 35)
                )
        );

        var names = App.getAdultUserNames(people);
        System.out.println(names); // => [Anna, Alex]
    }

    public static List<String> getAdultUserNames(List<Person> people) {
        return people.stream().filter(p -> (p.getAge() >= 18)).map(Person::getName).toList();
    }
}
