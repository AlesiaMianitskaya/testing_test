/**
 * Rules four: string contains dictionary's words
 * The dictionary is "I like Java very much"
 */
public class Vocabulary {
  /**
   * Check rule three
   *
   * @param line - console argument
   * @return true if rule is done, false otherwise
   */
  public static boolean check(String line) {
    String[] wordbook = {"I", "like", "Java", "very", "much"};
    int countTrue = 0;
    for (int i = 0; i < wordbook.length; i++) {
      if (line.contains(wordbook[i])) {
        countTrue++;
      }
    }
    if (countTrue != 0) {
      return true;
    } else {
      return false;
    }
  }
}
