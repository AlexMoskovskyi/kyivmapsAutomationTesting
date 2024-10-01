package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EventsPage;

public class EventsPageTest extends BaseTest {

    @Epic("Test3.1 Перевірка сортування вибірки даних події із дітьми ")
    @Story("Вхід на головну сторінку, перехід до розділу події та  перегляд списку подій з дітьми ")
    @Test(groups = "third", enabled = true)
    public void ShowEventsWithKids() throws InterruptedException {
        EventsPage eventsPage = new EventsPage();
        eventsPage.clickOnEvents()
                .clickOnEventsWithKids();
        Thread.sleep(3000);
        String expectedResult = "Куди піти з дітьми в Києві";
        Assert.assertEquals(eventsPage.WITH_CHILD_STATUS.getText(), expectedResult);
    }

    @Epic("Test3.2 Перевірка, вибір та перехід на сторінку обранної події ")
    @Story("Вхід на головну сторінку, перехід до розділу події, перегляд списку подій фестиваль ")
    @Test(groups = "third", priority = 1, enabled = true)
    public void ShowEventsFestival() {
        EventsPage eventsPage = new EventsPage();
        eventsPage.clickOnEvents()
                .clickOnEventsFestival()
                .clickOnFestivalSelected()
                .clickOnBuyTickets();
        String expectedResult = "https://kyivmaps.com/ua/events?t=festival";
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedResult));
    }

    @Epic("Test3.3 Додовання даних в розділ Activity на карту https://kyivmaps.com/ ")
    @Story("Вхід на головну сторінку, авторизація користувача та додовання даних в розділ Activity ")
    @Test(groups = "third", priority = 2, enabled = true)
    public void addActivityEvents() throws InterruptedException {
        EventsPage eventsPage = new EventsPage();
        eventsPage.autorization().
                clickOnAddEvents().
                clickOnActivityButton().
                inputEventName().
                clickOnAddEventButton().
                clickOnPublishButton().
                showStatusAddedEvent();
        Thread.sleep(3000);
        String expectedResult = "Очікує на модерацію";
        Assert.assertEquals(eventsPage.SHOW_STATUS_FIELD.getText(), expectedResult);
    }

    @Epic("Test3.4 Додовання даних в розділ Подія на карту https://kyivmaps.com/ ")
    @Story("Вхід на головну сторінку, авторизація користувача та додовання даних в розділ Подія")
    @Test(groups = "third", priority = 3, enabled = true)
    public void addEventEvents() throws InterruptedException {
        EventsPage eventsPage = new EventsPage();
        eventsPage.autorization().
                clickOnAddEvents().
                clickOnEventButton().
                inputEventName().
                clickOnAddEventButton().
                clickOnPublishButton().
                showStatusAddedEvent();
        Thread.sleep(3000);
        String expectedResult = "Очікує на модерацію";
        Assert.assertEquals(eventsPage.SHOW_STATUS_FIELD.getText(), expectedResult);
    }

    @Epic("Test3.5 Додовання даних в розділ Локація на карту https://kyivmaps.com/ ")
    @Story("Вхід на головну сторінку, авторизація користувача та додовання даних в розділ Локація")
    @Test(groups = "third", priority = 4, enabled = true)
    public void addLocationEvents() throws InterruptedException {
        EventsPage eventsPage = new EventsPage();
        eventsPage.autorization().
                clickOnAddEvents().
                clickOnLocationButton().
                inputEventName().
                clickOnAddEventButton().
                clickOnPublishButton();
        Thread.sleep(5000);
        String expectedResult = "Очікує на модерацію";
        Assert.assertEquals(eventsPage.SHOW_STATUS_FIELD.getText(), expectedResult);
    }
}
