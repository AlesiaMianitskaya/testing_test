import java.util.ArrayList;

/**
 * Describe man
 * and calculate the time and movement cost
 */
public class OnFoot implements Movement {

  private double speedMan;

  /**
   * Create man
   */
  OnFoot(double speedMan) {
    this.speedMan = speedMan;
  }

  /**
   * Define movement cost on foot
   *
   * @return movement cost
   */
  public double countPrice() {
    double price = 0.0;
    return price;
  }

  /**
   * Calculate the time travel
   *
   * @param Point coordinates of the distance
   * @return time travel
   */
  public double countTime(ArrayList<String> Point) {
    double timePath;
    Distance distance = new Distance();
    double path = distance.countPath(Point);
    timePath = path / speedMan;
    return timePath;
  }
}
