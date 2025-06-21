class Handler implements Runnable {
  @Override
  public void run() {
    Logger logger = Logger.getInstance();
    logger.log("Handler running");
  }
}

public class Program {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) new Thread(new Handler()).start();
  }
}
