import author.AuthorAddPost;
import author.AuthorHomePage;
import author.AuthorLoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class TestAuthor {
  private static String URL_HOME_PAGE = "http://localhost:8888/wp-admin/";
  private ChromeDriver driver;
  private AuthorLoginPage authorLoginPage;
  private AuthorHomePage authorHomePage;
  private AuthorAddPost authorAddPost;

  @BeforeMethod
  public void SetUp() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    authorLoginPage = new AuthorLoginPage(driver);
    authorLoginPage.openLoginPage();
    authorLoginPage.setUserName("author");
    authorLoginPage.setPassword("1111");
    authorHomePage = authorLoginPage.enterLoginPageAuthor();
  }

  @Test
  public void testLoginAuthor() {
    assertEquals(URL_HOME_PAGE, authorHomePage.getHomePageUrl());
  }

  @Test
  public void testAddPost() {
    authorAddPost = new AuthorAddPost(driver);
    authorAddPost.setTitle("My friends!");
    authorAddPost.setPost("If you spend a lot of your time on the Internet then " +
        "you'll probably be aware there's loads of stuff " +
        "in Friends that people missed the first time," +
        " only for it to be rediscovered 12 years after the series finale.");
    authorAddPost = authorHomePage.enterSaveDraft();

    assertEquals(URL_HOME_PAGE, authorAddPost.getAddPostPageUrl());
  }

  @AfterMethod
  public void TearDown() {
    driver.close();
  }
}
