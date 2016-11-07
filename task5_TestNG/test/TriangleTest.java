import java.math.BigDecimal;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;


public class TriangleTest {
  Triangle triangle;

  @BeforeMethod
  public void setTriangle() {
    triangle = new Triangle();
  }

  @Test
  public void testIsEquilateralTrue() throws Exception {
    BigDecimal a = BigDecimal.valueOf(5.0);
    BigDecimal b = BigDecimal.valueOf(5.0);
    BigDecimal c = BigDecimal.valueOf(5.0);
    assertTrue(triangle.isEquilateral(a, b, c));
  }

  @Test
  public void testIsEquilateralFalse() throws Exception {
    BigDecimal a = BigDecimal.valueOf(5.0);
    BigDecimal b = BigDecimal.valueOf(5.0);
    BigDecimal c = BigDecimal.valueOf(4.0);
    assertFalse(triangle.isEquilateral(a, b, c));
  }

  @Test
  public void testIsIsoscelesTrue() throws Exception {
    BigDecimal a = BigDecimal.valueOf(6.0);
    BigDecimal b = BigDecimal.valueOf(8.0);
    BigDecimal c = BigDecimal.valueOf(6.0);
    assertTrue(triangle.isIsosceles(a, b, c));
  }

  @Test
  public void testIsIsoscelesFalse() throws Exception {
    BigDecimal a = BigDecimal.valueOf(6.0);
    BigDecimal b = BigDecimal.valueOf(6.0);
    BigDecimal c = BigDecimal.valueOf(6.0);
    assertFalse(triangle.isIsosceles(a, b, c));
  }
}