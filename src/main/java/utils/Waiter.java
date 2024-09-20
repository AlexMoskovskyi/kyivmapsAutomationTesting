package utils;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Waiter {
    private static final Duration EXPECTED_TIMEOUT = Duration.ofSeconds(15);
    private static final Duration POLLING_EVERY_TIME = Duration.ofMillis(500);
    private final WebDriver webDriver;

    public Waiter(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement waitForElementClickable(WebElement webElement) {
        return fluentWait().until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public WebElement waitForElementVisibility(WebElement webElement) {
        return fluentWait().until(ExpectedConditions.visibilityOf(webElement));
    }

    public WebElement waitForSelectedElement(WebElement webElement) {
        fluentWait().until(ExpectedConditions.elementToBeSelected(webElement));
        return webElement;
    }

    private FluentWait<WebDriver> fluentWait() {
        return new FluentWait<>(webDriver)
                .withTimeout(EXPECTED_TIMEOUT)
                .pollingEvery(POLLING_EVERY_TIME)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
    }
}

