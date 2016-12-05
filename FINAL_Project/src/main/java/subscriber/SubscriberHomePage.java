package subscriber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * contains elements subscriber's home page
 */
public class SubscriberHomePage {
  private WebDriver driver;

  /**
   * constructor subscriber's home page
   *
   * @param driver chrome driver for opening browser
   */
  public SubscriberHomePage(ChromeDriver driver) {
    this.driver = driver;
  }

  /**
   * get home page url
   *
   * @return subscriber's home page url
   */
  public String getHomePageUrl() {
    return driver.getCurrentUrl();
  }
}
