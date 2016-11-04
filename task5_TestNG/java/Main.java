
import java.util.Scanner;

/**
 * Start point of program, define type of triangle
 */
public class Main {
  public static void main(String[] args) {
    double a, b, c;
    Scanner side = new Scanner(System.in);
    System.out.println("Enter length of the sides of the triangle: ");
    try {
      a = side.nextDouble();
      b = side.nextDouble();
      c = side.nextDouble();

      MyCheck ck = new MyCheck();
      Triangle tr = new Triangle();
      if (!ck.checkExist(a, b, c) || !ck.checkZero(a, b, c)) {
        System.out.println("Triangle isn't exist.");
      } else {
        if (tr.isEquilateral(a, b, c)) {
          System.out.println("Triangle is equilateral.");
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

