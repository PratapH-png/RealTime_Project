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
 ## 1. Task Management Module
  @tasks
  Scenario: Create a new task in a project
    Given I am logged into the actiTime dashboard
    When I navigate to the Tasks module
    And I select a project
    And I click on the Create Task button
    And I enter task details such as Task Name, Deadline, and Assignee
    And I click Save
    Then the new task should appear in the task list under the selected project

  @tasks
  Scenario: Edit an existing task
    Given I am in the Tasks module
    And I have selected an existing task
    When I click on the Edit button
    And I update the task details
    And I click Save
    Then the changes should be reflected in the task details

  @tasks
  Scenario: Delete a task
    Given I am in the Tasks module
    When I select an existing task
    And I click on the Delete button
    And I confirm the deletion
    Then the task should no longer appear in the task list