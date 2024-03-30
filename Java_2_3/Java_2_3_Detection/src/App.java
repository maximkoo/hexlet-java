import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        var books = new ArrayList<Map<String, String>>();

        var book1 = Map.of("title", "Cymbeline", "author", "Shakespeare", "year", "1611");
        var book2 = Map.of("title", "Book of Fooos", "author", "FooBar", "year", "1111");
        var book3 = Map.of("title", "The Tempest", "author", "Shakespeare", "year", "1611");
        var book4 = Map.of("title", "Book of Foos Barrrs", "author", "FooBar", "year", "2222");
        var book5 = Map.of("title", "Still foooing", "author", "FooBar", "year", "3333");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        var where = Map.of(
                "author", "Shakespeare",
                "year", "1611"
        );

        var result = findWhere(books, where);

        System.out.println(result); // =>
// [
//     {title=Cymbeline, year=1611, author=Shakespeare},
//     {title=The Tempest, year=1611, author=Shakespeare}
// ]
    }

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> list = new ArrayList<>();
        boolean isGood = false;
        for (Map<String, String> book : books) {
            isGood = true;
            for (String key : where.keySet()) {
                if (!book.get(key).equals(where.get(key))) {
                    isGood = false;
                    continue;
                }
            }
            if (!isGood) {
                continue;
            } else {
                list.add(book);
            }
        }
        return list;
    }
}
