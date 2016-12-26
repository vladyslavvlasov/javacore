package com.vladyslavvlasov.app.webdriver.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Vladyslav Vlasov on 26.12.2016.
 */
public class LoginPage extends AbstractPage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By emailField = By.id("email");
    By passwordField = By.id("password");

    public static By submitButton = By.xpath("//*[@id='submit-block']//button[@type = 'submit']");
    public void fillEmailField(String email) {
        WebElement mailField = driver.findElement(emailField);
        mailField.sendKeys(email);
    }

    public void fillPasswordField(String pass) {
        WebElement passField = driver.findElement(passwordField);
        passField.sendKeys(pass);
    }


}
