package pages;

import core.InitDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Element;
import utils.Waiter;



public class BasePage {
    protected Waiter waiter;
    protected Element element;
    protected WebDriver webDriver;

    public BasePage() {
       // webDriver = InitDriver.initiateWebDriver();
       // waiter = new Waiter(webDriver);
        this.element = new Element();
        this.waiter = new Waiter(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
