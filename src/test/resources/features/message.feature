@wip
Feature: BlEUCRM Sending Message Functionalities
  Agile Story: As a user, I should be able to send messages by clicking on Message tab under Active Stream

  Background:
    Given User is on the homepage
    When User navigates to Message Tag

  Scenario: User should be able to add multiple contacts contact lists

    And User clicks on the To box
    And User selects Employees and Departments
    Then User should see the selected users on TO box


  Scenario: User should be able to create a quote by clicking on the Comma icon
    And User clicks on the Comma icon
    And User enters a quote
    Then User should see the quote on the writting pad


  Scenario: User should be able to add mention by clicking on the Add mention icon
    And User clicks on the Add mention icon
    And User enters a mention
    Then User should see the mention on the writting pad


  Scenario: User should be able to send a message
    And user enters a message
    And User clicks on the To box
    And User selects Employees and Departments
    And User clicks on the send button
    Then User should see the message on Activity Stream page
