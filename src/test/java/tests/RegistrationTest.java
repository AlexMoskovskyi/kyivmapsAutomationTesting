package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Header;
import pages.SignUpPage;

public class RegistrationTest extends BaseTest{
    @Epic("Test1.1 Реєстрація")
    @Story("Вхід на головну сторінку та реєстрація ового користувача")
    @Test(groups = "main group", enabled = true)
    public void registrationTest(){
        Header header = new Header();
        header.clickOnLoginButton().clickOnSignUpButton();
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.inputEmailIntoField().
                inputFirstNameIntoField().
                inputLastNameIntoField().
                inputPasswordIntoField().
                clickOnRegistrationRulesButton().
                clickOnRegistrationButton();
        String expectedResult = "Ви успішно зареєстровані!";
       Assert.assertEquals(signUpPage.REGISTRATION_COMPLETED.getText(), expectedResult);
    }

    @Epic("Test1.2 Реєстрація з невалідним email")
    @Story("Вхід на головну сторінку та реєстрація з невалідним email ")
    @Test(groups = "main group", priority = 2, enabled = true)
    public void registrationInvalidTest() {
        Header header = new Header();
        header.clickOnLoginButton().clickOnSignUpButton();
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.inputInvalidEmailIntoField().
                inputFirstNameIntoField().
                inputLastNameIntoField().
                inputPasswordIntoField().
                clickOnRegistrationRulesButton().
                clickOnRegistrationButton();
        Assert.assertTrue(signUpPage.INVALID_REGISTRATION.isDisplayed());
    }

    @Epic("Test1.3 Реєстрація за допомогою аккаунту facebook")
    @Story("Вхід на головну сторінку та реєстрація за допомогою аккаунту facebook ")
    @Test(groups = "main group", priority = 3, enabled = true)
    public void registrationWithFacebook() {
        Header header = new Header();
        header.clickOnLoginButton().clickOnButton(header.FACEBOOK_AUTH_BUTTON);
        String actualResult = webDriver.getCurrentUrl();
        String expectedResult = "facebook.com";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Epic("Test1.3 Реєстрація за допомогою аккаунту google")
    @Story("Вхід на головну сторінку та реєстрація за допомогою аккаунту google ")
    @Test(groups = "main group", priority = 4, enabled = true)
    public void registrationWithGoogle() {
        Header header = new Header();
        header.clickOnLoginButton().clickOnButton(header.GOOGLE_AUTH_BUTTON);
        String actualResult = webDriver.getCurrentUrl();
        String expectedResult = "accounts.google.com";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}

