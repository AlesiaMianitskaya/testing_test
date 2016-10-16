/**
 * Describes formation of items
 */
public class Item {
  private String types;
  private String names;
  private int amount;
  private double price;

  /**
   * Constructor creates fields of items and input it
   *
   * @param types  item's type
   * @param names  item's names
   * @param amount item's amount
   * @param price  item's prise
   */
  public Item(String types, String names, int amount, double price) {
    this.types = types;
    this.names = names;
    this.amount = amount;
    this.price = price;
  }

  /**
   * Getter for type
   *
   * @return item's type
   */
  public String getTypes() {
    return types;
  }

  /**
   * Getter for amount of items
   *
   * @return item's amount
   */
  public int getAmount() {
    return amount;
  }

  /**
   * Getter for price of items
   *
   * @return item's price
   */
  public double getPrice() {
    return price;
  }
}
