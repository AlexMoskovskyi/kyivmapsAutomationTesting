package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Header;
import pages.SignUpPage;

public class SignUpPageTest extends BaseTest {
    @Epic("Test1.1 Реєстрація")
    @Story("Вхід на головну сторінку та реєстрація нового користувача")
    @Test(groups = "main group",priority = 1, enabled = true)
    public void registrationTest() {
        int testCaseId = 2;
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.clickOnLoginButton().
                inputEmailIntoField().
                inputFirstNameIntoField().
                inputLastNameIntoField().
                inputPasswordIntoField().
                clickOnRegistrationRulesButton().
                clickOnRegistrationButton();
        String expectedResult = "Ви успішно зареєстровані!";
        waiter.waitForElementVisibility(signUpPage.REGISTRATION_COMPLETED);
        Assert.assertEquals(signUpPage.REGISTRATION_COMPLETED.getText(), expectedResult);
    }

    @Epic("Test1.2 Реєстрація з невалідним email")
    @Story("Вхід на головну сторінку та реєстрація з невалідним email ")
    @Test(groups = "main group", priority = 2, enabled = true)
    public void registrationInvalidTest() {
        int testCaseId = 3;
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.clickOnLoginButton().
                inputInvalidEmailIntoField().
                inputFirstNameIntoField().
                inputLastNameIntoField().
                inputPasswordIntoField().
                clickOnRegistrationRulesButton().
                clickOnRegistrationButton();
        String expectedResult = "Ця електронна адреса вже зареєстрована.";
        waiter.waitForElementVisibility(signUpPage.INVALID_REGISTRATION);
        Assert.assertEquals(signUpPage.INVALID_REGISTRATION.getText(), expectedResult);
    }

    @Epic("Test1.3 Реєстрація за допомогою аккаунту facebook")
    @Story("Вхід на головну сторінку та реєстрація за допомогою аккаунту facebook ")
    @Test(groups = "main group", priority = 3, enabled = true)
    public void registrationWithFacebook() {
        int testCaseId = 4;
        Header header = new Header();
        header.clickOnLoginButton().
                clickOnSignUpButton().
                clickOnFacebookButton();
        String actualResult = webDriver.getCurrentUrl();
        String expectedResult = "facebook.com";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Epic("Test1.4 Реєстрація за допомогою аккаунту google")
    @Story("Вхід на головну сторінку та реєстрація за допомогою аккаунту google ")
    @Test(groups = "second group", priority = 4, enabled = true)
    public void registrationWithGoogle() {
        int testCaseId = 5;
        Header header = new Header();
        header.clickOnLoginButton().
                clickOnSignUpButton().
                clickOnGoogleButton();
        String actualResult = webDriver.getCurrentUrl();
        String expectedResult = "accounts.google.com";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Epic("Test1.5 Авторизація")
    @Story("Вхід на головну сторінку та авторизація")
    @Test(groups = "main group", priority = 5, enabled = true)
    public void authorizationTest() {
        int testCaseId = 6;
        Header header = new Header();
        header.clickOnLoginButton().
                inputLoginData().
                clickOnEnterButton();
    }
}

