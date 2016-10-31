import java.util.ArrayList;

/**
 * Count the time and travel cost for car or bus
 */
public abstract class MotorCar implements Movement {
  /**
   * Calculate the time and travel cost
   *
   * @param Point coordinates of the distance
   * @return time and travel cost
   */
  public abstract double[] countStatistics(ArrayList<String> Point);
}
