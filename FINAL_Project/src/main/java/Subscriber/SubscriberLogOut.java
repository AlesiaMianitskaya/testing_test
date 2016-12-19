package Subscriber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Contains pages' elements with logging out by subscriber
 */
public class SubscriberLogOut {
  private WebDriver driver;

  /**
   * Constructor subscriber's logging out page
   *
   * @param driver - chrome driver
   */
  public SubscriberLogOut(ChromeDriver driver) {
    this.driver = driver;
  }

  /**
   * go title
   */
  public void goToTitle() {
    driver.findElement(By.xpath(".//*[@id='wp-admin-bar-site-name']/a")).click();
  }

  /**
   * log out subscriber
   */
  public void logOut() {
    driver.findElement(By.xpath(".//*[@id='meta-2']/ul/li[2]/a")).click();
  }
}
