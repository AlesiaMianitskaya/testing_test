/**
 * Rule one: string doesn't contain numbers
 */
public class NoNumbers extends Builder{
  /**
   * Check rule one
   *
   * @param line - console argument
   * @return true if rule is done, false otherwise
   */
  public boolean test(String line) {
    char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    int position = 0;
    for (int i = 0; i < numbers.length; i++) {
      position += line.indexOf(numbers[i]);
    }
    if (position == -1 * numbers.length) {
      return true;
    } else {
      return false;
    }
  }
}
