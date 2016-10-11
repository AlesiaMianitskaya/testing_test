/**
 * Builder is super class
 */
public abstract class Builder {
  /**
   * abstract method for rules
   *
   * @param line - console argument
   * @return results rules
   */
  public abstract boolean test(String line);
}
