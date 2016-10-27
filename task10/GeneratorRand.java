/**
 * Generates a random value server response
 */
public class GeneratorRand {
  /**
   * max and min values of response
   */
  private int MIN = 10;
  private int MAX = 500;

  /**
   * generates a random integer number from 10 to 500
   *
   * @return response server
   */
  public int getRandom() {
    int response = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
    return response;
  }
}
