/**
 * Rule three: string contains more than 5 words
 * words are separated by spaces and punctuation marks
 */
public class MoreWords {
  /**
   * Check rule three
   *
   * @param line - console argument
   * @return true if rule is done, false otherwise
   */
  public static boolean check(String line) {
    int AMOUNT_OF_WORDS = 5;

    int wordsCount = line.split("[\\p{Punct} ]+").length;
    if (wordsCount > AMOUNT_OF_WORDS) {
      return true;
    } else {
      return false;
    }
  }
}
