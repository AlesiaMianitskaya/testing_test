/*
 * class Triangle determines the type of triangle
 */
public class Triangle {
  /*
   * if triangle isosceles return true otherwise false
   */
  boolean isosceles(double a, double b, double c) {
    if (Double.isInfinite(1 / (a - b)) || Double.isInfinite(1 / (b - c)) || Double.isInfinite(1 / (a - c))) {
      return true;
    } else return false;
  }

  /*
   * if triangle equilateral return true otherwise false
   */
  boolean equilateral(double a, double b, double c) {
    if (Double.isInfinite(1 / (a - b)) && Double.isInfinite(1 / (b - c))) {
      return true;
    } else return false;
  }
}
