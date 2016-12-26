package com.vladyslavvlasov.app.classwork.lesson23;

import com.vladyslavvlasov.app.webdriver.tests.BaseTest;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Vladyslav Vlasov on 24.12.2016.
 */
public class GoogleSRPageTest extends BaseTest {
    @Test
    public void searchForQ(){
        driver.get("http://www.google.com/");
        GoogleSRPage page = PageFactory.initElements(driver,GoogleSRPage.class);
        page.searchFor("Cheese");
    }
}
