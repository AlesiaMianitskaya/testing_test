public class MyName {
  public static void main(String args[]) {
    if (args.length != 0) { //name enter
      for (int i = 0; i < args.length; i++)
      System.out.println("Hello, " + args[i] + "."); //output
    }
    else System.out.println("It isn't name."); //name isn't
  }
}
