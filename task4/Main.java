import java.util.Scanner;

/*
 * Starting point of the program
 */
public class Main {
  /*
   * Enter coefficients of the equation
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MySolve sv = new MySolve();
    System.out.println("Enter a, b, c for a*x^2 + b*x + c = 0: ");

    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    // finds the roots of the equation
    sv.solve(a, b, c);
  }
}
