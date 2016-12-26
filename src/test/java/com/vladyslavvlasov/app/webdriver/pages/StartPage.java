package com.vladyslavvlasov.app.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Vladyslav Vlasov on 25.12.2016.
 */
public class StartPage extends AbstractPage {
    public static By loginButton = By.xpath("//*[@href ='/register#/']");

    public StartPage(WebDriver driver) {
        super(driver);
    }

    public void goToEntrepreneurPage() {
        driver.get(BASE_URL);
        WebElement entPage = driver.findElement(By.cssSelector("a[href ='/info/entrepreneur']"));
        entPage.click();
    }
    public void getStartPage(){
        driver.get(BASE_URL);
    }

}

