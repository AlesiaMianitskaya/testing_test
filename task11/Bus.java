import java.util.ArrayList;

/**
 * Describe parameters of bus
 * and calculate the time and travel cost
 */
public class Bus extends MotorCar {

  private int passengersBus;
  private double speedBus;
  private double fuelBus;
  private double priceFuelCar;

  /**
   * Create bus
   */
  Bus() {
    this.passengersBus = 60;
    this.speedBus = 50.0;
    this.fuelBus = 20.5;
    this.priceFuelCar = 0.6;
  }

  /**
   * Calculate the time and travel cost by bus
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
    price = ((fuelBus / 100) * path * priceFuelCar) / passengersBus;
    timePath = path / speedBus;
    double[] statistics = {price, timePath};
    return statistics;
  }

}
