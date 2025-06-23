import java.util.Arrays;

public class SearchService {

  public static Product linearSearch(Product[] products, String name) {
    for (Product product : products)
      if (product.getProductName().equalsIgnoreCase(name)) return product;
    return null;
  }

  public static Product binarySearch(Product[] products, String name) {
    Arrays.sort(products);
    int left = 0, right = products.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      int cmp = name.compareToIgnoreCase(products[mid].getProductName());

      if (cmp == 0) return products[mid];
      else if (cmp < 0) right = mid - 1;
      else left = mid + 1;
    }

    return null;
  }
}
