package com.vladyslavvlasov.app.webdriver.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;

/**
 * Created by Vladyslav Vlasov on 26.12.2016.
 */
public class SettingsPage extends AbstractPage{
    public static By savePhoneButton = By.xpath("//button[@class='button button-blue ng-binding' and @type ='submit']");
    public static By editPhoneButton = By.xpath("//img[contains(@ng-if,'$ctrl.phoneEditor')]");
    public static By phoneTextField = By.id("tmpPhone");
    public static By phoneInfo = By.xpath("//label[@for='phone' and @class ='ng-binding']/following-sibling::*[@class ='ng-binding']");



    public SettingsPage(WebDriver driver){
        super(driver);
    }
    public void assertPhoneChangedCorrectly(String newPhoneNum){
        WebElement element = driver.findElement(phoneInfo);
        Assert.assertEquals(element.getText(), newPhoneNum);
    }
}
