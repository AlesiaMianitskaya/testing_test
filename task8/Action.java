import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class is for choose he command
 */
public class Action {
  /**
   * Do chosen command and exit from program
   *
   * @param lists entered data of items
   */
  public void act(ArrayList<Item> lists) {
    String flag;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("Enter command: count types or count all or average price or average price type or enter exit for exit:  ");
      flag = sc.nextLine();
      if (flag.equals("count types")) {
        CountTypes ct = new CountTypes();
        ct.count(lists);
      }
      if (flag.equals("count all")) {
        CountAll cl = new CountAll();
        cl.count(lists);
      }
      if (flag.equals("average price")) {
        AveragePrice ap = new AveragePrice();
        ap.count(lists);
      }
      if (flag.equals("average price type")) {
        AveragePriceType at = new AveragePriceType();
        at.count(lists);
      }

    } while (!flag.equals("exit"));
    System.exit(0);
  }
}
