import Base.CreateRemoteDriver;
import Pages.DynamicallyLoadedPageElements;
import org.testng.annotations.Test;

public class Senario1 extends CreateRemoteDriver  {

    @Test
    public void senario1() {

        driver.navigate().to("http://the-internet.herokuapp.com/dynamic_loading/2");

        DynamicallyLoadedPageElements onHomePage = new DynamicallyLoadedPageElements(driver);

        onHomePage.clickOnStartButton();

        onHomePage.verifyText("Hello World!");

    }

}