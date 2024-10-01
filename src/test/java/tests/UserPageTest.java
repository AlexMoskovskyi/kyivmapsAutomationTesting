package tests;


import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserPage;


public class UserPageTest extends AuthBaseTest {

    @Epic("Test2.1 Сторінка користувача, зміна посилання")
    @Story("Вхід на сторінку користувача та зміна посилання")
    @Test(groups = "second group", priority = 1, enabled = true)
    public void changeUserLinkTest() {
        UserPage userPage = new UserPage();
        userPage.clickOnUserProfileButton().
                clickOnProfileButton().
                clickOnEditProfileButton().
                clickOnUserLinkField().
                clearUserLinkField().
                inputDataOnUserLinkField();
        String expectedResult = "Aleksandr_Moskovskyi";
        waiter.waitForElementVisibility(UserPage.NEW_USER_LINK);
        Assert.assertEquals(UserPage.NEW_USER_LINK.getText(), expectedResult);
    }

    @Epic("Test2.2 Зміна ім'я на сторінці користувача")
    @Story("Вхід на сторінку користувача та зміна ім'я")
    @Test(groups = "second group", priority = 2, enabled = true)
    public void changeFirstNameTest() {
        UserPage userPage = new UserPage();
        userPage.clickOnUserProfileButton().
                clickOnProfileButton().
                clickOnEditProfileButton().
                clickOnFirstNameField().
                clearFirstNameField().
                inputDataOnFirstNameField();
        String expectedResult = "Олександр";
        waiter.waitForElementVisibility(UserPage.NEW_FIRST_NAME);
        Assert.assertEquals(UserPage.NEW_FIRST_NAME.getText(), expectedResult);
    }

    @Epic("Test2.3 Зміна призвіща на сторінці користувача ")
    @Story("Вхід на сторінку користувача та зміна призвіща")
    @Test(groups = "second group", priority = 3, enabled = true)
    public void changeLastNameTest() {
        UserPage userPage = new UserPage();
        userPage.clickOnUserProfileButton().
                clickOnProfileButton().
                clickOnEditProfileButton().
                clickOnLastNameField().
                clearLastNameField().
                inputDataOnLastNameField();
        String expectedResult = "Московський";
        waiter.waitForElementVisibility(UserPage.NEW_LAST_NAME);
        Assert.assertEquals(UserPage.NEW_LAST_NAME.getText(), expectedResult);
    }

    @Epic("Test2.4 Зміна номеру телефона на сторінці користувача ")
    @Story("Вхід на сторінку користувача та зміна номеру телефона")
    @Test(groups = "second group", priority = 4, enabled = true)
    public void changeTelephoneNumberTest() {
        UserPage userPage = new UserPage();
        userPage.clickOnUserProfileButton().
                clickOnProfileButton().
                clickOnEditProfileButton().
                clickOnTelephoneField().
                clickTelephoneField().
                inputDataOnTelephonField();
        String expectedResult = "+380 (05) 555-55-55";
        waiter.waitForElementVisibility(UserPage.NEW_TELEPHONE);
        Assert.assertEquals(UserPage.NEW_TELEPHONE.getText(), expectedResult);
    }

    @Epic("Test2.5 Додовання соціальной мережі на сторінці користувача")
    @Story("Вхід на сторінку користувача та додавання новой соціальной мережі ")
    @Test(groups = "second group", priority = 5, enabled = true)
    public void addSocialNetworkTest() {
        UserPage userPage = new UserPage();
        userPage.clickOnUserProfileButton().
                clickOnProfileButton().
                clickOnEditProfileButton().
                clickOnSocialNetworkField().
                clickSocialNetworkAddButton().
                inputDataOnSocialNetworkField();
        String expectedResult = "https://uk-ua.facebook.com/";
        waiter.waitForElementClickable(UserPage.NEW_SOCIAL_NETWORK);
        Assert.assertEquals(UserPage.NEW_SOCIAL_NETWORK.getText(), expectedResult);
    }
}