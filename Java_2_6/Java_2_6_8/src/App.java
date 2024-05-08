import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        var films = List.of(
                new Film("Liquid Sky", List.of("thriller", "Action")),
                new Film("Superman", List.of("Action", "fantasy", "thriller")),
                new Film("Norwegian Ninja", List.of("THRILLER"))
        );

        var result = getGenres(films);
        System.out.println(result); // => {"action"=2,"thriller"=3,"fantasy"=1}
    }

    public static Map<String, Long> getGenres(List<Film> films) {
        List<String> longList = films.stream().map(x -> x.getGenres()).flatMap(List::stream).toList();
        return longList.stream().collect(Collectors.groupingBy(x -> x.toLowerCase(), Collectors.counting()));
    }
}
