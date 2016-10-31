import java.util.ArrayList;

/**
 * Calculation of the distance movement and validation this
 */
public class Distance {
  /**
   * Write coordinates in the two-dimensional array
   *
   * @param Point coordinates of the distance
   * @return two-dimensional array contained coordinates
   */
  public double[][] writePointToArray(ArrayList<String> Point) {
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
    return coord;
  }

  /**
   * Calculate distance
   *
   * @param Point
   * @return distance movement
   */
  public double countPath(ArrayList<String> Point) {
    double length = 0.0;
    double[][] coord = writePointToArray(Point);
    for (int i = 1; i < Point.size(); i++) {
      for (int j = 0; j < 2; j++) {
        length += coord[i][j] * coord[i][j] - coord[i - 1][j] * coord[i - 1][j];
      }
    }
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
