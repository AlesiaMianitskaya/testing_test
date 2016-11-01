import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;


public class CarTest {
  private Car car;
  ArrayList<String> Point;

  @BeforeTest
  public void setUp() throws Exception {
    car = new Car(1, 90.0, 7.5, 0.6);
    Point = new ArrayList<String>();
    Point.add(new String("0 0"));
  }

  @Test
  public void testPrice() {
    Point.add(new String("3 4"));
    assertEquals(0.2249, car.countPrice(Point), 0.001);
  }

  @Test
  public void testTime() {
    Point.add(new String("3 4"));
    assertEquals(0.0555, car.countTime(Point), 0.001);
  }
}