public class Program {
  public static void main(String[] args) {
    Inventory inventory = new Inventory();

    Product p1 = new Product("P001", "Laptop", 10, 1200.0);
    Product p2 = new Product("P002", "Monitor", 25, 300.0);
    Product p3 = new Product("P003", "Keyboard", 50, 25.0);

    inventory.addProduct(p1);
    inventory.addProduct(p2);
    inventory.addProduct(p3);

    inventory.printInventory();

    inventory.updateProduct("P002", "4K Monitor", 20, 350.0);
    inventory.deleteProduct("P003");

    inventory.printInventory();
  }
}
