package com.bleucrm.step_definitions;


import com.bleucrm.pages.MessagePage;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


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
        messagePage.employee.click();
        messagePage.humanResource.click();
        messagePage.allDep.click();
        messagePage.user.click();
        messagePage.delButton.click();

    }

    @Then("User should see the selected users on TO box")
    public void user_should_see_the_selected_users_on_TO_box() {
        Assert.assertEquals(messagePage.humanResource.getText(),messagePage.selectedDep.getText());
        Assert.assertEquals(messagePage.user.getText().trim(),messagePage.selectedUser.getText().trim());

    }

    @When("User clicks on the Comma icon")
    public void user_clicks_on_the_Comma_icon() {
        messagePage.commaIcon.click();



    }

    @When("User enters a quote")
    public void user_enters_a_quote() {

        Driver.get().switchTo().frame(0);
        messagePage.quoteTextBox.sendKeys("123*Cybertek#$/");
        messagePage.messageBox.click();
    }

    @Then("User should see the quote on the writting pad")
    public void user_should_see_the_quote_on_the_writting_pad() {

        Assert.assertEquals("123*Cybertek#$/",messagePage.quoteTextBox.getText());
    }

    @When("User clicks on the Add mention icon")
    public void user_clicks_on_the_Add_mention_icon() {
        messagePage.addMention.click();
    }

    @When("User enters a mention")
    public void user_enters_a_mention() {

        messagePage.mentionedUser.click();

    }

    @Then("User should see the mention on the writting pad")
    public void user_should_see_the_mention_on_the_writting_pad() {
        messagePage.addMention.click();
        String expectedMention=messagePage.mentionedUser.getText();
        Driver.get().switchTo().frame(0);
        String mention=messagePage.messageBox.getText();
        Assert.assertEquals(expectedMention.trim(),mention.trim());

    }

    @When("user enters a message")
    public void user_enters_a_message() {
        Driver.get().switchTo().frame(0);
        messagePage.messageBox.sendKeys(messagePage.writtenmessage);
        Driver.get().switchTo().parentFrame();
    }

    @When("User clicks on the send button")
    public void user_clicks_on_the_send_button() {
        messagePage.sendButton.click();
    }

    @Then("User should see the message on Activity Stream page")
    public void user_should_see_the_message_on_Activity_Stream_page() {

        String actualMessage=messagePage.postMessage.getText();
        Assert.assertEquals(messagePage.writtenmessage,actualMessage);
    }


}
