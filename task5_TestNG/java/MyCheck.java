import java.util.InputMismatchException;

/**
 * class MyCheck contains a check for exist
 */
public class MyCheck {
  /**
   * Tests the existence of a triangle
   *
   * @param a - console arguments
   * @param b - console arguments
   * @param c - console arguments
   * @return true, if triangle is, false otherwise
   */
  boolean checkExist(double a, double b, double c)  {
    if ((a + b > c) && (a + c > b) && (b + c > a)) {
      return true;
    } else {
      return false;
    }

  }

  /**
   * Checks sides is zero
   *
   * @param a - console arguments
   * @param b - console arguments
   * @param c - console arguments
   * @return true, if triangles' sides aren't zero, false otherwise
   */
  boolean checkZero(double a, double b, double c) {
    if (Double.isInfinite(1 / a) || Double.isInfinite(1 / b) || Double.isInfinite(1 / c)) {
      return false;
    } else {
      return true;
    }
  }
}
