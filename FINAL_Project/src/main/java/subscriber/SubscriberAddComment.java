package subscriber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * adding comment by subscriber
 */
public class SubscriberAddComment {
  private WebDriver driver;

  public SubscriberAddComment(ChromeDriver driver) {
    this.driver = driver;
  }

  /**
   * click on bottom "Dashboard"
   */
  public void goDashboard(){
    driver.findElement(By.className("wp-menu-name")).click();
  }

  /**
   * choose post "Hello world!"
   */
  public void goPosts() {
    driver.findElement(By.linkText("Hello world!")).click();
  }

  /**
   * input content adding comment
   * @param comment
   */
  public void setComment(String comment) {
    driver.findElement(By.id("comment")).sendKeys(comment);
  }

  /**
   * click on bottom "POST COST" post comment
   */
  public void goPostComment() {
    driver.findElement(By.id("submit")).click();
  }
}
