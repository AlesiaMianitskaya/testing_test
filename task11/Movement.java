import java.util.ArrayList;

/**
 * Describe the movement
 */
public interface Movement {
  /**
   * Calculate the time and travel cost
   *
   * @param Point coordinates of the distance
   * @return time and travel cost
   */
  public abstract double[] countStatistics(ArrayList<String> Point);
}
