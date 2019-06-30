package Utils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import org.apache.commons.io.FileUtils;

import java.util.Random;

public class ScreenShots {

    public void getScreenShot(WebDriver driver)
    {
        Random rand = new Random();
        int value = rand.nextInt(50);

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        System.out.println(System.getProperty("user.dir"));
        try {
            FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+ "\\Reports\\temp_"+String.valueOf(value)+".png"));
        }catch (Exception e)
        {
            System.out.println("Failed to get report");
        }


    }
}
