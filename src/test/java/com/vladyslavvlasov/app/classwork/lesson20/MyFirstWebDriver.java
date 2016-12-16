package com.vladyslavvlasov.app.classwork.lesson20;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Murcielago on 07.12.2016.
 */
public class MyFirstWebDriver {
    By searchField = By.name("q");

    @Test
    public void myFirstWebDriverTest() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        WebElement searchInput = driver.findElement(searchField);
        searchInput.sendKeys("Monkey");
        searchInput.submit();
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        List<WebElement> linkList= driver.findElements(By.xpath("//*[@class='g']//a"));
        System.out.println(linkList.size());

        Assert.assertTrue(linkList.get(0).getText().contains("Monkey"));
/*        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.close();*/
    }
}
