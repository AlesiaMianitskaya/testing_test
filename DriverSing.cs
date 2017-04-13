using System;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium;

namespace NUnitPro
{
    class DriverSing
    {
        public const string OPTION_ARGUMENT = "start-maximized";
        private static IWebDriver driver;

        private DriverSing() { }

        public static IWebDriver GetDriver()
        {
            if (driver == null)
            {
                ChromeOptions options = new ChromeOptions();
                options.AddArgument(OPTION_ARGUMENT); 
                driver = new ChromeDriver(options);
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
    }
}
