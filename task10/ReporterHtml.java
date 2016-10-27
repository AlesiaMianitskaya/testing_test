import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Creates the HTML table containing information about servers
 */
public class ReporterHtml {
  /**
   * Constant table's name
   */
  private String NAME_TABLE = "tableIP.html";
  /**
   * Constants colors
   */
  private String COLOR_1_BODY = "d9d9d9";
  private String COLOR_2_BODY = "fe0000";
  private String COLOR_3_BODY = "#efefef";
  private String COLOR_BACKGROUND = "#ffffff;";
  private String COLOR_HEAD = "#999999;";
  private String COLOR_TEXT = "#000000";
  /**
   * Constants part of the table
   */
  private String HEAD = "<!DOCTYPE html>\n" +
      "<html>\n" +
      " <head>\n" +
      "  <meta charset=\"utf-8\">\n" +
      "  <title>Table</title>\n" +
      "  <style>\n" +
      "   table {\n" +
      "   font-family: sans-serif;\n" +
      "    width: 520px;\n" +
      "    background: " + COLOR_BACKGROUND + "\n" +
      "    color: " + COLOR_TEXT + "\n" +
      "    border-spacing: 1px;\n" +
      "   }\n" +
      "    th {\n" +
      "    width: 130px;\n" +
      "    height: 20px;\n" +
      "    vertical-align: center;\n" +
      "    background: " + COLOR_HEAD + " \n" +
      "    padding: 5px; \n" +
      "   }  \n" +
      "   td {\n" +
      "    height:30px;\n" +
      "   }\n" +
      "  </style>\n" +
      " </head> \n" +
      " <body>\n" +
      "  <table>\n";
  private String HEAD_TABLE = "   <tr><th>Server</th><th>Response, ms</th></tr>\n";
  private String FOOTER = "  </table>\n</body>\n</html>";

  /**
   * Creates a HTML table and fill in table's head
   *
   * @param iPlist ArrayList with IP address servers
   */
  public void fillTable(ArrayList<IpLine> iPlist) {
    File file = new File(NAME_TABLE);
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter(file));
      bw.write(HEAD + HEAD_TABLE);
      writeIp(bw, iPlist);
      bw.write(FOOTER);
      bw.close();
    } catch (IOException e) {
      System.out.println("Error!");
    }
  }

  /**
   * Writes IP address of servers and responses to the table
   * and paints red color line with max response
   *
   * @param bw     object of class BufferedWriter for writing
   * @param iPlist ArrayList with IP address servers
   * @throws IOException auto generated exception when work with files
   */
  public void writeIp(BufferedWriter bw, ArrayList<IpLine> iPlist) throws IOException {
    String iP;
    String color = COLOR_1_BODY;
    IpLine[] arrayIp = new IpLine[iPlist.size()];
    int[] randomArray = new int[iPlist.size()];

    for (int j = 0; j < iPlist.size(); j++) {
      GeneratorRand gr = new GeneratorRand();
      randomArray[j] = gr.getRandom();
    }
    for (int i = 0; i < iPlist.size(); i++) {

      arrayIp[i] = iPlist.get(i);
      iP = arrayIp[i].getIp();

      color = keyColor(color);
      if (randomArray[i] == findMax(randomArray)) {
        color = COLOR_2_BODY;
      }
      bw.write(" <tr bgcolor = " + color + " padding=\"5px\"><td>" + iP + "</td>" +
          "<td>" + randomArray[i] + "</td></tr>\n");
    }
  }

  public int findMax(int[] randomArray) {
    int max = randomArray[0];
    for (int i = 0; i < randomArray.length; i++) {
      if (max < randomArray[i]) {
        max = randomArray[i];
      }
    }
    return max;
  }

  private String keyColor(String color) {
    if (color.equals(COLOR_1_BODY)) {
      return COLOR_3_BODY;
    } else {
      return COLOR_1_BODY;
    }
  }
}
