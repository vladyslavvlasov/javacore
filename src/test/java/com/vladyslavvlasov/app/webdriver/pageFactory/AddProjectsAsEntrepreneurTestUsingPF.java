package com.vladyslavvlasov.app.webdriver.pageFactory;

import com.vladyslavvlasov.app.webdriver.pages.AddProjectAsEntrepreneurStepTwoPage;
import com.vladyslavvlasov.app.webdriver.tests.BaseTest;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Vladyslav Vlasov on 24.12.2016.
 */
public class AddProjectsAsEntrepreneurTestUsingPF extends BaseTest {
    @Test
    public void testExistingEmail() {
        driver.get(AbstractPagePF.BASE_URL);
        AddProjectAsEntrepreneurStepOnePagePF page1 = PageFactory.initElements(driver, AddProjectAsEntrepreneurStepOnePagePF.class);
        page1.gotoRegistration();
        AddProjectAsEntrepreneurStepTwoPagePF page2 = PageFactory.initElements(driver, AddProjectAsEntrepreneurStepTwoPagePF.class);
        page2.fillInName(AbstractPagePF.EXISTING_LOGIN_NAME);
        page2.fillInCity(AbstractPagePF.CITY);
        page2.fillInPassword(AbstractPagePF.DEFAULT_PASS);
        page2.fillInPhone(AbstractPagePF.DEFAULT_PHONE_NUMBER);
        page2.fillInEmail(AbstractPagePF.EXISTING_EMAIL);
        page2.clickOnGoToStep2();
        page2.assertEmailErrorMessage();
    }
}
