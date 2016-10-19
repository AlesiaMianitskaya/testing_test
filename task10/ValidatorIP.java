import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

/**
 * Validation IP address of servers
 */
public class ValidatorIP {
  /**
   * validate ID address
   *
   * @param args command line argument
   * @return true if args is valid ID address otherwise false
   */
  public static boolean isValidIP(final String args) {
    try {
      Object res = InetAddress.getByName(args);
      return res instanceof Inet4Address || res instanceof Inet6Address;
    } catch (IOException e) {
      return false;
    }
  }
}
