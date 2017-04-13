using System;
using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;

namespace NUnitPro
{
    public class Test
    {
        private IWebDriver driver;

        [SetUp]
        public void setUp()
        {
            driver = DriverSing.GetDriver();
        }

        [Test]
        public void OpenTest()
        {
            BasePage basePage = new BasePage(driver);
            basePage.OpenOne("cbrext", "qwe123@")
                .ClickEditOn()
                .ChooseSetOfChongeFromAll("CS4078");
        }
        
        [TearDown]
        public void TearDown()
        {
            DriverSing.CloseDriver();
        }
    }
}
 //FirefoxProfile profile = new FirefoxProfile();
 //profile.SetPreference("network.http.phishy-userpass-length", 255);
 //driver = new FirefoxDriver(profile);
 //driver.get("http://username:password@URL");