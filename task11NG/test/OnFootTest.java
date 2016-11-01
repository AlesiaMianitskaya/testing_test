import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;


public class OnFootTest {
  private OnFoot onFoot;
  ArrayList<String> Point;

  @BeforeTest
  public void setUp() throws Exception {
    onFoot = new OnFoot(5.0);
    Point = new ArrayList<String>();
    Point.add(new String("0 0"));
  }

  @Test
  public void testCountStatistics() {
    Point.add(new String("3 4"));
    assertEquals(1.0, onFoot.countTime(Point), 0.001);
  }
}