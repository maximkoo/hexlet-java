import java.util.List;

public class App {
    public static void main(String[] args) {
        var emails = List.of("Mark@Gmail.com", "  AnnA@mail.io  ", "john@GMAIL.com");
        var result = App.normalize(emails);
        System.out.println(result); // => [mark@gmail.com, anna@mail.io, john@gmail.com]
    }

    public static List<String> normalize(List<String> list) {
        return list.stream().map(String::trim).map(String::toLowerCase).toList();
    }
}
