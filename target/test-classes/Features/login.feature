#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@functionality
Feature: actiTime Webpage Functionalities
## 1. Login Module
  @smoke
  Scenario: Successful login with valid credentials
    Given I am on the actiTime login page
    When I enter valid username and password
    And I click on the Login button
    Then I should be redirected to the actiTime dashboard
    And I should see the Logout option

  @negative
  Scenario: Unsuccessful login with invalid credentials
    Given I am on the actiTime login page
    When I enter an invalid username and password
    And I Click Login button
    Then I should see an error message saying Invalid username or password.