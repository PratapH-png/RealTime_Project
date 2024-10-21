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
 ## 1. Users and Settings Management Module
  @users_management
  Scenario: Add a new user to the system
    Given I am in the Users module
    When I click on Add New User
    And I enter the users details such as Name, Email, and Role
    And I click Save
    Then the new user should appear in the list of users

  @users_management
  Scenario: Update an existing users role
    Given I am in the Users module
    And I have selected an existing user
    When I click on Edit
    And I update the users role to Manager
    And I click Save
    Then the changes should be reflected in the users details