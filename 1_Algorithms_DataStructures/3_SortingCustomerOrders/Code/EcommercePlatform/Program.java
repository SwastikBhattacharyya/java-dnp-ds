public class Program {
  public static void main(String[] args) {
    Order[] orders = {
      new Order("O001", "Alice", 450.0),
      new Order("O002", "Bob", 200.0),
      new Order("O003", "Charlie", 1200.0),
      new Order("O004", "Diana", 300.0)
    };

    System.out.println("Original Orders:");
    for (Order order : orders) System.out.println(order);

    System.out.println("\nSorted with Bubble Sort:");
    Sorter.bubbleSort(orders);
    for (Order order : orders) System.out.println(order);

    Order[] orders2 = {
      new Order("O001", "Alice", 450.0),
      new Order("O002", "Bob", 200.0),
      new Order("O003", "Charlie", 1200.0),
      new Order("O004", "Diana", 300.0)
    };

    System.out.println("\nSorted with Quick Sort:");
    Sorter.quickSort(orders2, 0, orders2.length - 1);
    for (Order order : orders2) System.out.println(order);
  }
}
