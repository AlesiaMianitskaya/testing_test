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
    ArrayList<String> Point = new ArrayList<>();

    ReadFile rd = new ReadFile();
    rd.read(Point);

    Car car = new Car();
    double[] statisticsCar = car.countStatistics(Point);
    System.out.println("Price moving by car " + statisticsCar[0] + " $ and time " + statisticsCar[1] + " h");

    Bus bus = new Bus();
    double[] statisticsBus = bus.countStatistics(Point);
    System.out.println("Price moving by bus " + statisticsBus[0] + " $ and time " + statisticsBus[1] + " h");

    Bike bike = new Bike();
    double[] statisticsBike = bike.countStatistics(Point);
    System.out.println("Price moving by bike " + statisticsBike[0] + " $ and time " + statisticsBike[1] + " h");

    OnFoot onFoot = new OnFoot();
    double[] statisticsMen = onFoot.countStatistics(Point);
    System.out.println("Price moving on foot " + statisticsMen[0] + " $ and time " + statisticsMen[1] + " h");
  }
}
