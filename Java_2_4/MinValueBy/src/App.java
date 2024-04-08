import java.util.List;
import java.util.function.Function;

import lombok.*;

public class App {
    public static void main(String[] args) {
        var books = List.of(
                new Book("Anna Karenina", "Leo Tolstoy", 1890, 543),
                new Book("Crime and Punishment", "Fyodor Dostoevsky", 1864, 231),
                new Book("The Lord of the Rings", "J. R. R. Tolkien", 1920, 1000),
                new Book("The Adventures of Huckleberry Finn", "Mark Twain", 1901, 120),
                new Book("Invisible Man", "Ralph Ellison", 1920, 1000),
                new Book("Frankenstein", "Mary Shelley", 1920, 245)
        );

// Так можно получить книну, в которой меньше всего страниц
        var shortestBook = getMinValueBy(books, Book::getPagesCount);
        System.out.println(shortestBook);
// => Book(title=The Adventures of Huckleberry Finn, author=Mark Twain, published=1901, pagesCount=120)

// А так книгу, написанную раньше остальных
        var oldestBook = getMinValueBy(books, Book::getPublished);
        System.out.println(oldestBook);
        //=> Book(title=Crime and Punishment, author=Fyodor Dostoevsky, published=1864, pagesCount=231)

    }

    public static Book getMinValueBy(List<Book> books, Function<Book, Integer> fn) {
        if (books.isEmpty()) {
            return null;
        }
        Book thatBook = books.get(0);
        int val = fn.apply(books.get(0));
        for (Book book : books) {
            if (fn.apply(book) < val) {
                val = fn.apply(book);
                thatBook = book;
            }
        }
        return thatBook;
    }
}