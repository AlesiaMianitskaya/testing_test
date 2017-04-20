using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using OpenQA.Selenium;
using OpenQA.Selenium.Support;

namespace NUnitPro
{
    class ScreenshotCapture
    {
        public static void TakeScrenShot(IWebDriver driver)
        {
            Directory.CreateDirectory("D:\\new");
            Screenshot shot = ((ITakesScreenshot)driver).GetScreenshot();
            string name = CreateScreenshotFileName();
            shot.SaveAsFile(name, ScreenshotImageFormat.Png);
        }

        public static string CreateScreenshotFileName()
        {
            var timeStamp = DateTime.Now.ToString("yyyy-MM-dd-HH-mm-ss");
            string filename = timeStamp + ".png";
            return filename;
        }
    }
}
