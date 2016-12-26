package com.vladyslavvlasov.app.webdriver.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vladyslav Vlasov on 26.12.2016.
 */
public class ProjectPage extends AbstractPage {
    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    public static By projectTitle = By.xpath("//*[@ng-bind-html='$ctrl.post.projects.title']");
    public static By settings = By.xpath("//*[@href = '/dashboard#/settings']");

    public void assertLoggedInSuccesfully(String projTitle) {
        String actualMesg = driver.findElement(projectTitle).getText();
        Assert.assertEquals(actualMesg, projTitle);
    }

}
