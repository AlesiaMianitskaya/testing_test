import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;


public class DistanceTest {
  private Distance distance;
  ArrayList<String> Point;


  @BeforeTest
  public void setUp() throws Exception {
    distance = new Distance();
    Point = new ArrayList<String>();
    Point.add(new String("0 0"));
  }

  @DataProvider(name = "Point")
  public Object[][] getPoint() {
    return new Object[][]{
        {5.0, Point.add(new String("3.0 4.0"))},
        {5.0, Point.add(new String("-3.0 -4.0"))},
        {5.0, Point.add(new String("-3.0 4.0"))},
        {5.0, Point.add(new String("-3.0 4.0"))},
        {5.0, Point.add(new String("6/2 8/2"))},
        {14.142, Point.add(new String("1e10 1e10"))}
    };
  }

  @Test(dataProvider = "Point")
  public void testPath(double expected, ArrayList<String> Point) {
    assertEquals(expected, distance.countPath(Point));
  }

  @DataProvider(name = "data")
  public Object[][] getPoints() {
    return new Object[][]{
        {false, new double[][]{{0, 0}, {0, 0}}},
        {true, new double[][]{{1, 1}, {1, 1}}}
    };
  }

  @Test(dataProvider = "data")
  public void PositiveValid(boolean expected, double[][] points) {
    assertEquals(distance.validatePoint(points), expected);
  }

  @Test
  public void testCountPathMoreTwoPoint() {
    Point.add(new String("3.0 4.0"));
    Point.add(new String("6.0 8.0"));
    assertEquals(10.0, distance.countPath(Point), 0.001);
  }

  @Test()
  public void testWritePointToArray() {
    double[][] points = {{0, 0}, {2, 3}};
    Point.add(new String("2 3"));
    assertArrayEquals(points, distance.writePointToArray(Point));
  }
}