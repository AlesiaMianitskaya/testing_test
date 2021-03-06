package Author;

import Database.ConnectionToDatabaseAuthor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Testing adding draft by author
 */
@Test(singleThreaded = true)
public class TestAddDraft {
  private static String POST_STATUS = "Published";
  private ChromeDriver driver;
  private AuthorLoginPage authorLoginPage;
  private AuthorHomePage authorHomePage;
  private AuthorAddPost authorAddPost;
  private AuthorPublishPost authorPublishPost;
  private ConnectionToDatabaseAuthor connectionToDatabaseAuthor;

  @BeforeTest
  public void setUp() {
    connectionToDatabaseAuthor = new ConnectionToDatabaseAuthor();
    connectionToDatabaseAuthor.addUser();
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    authorLoginPage = new AuthorLoginPage(driver);
    authorLoginPage.openLoginPage();
    authorLoginPage.setUserName("author");
    authorLoginPage.setPassword("1");
    authorHomePage = authorLoginPage.enterLoginPageAuthor();
  }

  @BeforeMethod
  public void beforeMethod() {
    authorAddPost = new AuthorAddPost(driver);
    authorAddPost.setTitle("BREAKING DOWN 'Law Of Supply And Demand'");
    authorAddPost.setPost("One of the most basic economic laws, the law of supply " +
        "and demand ties into almost all economic principles in one way or another.\n");
    authorHomePage.enterSaveDraft();
  }

  @Test
  public void testPublishDraft() {
    authorPublishPost = new AuthorPublishPost(driver);
    authorPublishPost.goToPosts();
    authorPublishPost.openPost();
    authorPublishPost.publishPost();
    assertEquals(POST_STATUS, authorPublishPost.getStatus());
  }

  @AfterMethod
  public void tearDown() {
    driver.close();
  }

  @AfterTest
  public void afterTest() {
    connectionToDatabaseAuthor = new ConnectionToDatabaseAuthor();
    connectionToDatabaseAuthor.deleteDraft();
    connectionToDatabaseAuthor.deleteUser();
  }
}
