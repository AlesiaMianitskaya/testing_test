/**
 *
 */
public class IpLine {

  private String ip;

  /**
   * Constructor creates field of IP address and input it
   *
   * @param ip IP address server
   */
  public IpLine(String ip) {
    this.ip = ip;
  }

  /**
   * Getter for IP address
   *
   * @return IP address
   */
  public String getIp() {
    return ip;
  }
}
