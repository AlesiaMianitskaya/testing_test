import java.util.ArrayList;

/**
 * Start point of this program
 */
public class Main {
  /**
   * Creates ArrayList for IP address of servers
   *
   * @param args command line argument
   */
  public static void main(String[] args) {

    ArrayList<IpLine> iPlist = new ArrayList<>();
    ValidatorIP validatorIP = new ValidatorIP();

    if (args.length == 0) {
      ReaderFile rf = new ReaderFile();
      rf.getFromFile(iPlist);
    } else {
      for (int i = 0; i < args.length; i++) {
        iPlist.add(new IpLine(args[i]));
      }
      for (int i = iPlist.size() - 1; i >= 0; i--) {
        if (!validatorIP.isValidIP(args[i])) {
          iPlist.remove(i);
        }
      }
    }
    ReporterHtml rh = new ReporterHtml();
    rh.fillTable(iPlist);
  }
}
