import java.util.*;

public class App {
    public static void main(String[] args) {
        var books = new ArrayList<>(
                List.of(
                        new Book("Dubliners", "James Joyce"),
                        new Book("Moby-Dick", "Herman Melville"),
                        new Book("The Great Gatsby", "F. Scott Fitzgerald")
                )
        );

        var sortedBooks = sortBooks(books);
        System.out.println(sortedBooks);
// =&gt; [The Great Gatsby - F. Scott Fitzgerald, Moby-Dick - Herman Melville, Dubliners - James Joyce]
    }

    public static List<Book> sortBooks(List<Book> books) {
        //ArrayList<Book> res = new ArrayList<>(books);
        List<Book> res = new ArrayList<>(books);
        //Collections.sort(res, (m1,m2 ) -> m1.getTitle().compareTo(m2.getTitle()));
        Comparator<Book> cmp = Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER);
        res.sort(cmp.reversed());
        return res;
    }
}
