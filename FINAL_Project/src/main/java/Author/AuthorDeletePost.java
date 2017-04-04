package Author;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Contains pages' elements with deleting post by author
 */
public class AuthorDeletePost {

  private WebDriver driver;

  /**
   * Constructor of the page with deleting post by author
   *
   * @param driver - chrome driver
   */
  public AuthorDeletePost(ChromeDriver driver) {
    this.driver = driver;
  }

  /**
   *  go to post
   */
  public void goToPosts() {
    driver.findElement(By.linkText("1 Posts")).click();
  }

  /**
   * open post fot deleting
   */
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
