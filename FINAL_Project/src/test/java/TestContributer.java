import contributer.ContributerHomePage;
import contributer.ContributerLoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;


public class TestContributer {
  private static String URL_HOME_PAGE = "http://localhost:8888/wp-admin/";

  private ChromeDriver driver;
  private ContributerHomePage contributerHomePage;
  private ContributerLoginPage contributerLoginPage;


  @BeforeMethod
  public void SetUp() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    contributerLoginPage = new ContributerLoginPage(driver);
    contributerLoginPage.openLoginPage();
    contributerLoginPage.setUserName("contributor");
    contributerLoginPage.setPassword("1111");
    contributerHomePage = contributerLoginPage.enterLoginPage();
  }

  @Test
  public void testLoginContributor() {
    assertEquals(URL_HOME_PAGE, contributerHomePage.getHomePageUrl());
  }

  @AfterMethod
  public void TearDown() {
    driver.close();
  }
}
