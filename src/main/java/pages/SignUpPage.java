package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends Header {
    protected String email = "mіw5@i.ua";
    protected String password = "asdfghjk";
    protected String firstName = "Alex";
    protected String lastName = "MscW";

    @FindBy(xpath = "//*[@id=\"signupform-email\"]")
    private WebElement REG_EMAIL;

    @FindBy(xpath = "//*[@id=\"signupform-first_name\"]")
    private WebElement REG_FIRST_NAME;

    @FindBy(xpath = "//*[@id=\"signupform-last_name\"]")
    private WebElement REG_LAST_NAME;

    @FindBy(xpath = "//*[@id=\"signupform-password\"]")
    private WebElement REG_PASSWORD;

    @FindBy(xpath = "//*[@class=\"cbx-icon\"]")
    private WebElement REG_RULES_BUTTON;

    @FindBy(xpath = "//*[@class=\\\"btn btn-primary g-recaptcha recaptcha\\\"]")
    private WebElement REG_BUTTON;

    @FindBy(xpath = "//*[@class=\\\"help-block help-block-error\\\"]")
    private WebElement INVALID_REGISTRATION;

   @Step("Ввести в рядок email")
   public SignUpPage inputEmailIntoField() {
       waiter.waitForElementVisibility(REG_EMAIL).sendKeys(email, Keys.ENTER);
       return this;
   }

    @Step("Ввести в рядок Ім'я")
    public SignUpPage inputFirstNameIntoField() {
        waiter.waitForElementVisibility(REG_FIRST_NAME).sendKeys(firstName, Keys.ENTER);
        return this;
    }

    @Step("Ввести в рядок Призвіще")
    public SignUpPage inputLastNameIntoField() {
        waiter.waitForElementVisibility(REG_LAST_NAME).sendKeys(lastName, Keys.ENTER);
        return this;
    }
    @Step("Ввести в рядок Пароль")
    public SignUpPage inputPasswordIntoField() {
        waiter.waitForElementVisibility(REG_PASSWORD).sendKeys(password, Keys.ENTER);
        return this;
    }

    @Step("Натиснути кнопку реєстрация ")
    public SignUpPage clickOnRegistrationRulesButton() {
        waiter.waitForElementClickable(REG_RULES_BUTTON).click();
        return this;
    }

    @Step("Натиснути кнопку реєстрация ")
    public SignUpPage clickOnRegistrationButton() {
        waiter.waitForElementClickable(REG_BUTTON).click();
        return this;
    }
}
