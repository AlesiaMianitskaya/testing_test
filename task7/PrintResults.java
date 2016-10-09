/**
 * Output results on console
 */
public class PrintResults {
  /**
   * Print results
   *
   * @param line - console argument
   */
  public static void print(String line) {
    NoNumbers no = new NoNumbers();
    Numbers num = new Numbers();
    MoreWords more = new MoreWords();
    Vocabulary voc = new Vocabulary();
    if (line.length() == 0) {
      System.out.println("String is empty!");
      System.exit(0);
    }
    if (!no.check(line) && !num.check(line) && !more.check(line) && !voc.check(line)) {
      System.out.println("All rules fail!");
    }
    System.out.println("Rule one: string doesn't contain numbers. It is " + no.check(line) + ".");
    System.out.println("Rule two: string contains only numbers. It is " + num.check(line) + ".");
    System.out.println("Rule three: string contains more than 5 words. It is " + more.check(line) + ".");
    System.out.println("Rule four: string contains dictionary's words. It is " + voc.check(line) + ".");
  }
}
