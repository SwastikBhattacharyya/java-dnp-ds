public class Program {
  public static void main(String[] args) {
    PaymentContext context = new PaymentContext();

    context.processPayment(50.0);

    PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456", "Alice Smith");
    context.setPaymentStrategy(creditCard);
    context.processPayment(100.0);

    PaymentStrategy paypal = new PayPalPayment("alice@example.com");
    context.setPaymentStrategy(paypal);
    context.processPayment(250.0);
  }
}
