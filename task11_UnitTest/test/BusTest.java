import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class BusTest {
  private Bus bus;
  ArrayList<String> Point;

  @Before
  public void setUp() throws Exception {
    bus = new Bus(60, 50.0, 20.5, 0.6);
    Point = new ArrayList<String>();
    Point.add(new String("0 0"));
  }

  @Test
  public void testCountPrice() {
    Point.add(new String("6 5"));
    assertEquals(0.0160, bus.countPrice(Point), 0.001);
  }

  @Test
  public void testCountTime() {
    Point.add(new String("6 5"));
    assertEquals(0.1562, bus.countTime(Point), 0.001);
  }
}