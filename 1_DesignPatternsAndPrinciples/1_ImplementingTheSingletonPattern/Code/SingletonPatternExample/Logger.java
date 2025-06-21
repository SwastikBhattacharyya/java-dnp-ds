import java.time.LocalDateTime;

public class Logger {
  private static final Logger instance = new Logger();

  private Logger() {}

  public static Logger getInstance() {
    return instance;
  }

  public void log(String message) {
    System.out.println("[LOG] " + LocalDateTime.now() + ": " + message);
  }

  public void logError(String message) {
    System.out.println("[ERROR] " + LocalDateTime.now() + ": " + message);
  }

  public void logInfo(String message) {
    System.out.println("[INFO] " + LocalDateTime.now() + ": " + message);
  }
}
