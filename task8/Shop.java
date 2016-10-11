import java.util.ArrayList;
import java.util.Scanner;

/**
 * create ArrayList list and enter data of items
 */
public class Shop {

  ArrayList<Item> list = new ArrayList<>();

  /**
   * enter data of items in ArrayList list
   * and call method acts of class Action
   */
  public void goShop() {
    int i = 0;
    String types, names;
    int amount;
    double price;
    String flag;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.print("Enter " + (i + 1) + " type: ");
      types = sc.next();
      System.out.print("Enter name " + (i + 1) + " " + types + ": ");
      names = sc.next();
      System.out.print("Enter " + names + "'s amount: ");
      amount = sc.nextInt();
      System.out.print("Enter price " + types + " " + names + ": ");
      price = sc.nextDouble();
      System.out.print("Enter yes, if you want another item, otherwise any button: ");
      flag = sc.next();
      list.add(new Item(types, names, amount, price));
      i++;
    } while (flag.equals("yes"));
    Action acts = new Action();
    acts.act(list);
  }
}









