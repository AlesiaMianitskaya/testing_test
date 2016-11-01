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
  Bus(int passengersBus, double speedBus, double fuelBus, double priceFuelCar) {
    this.passengersBus = passengersBus;
    this.speedBus = speedBus;
    this.fuelBus = fuelBus;
    this.priceFuelCar = priceFuelCar;
  }

  /**
   * Calculate the travel time by bus
   *
   * @param Point coordinates of the distance
   * @return travel time
   */
  @Override
  public double countTime(ArrayList<String> Point) {
    Distance distance = new Distance();
    double path = distance.countPath(Point);
    double timePath = path / speedBus;
    return timePath;
  }

  /**
   * Calculate travel cost by bus
   *
   * @param Point coordinates of the distance
   * @return travel cost
   */
  @Override
  public double countPrice(ArrayList<String> Point) {
    Distance distance = new Distance();
    double path = distance.countPath(Point);
    double price = ((fuelBus / 100) * path * priceFuelCar) / passengersBus;
    return price;
  }
}
