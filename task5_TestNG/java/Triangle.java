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
    boolean flagOneSide = Double.isInfinite(1 / (a - b)) && Math.abs(b - c) > 0;
    boolean flagTwoSide = Double.isInfinite(1 / (b - c)) && Math.abs(a - b) > 0;
    boolean flagThreeSide = Double.isInfinite(1 / (a - c)) && Math.abs(b - c) > 0;
    if (flagOneSide || flagTwoSide || flagThreeSide) {
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
