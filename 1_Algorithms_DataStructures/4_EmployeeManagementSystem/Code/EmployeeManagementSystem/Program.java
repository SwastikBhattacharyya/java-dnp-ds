public class Program {
  public static void main(String[] args) {
    EmployeeManagementSystem system = new EmployeeManagementSystem(5);

    system.addEmployee(new Employee("E001", "Alice", "Manager", 70000));
    system.addEmployee(new Employee("E002", "Bob", "Developer", 60000));
    system.addEmployee(new Employee("E003", "Charlie", "Designer", 50000));

    system.traverseEmployees();

    System.out.println("\nSearching for E002:");
    Employee found = system.searchEmployee("E002");
    System.out.println(found != null ? found : "Not found");

    System.out.println("\nDeleting E002...");
    system.deleteEmployee("E002");

    system.traverseEmployees();
  }
}
