import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
  private final List<Observer> observers = new ArrayList<>();
  private String stockSymbol;
  private double stockPrice;

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) observer.update(stockSymbol, stockPrice);
  }

  public void setStockPrice(String symbol, double price) {
    this.stockSymbol = symbol;
    this.stockPrice = price;
    notifyObservers();
  }
}
