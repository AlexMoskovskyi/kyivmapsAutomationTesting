package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pages.Header;
import pages.SignUpPage;

public class RegistrationTest extends BaseTest{
    @Epic("Test1.1 Реєстрація")
    @Story("Вхід на головну сторінку та реєстрація")
    @Test
    public void registrationTest(){
        Header header = new Header();
        header.clickOnSignUpButton();
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.inputEmailIntoField().inputFirstNameIntoField().
                inputLastNameIntoField().clickOnRegistrationRulesButton().
                clickOnRegistrationButton();

        //WebElement loginButton = webDriver.findElement(By.xpath("//*[@id=\"lgn\"]"));
        //waiter.waitForElementClickable(loginButton).click();
//        WebElement signup = webDriver.findElement(By.xpath("//*[@class=\"signup-popup\"]"));
//        waiter.waitForElementClickable(signup).click();
//        WebElement regEmail = webDriver.findElement(By.xpath("//*[@id=\"signupform-email\"]"));
//        waiter.waitForElementClickable(regEmail).sendKeys(email, Keys.ENTER);
//        WebElement regFirstName = webDriver.findElement(By.xpath("//*[@id=\"signupform-first_name\"]"));
//        waiter.waitForElementClickable(regFirstName).sendKeys(firstName, Keys.ENTER);
//        WebElement regLastName = webDriver.findElement(By.xpath("//*[@id=\"signupform-last_name\"]"));
//        waiter.waitForElementClickable(regLastName).sendKeys(lastName, Keys.ENTER);
//        WebElement regPassword = webDriver.findElement(By.xpath("//*[@id=\"signupform-password\"]"));
//        waiter.waitForElementClickable(regPassword).sendKeys(password, Keys.ENTER);
//        WebElement regRulesButton = webDriver.findElement(By.xpath("//*[@class=\"cbx-icon\"]"));
//        waiter.waitForElementClickable(regRulesButton).click();
//        WebElement regButton = webDriver.findElement(By.xpath("//*[@class=\"btn btn-primary g-recaptcha recaptcha\"]"));
//        WebElement regButton = webDriver.findElement(By.xpath("//*[@id=\"recaptchaButton45271751a5b0424c4f284748b1057fd9\"]"));
//        waiter.waitForElementClickable(regButton).click();

    }

    @Epic("Test1.2 Реєстрація з невалідним email")
    @Story("Вхід на головну сторінку та реєстрація з невалідним email ")
    @Test(priority = 2, enabled = false)
    public void registrationInvalidTest() {

//        String emailInvalid = "moscow5@i.ua";
//        WebElement loginButton = webDriver.findElement(By.xpath("//*[@id=\"lgn\"]"));
//        waiter.waitForElementClickable(loginButton).click();
//        WebElement signup = webDriver.findElement(By.xpath("//*[@class=\"signup-popup\"]"));
//        waiter.waitForElementClickable(signup).click();
//        WebElement regEmail = webDriver.findElement(By.xpath("//*[@id=\"signupform-email\"]"));
//        waiter.waitForElementClickable(regEmail).sendKeys(emailInvalid, Keys.ENTER);
//        WebElement regFirstName = webDriver.findElement(By.xpath("//*[@id=\"signupform-first_name\"]"));
//        waiter.waitForElementClickable(regFirstName).sendKeys(firstName, Keys.ENTER);
//        WebElement regLastName = webDriver.findElement(By.xpath("//*[@id=\"signupform-last_name\"]"));
//        waiter.waitForElementClickable(regLastName).sendKeys(lastName, Keys.ENTER);
//        WebElement regPassword = webDriver.findElement(By.xpath("//*[@id=\"signupform-password\"]"));
//        waiter.waitForElementClickable(regPassword).sendKeys(password, Keys.ENTER);
//        WebElement regRulesButton = webDriver.findElement(By.xpath("//*[@class=\"cbx-icon\"]"));
//        waiter.waitForElementClickable(regRulesButton).click();
//        WebElement regButton = webDriver.findElement(By.xpath("//*[@class=\"btn btn-primary g-recaptcha recaptcha\"]"));
//        waiter.waitForElementClickable(regButton).click();
//        WebElement invalidRegistration = webDriver.findElement(By.xpath("//*[@class=\"help-block help-block-error\"]"));
//        String expectedResult = "Ця електронна адреса вже зареєстрована";
//        System.out.println(invalidRegistration.getText());
        //Assert.assertEquals(invalidRegistration.getText(), expectedResult);


    }

}

