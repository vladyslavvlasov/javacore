package com.vladyslavvlasov.app.webdriver.tests;

import com.vladyslavvlasov.app.webdriver.pages.AbstractPage;
import com.vladyslavvlasov.app.webdriver.pages.LoginPage;
import com.vladyslavvlasov.app.webdriver.pages.ProjectPage;
import com.vladyslavvlasov.app.webdriver.pages.StartPage;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Vladyslav Vlasov on 26.12.2016.
 */
public class LoginTests extends BaseTest {
    @Test
    public void testCorrectLogin() {
        StartPage startPage = new StartPage(driver);
        startPage.getStartPage();
        startPage.findElement(StartPage.loginButton).click();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillEmailField(AbstractPage.EXISTING_EMAIL);
        loginPage.fillPasswordField(AbstractPage.DEFAULT_PASS);
        loginPage.findElement(LoginPage.submitButton).click();

        ProjectPage projectPage = new ProjectPage(driver);
        projectPage.assertLoggedInSuccesfully(AbstractPage.DEFAULT_PROJECT_TITLE);

    }

}
