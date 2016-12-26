package com.vladyslavvlasov.app.webdriver.tests;

import com.vladyslavvlasov.app.webdriver.pages.*;
import org.junit.Test;

import java.util.Set;

/**
 * Created by Vladyslav Vlasov on 26.12.2016.
 */
public class ProfileTests extends BaseTest {
    @Test
    public void testChangingPhoneNumber(){
        StartPage startPage = new StartPage(driver);
        startPage.getStartPage();
        startPage.findElement(StartPage.loginButton).click();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillEmailField(AbstractPage.EXISTING_EMAIL);
        loginPage.fillPasswordField(AbstractPage.DEFAULT_PASS);
        loginPage.findElement(LoginPage.submitButton).click();

        ProjectPage projectPage = new ProjectPage(driver);
        projectPage.findElement(ProjectPage.settings).click();

        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.findElement(SettingsPage.editPhoneButton).click();
        settingsPage.findElement(SettingsPage.phoneTextField).clear();
        String randomPhoneNumber =AbstractPage.randomPhoneNumber;
        settingsPage.fillInField(SettingsPage.phoneTextField,randomPhoneNumber);
        settingsPage.findElement(SettingsPage.savePhoneButton).click();
        settingsPage.assertPhoneChangedCorrectly(randomPhoneNumber);
    }
}
