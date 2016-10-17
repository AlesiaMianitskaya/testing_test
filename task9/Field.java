import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;

/**
 * Find the size of files and folders, creation time for filling the table
 */
public class Field {
  /**
   * Count size of folders of current directory
   *
   * @param p path to this folder
   * @return size of folders in Kb
   * @throws IOException auto generated exception when work with files
   */
  public long sizeDir(String p) throws IOException {
    long sum = 0;
    File dir = new File(p);
    File[] dList = dir.listFiles();
    for (File d : dList) {
      if (d.isDirectory()) {
        sum += sizeDir(d.getPath());
      }
      if (d.isFile()) {
        sum += d.length();
      }
    }
    return sum;
  }

  /**
   * Count size of file of current directory
   *
   * @param list is file of current directory
   * @return size of file in bytes
   */
  public long sizeFile(File list) {
    long  size = list.length();
    return size;
  }

  /**
   * Convert file's or folder's sizes in Kb
   *
   * @param size file's or folder's sizes in bytes
   * @return 0 if file or folder are empty, 1 if sizes less one Kb
   * otherwise size in Kb
   */

  public long convertToKb(long size) {
    if (size == 0) {
      return 0;
    }
    if (size < 1024) {
      return 1;
    } else {
      return size / 1024;
    }
  }

  /**
   * Find creation time of files and folders of current directory
   *
   * @param path is  path to files or to folder
   * @return creation time of files and folders
   * @throws IOException auto generated exception when work with files
   */
  public String createTime(Path path) throws IOException {
    BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
    FileTime dateC = attributes.creationTime();
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    String date = sdf.format(dateC.toMillis());
    return date;
  }
}
