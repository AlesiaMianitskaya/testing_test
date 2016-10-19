import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Reads file path PATH and entry IP address in  ArrayList
 */
public class ReaderFile {
  /**
   * gets from file IP addresses and enters in ArrayList
   *
   * @param iPlist ArrayList for IP address entry
   */
  public void getFromFile(ArrayList<IpLine> iPlist) {
    try {
      Path path = Paths.get("servers.txt");
      BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8);
      String line;
      while ((line = br.readLine()) != null) {
        iPlist.add(new IpLine(line));
      }
      br.close();
    } catch (IOException e) {
      System.out.println("Error!");
    }
  }
}

