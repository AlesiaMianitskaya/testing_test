package subscriber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * contains elements subscriber's login page
 */
public class SubscriberLoginPage {
  private static final String URL_LOGIN_PAGE = "http://localhost:8888/wp-login.php";
  private WebDriver driver;

  /**
   * constructor subscriber's login page
   *
   * @param driver chrome driver for opening browser
   */
  public SubscriberLoginPage(ChromeDriver driver) {
    this.driver = driver;
  }

  /**
   * open login page
   */
  public void openLoginPage() {
    driver.get(URL_LOGIN_PAGE);
  }

  /**
   * fill field subscriber's login
   *
   * @param userName subscriber's name
   */
  public void setSubscriberName(String userName) {
    driver.findElement(By.id("user_login")).sendKeys(userName);
  }

  /**
   * fill field subscriber's password
   *
   * @param password subscriber's password
   */
  public void setSubscriberPassword(String password) {
    driver.findElement(By.id("user_pass")).sendKeys(password);
  }

  /**
   * log in home subscriber's page
   *
   * @return subscriber's home page
   */
  public SubscriberHomePage enterLoginPageSubscriber() {
    driver.findElement(By.id("wp-submit")).click();
    return new SubscriberHomePage((ChromeDriver) driver);
  }
}
