import java.util.ArrayList;

/**
 * Start point of the program
 */
public class Main {
  /**
   * Print statistics on the method to move: price and time
   * Create ArrayList for coordinates of the distance
   *
   * @param args command line argument
   */
  public static void main(String[] args) {
    ArrayList<String> Point = new ArrayList<String>();

    ReadFile rd = new ReadFile();
    rd.read(Point);

    Distance distance = new Distance();

    if (!distance.validatePoint(distance.writePointToArray(Point))) {
      System.out.println("Checkpoints are illegal.");
      System.exit(0);
    } else {
      Car car = new Car(1, 90.0, 7.5, 0.6);
      System.out.println("Price moving by car " + car.countPrice(Point) + " $ and time " + car.countTime(Point)+ " h");

      Bus bus = new Bus(60, 50.0, 20.5, 0.6);
      System.out.println("Price moving by bus " + bus.countPrice(Point) + " $ and time " + bus.countTime(Point) + " h");

      Bike bike = new Bike(20.0);
      System.out.println("Price moving by bike " + bike.countPrice() + " $ and time " + bike.countTime(Point) + " h");

      OnFoot onFoot = new OnFoot(5.0);
      System.out.println("Price moving on foot " + onFoot.countPrice() + " $ and time " + onFoot.countTime(Point) + " h");
    }
  }
}
