package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScripsActions {

    public void highlightElement(WebDriver driver, WebElement element,String color,Integer highlightElementTimeOut)
    {
        if(color.compareToIgnoreCase("red")==0)
        {
            System.out.println("red");
            ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red '",element);
        }else
        {
            System.out.println("green");
            ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid green '",element);
        }




        try {
            Thread.sleep(highlightElementTimeOut);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
