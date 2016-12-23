package com.vladyslavvlasov.app.webdriver.tests;

import com.vladyslavvlasov.app.webdriver.pages.AbstractPage;
import com.vladyslavvlasov.app.webdriver.pages.AddProjectAsEntrepreneurStepOnePage;
import com.vladyslavvlasov.app.webdriver.pages.AddProjectAsEntrepreneurStepTwoPage;
import org.junit.Test;

/**
 * Created by Vladyslav Vlasov on 21.12.2016.
 */
public class AddProjectAsEntrepreneurTests extends BaseTest {

    @Test
    public void testExistingEmail() {
        AddProjectAsEntrepreneurStepOnePage page = new AddProjectAsEntrepreneurStepOnePage(super.driver);
        page.goToEntrepreneurPage();
        page.goToRegistration();
        AddProjectAsEntrepreneurStepTwoPage page2 = new AddProjectAsEntrepreneurStepTwoPage(super.driver);
        page2.fillInName(AbstractPage.EXISTING_LOGIN_NAME);
        page2.fillInCity(AbstractPage.CITY);
        page2.fillInPhone(AbstractPage.DEFAULT_PHONE_NUMBER);
        page2.fillInPassword(AbstractPage.DEFAULT_PASS);
        page2.fillInEmail(AbstractPage.EXISTING_LOGIN_NAME);
        page2.clickOnGoToStep2();
        page2.assertEmailErrorMessage();
    }
}
