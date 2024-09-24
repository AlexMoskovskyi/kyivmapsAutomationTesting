package pages;

import core.InitDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Element;
import utils.Waiter;



public class BasePage {
    protected Waiter waiter;
   // protected Element element;

    public BasePage() {
       // this.element = new Element();
        this.waiter = new Waiter(InitDriver.getWebDriver());
        PageFactory.initElements(InitDriver.getWebDriver(),this);
    }
}
