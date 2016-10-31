import java.util.ArrayList;

/**
 * Describe man
 * and calculate the time and movement cost
 */
public class OnFoot implements Movement {

  private double speedMan;

  /**
   * Create mab
   */
  OnFoot() {
    this.speedMan = 5.0;
  }

  /**
   * Calculate the time and movement cost on foot
   *
   * @param Point coordinates of the distance
   * @return array containing time and movement cost
   */
  @Override
  public double[] countStatistics(ArrayList<String> Point) {
    double price;
    double path;
    double timePath;
    Distance distance = new Distance();
    path = distance.countPath(Point);
    price = 0.0;
    timePath = path / speedMan;
    double[] statistics = {price, timePath};
    System.out.println(path);
    return statistics;
  }
}
