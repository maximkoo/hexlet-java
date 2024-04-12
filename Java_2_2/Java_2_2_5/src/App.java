import java.util.List;

public class App {
    public static void main(String[] args) {
        var books = List.of(
                new Book("Death on the Nile", "Agatha Christie", "Detective"),
                new Book("Murder on the Orient Express", "Agatha Christie", "Detective"),
                new Book("The Raven", "Edgar Allan Poe", "Poem")
                );

        System.out.println(countBooks(books, "Agatha Christie", "Detective")); // 2
    }

    public static int countBooks(List<Book> list, String authorName, String genre) {
        int n = 0;
        for (Book book : list) {
            if (book.getAuthorName().equals(authorName) && book.getGenre().equals(genre)) {
                n++;
            }
        }
        return n;
    }
}
