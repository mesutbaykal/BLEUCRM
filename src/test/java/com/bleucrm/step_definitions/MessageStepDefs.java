package com.bleucrm.step_definitions;

import com.bleucrm.pages.BasePage;
import com.bleucrm.pages.MessagePage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.w3c.dom.html.HTMLInputElement;

public class MessageStepDefs {

    MessagePage messagePage=new MessagePage();

    @When("User navigates to Message Tag")
    public void user_navigates_to_Message_Tag() {

        messagePage.message.click();
    }

    @And("User clicks on the To box")
    public void user_clicks_on_the_To_box() {
        messagePage.toBox.click();

    }

    @When("User selects Employees and Departments")
    public void user_selects_Employees_and_Departments() {
        messagePage.delButton.click();
        BrowserUtils.waitForClickablility(messagePage.employee,5);
        JavascriptExecutor js=(JavascriptExecutor)Driver.get();
        js.executeScript("arguments[0].click()",messagePage.employee);
        //messagePage.employee.click();
        messagePage.toBox.click();
        messagePage.humanResource.click();
        messagePage.allDep.click();
        messagePage.user.click();

    }

    @Then("User should see the selected users on TO box")
    public void user_should_see_the_selected_users_on_TO_box() {
        Assert.assertEquals(messagePage.allDep.getText(),messagePage.selectedDep.getText());
        Assert.assertEquals(messagePage.user.getText(),messagePage.selectedUser.getText());

    }

    @When("User clicks on the Comma icon")
    public void user_clicks_on_the_Comma_icon() {
        MessagePage.commaIcon.click();
    }

    @When("User enters a quote")
    public void user_enters_a_quote() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should see the quote on the writting pad")
    public void user_should_see_the_quote_on_the_writting_pad() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on the Add mention icon")
    public void user_clicks_on_the_Add_mention_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters a mention")
    public void user_enters_a_mention() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should see the mention on the writting pad")
    public void user_should_see_the_mention_on_the_writting_pad() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters a message")
    public void user_enters_a_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on the send button")
    public void user_clicks_on_the_send_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should see the message on Activity Stream page")
    public void user_should_see_the_message_on_Activity_Stream_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
