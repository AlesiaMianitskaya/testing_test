import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MyCheckTest {

  MyCheck myCheck;

  @BeforeMethod
  public void setMyCheck() {
    myCheck = new MyCheck();
  }

  @DataProvider(name = "dataForZero")
  public Object[][] createZero() {
    return new Object[][]{
        {false, new Double(0.0), new Double(3.6), new Double(7.5)},
        {false, new Double(6.8), new Double(0.0), new Double(4.6)},
        {false, new Double(6.8), new Double(4.6), new Double(0.0)},
        {false, new Double(0.0), new Double(0.0), new Double(0.0)}
    };
  }

  @Test(dataProvider = "dataForZero")
  public void testCheckZero(boolean expected, Double a, Double b, Double c) throws Exception {
    assertEquals(expected, myCheck.checkZero(a, b, c));
  }

  @DataProvider(name = "sidePositive")
  public Object[][] createPositiveSide() {
    return new Object[][]{
        {true, 3.0, 4.0, 5.0},
        {true, 1e10, 1e10, 1e10},
        {true, 3.7, 4.8, 5.6},
        {true, 100, 120, 150},
        {true, Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE},
        {true, Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE}
    };
  }


  @Test(dataProvider = "sidePositive")
  public void testCheckExistPositive(boolean expected, double a, double b, double c) throws Exception {
    assertEquals(expected, myCheck.checkExist(a, b, c));
  }

  @DataProvider(name = "sideNegative")
  public Object[][] createNegativeSide() {
    return new Object[][]{
        {false, Double.NaN, 5.0, 6.0},
        {false, 5.0, Double.NaN, 6.0},
        {false, 5.0, 6.0, Double.NaN},
        {false, Double.MAX_VALUE, 5.0, 6.0},
        {false, 5.0, Double.MAX_VALUE, 6.0},
        {false, 5.0, 6.0, Double.MAX_VALUE},
        {false, Double.MIN_VALUE, 0.0001, 0.0001},
        {false, 0.0001, Double.MIN_VALUE, 0.0001},
        {false, 0.0001, 0.0001, Double.MIN_VALUE},
        {false, Double.POSITIVE_INFINITY, 6.8, 6.8},
        {false, 6.8, Double.POSITIVE_INFINITY, 6.8},
        {false, 4.5, 6.9, Double.POSITIVE_INFINITY},
        {false, -9.0, 4.5, 6.1},
        {false, 9.0, -4.5, 6.1},
        {false, 9.0, 4.5, -6.1},
        {false, Double.NEGATIVE_INFINITY, 6.8, 6.8},
        {false, 6.8, Double.NEGATIVE_INFINITY, 6.8},
        {false, 4.5, 6.9, Double.NEGATIVE_INFINITY},
        {false, null, 6.9, 4.5},
        {false, 9.0, null, 4.5},
        {false, 9.0, 6.9, null},
        {false, null, null, null},
        {false, 1 / 2, 3 / 5, 6 / 8}
    };
  }

  @Test(dataProvider = "sideNegative")
  public void testCheckExistNegative(boolean expected, double a, double b, double c) {
    assertEquals(expected, myCheck.checkExist(a, b, c));
  }
}