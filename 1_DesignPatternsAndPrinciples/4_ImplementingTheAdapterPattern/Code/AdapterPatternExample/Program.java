public class Program {
  public static void main(String[] args) {
    StripeGateway stripe = new StripeGateway();
    PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
    stripeProcessor.processPayment(150.0);

    PayPalGateway paypal = new PayPalGateway();
    PaymentProcessor paypalProcessor = new PayPalAdapter(paypal);
    paypalProcessor.processPayment(200.0);
  }
}
