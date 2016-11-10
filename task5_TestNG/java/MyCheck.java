import java.math.BigDecimal;


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
  boolean checkExist(BigDecimal a, BigDecimal b, BigDecimal c)throws NullPointerException  {
    if (c.compareTo(a.add(b)) == -1 && b.compareTo(a.add(c)) == -1 && a.compareTo(b.add(c)) == -1) {
      return true;
    } else {
      return false;
    }
  }
}
