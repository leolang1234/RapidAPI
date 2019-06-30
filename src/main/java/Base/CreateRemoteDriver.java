package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;


public class CreateRemoteDriver {

    public static WebDriver driver;

    @BeforeClass
    public void initializeRemoteDriver() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User-PC\\Desktop\\RapidAPI\\Drivers\\chromedriver.exe");

        try
        {
            driver =  new ChromeDriver();
        }catch (Exception e)
        {
            System.out.println("Failed to open webdriver");
        }



    }


    @AfterClass
    public void tearDown() {

        try {
            driver.close();
            driver.quit();

        } catch (Exception e) {
            System.out.println("Failed to close webdriver");
        }
    }

}
