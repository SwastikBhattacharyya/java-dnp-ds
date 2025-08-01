public class Product implements Comparable<Product> {
  private final String productId;
  private final String productName;
  private final String category;

  public Product(String productId, String productName, String category) {
    this.productId = productId;
    this.productName = productName;
    this.category = category;
  }

  public String getProductId() {
    return productId;
  }

  public String getProductName() {
    return productName;
  }

  public String getCategory() {
    return category;
  }

  @Override
  public int compareTo(Product other) {
    return this.productName.compareToIgnoreCase(other.productName);
  }

  @Override
  public String toString() {
    return "Product{"
        + "id='"
        + productId
        + '\''
        + ", name='"
        + productName
        + '\''
        + ", category='"
        + category
        + '\''
        + '}';
  }
}
