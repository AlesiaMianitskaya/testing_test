/**
 * class MyCheck contains a check for exist
 */
public class MyCheck {
  /**
   * Tests the existence of a triangle
   *
   * @param a, b, c - console arguments
   * @return true, if triangle is, false otherwise
   */
  boolean check(double a, double b, double c) {
    if ((a + b > c) && (a + c > b) && (b + c > a)) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Checks sides is zero
   *
   * @param a, b, c - console arguments
   * @return true, if triangle isn't, false otherwise
   */
  boolean test(double a, double b, double c) {
    if (Double.isInfinite(1 / a) || Double.isInfinite(1 / b) || Double.isInfinite(1 / c)) {
      return true;
    } else {
      return false;
    }
  }
}
