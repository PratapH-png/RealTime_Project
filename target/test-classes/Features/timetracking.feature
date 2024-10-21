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
## 1. Time Tracking Module
  @time_tracking
  Scenario: Track time for a task
    Given I am on the actiTime dashboard
    When I navigate to the Time-Track module
    And I select a task to track time
    And I start the timer
    Then the system should start tracking time for that task
    When I stop the timer after some time
    Then the tracked time should be saved and displayed against the task

  @time_tracking
  Scenario: Manually log time for a task
    Given I am in the Time-Track module
    When I select a task
    And I enter the time spent manually in the Time Spent field
    And I save the entry
    Then the time should be reflected against the selected task