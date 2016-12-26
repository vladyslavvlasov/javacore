package com.vladyslavvlasov.app.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vladyslav Vlasov on 21.12.2016.
 */
public class AddProjectAsEntrepreneurStepOnePage extends AbstractPage {
    By registerLink = By.cssSelector("a[href ='/register#/entrepreneur']");


    public AddProjectAsEntrepreneurStepOnePage(WebDriver driver) {
        super(driver);
    }

    public void getEntrepreneurPage(){
        driver.get("https://dev.equerest.com/info/entrepreneur");
    }
    public void goToRegistration() {
        driver.findElement(registerLink).click();
    }
}
