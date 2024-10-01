package pages;

import core.InitDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Waiter;

import static core.InitDriver.webDriver;

public class EventsPage extends Header {

    protected String activityName = "BigRunMarathon";
    public String newActivityUrl = "https://kyivmaps.com/ua/events/" + activityName.toLowerCase();

    @FindBy(xpath = "/html/body/div[2]/div/div[4]/div/a[2]")
    protected WebElement EVENTS_BUTTON;

    @FindBy(xpath = "//*[@id=\"top\"]/div[2]/div[3]/div[1]/div/a[3]")
    protected WebElement WITH_CHILD_BUTTON;

    @FindBy(xpath = "//*[@id=\"top\"]/div[2]/div[3]/div[1]/div/a[1]")
    protected WebElement FESTIVAL_BUTTON;

    @FindBy(xpath = "//*[@id=\"event-list-container\"]/li[2]/div/div/div[1]/div/span")
    protected WebElement FESTIVAL_SELECTED;

    @FindBy(xpath = "//*[@id=\"article_events\"]/div/article/div[1]/div/div[1]/a/span")
    public WebElement BUY_TICKETS_BUTTON;

    @FindBy(xpath = "//*[@id=\"top\"]/div[2]/div[3]/h1")
    public WebElement WITH_CHILD_STATUS;

    @FindBy(xpath = "//*[@id=\"addItem\"]")
    protected WebElement ADD_EVENTS;

    @FindBy(xpath = "//*[@id=\"step-select-type\"]/div[2]/div/div[1]/button")
    protected WebElement ACTIVITY_EVENTS;

    @FindBy(xpath = "//*[@id=\"step-select-type\"]/div[2]/div/div[2]/button")
    protected WebElement EVENT_EVENTS;

    @FindBy(xpath = "//*[@id=\"step-select-type\"]/div[2]/div/div[3]/button")
    protected WebElement LOCATION_EVENTS;

    @FindBy(xpath = "//*[@id=\"website-url\"]")
    protected WebElement INPUT_EVENT_NAME;

    @FindBy(xpath = "//*[@id=\"modal-popup\"]/div/div/div[3]/button[3]")
    protected WebElement ADD_EVENT_BUTTON;

    @FindBy(xpath = "//*[@id=\"publish\"]")
    protected WebElement PUBLISH_BUTTON;

    @FindBy(xpath = "//*[@id=\"status_current\"]")
    public WebElement SHOW_STATUS_FIELD;


    @Step("Авторизація користувача")
    public EventsPage autorization() {
        Header header = new Header();
        header.clickOnLoginButton().
                inputLoginData()
                .clickOnEnterButton();
        return this;
    }

    @Step("Натиснути на поле Події ")
    public EventsPage clickOnEvents() {
        waiter.waitForElementClickable(EVENTS_BUTTON).click();
        return this;
    }

    @Step("Натиснути на поле З дітьми  ")
    public EventsPage clickOnEventsWithKids() {
        waiter.waitForElementClickable(WITH_CHILD_BUTTON).click();
        return this;
    }

    @Step("Натиснути на поле фестиваль  ")
    public EventsPage clickOnEventsFestival() {
        waiter.waitForElementClickable(FESTIVAL_BUTTON).click();
        return this;
    }

    @Step("Натиснути на поле обраного фестиваля  ")
    public EventsPage clickOnFestivalSelected() {
        waiter.waitForElementClickable(FESTIVAL_SELECTED).click();
        return this;
    }

    @Step("Натиснути на поле купити квитки  ")
    public EventsPage clickOnBuyTickets() {
        waiter.waitForElementClickable(BUY_TICKETS_BUTTON).click();
        return this;
    }

    @Step("Натиснути на поле купити квитки  ")
    public EventsPage switchToNewWindow() {
        switchToNewWindow();
        return this;
    }

    @Step("Натиснути на + 'поле добавити подію' ")
    public EventsPage clickOnAddEvents() {
        waiter.waitForElementClickable(ADD_EVENTS).click();
        return this;
    }

    @Step("Натиснути на поле Activity")
    public EventsPage clickOnActivityButton() {
        waiter.waitForElementClickable(ACTIVITY_EVENTS).click();
        return this;
    }

    @Step("Ввести назву Activity")
    public EventsPage inputEventName() {
        waiter.waitForElementVisibility(INPUT_EVENT_NAME).sendKeys(activityName, Keys.ENTER);
        return this;
    }

    @Step("Натиснути на кнопку далі ")
    public EventsPage clickOnAddEventButton() {
        waiter.waitForElementClickable(ADD_EVENT_BUTTON).click();
        return this;
    }

    @Step("Натиснути на кнопку опублікувати ")
    public EventsPage clickOnPublishButton() {
        waiter.waitForElementClickable(PUBLISH_BUTTON).click();
        return this;
    }

    @Step("Отримуємо статус публікації ")
    public EventsPage showStatusAddedEvent() {
        waiter.waitForElementClickable(SHOW_STATUS_FIELD).getText();
        return this;
    }

    @Step("Натиснути на поле Подія")
    public EventsPage clickOnEventButton() {
        waiter.waitForElementClickable(EVENT_EVENTS).click();
        return this;
    }

    @Step("Натиснути на поле Локація")
    public EventsPage clickOnLocationButton() {
        waiter.waitForElementClickable(LOCATION_EVENTS).click();
        return this;
    }
}