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
  Bike() {
    this.speedBike = 20.0;
  }

  /**
   * Calculate the time and travel cost by bike
   *
   * @param Point coordinates of the distance
   * @return array containing time and travel cost
   */
  @Override
  public double[] countStatistics(ArrayList<String> Point) {
    double price;
    double path;
    double timePath;
    Distance distance = new Distance();
    path = distance.countPath(Point);
    price = 0.0;
    timePath = path / speedBike;
    double[] statistics = {price, timePath};
    return statistics;
  }

}
