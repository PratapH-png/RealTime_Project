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
## 1. Reports Module
  @reports
  Scenario: Generate a report on project time tracking
    Given I am in the Reports module
    When I select a project for which I want to generate a time tracking report
    And I choose the time period
    And I click Generate Report
    Then the system should display a detailed report of time tracked for the selected project within the specified time period

  @reports
  Scenario: Export a report as a PDF
    Given I have generated a report in the Reports module
    When I click the Export as PDF button
    Then the system should download the report as a PDF file