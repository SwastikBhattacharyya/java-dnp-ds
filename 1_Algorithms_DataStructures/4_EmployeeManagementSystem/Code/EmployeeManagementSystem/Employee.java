public class Employee {
  private final String employeeId;
  private String name;
  private String position;
  private double salary;

  public Employee(String employeeId, String name, String position, double salary) {
    this.employeeId = employeeId;
    this.name = name;
    this.position = position;
    this.salary = salary;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public String getName() {
    return name;
  }

  public String getPosition() {
    return position;
  }

  public double getSalary() {
    return salary;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee{"
        + "ID='"
        + employeeId
        + '\''
        + ", Name='"
        + name
        + '\''
        + ", Position='"
        + position
        + '\''
        + ", Salary="
        + salary
        + '}';
  }
}
