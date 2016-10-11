import java.util.ArrayList;

/**
 * The first command
 */
public class CountTypes extends Command{
  /**
   * Count types of items and output how much types are
   *
   * @param lists entered data of items
   */
  public void count(ArrayList<Item> lists) {
    Item[] arrayType = new Item[lists.size()];
    int count = 0;
    for (int i = 0; i < arrayType.length; i++) {
      arrayType[i] = lists.get(i);
    }
    for (int i = 0; i < arrayType.length; i++) {
      for (int j = i + 1; j < arrayType.length; j++) {
        if (arrayType[i].getTypes().equals(arrayType[j].getTypes())) {
          count++;
        }
      }
    }
    System.out.println("Count of types: " + (arrayType.length - count));
  }

}
