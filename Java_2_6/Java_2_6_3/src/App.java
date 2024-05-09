<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> af62b179fe42377ba4af5509bda922e3e530689d
import java.util.List;

public class App {
    public static void main(String[] args) {
<<<<<<< HEAD
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
=======
        var emails = List.of("Mark@Gmail.com", "  AnnA@mail.io  ", "john@GMAIL.com");
        var result = App.normalize(emails);
        System.out.println(result); // => [mark@gmail.com, anna@mail.io, john@gmail.com]
    }

    public static List<String> normalize(List<String> list) {
        return list.stream().map(String::trim).map(String::toLowerCase).toList();
>>>>>>> af62b179fe42377ba4af5509bda922e3e530689d
    }
}
