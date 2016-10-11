/**
 * Start point of program
 */
public class Main {
  /**
   * Create object class Shop
   *
   * @param args - console argument
   */
  public static void main(String[] args) {
    try {
      Shop sh = new Shop();
      sh.goShop();
    } catch (Exception e) {
      System.out.println("Wrong data!");
    }
  }
}








