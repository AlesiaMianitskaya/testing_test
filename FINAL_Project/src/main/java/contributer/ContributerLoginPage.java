package contributer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * contains elements contributor's login page
 */
public class ContributerLoginPage {
  private static String URL_LOGIN_PAGE = "http://localhost:8888/wp-login.php";
  private WebDriver driver;

  /**
   * constructor contributor's login page
   *
   * @param driver chrome driver for opening browser
   */
  public ContributerLoginPage(ChromeDriver driver) {
    this.driver = driver;
  }

  /**
   * open login page
   */
  public void openLoginPage() {
    driver.get(URL_LOGIN_PAGE);
  }

  /**
   * fill field contributor's login
   *
   * @param userName contributor's name
   */
  public void setUserName(String userName) {
    driver.findElement(By.id("user_login")).sendKeys(userName);
  }

  /**
   * fill field contributor's password
   *
   * @param password contributor's password
   */
  public void setPassword(String password) {

    driver.findElement(By.id("user_pass")).sendKeys(password);
  }

  /**
   * log in home contributor's page
   *
   * @return contributor's home page
   */
  public ContributerHomePage enterLoginPage() {
    driver.findElement(By.id("wp-submit")).click();
    return new ContributerHomePage((ChromeDriver) driver);
  }
}