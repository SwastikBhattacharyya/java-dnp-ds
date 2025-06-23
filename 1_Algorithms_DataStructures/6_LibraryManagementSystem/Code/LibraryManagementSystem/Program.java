public class Program {
  public static void main(String[] args) {
    Book[] books = {
      new Book("B001", "Java Programming", "Alice"),
      new Book("B002", "Python Basics", "Bob"),
      new Book("B003", "Data Structures", "Charlie"),
      new Book("B004", "Web Development", "Diana"),
      new Book("B005", "Algorithms", "Eve")
    };

    System.out.println("Linear Search for 'Data Structures':");
    Book found1 = LibrarySearch.linearSearch(books, "Data Structures");
    System.out.println(found1 != null ? found1 : "Book not found");

    System.out.println("\nBinary Search for 'Web Development':");
    Book found2 = LibrarySearch.binarySearch(books, "Web Development");
    System.out.println(found2 != null ? found2 : "Book not found");
  }
}
