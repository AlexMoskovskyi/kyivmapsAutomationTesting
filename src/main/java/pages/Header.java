package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {

    protected String trueEmail = "moscow5@i.ua";
    protected String password = "asdfghjk";

    @FindBy(xpath = "//*[@id=\"menu-toggle\"]")
    protected WebElement MENU_TOGGLE;

    @FindBy(xpath = "//*[@class=\"show-search\"]")
    protected WebElement SEARCH_BUTTON;

    @FindBy(xpath = "//*[@id=\"main-search\"]")
    protected WebElement SEARCH_FIELD;

    @FindBy(xpath = "//*[@id=\"lgn\"]")
    public WebElement LOGIN_BUTTON;

    @FindBy(xpath = "//*[@id=\"user-menu-btn\"]")
    protected WebElement USER_MENU_BUTTON;

    @FindBy(xpath = "//*[@class=\"facebook auth-link\"]")
    public WebElement FACEBOOK_AUTH_BUTTON;

    @FindBy(xpath = "//*[@class=\"google auth-link\"]")
    public WebElement GOOGLE_AUTH_BUTTON;

    @FindBy(xpath = "//*[@id=\"user-email\"]")
    protected WebElement USER_EMAIL;

    @FindBy(xpath = "//*[@id=\"user-passwordlogin\"]")
    protected WebElement USER_PASSWORD;

    @FindBy(xpath = "//*[@type=\"submit\"][@class=\"btn btn-primary\"]")
    protected WebElement ENTER_BUTTON;

    @FindBy (xpath = "//*[@class=\"signup-popup\"]")
    protected WebElement SIGN_UP_BUTTON;

    @FindBy(xpath = "//*[@class=\"header-td td-add tt-container\"]")
    protected WebElement ADD_EVENT_BUTTON;

    @Step("Натиснути кнопку ")
    public Header clickOnButton(WebElement webElement) {
        waiter.waitForElementClickable(webElement).click();
        return this;
    }

    @Step("Натиснути кнопку авторизації")
    public Header clickOnLoginButton() {
        waiter.waitForElementClickable(LOGIN_BUTTON).click();
        return this;
    }

    @Step("Вставити в поля емеил та пароль")
    public Header inputLoginData() {
        waiter.waitForElementVisibility(USER_EMAIL).sendKeys(trueEmail);
        waiter.waitForElementVisibility(USER_PASSWORD).sendKeys(password);
        return this;
    }

    @Step("Натиснути кнопку входу в аккаунт ")
    public Header clickOnEnterButton() {
        waiter.waitForElementClickable(ENTER_BUTTON).click();
        return this;
    }

    @Step("Натиснути кнопку реєстрация ")
    public Header clickOnSignUpButton() {
        waiter.waitForElementClickable(SIGN_UP_BUTTON).click();
        return this;
    }

    @Step("Ввести {text} в пошуковому рядку")
    public Header inputTextIntoSearchField(String text) {
        SEARCH_BUTTON.click();
        waiter.waitForElementVisibility(SEARCH_FIELD).sendKeys(text);
        return this;
    }
}
