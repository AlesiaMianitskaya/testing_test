package editor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * contains elements editor's login page
 */
public class EditorLoginPage {
  private static String URL_LOGIN_PAGE = "http://localhost:8888/wp-login.php";
  private WebDriver driver;

  /**
   * constructor editor's login page
   *
   * @param driver chrome driver for opening browser
   */
  public EditorLoginPage(ChromeDriver driver) {
    this.driver = driver;
  }

  /**
   * open login page
   */
  public void openLoginPage() {
    driver.get(URL_LOGIN_PAGE);
  }

  /**
   * fill field editor's login
   *
   * @param userName editor's name
   */
  public void setUserName(String userName) {
    driver.findElement(By.id("user_login")).sendKeys(userName);
  }

  /**
   * fill field editor's password
   *
   * @param password editor's password
   */
  public void setPassword(String password) {
    driver.findElement(By.id("user_pass")).sendKeys(password);
  }

  /**
   * log in home editor's page
   *
   * @return editor's home page
   */
  public EditorHomePage enterLoginPageEditor() {
    driver.findElement(By.id("wp-submit")).click();
    return new EditorHomePage((ChromeDriver) driver);
  }
}