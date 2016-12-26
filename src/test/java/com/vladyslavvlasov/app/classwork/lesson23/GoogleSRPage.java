package com.vladyslavvlasov.app.classwork.lesson23;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Vladyslav Vlasov on 24.12.2016.
 */
public class GoogleSRPage {
    @FindBy (how = How.NAME, using = "q")
    private WebElement searchBox;

    public void searchFor(String text){
        searchBox.sendKeys(text);
        searchBox.submit();
    }
}
