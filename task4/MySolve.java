/**
 * Class MySolve solves quadratic equation
 */
public class MySolve {
  /**
   * Counts discriminant
   *
   * @param a - console arguments
   * @param b - console arguments
   * @param c - console arguments
   * @return discriminant equation
   */
  private double discriminant(double a, double b, double c) {
    return b * b - 4 * a * c;
  }

  /**
   * Finds the roots of the equation and prints result
   *
   * @param a - console arguments
   * @param b - console arguments
   * @param c - console arguments
   */
  public void solve(double a, double b, double c) {
    double x1, x2;
    if (Double.isInfinite(1 / a)) {
      System.out.println("Equation isn't quadratic.");
      System.exit(0);
    }
    if (Double.isInfinite(1 / discriminant(a, b, c))) {
      // formula of roots
      x1 = x2 = (-1 * b) / (2 * a);
      System.out.println("Roots are: " + x1 + " and " + x2);
      System.exit(0);
    }
    if (discriminant(a, b, c) > 0) {
      // formula of roots
      x1 = (-1 * b + Math.sqrt(discriminant(a, b, c))) / (2 * a);
      x2 = (-1 * b - Math.sqrt(discriminant(a, b, c))) / (2 * a);
      System.out.println("Roots are: " + x1 + " and " + x2);
    } else {
      // discriminant less than zero
      System.out.println("No roots.");
    }
  }
}
