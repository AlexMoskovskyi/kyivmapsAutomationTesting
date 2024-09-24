package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends Header {
    protected String trueEmail = "moscow5@i.ua";
    protected String email = "asfhgfjgtvbbh@ukr.net";
    protected String password = "asdfghjk";
    protected String firstName = "Alex";
    protected String lastName = "MscW";

    @FindBy(xpath = "//*[@id=\"signupform-email\"]")
    protected WebElement REG_EMAIL;

    @FindBy(xpath = "//*[@id=\"signupform-first_name\"]")
    protected WebElement REG_FIRST_NAME;

    @FindBy(xpath = "//*[@id=\"signupform-last_name\"]")
    protected WebElement REG_LAST_NAME;

    @FindBy(xpath = "//*[@id=\"signupform-password\"]")
    protected WebElement REG_PASSWORD;

    @FindBy(xpath = "//*[@class=\"cbx-icon\"]")
    protected WebElement REG_RULES_BUTTON;

    @FindBy(xpath = "//*[@class=\"btn btn-primary g-recaptcha recaptcha\"]")
    protected WebElement REG_BUTTON;

    @FindBy(xpath = "//*[@class=\"help-block help-block-error\"]")
    public WebElement INVALID_REGISTRATION;

    @FindBy(xpath = "//*[@class=\"registration-completed\"]")
    public WebElement REGISTRATION_COMPLETED;

   @Step("Ввести в рядок email")
   public SignUpPage inputEmailIntoField() {
       waiter.waitForElementVisibility(REG_EMAIL).sendKeys(email, Keys.ENTER);
       return this;
   }

    @Step("Ввести в рядок вже зареєстрований email")
    public SignUpPage inputInvalidEmailIntoField() {
        waiter.waitForElementVisibility(REG_EMAIL).sendKeys(trueEmail, Keys.ENTER);
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

    @Step("Отримуемо текст успішной реєстрації  ")
    public String getRegistrationCompletedText( ) {
       String registrationCompletedText = REGISTRATION_COMPLETED.getText();

        return registrationCompletedText;
    }

    @Step("Отримуемо текст реєстрації  ")
    public String getInvalidRegistrationText( ) {
        String invalidRegistrationText = INVALID_REGISTRATION.getText();

        return invalidRegistrationText;
    }
}
