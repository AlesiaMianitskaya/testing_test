package Editor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Contains pages' elements with delete post by editor
 */
public class EditorDeletePost {
  private WebDriver driver;

  /**
   * Constructor of the page with deleting post by editor
   *
   * @param driver - chrome driver
   */
  public EditorDeletePost(ChromeDriver driver) {
    this.driver = driver;
  }

  /**
   * go to posts for deleting
   */
  public void goToPosts() {
    driver.findElement(By.linkText("2 Posts")).click();
  }

  public void openPost() {
    driver.findElement(By.className("row-title")).click();
  }

  /**
   * delete post
   */
  public void delete() {
    driver.findElement(By.id("delete-action")).click();
  }

  /**
   * find deleted post
   *
   * @return name "trash" with deleted post
   */
  public String getTrash() {
    return driver.findElement(By.className("trash")).getText();
  }
}
