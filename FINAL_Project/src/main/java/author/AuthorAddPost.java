package author;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * contains elements page with adding post by author
 */
public class AuthorAddPost {
  private WebDriver driver;

  /**
   * constructor page with adding post by author
   *
   * @param driver chrome driver for opening browser
   */
  public AuthorAddPost(ChromeDriver driver) {
    this.driver = driver;
  }

  /**
   * input title adding post
   *
   * @param title adding post
   */
  public void setTitle(String title) {
    driver.findElement(By.id("title")).sendKeys(title);
  }

  /**
   * input content adding post
   *
   * @param post content adding post
   */
  public void setPost(String post) {
    driver.findElement(By.id("content")).sendKeys(post);
  }

  /**
   * get added post page's url
   *
   * @return added post page's url
   */
  public String getAddPostPageUrl() {
    return driver.getCurrentUrl();
  }
}