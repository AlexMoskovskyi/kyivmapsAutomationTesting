package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {
    @FindBy(xpath = "//*[@id=\"menu-toggle\"]")
    protected WebElement MENU_TOGGLE;

    @FindBy(xpath = "//*[@class=\"show-search\"]")
    protected WebElement SEARCH_BUTTON;

    @FindBy(xpath = "//*[@id=\"main-search\"]")
    protected WebElement SEARCH_FIELD;

    @FindBy(xpath = "//*[@id=\"lgn\"]")
    public WebElement LOGIN_BUTTON;

    @FindBy(xpath = "//*[@class=\"header-td td-add tt-container\"]")
    protected WebElement ADD_EVENT_BUTTON;

    @Step("Натиснути ")
    public Header clickOnLoginButton() {
        waiter.waitForElementClickable(LOGIN_BUTTON).click();
        return this;
    }

    @Step("Ввести {text} в пошуковому рядку")
    public Header inputTextIntoSearchField(String text) {
        SEARCH_BUTTON.click();
        waiter.waitForElementVisibility(SEARCH_FIELD).sendKeys(text);
        return this;
    }

//    @Step("Натиснути на кнопку пошуку")
//    public ResultsPage clickOnSearchButton() {
//        element.scrollAndClickOnElement(SEARCH_BUTTON);
//        return new ResultsPage();
//    }
}
