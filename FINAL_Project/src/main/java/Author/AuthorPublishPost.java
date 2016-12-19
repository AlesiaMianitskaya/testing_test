package Author;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Contains pages' elements with publish post by author
 */
public class AuthorPublishPost {
  private WebDriver driver;

  /**
   * Constructor author's publish page
   *
   * @param driver - chrome driver
   */
  public AuthorPublishPost(ChromeDriver driver) {
    this.driver = driver;
  }

  /**
   * go to posts
   */
  public void goToPosts() {
    driver.findElement(By.linkText("1 Post")).click();
  }

  /**
   * open post for publishing
   */
  public void openPost() {
    driver.findElement(By.className("row-title")).click();
  }

  /**
   * publish post
   */
  public void publishPost() {
    driver.findElement(By.id("publish")).click();
  }

  /**
   * get status published post
   *
   * @return status published post
   */
  public String getStatus() {
    return driver.findElement(By.id("post-status-display")).getText();
  }
}
