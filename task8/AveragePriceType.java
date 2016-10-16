import java.util.ArrayList;
import java.util.Scanner;

/**
 * The fourth command
 */
public class AveragePriceType extends Command {
  /**
   * Count average price for certain type of items
   *
   * @param lists lists entered data of items
   */
  public void count(ArrayList<Item> lists) {
    Item[] arrayType = new Item[lists.size()];
    Item[] arrayPrice = new Item[lists.size()];

    for (int i = 0; i < arrayType.length; i++) {
      arrayType[i] = lists.get(i);
    }
    for (int i = 0; i < arrayPrice.length; i++) {
      arrayPrice[i] = lists.get(i);
    }

    System.out.println("Enter type you want to count average price: ");
    Scanner sc = new Scanner(System.in);
    String userType = sc.next();
    double averPriceType = 0.0;

    for (int i = 0; i < arrayType.length; i++) {
      if (userType.equals(arrayType[i].getTypes())) {
        for (int j = 0; j < arrayPrice.length; j++) {
          averPriceType += arrayPrice[j].getPrice();
          break;
        }
      }
    }
    System.out.println("Average price of: " + userType + " " + (averPriceType / arrayPrice.length));
  }
}
