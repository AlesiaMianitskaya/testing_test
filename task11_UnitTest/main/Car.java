import java.util.ArrayList;

/**
 * Describe parameters of car
 * and calculate the time and travel cost
 */
public class Car extends MotorCar {

  private int passengersCar;
  private double speedCar;
  private double fuelCar;
  private double priceFuelCar;

  /**
   * Create car
   */
  Car(int passengersCar, double speedCar, double fuelCar, double priceFuelCar) {
    this.passengersCar = passengersCar;
    this.speedCar = speedCar;
    this.fuelCar = fuelCar;
    this.priceFuelCar = priceFuelCar;
  }

  /**
   * Calculate the travel time by car
   *
   * @param Point coordinates of the distance
   * @return travel time
   */
  @Override
  public double countTime(ArrayList<String> Point) {
    Distance distance = new Distance();
    double path = distance.countPath(Point);
    double timePath = path / speedCar;
    return timePath;
  }

  /**
   * Calculate travel cost by car
   *
   * @param Point coordinates of the distance
   * @return travel cost
   */
  @Override
  public double countPrice(ArrayList<String> Point) {
    Distance distance = new Distance();
    double path = distance.countPath(Point);
    double price = ((fuelCar / 100) * path * priceFuelCar) / passengersCar;
    return price;
  }
}
