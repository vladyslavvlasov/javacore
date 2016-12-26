package com.vladyslavvlasov.app.webdriver.tests;

import com.vladyslavvlasov.app.webdriver.pages.AbstractPage;
import com.vladyslavvlasov.app.webdriver.pages.AddProjectAsEntrepreneurStepOnePage;
import com.vladyslavvlasov.app.webdriver.pages.AddProjectAsEntrepreneurStepTwoPage;
import com.vladyslavvlasov.app.webdriver.pages.StartPage;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vladyslav Vlasov on 21.12.2016.
 */
public class AddProjectAsEntrepreneurTests extends BaseTest {

    @Test
    public void testExistingEmail() {
        StartPage startPage = new StartPage(super.driver);
        startPage.goToEntrepreneurPage();
        AddProjectAsEntrepreneurStepOnePage page = new AddProjectAsEntrepreneurStepOnePage(super.driver);
        page.goToRegistration();
        AddProjectAsEntrepreneurStepTwoPage page2 = new AddProjectAsEntrepreneurStepTwoPage(super.driver);
        page2.fillInName(AbstractPage.EXISTING_LOGIN_NAME);
        page2.fillInCity(AbstractPage.CITY);
        page2.fillInPhone(AbstractPage.DEFAULT_PHONE_NUMBER);
        page2.fillInPassword(AbstractPage.DEFAULT_PASS);
        page2.fillInEmail(AbstractPage.EXISTING_EMAIL);
        page2.clickOnGoToStep2();
        page2.assertEmailErrorMessage();
    }
    @Test
    public void testBlankField(){
        AddProjectAsEntrepreneurStepOnePage page1 = new AddProjectAsEntrepreneurStepOnePage(driver);
        page1.getEntrepreneurPage();
        page1.goToRegistration();
        AddProjectAsEntrepreneurStepTwoPage page2 = new AddProjectAsEntrepreneurStepTwoPage(driver);
        page2.clickOnGoToStep2();
        page2.clickOnGoToStep2();
        page2.assertFieldHasToBeFilledEm();
    }
    @Test
    public void testIncorrectPhoneNumber(){
        StartPage startPage = new StartPage(super.driver);
        startPage.goToEntrepreneurPage();
        AddProjectAsEntrepreneurStepOnePage page = new AddProjectAsEntrepreneurStepOnePage(super.driver);
        page.goToRegistration();
        AddProjectAsEntrepreneurStepTwoPage page2 = new AddProjectAsEntrepreneurStepTwoPage(super.driver);
        page2.fillInPhone(AddProjectAsEntrepreneurStepTwoPage.incorrectPhone);
        page2.findElement(AddProjectAsEntrepreneurStepTwoPage.name).click();
        page2.assertPhoneEm();
    }
}
