public class WebApp implements Observer {
  private final String user;

  public WebApp(String user) {
    this.user = user;
  }

  @Override
  public void update(String stockSymbol, double price) {
    System.out.println("WebApp [" + user + "] - " + stockSymbol + " updated to $" + price);
  }
}
