package author;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * contains elements author's login page
 */
public class AuthorLoginPage {
  private static String URL_LOGIN_PAGE = "http://localhost:8888/wp-login.php";
  private WebDriver driver;

  /**
   * constructor author's login page
   *
   * @param driver chrome driver for opening browser
   */
  public AuthorLoginPage(ChromeDriver driver) {
    this.driver = driver;
  }

  /**
   * open login page
   */
  public void openLoginPage() {
    driver.get(URL_LOGIN_PAGE);
  }

  /**
   * fill field author's login
   *
   * @param userName author's name
   */
  public void setUserName(String userName) {
    driver.findElement(By.id("user_login")).sendKeys(userName);
  }

  /**
   * fill field author's password
   *
   * @param password author's password
   */
  public void setPassword(String password) {

    driver.findElement(By.id("user_pass")).sendKeys(password);
  }

  /**
   * log in home author's page
   *
   * @return author's home page
   */
  public AuthorHomePage enterLoginPageAuthor() {
    driver.findElement(By.id("wp-submit")).click();
    return new AuthorHomePage((ChromeDriver) driver);
  }
}