import java.util.HashMap;
import java.util.Map;

public class Inventory {
  private final Map<String, Product> products = new HashMap<>();

  public void addProduct(Product product) {
    products.put(product.getProductId(), product);
    System.out.println("Added: " + product);
  }

  public void updateProduct(String productId, String name, int quantity, double price) {
    Product product = products.get(productId);
    if (product != null) {
      product.setProductName(name);
      product.setQuantity(quantity);
      product.setPrice(price);
      System.out.println("Updated: " + product);
    } else {
      System.out.println("Product not found: " + productId);
    }
  }

  public void deleteProduct(String productId) {
    Product removed = products.remove(productId);
    if (removed != null) {
      System.out.println("Deleted: " + removed);
    } else {
      System.out.println("Product not found: " + productId);
    }
  }

  public void printInventory() {
    System.out.println("Inventory:");
    for (Product product : products.values()) {
      System.out.println(product);
    }
  }
}
