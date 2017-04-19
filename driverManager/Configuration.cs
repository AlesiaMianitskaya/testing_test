using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Configuration;
using System.Reflection;

namespace TESTNUNIT
{
    class Configuration
    {
        public static string currentBrowserName = ReadSetting("browser.current");
        public static string userName = ReadSetting("crb.user.admin");
        public static string password = ReadSetting("crb.password");
        private static string ReadSetting(string key)
        {
            string result = "";
            try
            {
                result = ConfigurationManager.AppSettings[key] ?? "Not Found";
            }
            catch (ConfigurationErrorsException)
            {
                //wtire log
            }
            return result;
        }
    }
}
