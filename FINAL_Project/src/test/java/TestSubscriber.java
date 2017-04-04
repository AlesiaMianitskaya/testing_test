import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import subscriber.SubscriberAddComment;
import subscriber.SubscriberHomePage;
import subscriber.SubscriberLoginPage;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class TestSubscriber {
  private static String URL_HOME_PAGE = "http://localhost:8888/wp-admin/profile.php";
  private ChromeDriver driver;
  private SubscriberHomePage subscriberHomePage;
  private SubscriberLoginPage subscriberLoginPage;
  private SubscriberAddComment subscriberAddComment;

  @BeforeMethod
  public void SetUp() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    subscriberLoginPage = new SubscriberLoginPage(driver);
    subscriberLoginPage.openLoginPage();
    subscriberLoginPage.setSubscriberName("subscriber");
    subscriberLoginPage.setSubscriberPassword("1111");
    subscriberHomePage = subscriberLoginPage.enterLoginPageSubscriber();
  }

  @Test
  public void testLoginSubscriber() {
    assertEquals(URL_HOME_PAGE, subscriberHomePage.getHomePageUrl());
  }

  @Test
  public void testAddComment() {
    subscriberAddComment = new SubscriberAddComment(driver);
    subscriberAddComment.goDashboard();
    subscriberAddComment.goPosts();
    subscriberAddComment.setComment("I like it!");
    subscriberAddComment.goPostComment();
    assert (driver.getCurrentUrl().contains("comment"));

  }

  @AfterMethod
  public void TearDown() {
    driver.close();
  }
}
