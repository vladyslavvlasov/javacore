package com.vladyslavvlasov.app.webdriver.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Vladyslav Vlasov on 23.12.2016.
 */
public class AddProjectAsEntrepreneurStepTwoPage extends AbstractPage {
    public AddProjectAsEntrepreneurStepTwoPage(WebDriver driver) {
        super(driver);
    }


    By name = By.id("fio");
    By city = By.id("city");
    By phone = By.id("tel");
    By email = By.id("mail");
    By password = By.id("pass");
    By goToStep2 = By.xpath("//*[@ class = 'button button-blue button-next']");
    By emailEM = By.xpath("//*[@class='toast-message']");

    String emailErrorMessage = "Пользователь с таким e-mail уже зарегестрирован.";

    public void fillInName() {
        WebElement fullName = driver.findElement(name);
        fullName.sendKeys(EXISTING_LOGIN_NAME);
    }

    public void fillInCity() {
        WebElement thisCity = driver.findElement(city);
        thisCity.sendKeys(CITY);
    }

    public void fillInPhone() {
        WebElement phoneNum = driver.findElement(phone);
        phoneNum.clear();
        phoneNum.sendKeys(DEFAULT_PHONE_NUMBER);
    }

    public void fillInPassword() {
        WebElement pass = driver.findElement(password);
        pass.sendKeys(DEFAULT_PASS);
    }

    public void fillInEmail() {
        WebElement emailField = driver.findElement(email);
        emailField.sendKeys(EXISTING_EMAIL);
    }

    public void clickOnGoToStep2() {
        WebElement step2 = driver.findElement(goToStep2);
        step2.click();
    }

    public void assertEmailErrorMessage() {
        WebElement em = driver.findElement(emailEM);
        String actualEm = em.getAttribute("aria-label");
        Assert.assertEquals(actualEm, emailErrorMessage);
    }
}

