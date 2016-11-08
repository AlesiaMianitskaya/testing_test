import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigDecimal;

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
        {false, 0.0, 3.6, 7.5},
        {false, 6.8, 0.0, 4.6},
        {false, 6.8, 4.6, 0.0},
        {false, 0.0, 4.6, 0.0},
        {false, 4.6, 0.0, 0.0},
        {false, 0.0, 0.0, 4.6},
        {false, 0.0, 0.0, 0.0}
    };
  }

  @Test(dataProvider = "dataForZero")
  public void testCheckZero(boolean expected, double a, double b, double c) throws Exception {
    BigDecimal sideOne = BigDecimal.valueOf(a);
    BigDecimal sideTwo = BigDecimal.valueOf(b);
    BigDecimal sideThree = BigDecimal.valueOf(c);
    assertEquals(expected, myCheck.checkZero(sideOne, sideTwo, sideThree));
  }

  @DataProvider(name = "sidePositive")
  public Object[][] createPositiveSide() {
    return new Object[][]{
        {true, 3.0, 4.0, 5.0},
        {true, 1e10, 1e10, 1e10},
        {true, 3.7, 4.8, 5.6},
        {true, 100, 120, 150},
        {true, Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE},
        {true, Double.MAX_VALUE, Double.MAX_VALUE, 0.0001},
        {true, 0.0001, Double.MAX_VALUE, Double.MAX_VALUE},
        {true, Double.MAX_VALUE, 0.0001, Double.MAX_VALUE},
        {true, Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE},
        {true, Double.MIN_VALUE, 0.0001, 0.0001},
        {true, 0.0001, Double.MIN_VALUE, 0.0001},
        {true, 0.0001, 0.0001, Double.MIN_VALUE}
    };
  }

  @Test(dataProvider = "sidePositive")
  public void testCheckExistPositive(boolean expected, double a, double b, double c) throws Exception {
    BigDecimal sideOne = BigDecimal.valueOf(a);
    BigDecimal sideTwo = BigDecimal.valueOf(b);
    BigDecimal sideThree = BigDecimal.valueOf(c);
    assertEquals(expected, myCheck.checkExist(sideOne, sideTwo, sideThree));
  }

  @DataProvider(name = "sideNegative")
  public Object[][] createNegativeSide() {
    return new Object[][]{
        {false, Double.MAX_VALUE, 5.0, 6.0},
        {false, 5.0, Double.MAX_VALUE, 6.0},
        {false, 5.0, 6.0, Double.MAX_VALUE},
        {false, Double.MIN_VALUE, 0.001, 3.0},
        {false, 0.001, Double.MIN_VALUE, 3.0},
        {false, 0.1, 3.0, Double.MIN_VALUE},
        {false, -9.0, 4.5, 6.1},
        {false, 9.0, -4.5, 6.1},
        {false, 9.0, 4.5, -6.1},
        {false, -9.0, -4.5, -6.1},
        {false, 1 / 2, 8 / 2, 10 / 2},
        {false, -1 / 2, -8 / 2, -10 / 2},
    };
  }

  @Test(dataProvider = "sideNegative")
  public void testCheckExistNegative(boolean expected, double a, double b, double c) {
    BigDecimal sideOne = BigDecimal.valueOf(a);
    BigDecimal sideTwo = BigDecimal.valueOf(b);
    BigDecimal sideThree = BigDecimal.valueOf(c);
    assertEquals(expected, myCheck.checkExist(sideOne, sideTwo, sideThree));
  }

  @DataProvider(name = "sideNull")
  public Object[][] createNullSide() {
    return new Object[][]{
        {null, 6.9, 4.5},
        {9.0, null, 4.5},
        {9.0, 6.9, null},
        {null, null, null},
        {null, null, 4.5},
        {9.0, null, null},
        {null, 6.9, null}
    };
  }

  @Test(dataProvider = "sideNull", expectedExceptions = IllegalArgumentException.class)
  public void testCheckExistNull(double a, double b, double c) {
    BigDecimal sideOne = BigDecimal.valueOf(a);
    BigDecimal sideTwo = BigDecimal.valueOf(b);
    BigDecimal sideThree = BigDecimal.valueOf(c);
    myCheck.checkExist(sideOne, sideTwo, sideThree);
  }
}