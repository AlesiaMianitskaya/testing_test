using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Support.PageObjects;
using OpenQA.Selenium.Support.UI;


namespace NUnitPro
{
    class BasePage
    {
        private IWebDriver driver;

        private const string MAIN_URL = "cbr-admin.demo.pointid.ru/";

        [FindsBy(How = How.XPath, Using = "//*[@class='modalLink']")]
        private IWebElement buttonEditOn;

        [FindsBy(How = How.XPath, Using = "//*[@value='Выбрать набор']")]
        private IWebElement buttonChooseSet;

        [FindsBy(How = How.XPath, Using = "//*[@id='ui-id-1']/iframe")]
        private IWebElement frameElement;

        [FindsBy(How = How.XPath, Using = "//*[@value='my']")]
        private IWebElement onlyMySets;

        [FindsBy(How = How.XPath, Using = "//*[@value='all']")]
        private IWebElement allSets;


        public BasePage(IWebDriver driver)
        {
            this.driver = driver;
            PageFactory.InitElements(driver, this);
        }

        public BasePage OpenOne(string userName, string password)
        {
            string mainUrl = "http://" + userName + ":" + password + "@" + MAIN_URL;
            driver.Navigate().GoToUrl(mainUrl);
            return this;
        }

        public BasePage ClickEditOn()
        {
            buttonEditOn.Click();
            return this;
        }

        public BasePage ChoseSetOfChangeFromMy(string idOfset)
        {
            ScreenshotCapture.TakeScrenShot(driver);
           // driver.SwitchTo().Frame(driver.FindElement(By.XPath("//*[@id='ui-id-1']/iframe")));
            driver.SwitchTo().Frame(frameElement);
            driver.FindElement(By.XPath("//b[contains(text(), '" + idOfset + "')]")).Click();
            new WebDriverWait(driver, TimeSpan.FromSeconds(10)).Until(ExpectedConditions.ElementToBeClickable(buttonChooseSet)); 
            buttonChooseSet.Click();
            return this;
        }

        public BasePage ChooseSetOfChongeFromAll(string idOfset)
        {
            driver.SwitchTo().Frame(frameElement);
            allSets.Click();
            driver.FindElement(By.XPath("//b[contains(text(), '" + idOfset + "')]")).Click();
            new WebDriverWait(driver, TimeSpan.FromSeconds(10)).Until(ExpectedConditions.ElementToBeClickable(buttonChooseSet));
            buttonChooseSet.Click();
            return this;
        }
    }
}
