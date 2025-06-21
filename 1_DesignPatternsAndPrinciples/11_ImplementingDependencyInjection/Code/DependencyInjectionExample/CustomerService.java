public class CustomerService {
  private final CustomerRepository repository;

  public CustomerService(CustomerRepository repository) {
    this.repository = repository;
  }

  public void showCustomer(String id) {
    Customer customer = repository.findCustomerById(id);
    System.out.println("Customer ID: " + customer.getId());
    System.out.println("Customer Name: " + customer.getName());
  }
}
