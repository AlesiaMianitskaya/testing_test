import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;


public class BikeTest {
  private Bike bike;
  ArrayList<String> Point;

  @BeforeTest
  public void setUp() throws Exception {
    bike = new Bike(20.0);
    Point = new ArrayList<String>();
  }

  @Test
  public void testCountTimeNull() {
    assertEquals("Error!", bike.countTime(Point), 0.001);
  }

  @Test
  public void testCountTime() {
    Point.add(new String("0 0"));
    Point.add(new String("6 5"));
    assertEquals(0.3905, bike.countTime(Point), 0.001);
  }
}