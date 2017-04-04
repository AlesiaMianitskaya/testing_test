package Editor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Contains pages' elements with log out by editor
 */
public class EditorLogOut {
  private WebDriver driver;

  /**
   * Constructor editor's log out page
   *
   * @param driver - chrome driver
   */
  public EditorLogOut(ChromeDriver driver) {
    this.driver = driver;
  }

  /**
   * go to title site fot log outing
   */
  public void goToTitle() {
    driver.findElement(By.xpath(".//*[@id='wp-admin-bar-site-name']/a")).click();
  }

  /**
   * editor log out
   */
  public void logOut() {
    driver.findElement(By.xpath(".//*[@id='meta-2']/ul/li[2]/a")).click();
  }
}
