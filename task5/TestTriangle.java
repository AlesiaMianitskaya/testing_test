import java.util.Scanner;

/**
 * The starting point of the program,
 * triangle type definition
 */
public class TestTriangle {
  /**
   * enter length of the triangle and
   * output type of a triangle
   *
   * @param args - console arguments
   */
  public static void main(String args[]) {
    double a, b, c;
    Scanner side = new Scanner(System.in);
    System.out.println("Enter length of the sides of the triangle: ");
    try {
      Triangle tr = new Triangle();
      MyCheck ck = new MyCheck();
      a = side.nextDouble();
      b = side.nextDouble();
      c = side.nextDouble();

      if (!ck.check(a, b, c) || ck.test(a, b, c)) {
        System.out.println("Triangle isn't exist.");
      } else {
        if (tr.isEquilateral(a, b, c)) {
          System.out.println("Triangle is equilateral.");
          System.exit(0);
        }
        if (tr.isIsosceles(a, b, c)) {
          System.out.println("Triangle is isosceles.");
        }
        if (!tr.isIsosceles(a, b, c) && !tr.isEquilateral(a, b, c)) {
          System.out.println("Triangle is simple.");
        }
      }
    } catch (Exception e) {
      System.out.println("Wrong data!");
    }
  }
}