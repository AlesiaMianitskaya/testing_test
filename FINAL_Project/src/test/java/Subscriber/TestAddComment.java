package Subscriber;

import Database.ConnectionToDatabaseSubscriber;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Testing adding comment by subscriber
 */
@Test (singleThreaded = true)
public class TestAddComment {
  private static String STATUS_COMMENT = "Your comment is awaiting moderation.";
  private ChromeDriver driver;
  SubscriberLoginPage subscriberLoginPage;
  SubscriberHomePage subscriberHomePage;
  SubscriberPostComment subscriberPostComment;
  ConnectionToDatabaseSubscriber connectionToDatabaseSubscriber;

  @BeforeTest
  public void setUp() {
    connectionToDatabaseSubscriber = new ConnectionToDatabaseSubscriber();
    connectionToDatabaseSubscriber.addUser();
  }

  @BeforeMethod
  public void beforeMethod() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    subscriberLoginPage = new SubscriberLoginPage(driver);
    subscriberLoginPage.openLoginPage();
    subscriberLoginPage.setUserName("subscriber");
    subscriberLoginPage.setPassword("1");
    subscriberHomePage = subscriberLoginPage.enterLoginPageSubscriber();
  }

  @Test
  public void testAddComment() {
    subscriberPostComment = new SubscriberPostComment(driver);
    subscriberPostComment.goToDashboard();
    subscriberPostComment.goToPost();
    subscriberPostComment.writeComment("I like it!");
    subscriberPostComment.addComment();
    subscriberPostComment = subscriberHomePage.enterPostComment();

    assertEquals(STATUS_COMMENT, subscriberPostComment.getPostCommentStatus());
  }

  @AfterMethod
  public void tearDown() {
    driver.close();
  }

  @AfterTest
  public void afterTest() {
    connectionToDatabaseSubscriber = new ConnectionToDatabaseSubscriber();
    connectionToDatabaseSubscriber.deleteComment();
    connectionToDatabaseSubscriber.deleteUser();
  }
}
