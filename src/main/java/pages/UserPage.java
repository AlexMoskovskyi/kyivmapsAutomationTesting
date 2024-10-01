package pages;

import core.InitDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Waiter;

public class UserPage extends Header {
    private String newFirstName = "Олександр";
    private String newLastName = "Московський";
    private String newUserLink = "Aleksandr_Moskovskyi";
    private String socialNetworkLink = "https://uk-ua.facebook.com/";

    @FindBy(xpath = "//*[@class=\"user-ava\"]")
    protected WebElement USER_PROFILE;

    @FindBy(xpath = "//*[@class=\"user-profile\"]")
    protected WebElement SELECT_PROFILE;

    @FindBy(xpath = "//*[@class=\"edit-event\"]")
    protected WebElement EDIT_PROFILE;

    @FindBy(xpath = "//*[@id=\"userSettingsForm\"]/div[1]/div[1]/div/div[1]/div")
    protected WebElement EDIT_USER_LINK;

    @FindBy(xpath = "//*[@id=\"user-idt\"]")
    protected WebElement USER_LINK_FIELD;

    @FindBy(xpath = "//*[@id=\"userSettingsForm\"]/div[1]/div[1]/div/div[1]/div/div")
    public static WebElement NEW_USER_LINK;

    @FindBy(xpath = "//*[@id=\"userSettingsForm\"]/div[1]/div[2]/div/div[1]/div")
    protected WebElement EDIT_FIRST_NAME;

    @FindBy(xpath = "//*[@id=\"user-first_name\"]")
    protected WebElement FIRST_NAME_FIELD;

    @FindBy(xpath = "//*[@id=\"userSettingsForm\"]/div[1]/div[2]/div/div[1]/div/div")
    public static WebElement NEW_FIRST_NAME;

    @FindBy(xpath = "//*[@id=\"userSettingsForm\"]/div[1]/div[3]/div/div[1]/div")
    protected WebElement EDIT_LAST_NAME;

    @FindBy(xpath = "//*[@id=\"user-last_name\"]")
    protected WebElement LAST_NAME_FIELD;

    @FindBy(xpath = "//*[@id=\"userSettingsForm\"]/div[1]/div[3]/div/div[1]/div/div")
    public static WebElement NEW_LAST_NAME;

    @FindBy(xpath = "//*[@id=\"userSettingsForm\"]/div[1]/div[5]/div/div[1]/div")
    protected WebElement EDIT_TELEPHONE;

    @FindBy(xpath = "//*[@id=\"user-phone\"]")
    protected WebElement TELEPHONE_FIELD;

    @FindBy(xpath = "//*[@id=\"userSettingsForm\"]/div[1]/div[5]/div/div[1]/div/div")
    public static WebElement NEW_TELEPHONE;

    @FindBy(xpath = "//*[@id=\"userSettingsForm\"]/div[1]/div[6]/div/div[1]/div")
    protected WebElement EDIT_SOCIAL_NETWORK;

    @FindBy(xpath = "//*[@id=\"add_social_edit\"]")
    protected WebElement SOCIAL_NETWORK_ADD_BUTTON;

    @FindBy(xpath = "//*[@id=\"element_social\"]")
    protected WebElement SOCIAL_NETWORK_FIELD;

    @FindBy(xpath = "//*[@id=\"userSettingsForm\"]/div[1]/div[6]/div/div[1]/div/div")
    public static WebElement NEW_SOCIAL_NETWORK;

    @Step("Натиснути кнопку меню користувача ")
    public UserPage clickOnUserProfileButton() {
        waiter.waitForElementClickable(USER_PROFILE).click();
        return this;
    }

    @Step("Натиснути кнопку профіль ")
    public UserPage clickOnProfileButton() {
        waiter.waitForElementClickable(SELECT_PROFILE).click();
        return this;
    }

    @Step("Натиснути кнопку налаштування ")
    public UserPage clickOnEditProfileButton() {
        waiter.waitForElementClickable(EDIT_PROFILE).click();
        return this;
    }

    @Step("Натиснути на поле посилання ")
    public UserPage clickOnUserLinkField() {
        waiter.waitForElementClickable(EDIT_USER_LINK).click();
        return this;
    }

    @Step("Натиснути на поле ім'я ")
    public UserPage clickOnFirstNameField() {
        waiter.waitForElementClickable(EDIT_FIRST_NAME).click();
        return this;
    }

    @Step("Натиснути на поле прізвище ")
    public UserPage clickOnLastNameField() {
        waiter.waitForElementClickable(EDIT_LAST_NAME).click();
        return this;
    }

    @Step("Натиснути на поле телефон ")
    public UserPage clickOnTelephoneField() {
        waiter.waitForElementClickable(EDIT_TELEPHONE).click();
        return this;
    }

    @Step("Натиснути на поле cоціальні мережі ")
    public UserPage clickOnSocialNetworkField() {
        waiter.waitForElementClickable(EDIT_SOCIAL_NETWORK).click();
        return this;
    }

    @Step("Очистити поле посилання ")
    public UserPage clearUserLinkField() {
        waiter.waitForElementVisibility(USER_LINK_FIELD).clear();
        return this;
    }

    @Step("Очистити поле ім'я ")
    public UserPage clearFirstNameField() {
        waiter.waitForElementVisibility(FIRST_NAME_FIELD).clear();
        return this;
    }

    @Step("Очистити поле прізвище ")
    public UserPage clearLastNameField() {
        waiter.waitForElementVisibility(LAST_NAME_FIELD).clear();
        return this;
    }

    @Step("Клікнути у полі телефон ")
    public UserPage clickTelephoneField() {
        waiter.waitForElementVisibility(TELEPHONE_FIELD).click();
        return this;
    }

    @Step("Натиснути кнопку додати у розділі cоціальні мережі ")
    public UserPage clickSocialNetworkAddButton() {
        waiter.waitForElementVisibility(SOCIAL_NETWORK_ADD_BUTTON).click();
        return this;
    }

    @Step("Ввести нове посилання ")
    public UserPage inputDataOnUserLinkField() {
        waiter.waitForElementVisibility(USER_LINK_FIELD).sendKeys(newUserLink, Keys.ENTER);
        return this;
    }

    @Step("Ввести нове ім'я ")
    public UserPage inputDataOnFirstNameField() {
        waiter.waitForElementVisibility(FIRST_NAME_FIELD).sendKeys(newFirstName, Keys.ENTER);
        return this;
    }

    @Step("Ввести нове прізвище")
    public UserPage inputDataOnLastNameField() {
        waiter.waitForElementVisibility(LAST_NAME_FIELD).sendKeys(newLastName, Keys.ENTER);
        return this;
    }

    @Step("Ввести новий номер телефону ")
    public UserPage inputDataOnTelephonField() {
        waiter.waitForElementVisibility(TELEPHONE_FIELD).sendKeys(Keys.NUMPAD5, Keys.NUMPAD0,
                Keys.NUMPAD5, Keys.NUMPAD5, Keys.NUMPAD5, Keys.NUMPAD5, Keys.NUMPAD5,
                Keys.NUMPAD5, Keys.NUMPAD5, Keys.ENTER);
        return this;
    }

    @Step("Додавання новой соціальной мережі")
    public UserPage inputDataOnSocialNetworkField() {
        waiter.waitForElementVisibility(SOCIAL_NETWORK_FIELD).sendKeys(socialNetworkLink, Keys.ENTER);
        return this;
    }
}
