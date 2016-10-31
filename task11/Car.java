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
  Car() {
    this.passengersCar = 1;
    this.speedCar = 90.0;
    this.fuelCar = 7.5;
    this.priceFuelCar = 0.6;
  }

  /**
   * Calculate the time and travel cost by car
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
    price = ((fuelCar / 100) * path * priceFuelCar) / passengersCar;
    timePath = path / speedCar;
    double[] statistics = {price, timePath};
    return statistics;
  }
}
