public class Book implements Comparable<Book> {
  private final String bookId;
  private final String title;
  private final String author;

  public Book(String bookId, String title, String author) {
    this.bookId = bookId;
    this.title = title;
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public String getBookId() {
    return bookId;
  }

  public String getAuthor() {
    return author;
  }

  @Override
  public int compareTo(Book other) {
    return this.title.compareToIgnoreCase(other.title);
  }

  @Override
  public String toString() {
    return "Book{"
        + "ID='"
        + bookId
        + '\''
        + ", Title='"
        + title
        + '\''
        + ", Author='"
        + author
        + '\''
        + '}';
  }
}
