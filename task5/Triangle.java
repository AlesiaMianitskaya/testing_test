/**
 * class Triangle determines the type of triangle
 */
public class Triangle {
  /**
   * Decides if triangle isosceles
   *
   * @param a, b, c - console arguments
   * @return true if triangle isosceles  otherwise false
   */
  boolean isosceles(double a, double b, double c) {
    if (Double.isInfinite(1 / (a - b)) || Double.isInfinite(1 / (b - c)) || Double.isInfinite(1 / (a - c))) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Decides if triangle equilateral
   *
   * @param a, b, c - console arguments
   * @return true if triangle is equilateral otherwise false
   */
  boolean equilateral(double a, double b, double c) {
    if (Double.isInfinite(1 / (a - b)) && Double.isInfinite(1 / (b - c))) {
      return true;
    } else {
      return false;
    }
  }
}
