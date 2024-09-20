package tests;

import core.InitDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.Listener;
import utils.ScreenshotListener;
import utils.Waiter;

@Listeners({Listener.class, ScreenshotListener.class})
public class BaseTest {
    protected static final String URL = "https://kyivmaps.com/ua/";
    protected WebDriver webDriver;
    protected Waiter waiter;

    @BeforeMethod(groups = "main group")
    public void setUp() {
        webDriver = InitDriver.initiateWebDriver();
        waiter = new Waiter(webDriver);
        webDriver.get(URL);
    }

    @AfterMethod(groups = "main group")
    public void close() {
        webDriver.quit();
    }
}
