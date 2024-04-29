import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    private static final List<String> FREE_DOMAINS = List.of(
            "gmail.com",
            "yandex.ru",
            "hotmail.com",
            "yahoo.com"
    );

    public static void main(String[] args) {
        var emails = List.of(
                "info@yandex.ru",
                "mk@host.com",
                "support@hexlet.io",
                "sergey@gmail.com",
                "vovan@gmail.com",
                "vovan@hotmail.com"
        );

        var result = getFreeDomainsCount(emails);
        System.out.println(result); // => {gmail.com=2, yandex.ru=1, hotmail.com=1}
    }

    public static Map<String, Long> getFreeDomainsCount(List<String> list) {
        return list.stream()
                .map(x -> {
                    String[] q = x.split("@");
                    return q[1];
                })
                .filter(x -> FREE_DOMAINS.contains(x))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
    }
}
