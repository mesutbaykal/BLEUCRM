package com.bleucrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessagePage extends BasePage {

    @FindBy(xpath ="//*[@id='feed-add-post-destination-container']")
    public WebElement toBox;

    @FindBy(xpath = "//*[@class='feed-add-post-del-but']")
    public WebElement delButton;

    @FindBy(css = ".bx-finder-box-tab.bx-lm-tab-department")
    public WebElement employee;

    @FindBy(xpath = "(//*[text()='Human resources'])[3]")
    public WebElement humanResource;

    @FindBy(xpath = "//*[.='All department and subdepartment employees']")
    public WebElement allDep;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-info'])[1]")
    public WebElement user;

    @FindBy(xpath = "//*[@data-id='DR263']/span[1]")
    public WebElement selectedDep;

    @FindBy(xpath = "//*[@data-id='U512']/span[1]")
    public WebElement selectedUser;
    
    @FindBy(xpath = "//*[@class='bxhtmled-top-bar-btn bxhtmled-button-quote bxhtmled-top-bar-btn-active']")
    public static WebElement commaIcon;

    @FindBy(xpath = "//*[@class='bxhtmled-quote']")
    public WebElement quoteTextBox;

    @FindBy(xpath = "//*[@id='bx-b-mention-blogPostForm']")
    public WebElement addMention;

    @FindBy(xpath ="//*[@id='mention65762191_last_U513']")
    public WebElement mentioned;

    @FindBy(xpath = "//*[@id='microoPostFormLHE_blogPostForm']")
    public WebElement messageBox;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//*[@id='blog_post_body_399']")
    public WebElement postMessage;
}
