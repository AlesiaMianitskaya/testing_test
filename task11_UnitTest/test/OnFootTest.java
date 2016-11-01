import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class OnFootTest {
  private OnFoot onFoot;
  ArrayList<String> Point;

  @Before
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