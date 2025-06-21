public class Program {
  public static void main(String[] args) {
    Product[] products = {
      new Product("P001", "Laptop", "Electronics"),
      new Product("P002", "Shoes", "Apparel"),
      new Product("P003", "Headphones", "Electronics"),
      new Product("P004", "T-shirt", "Apparel"),
      new Product("P005", "Smartphone", "Electronics")
    };

    String searchTerm = "Headphones";

    Product resultLinear = SearchService.linearSearch(products, searchTerm);
    System.out.println(
        "Linear Search Result: " + (resultLinear != null ? resultLinear : "Not found"));

    Product resultBinary = SearchService.binarySearch(products, searchTerm);
    System.out.println(
        "Binary Search Result: " + (resultBinary != null ? resultBinary : "Not found"));
  }
}
