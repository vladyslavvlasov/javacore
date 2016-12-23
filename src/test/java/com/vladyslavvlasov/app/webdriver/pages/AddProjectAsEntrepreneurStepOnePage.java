package com.vladyslavvlasov.app.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vladyslav Vlasov on 21.12.2016.
 */
public class AddProjectAsEntrepreneurStepOnePage extends AbstractPage {
    By registerLink = By.xpath("//*[@href = \"/register#/entrepreneur\"]");


    public AddProjectAsEntrepreneurStepOnePage(WebDriver driver){
        super(driver);
    }
public  void goToRegistration(){
        driver.findElement(registerLink).click();
}
public void goToEntrepreneurPage(){
    driver.get(BASE_URL+"info/entrepreneur/");
}
}
