import java.util.ArrayList;

/**
 * Calculation of the distance movement and validation this
 */
public class Distance {
  /**
   * Calculate distance
   *
   * @param Point coordinates of the distance
   * @return distance movement
   */
  public double countPath(ArrayList<String> Point) {

    String[] arrayPoint = new String[Point.size()];
    double[][] coord = new double[Point.size()][2];

    for (int i = 0; i < Point.size(); i++) {
      String[] coordStr;
      double[] coordD = new double[2];

      arrayPoint[i] = Point.get(i);
      coordStr = arrayPoint[i].split(" ");
      for (int k = 0; k < 2; k++) {
        coordD[k] = Double.parseDouble(coordStr[k]);
      }
      for (int j = 0; j < coordStr.length; j++) {
        coord[i][j] = coordD[j];
      }
    }
    double length = 0.0;
    for (int i = 1; i < Point.size(); i++) {
      for (int j = 0; j < 2; j++) {
        length += coord[i][j] * coord[i][j] - coord[i - 1][j] * coord[i - 1][j];
      }
    }
    if (!validatePoint(coord)) {
      System.out.println("Checkpoints are illegal.");
      System.exit(0);
    }
    System.out.println(Math.sqrt(length));
    return Math.sqrt(length);
  }

  /**
   * Compares the first and last coordinate
   *
   * @param coord coordinate of the distance
   * @return true if coordinate doesn't equals otherwise false
   */
  public boolean validatePoint(double[][] coord) {
    double flagOne = 1 / (coord[0][0] - coord[coord.length - 1][0]);
    double flagTwo = 1 / (coord[0][1] - coord[coord.length - 1][1]);
    if (Double.isInfinite(flagOne) && Double.isInfinite(flagTwo)) {
      return false;
    } else {
      return true;
    }
  }
}
