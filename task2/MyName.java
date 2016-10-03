public class MyName {
  /*
   *print Hello, args, args enter from command line
   */
  public static void main(String args[]) { //output Hello, args
    if (args.length != 0) { //name enter
      for (int i = 0; i < args.length; i++) {
        System.out.println("Hello, " + args[i] + "."); //output
      }
    }
    else {
      System.out.println("It isn't name."); //name isn't
    }
  }
}
