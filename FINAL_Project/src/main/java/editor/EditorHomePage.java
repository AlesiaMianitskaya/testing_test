package editor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * contains elements editor's home page
 */
public class EditorHomePage {
  private WebDriver driver;

  /**
   * constructor editor's home page
   *
   * @param driver chrome driver for opening browser
   */
  public EditorHomePage(ChromeDriver driver) {
    this.driver = driver;
  }

  /**
   * save post
   *
   * @return page with added post
   */
  public EditorAddPost enterSaveDraft() {
    driver.findElement(By.id("save-post")).click();
    return new EditorAddPost((ChromeDriver) driver);
  }

  /**
   * get home page url
   *
   * @return editor's home page url
   */
  public String getHomePageUrl() {
    return driver.getCurrentUrl();
  }

}