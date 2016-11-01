import java.util.ArrayList;

/**
 * Count the time and travel cost for car or bus
 */
public abstract class MotorCar implements Movement {
  /**
   * Calculate travel cost
   *
   * @param Point coordinates of the distance
   * @return travel cost
   */
  public abstract double countPrice(ArrayList<String> Point);

  /**
   * Calculate travel time
   *
   * @param Point coordinates of the distance
   * @return travel time
   */
  public abstract double countTime(ArrayList<String> Point);
}