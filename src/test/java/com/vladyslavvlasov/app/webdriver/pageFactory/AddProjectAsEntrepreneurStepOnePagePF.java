package com.vladyslavvlasov.app.webdriver.pageFactory;

import com.vladyslavvlasov.app.webdriver.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.xml.xpath.XPath;

/**
 * Created by Vladyslav Vlasov on 24.12.2016.
 */
public class AddProjectAsEntrepreneurStepOnePagePF extends AbstractPagePF {
    @FindBy(how = How.XPATH, using = "//*[@href = \"/register#/entrepreneur\"]")
    private WebElement registerLink;

    @FindBy(how = How.LINK_TEXT, using = "BASE_URL + \"info/entrepreneur/\"")
    private WebElement entPage;



    public void gotoRegistration() {
        registerLink.click();
    }
}
