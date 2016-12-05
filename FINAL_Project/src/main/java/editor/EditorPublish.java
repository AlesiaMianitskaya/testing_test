package editor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * publishing editor's post
 */
public class EditorPublish {
  private WebDriver driver;

  public EditorPublish(ChromeDriver driver) {
    this.driver = driver;
  }

  /**
   * click on bottom "Post" for choosing publishing post
   */
  public void goPosts() {
    driver.findElement(By.partialLinkText("Post")).click();
  }

  /**
   * click inset "Draft"
   */
  public void goDrafts() {
    driver.findElement(By.className("draft")).click();
  }

  /**
   * click on bottom "Edit"
   */
  public void goEdit() {
    driver.findElement(By.className("row-title")).click();
  }

  /**
   * click on bottom "Publish" for publishing post
   */
  public void goPublish() {
    driver.findElement(By.id("publish")).click();
  }

}
