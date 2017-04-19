using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Support;

namespace TESTNUNIT
{
    [TestFixture]
    public class DriverManagerTest
    {
        private static IWebDriver driver;
        private static string USER_NAME = Configuration.userName;
        private static string PASSWORD = Configuration.password;
        private const string MAIN_URL = "cbr-admin.demo.pointid.ru/";

        [SetUp]
        public void SetUp()
        {
            driver = DriverSingleton.GetDriver();
        }

        [TearDown]
        public void TearDown()
        {
            DriverSingleton.CloseDriver();
        }

        [Test]
        public void IsItTrue()
        {
            string mainUrl = "http://" + USER_NAME + ":" + PASSWORD + "@" + MAIN_URL;
            driver.Navigate().GoToUrl(mainUrl);
            Assert.AreEqual(5, 5);
        }

        [Test]
        public void IsItFlse()
        {
            bool f = false;
            Assert.False(f);
        }

        [Test]
        public void IsItFalse()
        {
            bool f = true;
            Assert.False(f);
        }
    }
}
