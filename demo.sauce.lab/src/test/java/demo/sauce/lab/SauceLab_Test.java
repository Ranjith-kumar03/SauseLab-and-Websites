package demo.sauce.lab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;
 
public class SauceLab_Test {
 
	public static final String USERNAME = "Ranjith-kumar03";
	  public static final String ACCESS_KEY = "17e48f95-f18e-4615-98bc-9b986e9482b0";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	 
	  @Test
  public static void Sauce_Test() throws Exception 
  
  {
 
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Windows 10");
    caps.setCapability("version", "latest");
 
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
 
    /**
     * Goes to Sauce Lab's guinea-pig page and prints title
     */
 
    driver.get("https://www.facebook.com");
    System.out.println("title of page is: " + driver.getTitle());
 
    driver.quit();
  }
}
