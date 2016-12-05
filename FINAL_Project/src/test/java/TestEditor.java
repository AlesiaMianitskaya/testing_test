import editor.EditorHomePage;
import editor.EditorLoginPage;
import editor.EditorPublish;
import editor.EditorAddPost;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class TestEditor {
  private static String URL_HOME_PAGE = "http://localhost:8888/wp-admin/";

  private ChromeDriver driver;
  private EditorLoginPage editorLoginPage;
  private EditorHomePage editorHomePage;
  private EditorPublish editorPublish;
  private EditorAddPost editorAddPost;

  @BeforeMethod
  public void SetUp() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    editorLoginPage = new EditorLoginPage(driver);
    editorLoginPage.openLoginPage();
    editorLoginPage.setUserName("editor");
    editorLoginPage.setPassword("1111");
    editorHomePage = editorLoginPage.enterLoginPageEditor();
  }

  @Test
  public void testLoginEditor() {
    assertEquals(URL_HOME_PAGE, editorHomePage.getHomePageUrl());
  }

  @Test
  public void testPublish() {
    editorPublish = new EditorPublish(driver);
    editorPublish.goPosts();
    editorPublish.goDrafts();
    editorPublish.goEdit();
    editorPublish.goPublish();
    assert (driver.getCurrentUrl().contains("action=edit"));
  }

  @Test
  public void testAddPost() {
    editorAddPost = new EditorAddPost(driver);
    editorAddPost.setTitle("Your best leads are already right in front of you.");
    editorAddPost.setPost("Just think about the way that you buy things today. You don’t want" +
        " to respond to cold emails and phone calls — and neither do your potential customers. " +
        "That’s why as a business, your best leads are the people that are already visiting your" +
        " website. You just need to reach out and let them know you’re there, and that’s where we come in.");
    editorAddPost = editorHomePage.enterSaveDraft();
  }

  @AfterMethod
  public void TearDown() {
    driver.close();
  }
}

