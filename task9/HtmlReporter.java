import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Creates the HTML table containing information about the current directory
 */
public class HtmlReporter {
  /**
   * Constant table's name
   */
  private String NAME_TABLE = "table.html";
  /**
   * Constants colors
   */
  private String COLOR_1_BODY = "#efefef";
  private String COLOR_2_BODY = "#f7f7f7";
  private String COLOR_BACKGROUND = "#ffffff;";
  private String COLOR_HEAD = "#cfcfcf;";
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
      "    height: 40px;\n" +
      "    vertical-align: top;\n" +
      "    background: " + COLOR_HEAD + " \n" +
      "    padding: 5px; \n" +
      "   }  \n" +
      "   tr{\n" +
      "    height: 20px;\n" +
      "   }\n" +
      "  </style>\n" +
      " </head> \n" +
      " <body>\n" +
      "  <table>\n";
  private String HEAD_TABLE = "   <tr><th>ИМЯ</th><th>ТИП</th><th>ДАТА СОЗДАНИЯ</th><th>РАЗМЕР (в Kb)</th></tr>\n";
  private String FOOTER = "  </table>\n</body>\n</html>";

  /**
   * Change the color of the line
   *
   * @param colorLine current line's color
   * @return COLOR_2_BODY if the previous line's color was COLOR_1_BODY, otherwise COLOR_1_BODY
   */
  private String keyColor(String colorLine) {
    if (colorLine.equals(COLOR_1_BODY)) {
      return COLOR_2_BODY;
    } else {
      return COLOR_1_BODY;
    }
  }

  /**
   * Creates a HTML table and fill in table's head
   *
   * @param list is array of files and folders of current directory
   */
  public void create(File[] list) {
    File file = new File(NAME_TABLE);
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter(file));
      bw.write(HEAD + HEAD_TABLE);
      String colorLine = COLOR_1_BODY;

      for (File f : list) {
        String name = f.getName();
        String type = "";
        long size = 0;
        Field fl = new Field();
        if (f.isFile()) {
          type = "File";
          size = fl.convertToKb(fl.sizeFile(f));
        }
        if (f.isDirectory()) {
          type = "Dir";
          size = fl.convertToKb(fl.sizeDir(f.getPath()));
        }
        Path path = Paths.get(f.getPath());
        String date = fl.createTime(path);
        writeCells(bw, name, type, date, size, colorLine);
        colorLine = keyColor(colorLine);
      }
      bw.write(FOOTER);
      bw.close();
    } catch (IOException e) {
      System.out.println("Error!");
    }
  }

  /**
   * Writes files' and folders' names, types, times creation and sizes in HTML table
   *
   * @param bw        object of class BufferedWriter for writing
   * @param name      file's or folder's names
   * @param type      file's or folder's types
   * @param date      file's or folder's times creation
   * @param size      file's or folder's sizes
   * @param colorLine color of line
   * @throws IOException auto generated exception when work with files
   */
  public void writeCells(BufferedWriter bw, String name, String type, String date, long size, String colorLine) throws IOException {
    bw.write(" <tr bgcolor = " + colorLine + " padding=\"5px\"><td>" + name + "</td>" +
        "<td>" + type + "</td><td>" + date + "</td><td>" + size + "</td></tr>\n");
  }
}

