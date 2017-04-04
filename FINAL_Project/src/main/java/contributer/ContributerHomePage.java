package contributer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * contains elements contributor's home page
 */
public class ContributerHomePage {
  private WebDriver driver;

  /**
   * constructor contributor's home page
   *
   * @param driver chrome driver for opening browser
   */
  public ContributerHomePage(ChromeDriver driver) {
    this.driver = driver;
  }

  /**
   * get  home page url
   *
   * @return contributor's home page url
   */
  public String getHomePageUrl() {
    return driver.getCurrentUrl();
  }

}
