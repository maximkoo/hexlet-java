public final class Book {

    private String title;
    private String authorName;
    private String genre;

    public Book(String title, String authorName, String genre) {
        this.title = title;
        this.authorName = authorName;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getGenre() {
        return genre;
    }
}