import java.util.Arrays;

public class LibrarySearch {

  public static Book linearSearch(Book[] books, String title) {
    for (Book book : books) {
      if (book.getTitle().equalsIgnoreCase(title)) {
        return book;
      }
    }
    return null;
  }

  public static Book binarySearch(Book[] books, String title) {
    Arrays.sort(books); // Ensure the array is sorted
    int low = 0, high = books.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      int cmp = books[mid].getTitle().compareToIgnoreCase(title);

      if (cmp == 0) {
        return books[mid];
      } else if (cmp < 0) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return null;
  }
}
