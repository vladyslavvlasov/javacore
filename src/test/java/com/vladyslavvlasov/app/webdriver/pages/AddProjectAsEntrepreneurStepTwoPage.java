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


    public static By name = By.id("fio");
    public static By city = By.id("city");
    public static By phone = By.id("tel");
    public static By email = By.id("mail");
    public static By password = By.cssSelector("#pass");
    public static By goToStep2 = By.cssSelector(".button.button-blue.button-next");
    public static By emailEM = By.cssSelector(".toast-message");
    public static By fieldHasToBeFilledInEM = By.cssSelector(".error-message.ng-scope");
    public static By inCorrectPhoneNumElement = By.xpath("//*[@class = 'error-message ng-scope' and @ng-message='pattern']");


    public final static String wrongPhoneEm = "Формат номера неверный";
    public final static String incorrectPhone = "+380-009957";
    public final static String emailErrorMessage = "Пользователь с таким e-mail уже зарегестрирован.";
    public final static String fieldHasToBeFilledIn= "Поле обязательно для заполнения";

    public void fillInName(String nameStr) {
        WebElement fullName = driver.findElement(name);
        fullName.sendKeys(nameStr);
    }

    public void fillInCity(String cityArg) {
        WebElement thisCity = driver.findElement(city);
        thisCity.sendKeys(cityArg);
    }

    public void fillInPhone(String phonenumber) {
        WebElement phoneNum = driver.findElement(phone);
        phoneNum.clear();
        phoneNum.sendKeys(phonenumber);
    }

    public void fillInPassword(String passArg) {
        WebElement pass = driver.findElement(password);
        pass.sendKeys(passArg);
    }

    public void fillInEmail(String regEmail) {
        WebElement emailField = driver.findElement(email);
        emailField.sendKeys(regEmail);
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
    public void assertFieldHasToBeFilledEm(){
        WebElement filledEM = driver.findElement(fieldHasToBeFilledInEM);
        String actualEm = filledEM.getText();
        System.out.println(actualEm);
        Assert.assertEquals(actualEm,fieldHasToBeFilledIn);
    }
    public WebElement findElement(By locator){
        WebElement elementToBeFound = driver.findElement(locator);
        return elementToBeFound;
    }
    public void assertPhoneEm(){
        WebElement em = driver.findElement(inCorrectPhoneNumElement);
        String actualMsg = em.getText();
        Assert.assertEquals(wrongPhoneEm, actualMsg);
    }
}

