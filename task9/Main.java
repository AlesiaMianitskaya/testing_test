import java.io.File;

/**
 * Start of the program
 */
public class Main {
  /**
   * Create object of class File which is
   * in the current directory
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    File F = new File(System.getProperty("user.dir"));
    File[] list = F.listFiles();

    HtmlReporter hr = new HtmlReporter();
    hr.create(list);
  }
}
