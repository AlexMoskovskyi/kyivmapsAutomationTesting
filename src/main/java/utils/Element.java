package utils;

import core.InitDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Element {
    private Waiter waiter;
    private WebDriver webDriver;

    public Element() {
        webDriver = InitDriver.getWebDriver();
        this.waiter = new Waiter(webDriver);

    }

    public void scrollAndClickOnElement(WebElement webElement) {
        waiter.waitForElementClickable(webElement).click();
    }

    public Element scrollToElementAndSendKey(WebElement webElement, String key) {
        scrollToElement(webElement);
        searchFieldClearAndSendKey(webElement, key);
        return this;
    }

    private void scrollToElement(WebElement webElement) {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webElement);
        actions.perform();
    }

    private Element searchFieldClearAndSendKey(WebElement webElement, String key) {
        var searchField = waiter.waitForElementClickable(webElement);
        if (System.getProperty("os.name").startsWith("Mac")) {
            searchField.sendKeys(Keys.COMMAND, "a", Keys.BACK_SPACE);
        } else {
            searchField.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        }
        searchField.sendKeys(key);
        return this;
    }

}
