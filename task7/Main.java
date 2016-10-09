import java.util.Scanner;

/**
 * The starting point of the program
 * check five rules
 */
public class Main {
  /**
   * Enter string and
   * output results of rules
   *
   * @param args - console arguments
   */
  public static void main(String[] args) {
    System.out.println("Enter string: ");
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();

    PrintResults pr = new PrintResults();
    pr.print(line);
  }
}
