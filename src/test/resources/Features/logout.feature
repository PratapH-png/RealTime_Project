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
 
 ## 1. Logout
  @smoke
  Scenario: Successful logout from actiTime
    Given I am logged into the actiTime dashboard
    When I click on the Logout button
    Then I should be logged out of the system
    And I should be redirected to the login page