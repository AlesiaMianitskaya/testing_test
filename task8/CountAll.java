import java.util.ArrayList;

/**
 * The second command
 */
public class CountAll extends Command {
  /**
   * Count amount af all items and output how much items are
   *
   * @param lists entered data of items
   */
  public void count(ArrayList<Item> lists) {

    Item[] arrayAmount = new Item[lists.size()];

    for (int i = 0; i < arrayAmount.length; i++) {
      arrayAmount[i] = lists.get(i);
    }
    int sum = 0;
    for (int i = 0; i < arrayAmount.length; i++) {
      sum += arrayAmount[i].getAmount();
    }
    System.out.println("Count of all items: " + sum);
  }
}
