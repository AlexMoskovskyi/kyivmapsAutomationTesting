package tests;

import core.InitDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.Header;
import utils.ScreenshotListener;
import utils.Waiter;

@Listeners(ScreenshotListener.class)
public class AuthBaseTest extends BaseTest{
    protected static final String URL = "https://kyivmaps.com/ua/";
    protected WebDriver webDriver;
    protected Waiter waiter;

    @BeforeMethod()
    public void setUp() {
        webDriver = InitDriver.initiateWebDriver();
        waiter = new Waiter(webDriver);
        webDriver.get(URL);
        Header header = new Header();
        header.clickOnLoginButton().inputLoginData()
                .clickOnEnterButton();
    }

    @AfterMethod()
    public void close() {
        webDriver.quit();
    }
}

