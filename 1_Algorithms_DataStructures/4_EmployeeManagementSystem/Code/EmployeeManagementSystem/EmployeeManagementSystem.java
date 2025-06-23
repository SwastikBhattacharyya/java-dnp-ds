public class EmployeeManagementSystem {
  private final Employee[] employees;
  private int size;

  public EmployeeManagementSystem(int capacity) {
    this.employees = new Employee[capacity];
    this.size = 0;
  }

  public void addEmployee(Employee employee) {
    if (size >= employees.length) {
      System.out.println("Cannot add employee: array is full.");
      return;
    }
    employees[size++] = employee;
    System.out.println("Added: " + employee);
  }

  public Employee searchEmployee(String employeeId) {
    for (int i = 0; i < size; i++) {
      if (employees[i].getEmployeeId().equals(employeeId)) {
        return employees[i];
      }
    }
    return null;
  }

  public void deleteEmployee(String employeeId) {
    for (int i = 0; i < size; i++) {
      if (employees[i].getEmployeeId().equals(employeeId)) {
        // Shift elements to fill the gap
        for (int j = i; j < size - 1; j++) {
          employees[j] = employees[j + 1];
        }
        employees[--size] = null;
        System.out.println("Deleted employee with ID: " + employeeId);
        return;
      }
    }
    System.out.println("Employee not found: " + employeeId);
  }

  public void traverseEmployees() {
    System.out.println("All Employees:");
    for (int i = 0; i < size; i++) {
      System.out.println(employees[i]);
    }
  }
}
