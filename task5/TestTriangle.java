import java.util.Scanner;

/**
 * the starting point of the program
 */
public class TestTriangle {
  // Entrance to solution, prints results to console
  public static void main(String args[]) {
    double a, b, c;
    Scanner side = new Scanner(System.in);
    Triangle tr = new Triangle();
    MyCheck ck = new MyCheck();
    System.out.println("Enter length of the sides of the triangle: ");
    try {
      a = side.nextDouble();
      b = side.nextDouble();
      c = side.nextDouble();

      // the existence check
      if (!ck.check(a, b, c) || ck.test(a, b, c)) {
        System.out.println("Triangle isn't exist.");
      } else {
        // if triangle is equilateral
        if (tr.equilateral(a, b, c)) {
          System.out.println("Triangle is equilateral.");
          System.exit(0);
        }
        // test of an isosceles
        if (tr.isosceles(a, b, c)) {
          System.out.println("Triangle is isosceles.");
        }
        // test triangle is simple
        if (!tr.isosceles(a, b, c) && !tr.equilateral(a, b, c)) {
          System.out.println("Triangle is simple.");
        }
      }

    } catch (Exception e) {
      System.out.println("Wrong data!");
    }
  }
}