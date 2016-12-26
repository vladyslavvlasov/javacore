package com.vladyslavvlasov.app.webdriver.pageFactory;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Vladyslav Vlasov on 24.12.2016.
 */
public class AddProjectAsEntrepreneurStepTwoPagePF {
    @FindBy(how = How.ID, using = "fio")
    private WebElement name;
    @FindBy(how = How.ID, using = "city")
    private WebElement city;
    @FindBy(how = How.ID, using = "tel")
    private WebElement phone;
    @FindBy(how = How.ID, using = "mail")
    private WebElement email;
    @FindBy(how = How.ID, using = "pass")
    private WebElement password;
    @FindBy(how = How.XPATH, using = "//*[@ class = 'button button-blue button-next']")
    private WebElement goToStep2;
    @FindBy(how = How.XPATH, using = "//*[@class='toast-message']")
    private WebElement emailEM;
    String emailErrorMessage = "Пользователь с таким e-mail уже зарегестрирован.";

    public void fillInName(String nameStr) {
        name.sendKeys(nameStr);
    }

    public void fillInCity(String cityName) {
        city.sendKeys(cityName);
    }

    public void fillInPhone(String phonenum) {
        phone.clear();
        phone.sendKeys(phonenum);
    }

    public void fillInEmail(String emailaddress) {
        email.sendKeys(emailaddress);
    }

    public void fillInPassword(String passToUse) {
        password.sendKeys(passToUse);
    }
    public void clickOnGoToStep2(){
        goToStep2.click();
    }
    public void assertEmailErrorMessage(){
        String actualEm = emailEM.getAttribute("aria-label");
        Assert.assertEquals(actualEm, emailErrorMessage);
    }
}
