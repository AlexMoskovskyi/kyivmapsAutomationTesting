package tests;

import core.InitDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Header;
import utils.Waiter;

import java.util.Iterator;
import java.util.Set;

public class AutoritationTest extends BaseTest {
    private String email = "mіw5@i.ua";
    private String password = "asdfghjk";
    private String firstName = "Alex";
    private String lastName = "MscW";

    @Epic("Test1.1 Реєстрація")
    @Story("Вхід на головну сторінку та реєстрація")
    @Test(priority = 1,enabled = false)
    public void registrationTest() {
        WebElement loginButton = webDriver.findElement(By.xpath("//*[@id=\"lgn\"]"));
        waiter.waitForElementClickable(loginButton).click();
        WebElement signup = webDriver.findElement(By.xpath("//*[@class=\"signup-popup\"]"));
        waiter.waitForElementClickable(signup).click();
        WebElement regEmail = webDriver.findElement(By.xpath("//*[@id=\"signupform-email\"]"));
        waiter.waitForElementClickable(regEmail).sendKeys(email, Keys.ENTER);
        WebElement regFirstName = webDriver.findElement(By.xpath("//*[@id=\"signupform-first_name\"]"));
        waiter.waitForElementClickable(regFirstName).sendKeys(firstName, Keys.ENTER);
        WebElement regLastName = webDriver.findElement(By.xpath("//*[@id=\"signupform-last_name\"]"));
        waiter.waitForElementClickable(regLastName).sendKeys(lastName, Keys.ENTER);
        WebElement regPassword = webDriver.findElement(By.xpath("//*[@id=\"signupform-password\"]"));
        waiter.waitForElementClickable(regPassword).sendKeys(password, Keys.ENTER);
        WebElement regRulesButton = webDriver.findElement(By.xpath("//*[@class=\"cbx-icon\"]"));
        waiter.waitForElementClickable(regRulesButton).click();
        WebElement regButton = webDriver.findElement(By.xpath("//*[@class=\"btn btn-primary g-recaptcha recaptcha\"]"));
        //WebElement regButton = webDriver.findElement(By.xpath("//*[@id=\"recaptchaButton45271751a5b0424c4f284748b1057fd9\"]"));
        waiter.waitForElementClickable(regButton).click();
        WebElement regComplet = webDriver.findElement(By.xpath("//*[@class=\"registration-completed\"]"));
        String expectedResult = "Ви успішно зареєстровані!";
        Assert.assertEquals(regComplet.getText(), expectedResult);
    }
    @Epic("Test1.2 Реєстрація з невалідним email")
    @Story("Вхід на головну сторінку та реєстрація з невалідним email ")
    @Test(priority = 2)
    public void registrationInvalidTest() {
        //Header header = new Header();
        //header.clickOnLoginButton();
        String emailInvalid = "moscow5@i.ua";
        WebElement loginButton = webDriver.findElement(By.xpath("//*[@id=\"lgn\"]"));
        waiter.waitForElementClickable(loginButton).click();
        WebElement signup = webDriver.findElement(By.xpath("//*[@class=\"signup-popup\"]"));
        waiter.waitForElementClickable(signup).click();
        WebElement regEmail = webDriver.findElement(By.xpath("//*[@id=\"signupform-email\"]"));
        waiter.waitForElementClickable(regEmail).sendKeys(emailInvalid, Keys.ENTER);
        WebElement regFirstName = webDriver.findElement(By.xpath("//*[@id=\"signupform-first_name\"]"));
        waiter.waitForElementClickable(regFirstName).sendKeys(firstName, Keys.ENTER);
        WebElement regLastName = webDriver.findElement(By.xpath("//*[@id=\"signupform-last_name\"]"));
        waiter.waitForElementClickable(regLastName).sendKeys(lastName, Keys.ENTER);
        WebElement regPassword = webDriver.findElement(By.xpath("//*[@id=\"signupform-password\"]"));
        waiter.waitForElementClickable(regPassword).sendKeys(password, Keys.ENTER);
        WebElement regRulesButton = webDriver.findElement(By.xpath("//*[@class=\"cbx-icon\"]"));
        waiter.waitForElementClickable(regRulesButton).click();
        WebElement regButton = webDriver.findElement(By.xpath("//*[@class=\"btn btn-primary g-recaptcha recaptcha\"]"));
        waiter.waitForElementClickable(regButton).click();
        WebElement invalidRegistration = webDriver.findElement(By.xpath("//*[@class=\"help-block help-block-error\"]"));
        String expectedResult = "Ця електронна адреса вже зареєстрована";
        System.out.println(invalidRegistration.getText());
        //Assert.assertEquals(invalidRegistration.getText(), expectedResult);


    }
    @Epic("Test1.3 Авторизація")
    @Story("Вхід на головну сторінку та авторизація")
    @Test(priority = 3,enabled = false)
    public void autorisationTest() throws InterruptedException {
        String autEmail = "moscow5@i.ua";
        //Header header = new Header();
        //header.LOGIN_BUTTON.click();
        WebElement loginButton = webDriver.findElement(By.xpath("//*[@id=\"lgn\"]"));
        waiter.waitForElementClickable(loginButton).click();
        WebElement userEmail = webDriver.findElement(By.xpath("//*[@id=\"user-email\"]"));
        waiter.waitForElementClickable(userEmail).sendKeys(autEmail, Keys.ENTER);
        WebElement userPassword = webDriver.findElement(By.xpath("//*[@id=\"user-passwordlogin\"]"));
        waiter.waitForElementClickable(userPassword).sendKeys(password, Keys.ENTER);

    }
}