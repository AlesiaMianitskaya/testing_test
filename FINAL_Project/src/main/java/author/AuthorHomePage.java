package author;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * contains elements author's home page
 */
public class AuthorHomePage {
  private WebDriver driver;

  /**
   * constructor author's home page
   *
   * @param driver chrome driver for opening browser
   */
  public AuthorHomePage(ChromeDriver driver) {
    this.driver = driver;
  }

  /**
   * get  home page url
   *
   * @return author's home page url
   */
  public String getHomePageUrl() {
    return driver.getCurrentUrl();
  }

  /**
   * save post
   *
   * @return page with adding post
   */
  public AuthorAddPost enterSaveDraft() {
    driver.findElement(By.id("save-post")).click();
    return new AuthorAddPost((ChromeDriver) driver);
  }
}