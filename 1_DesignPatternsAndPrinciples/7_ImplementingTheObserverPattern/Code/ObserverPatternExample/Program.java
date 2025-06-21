public class Program {
  public static void main(String[] args) {
    StockMarket market = new StockMarket();

    Observer mobileClient = new MobileApp("Alice");
    Observer webClient = new WebApp("Bob");

    market.registerObserver(mobileClient);
    market.registerObserver(webClient);

    market.setStockPrice("AAPL", 150.75);
    market.setStockPrice("GOOGL", 2800.50);

    market.removeObserver(webClient);
    market.setStockPrice("MSFT", 320.40);
  }
}
