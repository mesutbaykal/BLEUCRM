package com.bleucrm.pages;

import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{


    @FindBy(xpath = "//*[@name='USER_LOGIN']")
    public WebElement username;

    @FindBy(xpath = "//*[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='login-btn']")
    public WebElement login;

    public void login(){

        username.sendKeys(ConfigurationReader.get("username"));
        password.sendKeys(ConfigurationReader.get("password"));
        login.click();
        BrowserUtils.waitFor(2);
    }
}
