import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Reading file containing coordinates of the distance
 */
public class ReadFile {
  /**
   * Read file and addition coordinates to ArrayList
   *
   * @param Point ArrayList for coordinates of the distance
   */
  public void read(ArrayList<String> Point) {
    try {
      Path path = Paths.get("points.txt");
      BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8);
      String line;
      while ((line = br.readLine()) != null) {
        Point.add(new String(line));
      }
      br.close();
    } catch (IOException e) {
      System.out.println("Error!");
    }
  }
}

