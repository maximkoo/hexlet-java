import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

public class Book {
    private String title;
    private String author;
    private int published;
    private int pagesCount;

    @Override
    public String toString() {
        return "Book(" +
                "title=" + title +
                ", author=" + author +
                ", published=" + published +
                ", pagesCount=" + pagesCount +
                ')';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public Book(String title, String author, int published, int pagesCount) {
        this.title = title;
        this.author = author;
        this.published = published;
        this.pagesCount = pagesCount;
    }
}