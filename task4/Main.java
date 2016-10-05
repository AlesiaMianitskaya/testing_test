import java.util.Scanner;

/**
 * Starting point of the program,
 * finding real roots of a quadratic
 * equation
 */
public class Main {
  /**
   * Enter coefficients of the
   * equation and output roots
   *
   * @param args - console arguments
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a, b, c for a*x^2 + b*x + c = 0: ");
    try {
      MySolve sv = new MySolve();
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      sv.solve(a, b, c);
    } catch (Exception e) {
      System.out.println("Wrong data!");
    }
  }
}
