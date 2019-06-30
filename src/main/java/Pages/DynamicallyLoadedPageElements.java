package Pages;

import Utils.JavaScripsActions;
import Utils.ScreenShots;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicallyLoadedPageElements {

    protected WebDriver driver;

    @FindBy(css="div#start>button")
    private WebElement startButton;

    @FindBy(id="finish")
    private WebElement helloWorld;

    public DynamicallyLoadedPageElements(WebDriver driver)
    {
        this.driver = driver;

        PageFactory.initElements(driver, this);

        System.getProperty("Finished loading the Home Page Dom");
    }

    public void clickOnStartButton()
    {
        new JavaScripsActions().highlightElement(driver,startButton, "red",5000);


        try {
            startButton.click();
        }catch (Exception e)
        {
            System.out.println("Failed to find start button");
        }

    }

    public void verifyText(String textToVerify)  {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(helloWorld));

        WebElement textElement = helloWorld.findElement(By.tagName("h4"));

        if(textElement.getText().compareToIgnoreCase(textToVerify)==0)
        {
            new JavaScripsActions().highlightElement(driver,textElement,"green",5000);
        }else
        {
            new JavaScripsActions().highlightElement(driver,textElement,"red",5000);
            new ScreenShots().getScreenShot(driver);
        }



       // System.out.println(helloWorld.findElement(By.tagName("h4")).getText());


    }
}
