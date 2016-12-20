package com.vladyslavvlasov.app.webdriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vladyslav Vlasov on 19.12.2016.
 */
public class EquerestTests {
    By fio = By.id("fio");
    By city = By.id("city");
    By tel = By.id("tel");
    By mail = By.id("mail");
    By pass = By.id("pass");
    By toastMessage = By.xpath("//*[@class='toast-message']");
    By smallEM = By.xpath("//*[@class = 'error-message ng-scope']");
    By loginLink = By.xpath("//*[@href ='/register#/']");
    By submitButton = By.xpath("//*[@id='submit-block']//button[@type = 'submit']");
    By projectTitle = By.xpath("//*[@ng-bind-html='$ctrl.post.projects.title']");
    By settings = By.xpath("//*[@href = '/dashboard#/settings']");
    By phoneEditor = By.xpath("//img[contains(@ng-if,'$ctrl.phoneEditor')]");
    By phoneId = By.id("tmpPhone");
    By savePhone = By.xpath("//button[@class='button button-blue ng-binding' and @type ='submit']");
    public String newPhone = "+380631111111";
    public String incorrectPhone = "+380-009957";
    public final String existingPassword = "Dev12345";
    public final String existingEmail = "deep_metal_warrior@yahoo.com";
    public final String toastText = "Пользователь с таким e-mail уже зарегестрирован.";
    public final String existingName = "Vlady";
    public final String smallEm = "Поле обязательно для заполнения";
    public final String wrongPhoneEm = "Формат номера неверный";
    public final String projTitle = "Vlady";


    @Test
    public void testExistingEmail() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://dev.equerest.com/info/entrepreneur");
        WebElement button1 = driver.findElement(By.xpath("//*[@href = \"/register#/entrepreneur\"]"));
        button1.click();
        WebElement fullName = driver.findElement(fio);
        fullName.sendKeys(existingName);
        WebElement cityForm = driver.findElement(city);
        cityForm.sendKeys("Kyiv");
        WebElement phone = driver.findElement(tel);
        phone.clear();
        phone.sendKeys("+380630000000");
        WebElement password = driver.findElement(pass);
        password.sendKeys("Dev12345");
        WebElement email = driver.findElement(mail);
        email.sendKeys(existingEmail);
        WebElement step2 = driver.findElement(By.xpath("//*[@ class = 'button button-blue button-next']"));
        step2.click();
        WebElement em = driver.findElement(toastMessage);
        String actualEm = em.getAttribute("aria-label");
        Assert.assertEquals(actualEm, toastText);
        driver.close();
    }

    @Test
    public void testBlankFields() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://dev.equerest.com/info/entrepreneur");
        WebElement button1 = driver.findElement(By.xpath("//*[@href = \"/register#/entrepreneur\"]"));
        button1.click();
        WebElement step2 = driver.findElement(By.xpath("//*[@ class = 'button button-blue button-next']"));
        step2.click();
        step2.click();
        WebElement em = driver.findElement(smallEM);
        String actualEm = em.getText();
        Assert.assertEquals(actualEm, smallEm);
        driver.close();
    }

    @Test
    public void testIncorrectPhoneNumber() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://dev.equerest.com/info/entrepreneur");
        WebElement button1 = driver.findElement(By.xpath("//*[@href = \"/register#/entrepreneur\"]"));
        button1.click();
        WebElement phone = driver.findElement(tel);
        phone.clear();
        phone.sendKeys(incorrectPhone);
        WebElement nextField = driver.findElement(fio);
        nextField.click();
        WebElement em = driver.findElement(By.xpath("//*[@class = 'error-message ng-scope' and @ng-message='pattern']"));
        String actualMsg = em.getText();
        Assert.assertEquals(wrongPhoneEm, actualMsg);
        driver.close();
    }

    @Test
    public void login() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://dev.equerest.com/");
        WebElement loginButton = driver.findElement(loginLink);
        loginButton.click();
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(existingEmail);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(existingPassword);
        WebElement submitBut = driver.findElement(submitButton);
        submitBut.click();
        String actualMesg = driver.findElement(projectTitle).getText();
        Assert.assertEquals(actualMesg, projTitle);
        driver.close();
    }

    @Test
    public void changePhoneNum() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://dev.equerest.com/");
        WebElement loginButton = driver.findElement(loginLink);
        loginButton.click();
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(existingEmail);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(existingPassword);
        WebElement submitBut = driver.findElement(submitButton);
        submitBut.click();
        WebElement settingsButton = driver.findElement(settings);
        settingsButton.click();
        WebElement phoneEditorButton = driver.findElement(phoneEditor);
        phoneEditorButton.click();
        WebElement phoneField = driver.findElement(phoneId);
        phoneField.clear();
        phoneField.sendKeys(newPhone);
        WebElement savePhonebutton = driver.findElement(savePhone);
        savePhonebutton.click();
        WebElement phoneInfo = driver.findElement(By.xpath("//label[@for='phone' and @class ='ng-binding']/following-sibling::*[@class ='ng-binding']"));
        Assert.assertEquals(phoneInfo.getText(), newPhone);
        driver.close();
    }
}
