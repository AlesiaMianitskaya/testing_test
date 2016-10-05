/**
 * class Triangle determines the type of triangle
 */
public class Triangle {
  /**
   * Decides if triangle isosceles
   *
   * @param a - console arguments
   * @param b - console arguments
   * @param c - console arguments
   * @return true if triangle isosceles  otherwise false
   */
  boolean isIsosceles(double a, double b, double c) {
    if (Double.isInfinite(1 / (a - b)) || Double.isInfinite(1 / (b - c)) || Double.isInfinite(1 / (a - c))) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Decides if triangle equilateral
   *
   * @param a - console arguments
   * @param b - console arguments
   * @param c - console arguments
   * @return true if triangle is equilateral otherwise false
   */
  boolean isEquilateral(double a, double b, double c) {
    if (Double.isInfinite(1 / (a - b)) && Double.isInfinite(1 / (b - c))) {
      return true;
    } else {
      return false;
    }
  }
}
