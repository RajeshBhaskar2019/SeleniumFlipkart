package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class OpenBrowser
{
 public static WebDriver driver;

 @BeforeSuite
 public static void LaunchApplication()
 {
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com/");

 }

// @AfterSuite
 //public static void closeBrowser()
 //{
   //  driver.quit();
 //}
}
