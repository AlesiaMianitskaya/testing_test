import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class BikeTest {
  private Bike bike;
  ArrayList<String> Point;

  @Before
  public void setUp() throws Exception {
    bike = new Bike(20.0);
    Point = new ArrayList<String>();
    Point.add(new String("0 0"));
  }

  @Test
  public void testCountTime() {
    Point.add(new String("6 5"));
    assertEquals( 0.3905, bike.countTime(Point), 0.001);
  }
}