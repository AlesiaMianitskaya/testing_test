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
    if (!no.test(line) && !num.test(line) && !more.test(line) && !voc.test(line)) {
      System.out.println("All rules fail!");
    }
    System.out.println("Rule one: string doesn't contain numbers. It is " + no.test(line) + ".");
    System.out.println("Rule two: string contains only numbers. It is " + num.test(line) + ".");
    System.out.println("Rule three: string contains more than 5 words. It is " + more.test(line) + ".");
    System.out.println("Rule four: string contains dictionary's words. It is " + voc.test(line) + ".");
  }
}
