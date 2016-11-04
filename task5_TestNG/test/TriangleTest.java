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
    assertTrue(triangle.isEquilateral(5.0, 5.0, 5.0));
  }

  @Test
  public void testIsEquilateralFalse() throws Exception {
    assertFalse(triangle.isEquilateral(5.0, 5.0, 4.0));
  }

  @Test
  public void testIsIsoscelesTrue() throws Exception {
    assertTrue(triangle.isIsosceles(6, 8, 6));
  }

  @Test
  public void testIsIsoscelesFalse() throws Exception {
    assertFalse(triangle.isIsosceles(6, 6, 6));
  }
}