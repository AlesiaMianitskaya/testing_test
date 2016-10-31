import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DistanceTest {
  private Distance distance;
  ArrayList<String> Point;

  @Before
  public void setUp() throws Exception {
    distance = new Distance();
    Point = new ArrayList<String>();
    Point.add(new String("0 0"));
  }

  @Test
  public void testCountPath() {
    Point.add(new String("3 4"));
    assertEquals(5.0, distance.countPath(Point), 0.001);
  }

  @Test
  public void testCountPathMinus() {
    Point.add(new String("-3 -4"));
    assertEquals(5.0, distance.countPath(Point), 0.001);
  }

  @Test
  public void testCountPathFraction() {
    Point.add(new String("6/2 8/2"));
    assertEquals(5.0, distance.countPath(Point), 0.001);
  }

  @Test
  public void testCountPathDegree() {
    Point.add(new String("1e10 1e10"));
    assertEquals(14.142135, distance.countPath(Point), 0.001);
  }

  @Test
  public void testCountPathMoreTwoPoint() {
    Point.add(new String("3.0 4.0"));
    Point.add(new String("6.0 8.0"));
    assertEquals(10.0, distance.countPath(Point), 0.001);
  }

  @Test
  public void testWritePointToArray() {
    double[][] points = {{0, 0}, {2, 3}};
    Point.add(new String("2 3"));
    assertArrayEquals(points, distance.writePointToArray(Point));
  }

  @Test
  public void PositiveValid() {
    double[][] points = {{1, 1}, {2, 2}};
    assertTrue(distance.validatePoint(points));
  }

  @Test
  public void NegativeValid() {
    double[][] points = {{0, 0}, {0, 0}};
    assertFalse(distance.validatePoint(points));
  }
}