package com.bleucrm.pages;

import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MessagePage extends BasePage {

    @FindBy(xpath ="//*[@id='feed-add-post-destination-container']")
    public WebElement toBox;

    @FindBy(xpath = "//*[@class='feed-add-post-del-but']")
    public WebElement delButton;

    @FindBy(css = ".bx-finder-box-tab.bx-lm-tab-department")
    public WebElement employee;

    @FindBy(xpath = "(//a[@class='bx-finder-company-department-inner'])[2]")
    public WebElement humanResource;

    @FindBy(xpath = "//*[.='All department and subdepartment employees']")
    public WebElement allDep;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-info'])[1]")
    public WebElement user;

    @FindBy(xpath = "//*[@data-id='DR263']/span[1]")
    public WebElement selectedDep;

    @FindBy(xpath = "//*[@data-id='U512']/span[1]")
    public WebElement selectedUser;
    
    @FindBy(css=".bxhtmled-top-bar-btn.bxhtmled-button-quote")
    public WebElement commaIcon;

    @FindBy(xpath = "//*[@class='bxhtmled-quote']")
    public WebElement quoteTextBox;

    @FindBy(xpath = "//*[@id='bx-b-mention-blogPostForm']")
    public WebElement addMention;

    @FindBy(xpath = "//a[contains(@id, '_last_U513')]/div/div")
    public WebElement mentionedUser;

    @FindBy(xpath ="//*[@id='mention65762191_last_U513']")
    public WebElement mentioned;

    @FindBy(tagName = "body")
    public WebElement messageBox;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement postMessage;

    @FindBy(css = "#feed-add-buttons-blockblogPostForm")
    public WebElement clickAnyWhere;

    @FindBy(css = "#user-block")
    public WebElement userBlok;

    @FindBy(linkText = "Log out")
    public WebElement logOutBtn;

    public String writtenmessage="123*#cydeo$&/";


    JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
    public void logOutUser(){
        userBlok.click();
        BrowserUtils.waitForClickablility(logOutBtn,10);
        jse.executeScript("arguments[0].click();",logOutBtn);
        BrowserUtils.waitFor(2);
        Alert alert = Driver.get().switchTo().alert();
        alert.accept();
    }
}
