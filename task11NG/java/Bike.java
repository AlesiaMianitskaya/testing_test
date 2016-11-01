import java.util.ArrayList;

/**
 * Describe parameters of bike
 * and calculate the time and travel cost
 */
public class Bike implements Movement {

  private double speedBike;

  /**
   * Create bike
   */
  Bike(double speedBike) {
    this.speedBike = speedBike;
  }

  /**
   * Define travel cost by bike
   *
   * @return travel cost
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
    timePath = path / speedBike;
    return timePath;
  }
}
