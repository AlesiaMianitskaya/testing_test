using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using OpenQA.Selenium;
using OpenQA.Selenium.Support;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Firefox;

namespace TESTNUNIT
{
    class DriverSingleton
    {
        private const string Chrome = "chrome";
        private const string Firefox = "firefox";

        private static IWebDriver driver;
        private DriverSingleton() { }

        public static IWebDriver GetDriver()
        {
            if (driver == null)
            {
                driver = GetDriverInstance();
            }
            return driver;
        }

        public static void CloseDriver()
        {
            if (driver != null)
            {
                driver.Quit();
                driver = null;
            }
        }

        /// <summary>
        /// Creates specifiс driver 
        /// </summary>
        /// <exception cref="InvalidOperationException">if driver with specified name wasn't found</exception>
        /// <returns></returns>
        private static IWebDriver GetDriverInstance()
        {
            switch (Configuration.currentBrowserName)
            {
                case Firefox:
                    {
                        return GetFirefoxDriver();
                    }
                case Chrome:
                default:
                    {
                        return GetChromeDriver();
                    }
            }
        }

        private static IWebDriver GetChromeDriver()
        {
            var options = new ChromeOptions();
            options.AddArgument("start-maximized");
            return new ChromeDriver(options);  //bin chrome path?
        }

        private static IWebDriver GetFirefoxDriver()
        {
            FirefoxDriverService service = FirefoxDriverService.CreateDefaultService();
            var driver = new FirefoxDriver(service);
            driver.Manage().Window.Maximize();
            return driver;
        }
    }
}
