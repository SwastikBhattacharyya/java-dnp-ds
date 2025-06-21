public class FinancialForecasting {
  public static double futureValueRecursive(double presentValue, double growthRate, int periods) {
    if (periods == 0) return presentValue;
    return futureValueRecursive(presentValue, growthRate, periods - 1) * (1 + growthRate);
  }

  public static double futureValueIterative(double presentValue, double growthRate, int periods) {
    double fv = presentValue;
    for (int i = 0; i < periods; i++) {
      fv *= (1 + growthRate);
    }
    return fv;
  }

  public static void main(String[] args) {
    double presentValue = 1000.0;
    double growthRate = 0.05;
    int periods = 5;

    double futureValue = futureValueRecursive(presentValue, growthRate, periods);
    System.out.printf("Future value after %d periods: %.2f\n", periods, futureValue);

    futureValue = futureValueIterative(presentValue, growthRate, periods);
    System.out.printf("Future value after %d periods (Iterative): %.2f\n", periods, futureValue);
  }
}
