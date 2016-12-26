package com.vladyslavvlasov.app.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Vladyslav Vlasov on 21.12.2016.
 */
public abstract class AbstractPage {
    public static final String EXISTING_LOGIN_NAME = "Vlady";
    public static final String CITY = "Kyiv";
    public static final String EXISTING_EMAIL = "deep_metal_warrior@yahoo.com";
    public static final String DEFAULT_PHONE_NUMBER ="+380630000000";
    public static final String BASE_URL ="https://dev.equerest.com/";
    public static final String DEFAULT_PASS ="Dev12345";
    public static final String DEFAULT_PROJECT_TITLE = "Vlady";
    public static String randomPhoneNumber= "+38063"+(int)(Math.random()*9999999);
    WebDriver driver;


    public AbstractPage(WebDriver driver){
        this.driver = driver;
    }
    public WebElement findElement(By elementLocator){
        WebElement element = driver.findElement(elementLocator);
        return element;
    }
    public WebElement fillInField(By locator, String message){
        WebElement element = driver.findElement(locator);
        element.sendKeys(message);
        return element;
    }
}
