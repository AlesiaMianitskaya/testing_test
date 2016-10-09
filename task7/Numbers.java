/**
 * Rule two: string contains only numbers
 */
public class Numbers {
  /**
   * Check rule two
   *
   * @param line - console argument
   * @return true if rule is done, false otherwise
   */
  public static boolean check(String line) {
    char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    int count = 0;
    char[] newLine = line.toCharArray();

    for (int i = 0; i < newLine.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        if (newLine[i] == numbers[j]) {
          count++;
        }
      }
    }
    if (count == newLine.length) {
      return true;
    } else {
      return false;
    }
  }
}
