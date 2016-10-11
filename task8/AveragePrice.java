import java.util.ArrayList;

/**
 * The third command
 */
public class AveragePrice extends Command {
  /**
   * Count average price of all items and output it
   *
   * @param lists entered data of items
   */
  public void count(ArrayList<Item> lists) {
    Item[] arrayPrice = new Item[lists.size()];
    for (int i = 0; i < arrayPrice.length; i++) {
      arrayPrice[i] = lists.get(i);
    }

    Item[] arrayAmount = new Item[lists.size()];
    for (int i = 0; i < arrayAmount.length; i++) {
      arrayAmount[i] = lists.get(i);
    }

    int sum = 0;
    double averPrice = 0.0;
    for (int i = 0; i < arrayAmount.length; i++) {
      averPrice = arrayPrice[i].getPrice() * arrayAmount[i].getAmount();
      sum += arrayAmount[i].getAmount();
    }
    System.out.println("Average price of all items: " + (averPrice / sum));
  }
}

