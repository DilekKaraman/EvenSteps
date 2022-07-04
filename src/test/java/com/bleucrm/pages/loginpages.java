package com.bleucrm.pages;

import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpages {

    public loginpages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement loginBox;

    @FindBy(name = "USER_PASSWORD")
    public WebElement inputPassword;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='Event']")
    public WebElement Event;

    public void login() {
        loginBox.sendKeys(ConfigurationReader.getProperty("userlogin"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("userpassword"));
        loginButton.click();
    }
}
