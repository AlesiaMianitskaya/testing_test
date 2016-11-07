import java.math.BigDecimal;

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
  boolean isIsosceles(BigDecimal a, BigDecimal b, BigDecimal c) {
    if ((a.compareTo(b) == 0 && c.compareTo(b) != 0) ||
        (b.compareTo(c) == 0 && a.compareTo(b) != 0) ||
        (a.compareTo(c) == 0 && b.compareTo(c) != 0)) {
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
  boolean isEquilateral(BigDecimal a, BigDecimal b, BigDecimal c) {
    if (a.compareTo(b) == 0 && b.compareTo(c) == 0) {
      return true;
    } else {
      return false;
    }
  }
}
