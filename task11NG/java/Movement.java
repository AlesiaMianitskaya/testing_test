import java.util.ArrayList;

/**
 * Describe the movement
 */
public interface Movement {
  /**
   * Calculate the time
   *
   * @param Point coordinates of the distance
   * @return travel time
   */
  double countTime(ArrayList<String> Point);
}
