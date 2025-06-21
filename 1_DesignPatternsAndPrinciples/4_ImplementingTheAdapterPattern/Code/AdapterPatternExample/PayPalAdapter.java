public class PayPalAdapter implements PaymentProcessor {
  private final PayPalGateway payPalGateway;

  public PayPalAdapter(PayPalGateway payPalGateway) {
    this.payPalGateway = payPalGateway;
  }

  @Override
  public void processPayment(double amount) {
    payPalGateway.sendPayment(amount);
  }
}
